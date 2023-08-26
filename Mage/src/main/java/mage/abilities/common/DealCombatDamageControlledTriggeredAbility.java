package mage.abilities.common;

import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.constants.SetTargetPointer;
import mage.constants.Zone;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.Game;
import mage.game.events.DamagedPlayerEvent;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.target.targetpointer.FixedTarget;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author LevelX2
 */
public class DealCombatDamageControlledTriggeredAbility extends TriggeredAbilityImpl {

    private final Set<UUID> damagedPlayerIds = new HashSet<>();
    private final SetTargetPointer setTargetPointer;
    private final FilterCreaturePermanent filter;

    public DealCombatDamageControlledTriggeredAbility(Effect effect) {
        this(Zone.BATTLEFIELD, effect);
    }

    public DealCombatDamageControlledTriggeredAbility(Zone zone, Effect effect) {
        this(zone, effect, false);
    }

    public DealCombatDamageControlledTriggeredAbility(Zone zone, Effect effect, boolean setTargetPointer) {
        this(zone, effect, setTargetPointer, false);
    }

    public DealCombatDamageControlledTriggeredAbility(Zone zone, Effect effect, boolean setTargetPointer, boolean onlyOpponents) {
        this(zone, effect, setTargetPointer, onlyOpponents, false);
    }

    public DealCombatDamageControlledTriggeredAbility(Zone zone, Effect effect, boolean setTargetPointer, boolean onlyOpponents, boolean optional) {
        this(zone, effect, new FilterCreaturePermanent("creatures"), setTargetPointer ? SetTargetPointer.PLAYER : SetTargetPointer.NONE, onlyOpponents, false);
    }

    public DealCombatDamageControlledTriggeredAbility(Zone zone, Effect effect, FilterCreaturePermanent filter, SetTargetPointer setTargetPointer, boolean onlyOpponents, boolean optional) {
        super(zone, effect, optional);
        this.setTargetPointer = setTargetPointer;
        this.filter = filter;
        setTriggerPhrase("Whenever one or more " + filter.getMessage() + " you control deal combat damage to a player, ");
    }

    protected DealCombatDamageControlledTriggeredAbility(final DealCombatDamageControlledTriggeredAbility ability) {
        super(ability);
        this.setTargetPointer = ability.setTargetPointer;
        this.filter = ability.filter;
    }

    @Override
    public DealCombatDamageControlledTriggeredAbility copy() {
        return new DealCombatDamageControlledTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DAMAGED_PLAYER
                || event.getType() == GameEvent.EventType.DAMAGED_PLAYER_BATCH
                || event.getType() == GameEvent.EventType.COMBAT_DAMAGE_STEP_PRIORITY
                || event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (event.getType() == GameEvent.EventType.COMBAT_DAMAGE_STEP_PRIORITY 
            || (event.getType() == GameEvent.EventType.ZONE_CHANGE && event.getTargetId().equals(getSourceId()))) {
            damagedPlayerIds.clear();
            return false;
        }

        if (event.getType() == EventType.DAMAGED_PLAYER) {
            DamagedPlayerEvent damageEvent = (DamagedPlayerEvent) event;
            Permanent p = game.getPermanent(event.getSourceId());
            if (!damageEvent.isCombatDamage()
                || p == null
                || !p.isControlledBy(this.getControllerId())
                || !filter.match(p, game)
                || damagedPlayerIds.contains(event.getPlayerId())) {
                return false;
            }
            
            damagedPlayerIds.add(event.getPlayerId());
        }

        switch (setTargetPointer) {
            case PLAYER:
                this.getEffects().setTargetPointer(new FixedTarget(event.getPlayerId()));
                break;
            default:
                break;
        }
        return true;
    }
}
