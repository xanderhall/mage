package org.mage.test.cards.single.clb;

import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

import mage.constants.PhaseStep;
import mage.constants.Zone;

public class HezrouTest extends CardTestPlayerBase {

    private static final String HEZROU = "Hezrou";
    private static final String STENCH = "Demonic Stench";
    private static final String LION = "Silvercoat Lion";
    private static final String KNIGHT = "Knight Errant";
    private static final String MEMNITE = "Memnite";
    private static final String CADET = "Eager Cadet";

    /**
     * Instant — Adventure
     * Each creature that blocked this turn gets -1/-1 until end of turn. (Then exile this card. You may cast the creature later from exile.)
     */
    @Test
    public void testAdventure() {
        addCard(Zone.BATTLEFIELD, playerA, MEMNITE);
        addCard(Zone.BATTLEFIELD, playerA, CADET);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 1);
        addCard(Zone.HAND, playerA, HEZROU);

        addCard(Zone.BATTLEFIELD, playerB, LION);
        addCard(Zone.BATTLEFIELD, playerB, KNIGHT);

        // Player A attacks with both creatures
        attack(1, playerA, MEMNITE);
        attack(1, playerA, CADET);

        // Player B blocks each creature
        block(1, playerB, LION, MEMNITE);
        block(1, playerB, KNIGHT, CADET);

        // Player A casts Demonic Stench, which should kill both creatures
        //castSpell(1, PhaseStep.POSTCOMBAT_MAIN, playerA, STENCH);

        setStrictChooseMode(true);
        setStopAt(1, PhaseStep.END_TURN);
        execute();

        assertPermanentCount(playerB, 0);

    }

    @Test
    public void testBlocked() {

    }
}
