package mage.cards.h;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import mage.MageInt;
import mage.MageObjectReference;
import mage.abilities.common.BecomesBlockedAllTriggeredAbility;
import mage.abilities.effects.common.continuous.BoostAllEffect;
import mage.constants.SubType;
import mage.constants.WatcherScope;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.Predicate;
import mage.filter.predicate.permanent.BlockingOrBlockedBySourcePredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.watchers.Watcher;
import mage.cards.AdventureCard;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;

/**
 *
 * @author Xanderhall
 */
public final class Hezrou extends AdventureCard {

    private static final FilterCreaturePermanent blockingCreatureFilter = new FilterCreaturePermanent("each blocking creature");
    private static final FilterCreaturePermanent creatureThatBlockedFilter = new FilterCreaturePermanent("each creature that blocked this turn");
    private static final FilterControlledPermanent creatureYouControlFilter = new FilterControlledCreaturePermanent("one or more creatures you control");

    static {
        creatureThatBlockedFilter.add(HezrouPredicate.instance);
        blockingCreatureFilter.add(BlockingOrBlockedBySourcePredicate.BLOCKING);
    }

    public Hezrou(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, new CardType[]{CardType.INSTANT}, "{5}{B}{B}", "Demonic Stench", "{B}");
        
        this.subtype.add(SubType.FROG);
        this.subtype.add(SubType.DEMON);
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Whenever one or more creatures you control become blocked, each blocking creature gets -1/-1 until end of turn.
        this.addAbility(new BecomesBlockedAllTriggeredAbility(
            new BoostAllEffect(-1, -1, Duration.EndOfTurn, blockingCreatureFilter, false),
            false, creatureYouControlFilter, false)
        );

        // Demonic Stench
        // Each creature that blocked this turn gets -1/-1 until end of turn
        this.getSpellCard().getSpellAbility().addEffect(new BoostAllEffect(-1, -1, Duration.EndOfTurn, creatureThatBlockedFilter, false));
        this.getSpellCard().getSpellAbility().addWatcher(new HezrouWatcher());
    }

    private Hezrou(final Hezrou card) {
        super(card);
    }

    @Override
    public Hezrou copy() {
        return new Hezrou(this);
    }
}

enum HezrouPredicate implements Predicate<Permanent> {
    instance;

    @Override
    public boolean apply(Permanent input, Game game) {
        HezrouWatcher watcher = game.getState().getWatcher(HezrouWatcher.class);
        return watcher != null && watcher.checkCreature(input, game);
    }
}

class HezrouWatcher extends Watcher {

    private final Set<MageObjectReference> blockers = new HashSet<>();

    HezrouWatcher() {
        super(WatcherScope.GAME);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() != GameEvent.EventType.BLOCKER_DECLARED) {
            return;
        }
        blockers.add(new MageObjectReference(event.getSourceId(), game));
    }

    @Override
    public void reset() {
        super.reset();
        this.blockers.clear();
    }

    boolean checkCreature(Permanent permanent, Game game) {
        return blockers.stream().anyMatch(mor -> mor.refersTo(permanent, game));
    }
}
