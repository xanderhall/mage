package mage.cards.a;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.filter.FilterSpell;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.PermanentPredicate;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CopySourceSpellEffect;
import mage.abilities.keyword.WardAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author Xanderhall
 */
public final class ArchmageOfEchoes extends CardImpl {

    private static FilterSpell filter = new FilterSpell("Faerie or Wizard permanent spell");

    static {
        filter.add(PermanentPredicate.instance);
        filter.add(Predicates.or(SubType.FAERIE.getPredicate(), SubType.WIZARD.getPredicate()));
    }

    public ArchmageOfEchoes(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{U}");
        
        this.subtype.add(SubType.FAERIE);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Ward {2}
        this.addAbility(new WardAbility(new ManaCostsImpl<>("{2}")));

        // Whenever you cast a Faerie or Wizard permanent spell, copy it.
        this.addAbility(new SpellCastControllerTriggeredAbility(new CopySourceSpellEffect(), filter, false));
    }

    private ArchmageOfEchoes(final ArchmageOfEchoes card) {
        super(card);
    }

    @Override
    public ArchmageOfEchoes copy() {
        return new ArchmageOfEchoes(this);
    }
}
