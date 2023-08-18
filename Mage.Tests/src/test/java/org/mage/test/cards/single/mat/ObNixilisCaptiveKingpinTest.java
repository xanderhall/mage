package org.mage.test.cards.single.mat;

import org.junit.Test;
import org.mage.test.serverside.base.CardTestMultiPlayerBase;

import mage.constants.PhaseStep;
import mage.constants.Zone;
import mage.counters.CounterType;

public class ObNixilisCaptiveKingpinTest extends CardTestMultiPlayerBase {
    
    private final String OB = "Ob Nixilis, Captive Kingpin";

    @Test
    public void testEffect() {
        addCard(Zone.BATTLEFIELD, playerA, OB, 1);
        addCard(Zone.BATTLEFIELD, playerA, "Cryptolith Fragment", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Cult Guildmage", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 4);
        addCard(Zone.LIBRARY, playerA, "Silvercoat Lion", 3);

        // Dealing one damage to multiple targets should trigger Ob Nixilis's effect once
        activateAbility(1, PhaseStep.PRECOMBAT_MAIN, playerA, "{T}");
        setChoice(playerA, "Red");

        // Dealing one damage to one target should trigger Ob Nixilis's effect once
        activateAbility(1, PhaseStep.PRECOMBAT_MAIN, playerA, "{R}", playerB);

        setStopAt(1, PhaseStep.POSTCOMBAT_MAIN);
        setStrictChooseMode(true);
        execute();

        assertCounterCount(playerA, OB, CounterType.P1P1, 2);
        assertExileCount(activePlayer, 2);
    }

    @Test
    public void testTwoTriggersSameCard() {
        addCard(Zone.BATTLEFIELD, playerA, OB, 1);
        addCard(Zone.BATTLEFIELD, playerA, "Syr Konrad, the Grim", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Millstone", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 4);

        removeAllCardsFromLibrary(playerB);
        addCard(Zone.LIBRARY, playerB, "Silvercoat Lion", 10);

        // Activate Millstone with Konrad on board, should Konrad twice and trigger Ob Nixilis twice
        activateAbility(1, PhaseStep.PRECOMBAT_MAIN, playerA, "{2}", playerB);

        setStopAt(1, PhaseStep.POSTCOMBAT_MAIN);
        //setStrictChooseMode(true);
        execute();

        assertCounterCount(playerA, OB, CounterType.P1P1, 2);
        assertExileCount(activePlayer, 2);
    }
}
