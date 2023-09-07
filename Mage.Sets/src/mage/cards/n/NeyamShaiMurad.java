package mage.cards.n;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ReturnFromGraveyardToBattlefieldTargetEffect;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.events.DamagedEvent;
import mage.game.events.GameEvent;
import mage.players.Player;
import mage.target.common.TargetCardInGraveyard;
import mage.target.targetpointer.FixedTarget;
import mage.util.CardUtil;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.Cards;
import mage.constants.CardType;
import mage.constants.Outcome;

/**
 *
 * @author Xanderhall
 */
public final class NeyamShaiMurad extends CardImpl {

    public NeyamShaiMurad(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}{B}");
        
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Rogue Trader -- Whenever Neyam Shai Murad deals combat damage to a player, you may have that player return target permanent card from their graveyard to their hand.
        // If you do, that player chooses a permanent card in your graveyard, then you put it onto the battlefield under your control.

        this.addAbility(new NeyamShaiMuradTriggeredAbility().withFlavorWord("Rogue Trader"));
    }

    private NeyamShaiMurad(final NeyamShaiMurad card) {
        super(card);
    }

    @Override
    public NeyamShaiMurad copy() {
        return new NeyamShaiMurad(this);
    }
}

class NeyamShaiMuradTriggeredAbility extends TriggeredAbilityImpl {

    NeyamShaiMuradTriggeredAbility() {
        super(Zone.BATTLEFIELD, new NeyamShaiMuradEffect(), true);
        setTriggerPhrase("Whenever {this} deals combat damage to a player, ");
    }

    private NeyamShaiMuradTriggeredAbility(final NeyamShaiMuradTriggeredAbility effect) {
        super(effect);
    }

    @Override
    public NeyamShaiMuradTriggeredAbility copy() {
        return new NeyamShaiMuradTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DAMAGED_PLAYER;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (!event.getSourceId().equals(getSourceId()) || !((DamagedEvent) event).isCombatDamage()) {
            return false;
        }
        getAllEffects().setTargetPointer(new FixedTarget(event.getPlayerId()));
        return true;
    }
}

class NeyamShaiMuradEffect extends OneShotEffect {
    
    NeyamShaiMuradEffect() {
        super(Outcome.Benefit);
        staticText = "you may have that player return target permanent card from their graveyard to their hand. "
            + "If you do, that player chooses a permanent card in your graveyard, then you put it onto the battlefield under your control";
    }

    private NeyamShaiMuradEffect(final NeyamShaiMuradEffect effect) {
        super(effect);
    }

    @Override
    public NeyamShaiMuradEffect copy() {
        return new NeyamShaiMuradEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(getTargetPointer().getFirst(game, source));
        Player controller = game.getPlayer(source.getControllerId());
        Cards playerGraveyard = player.getGraveyard();
        Cards controllerGraveyard = controller.getGraveyard();
        if (player == null || controller == null || playerGraveyard.isEmpty()) {
            return false;
        }

        TargetCardInGraveyard target = new TargetCardInGraveyard(StaticFilters.FILTER_CARD_PERMANENT);

        if (!controller.chooseTarget(Outcome.ReturnToHand, playerGraveyard, target, source, game)
            || !playerGraveyard.contains(target.getFirstTarget())
            || !player.moveCards(playerGraveyard.get(target.getFirstTarget(), game), Zone.HAND, source, game)) {
            return false;
        }

        target.clearChosen();
        target.withNotTarget(true);
        if (!player.choose(Outcome.PutCreatureInPlay, controllerGraveyard, target, source, game)) {
            return false;
        }

        return controllerGraveyard.contains(target.getFirstTarget()) && controller.moveCards(controllerGraveyard.get(target.getFirstTarget(), game), Zone.BATTLEFIELD, source, game);
    }
}