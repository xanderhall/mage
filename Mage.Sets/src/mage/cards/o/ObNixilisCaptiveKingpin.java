package mage.cards.o;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.SpellAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ExileTopXMayPlayUntilEndOfTurnEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.WatcherScope;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.watchers.Watcher;

public final class ObNixilisCaptiveKingpin extends CardImpl {

    public ObNixilisCaptiveKingpin(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}{R}");

        this.addSuperType(SuperType.LEGENDARY);
        this.addSubType(SubType.DEMON);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);

        // Flying, Trample
        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(TrampleAbility.getInstance());

        // Whenever one or more opponents each lose exactly 1 life, put a +1/+1 counter on Ob Nixilis, Captive Kingpin. 
        // Exile the top card of your library. Until your next end step, you may play that card.

        this.addAbility(new ObNixilisTriggeredAbility(), new ObNixilisWatcher());
    }

    private ObNixilisCaptiveKingpin(final ObNixilisCaptiveKingpin card) {
        super(card);
    }

    @Override
    public Card copy() {
        return new ObNixilisCaptiveKingpin(this);
    }
}

class ObNixilisTriggeredAbility extends TriggeredAbilityImpl {

    private Set<UUID> events = new HashSet<>();

    public ObNixilisTriggeredAbility() {
        super(Zone.BATTLEFIELD, new ObNixilisEffect());
        
    }

    protected ObNixilisTriggeredAbility(final ObNixilisTriggeredAbility ability) {
        super(ability);
    }

    public ObNixilisTriggeredAbility copy() {
        return new ObNixilisTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.LOST_LIFE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (game.getOpponents(this.controllerId).contains(event.getPlayerId()) && event.getAmount() == 1) {

            UUID source = event.getSourceId();
            if (events.stream().noneMatch(id -> id.equals(source))) {
                events.add(source);
                return true;
            }
        }
        return false;
    }
}

class ObNixilisEffect extends OneShotEffect {

    public ObNixilisEffect() {
        super(Outcome.Benefit);
        this.staticText = "Whenever one or more opponents each lose exactly 1 life, put a +1/+1 counter on Ob Nixilis, Captive Kingpin."
            + "Exile the top card of your library. Until your next end step, you may play that card.";
    }

    protected ObNixilisEffect(final ObNixilisEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return new AddCountersSourceEffect(CounterType.P1P1.createInstance(), true).apply(game, source)
            && new ExileTopXMayPlayUntilEndOfTurnEffect(1, true, Duration.UntilEndOfYourNextTurn).apply(game, source);
    }

    @Override
    public Effect copy() {
        return new ObNixilisEffect(this);
    }
    
}

class ObNixilisWatcher extends Watcher {

    public ObNixilisWatcher() {
        super(WatcherScope.GAME);
    }

    protected ObNixilisWatcher(Watcher watcher) {
        super(watcher);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        
    }
    
}