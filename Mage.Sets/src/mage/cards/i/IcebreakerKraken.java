package mage.cards.i;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.ReturnToHandChosenControlledPermanentCost;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DontUntapInPlayersNextUntapStepAllEffect;
import mage.abilities.effects.common.ReturnToHandSourceEffect;
import mage.abilities.effects.common.cost.SpellCostReductionForEachSourceEffect;
import mage.abilities.hint.Hint;
import mage.abilities.hint.ValueHint;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledLandPermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.Predicates;
import mage.game.Game;
import mage.players.Player;
import mage.target.common.TargetControlledPermanent;
import mage.target.common.TargetOpponent;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class IcebreakerKraken extends CardImpl {

    private static final FilterControlledPermanent filter 
            = new FilterControlledLandPermanent("snow land you control");

    static {
        filter.add(SuperType.SNOW.getPredicate());
    }

    private static final DynamicValue xValue = new PermanentsOnBattlefieldCount(filter);
    private static final Hint hint = new ValueHint("Snow lands you control", xValue);

    public IcebreakerKraken(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{10}{U}{U}");

        this.supertype.add(SuperType.SNOW);
        this.subtype.add(SubType.KRAKEN);
        this.power = new MageInt(8);
        this.toughness = new MageInt(8);

        // This spell costs {1} less to cast for each snow land you control.
        this.addAbility(new SimpleStaticAbility(
                Zone.ALL, new SpellCostReductionForEachSourceEffect(1, xValue)
        ).addHint(hint));

        // When Icebreaker Kraken enters the battlefield, artifacts and creatures target opponent controls don't untap during that player's next untap step.
        Ability ability = new EntersBattlefieldTriggeredAbility(new IcebreakerKrakenEffect());
        ability.addTarget(new TargetOpponent());
        this.addAbility(ability);

        // Return three snow lands you control to their owner's hand: Return Icebreaker Kraken to its owner's hand.
        Cost cost = new ReturnToHandChosenControlledPermanentCost(new TargetControlledPermanent(3, filter));
        cost.setText("return three snow lands you control to their owner's hand");
        this.addAbility(new SimpleActivatedAbility(new ReturnToHandSourceEffect(), cost));
    }

    private IcebreakerKraken(final IcebreakerKraken card) {
        super(card);
    }

    @Override
    public IcebreakerKraken copy() {
        return new IcebreakerKraken(this);
    }
}

class IcebreakerKrakenEffect extends OneShotEffect {

    private static final FilterPermanent filter = new FilterPermanent();

    static {
        filter.add(Predicates.or(CardType.CREATURE.getPredicate(), CardType.ARTIFACT.getPredicate()));
    }

    IcebreakerKrakenEffect() {
        super(Outcome.Detriment);
        staticText = "Artifacts and creatures target opponent controls don't untap during that player's next untap step";
    }

    private IcebreakerKrakenEffect(final IcebreakerKrakenEffect effect) {
        super(effect);
    }

    @Override
    public IcebreakerKrakenEffect copy() {
        return new IcebreakerKrakenEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getFirstTarget());
   
        if (player != null) {
            ContinuousEffect effect = new DontUntapInPlayersNextUntapStepAllEffect(filter);
            effect.setTargetPointer(new FixedTarget(player.getId()));
            game.addEffect(effect, source);                      
            return true;
        }
        return true;
    }
}
