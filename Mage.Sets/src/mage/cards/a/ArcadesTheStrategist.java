package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldControlledTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.combat.CanAttackAsThoughItDidntHaveDefenderAllEffect;
import mage.abilities.effects.common.ruleModifying.CombatDamageByToughnessAllEffect;
import mage.abilities.keyword.DefenderAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.VigilanceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.AbilityPredicate;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class ArcadesTheStrategist extends CardImpl {

    private static final FilterControlledCreaturePermanent defenderSingle = new FilterControlledCreaturePermanent("a creature with defender");
    private static final FilterCreaturePermanent defenderPlural = new FilterCreaturePermanent("Each creature you control with defender");

    static {
        defenderSingle.add(new AbilityPredicate(DefenderAbility.class));
        
        defenderPlural.add(TargetController.YOU.getControllerPredicate());
        defenderPlural.add(new AbilityPredicate(DefenderAbility.class));
    }

    public ArcadesTheStrategist(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}{W}{U}");

        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.ELDER);
        this.subtype.add(SubType.DRAGON);
        this.power = new MageInt(3);
        this.toughness = new MageInt(5);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Vigilance
        this.addAbility(VigilanceAbility.getInstance());

        // Whenever a creature with defender enters the battlefield under your control, draw a card.
        this.addAbility(new EntersBattlefieldControlledTriggeredAbility(
                new DrawCardSourceControllerEffect(1), defenderSingle
        ));

        // Each creature you control with defender assigns combat damage equal to its toughness rather than its power and can attack as though it didn't have defender.
        Ability ability = new SimpleStaticAbility(new CombatDamageByToughnessAllEffect(defenderPlural));
        ability.addEffect(new CanAttackAsThoughItDidntHaveDefenderAllEffect(
                Duration.WhileOnBattlefield, defenderSingle
        ).setText("and can attack as though it didn't have defender"));
        this.addAbility(ability);
    }

    private ArcadesTheStrategist(final ArcadesTheStrategist card) {
        super(card);
    }

    @Override
    public ArcadesTheStrategist copy() {
        return new ArcadesTheStrategist(this);
    }
}
