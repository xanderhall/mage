
package mage.abilities.effects.common.ruleModifying;

import mage.abilities.Ability;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.constants.Duration;
import mage.constants.Layer;
import mage.constants.Outcome;
import mage.constants.SubLayer;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.Game;

/**
 * @author TheElk801
 */
public class CombatDamageByToughnessAllEffect extends ContinuousEffectImpl {

    private final FilterCreaturePermanent filter;


    public CombatDamageByToughnessAllEffect(FilterCreaturePermanent filter) {
        this(filter, Duration.WhileOnBattlefield);
    }
     
    public CombatDamageByToughnessAllEffect(FilterCreaturePermanent filter, Duration duration) {
        super(duration, Layer.RulesEffects, SubLayer.NA, Outcome.Neutral);
        this.filter = filter;
        this.staticText = filter.getMessage() + " assigns combat damage equal to its toughness rather than its power";
    }
    

    private CombatDamageByToughnessAllEffect(final CombatDamageByToughnessAllEffect effect) {
        super(effect);
        this.filter = effect.filter;
    }

    @Override
    public CombatDamageByToughnessAllEffect copy() {
        return new CombatDamageByToughnessAllEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        game.getCombat().setUseToughnessForDamage(true);
        game.getCombat().addUseToughnessForDamageFilter(filter);
        return true;
    }
}
