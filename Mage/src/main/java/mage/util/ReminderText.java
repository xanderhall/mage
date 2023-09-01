package mage.util;

public enum ReminderText {
    ADVENTURE_ARTIFACT("Then exile this card. You may cast the artifact later from exile."),
    ADVENTURE_CREATURE("Then exile this card. You may cast the creature later from exile."),
    AFFLICT("Whenever this creature becomes blocked, defending player loses {~} life."),
    AFTERMATH("Cast this spell only from your graveyard. Then exile it."),
    BACKGROUND("You can have a Background as a second commander."),
    BARGAIN("You may sacrifice an artifact, enchantment, or token as you cast this spell."),
    BATTLE_CRY("Whenever this creature attacks, each other attacking creature gets +1/+0 until end of turn."),
    BUSHIDO("Whenever this creature blocks or becomes blocked, it gets +1/+1 until end of turn."),
    BUYBACK("You may pay an additional {~} as you cast this spell. If you do, put this card into your hand as it resolves."),
    CHANGELING("This card is every creature type."),
    CASCADE("When you cast this spell, exile cards from the top of your library until you exile a nonland card that costs less. You may cast it without paying its mana cost. Put the exiled cards on the bottom of your library in a random order."),
    CASUALTY("As you cast this spell, you may sacrifice a creature with power 1 or greater. When you do, copy this spell."),
    CLASH("Each clashing player reveals the top card of their library, then puts that card on the top or bottom. A player wins if their card had a higher mana value."),
    CLEAVE("You may cast this spell for its cleave cost. If you do, remove the words in square brackets."),
    CONSPIRACY("Start the game with this conspiracy face up in the command zone."),
    CONSPIRE("As you cast this spell, you may tap two untapped creatures you control that share a color with it. When you do, copy it and you may choose a new target for the copy."),
    CONVOKE("Your creatures can help cast this spell. Each creature you tap while casting this spell pays for {1} or one mana of that creature's color."),
    CREW("Tap any number of creatures you control with total power {~} or more: This Vehicle becomes an artifact creature until end of turn."),
    DASH("You may cast this spell for its dash cost. If you do, it gains haste, and it's returned from the battlefield to its owner's hand at the beginning of the next end step."),
    DEATHTOUCH("Any amount of damage this deals to a creature is enough to destroy it."),
    DEVOID("This card has no color."),
    ECHO("At the beginning of your upkeep, if this came under your control since the beginning of your last upkeep, sacrifice it unless you pay its echo cost."),
    EMERGE("You may cast this spell by sacrificing a creature and paying the emerge cost reduced by that creature's mana value."),
    ENCORE("{~}, Exile this card from your graveyard: For each opponent, create a token copy that attacks that opponent this turn if able. They gain haste. Sacrifice them at the beginning of the next end step. Activate only as a sorcery."),
    ENTWINE("Choose both if you pay the entwine cost."),
    EQUIP("{~}: Attach to target creature you control. Equip only as a sorcery."),
    EVOLVE("Whenever a creature enters the battlefield under your control, if that creature has greater power or toughness than this creature, put a +1/+1 counter on this creature."),
    EXALTED("Whenever a creature you control attacks alone, that creature gets +1/+1 until end of turn."),
    EXERT("An exerted creature won't untap during your next untap step."),
    FABRICATE("When this creature enters the battlefield, put a +1/+1 counter on it or create a 1/1 colorless Servo artifact creature token."),
    FEAR("It can’t be blocked except by artifact creatures and/or black creatures."),
    FIGHT("Each deals damage equal to its power to the other."),
    FIRST_STRIKE("This creature deals combat damage before creatures without first strike."),
    FLANKING("Whenever a creature without flanking blocks this creature, the blocking creature gets -1/-1 until end of turn."),
    FLASH("You may cast this spell any time you could cast an instant."),
    FLASHBACK("You may cast this card from your graveyard for its flashback cost. Then exile it."),
    FLYING("It can't be blocked except by creatures with flying or reach."),
    FORETELL("During your turn, you may pay {2} and exile this card from your hand face down. Cast it on a later turn for its foretell cost."),
    FUSE("You may cast one or both halves of this card from your hand."),
    GOAD(""),
    HAUNT("When this creature dies, exile it haunting target creature."),
    HEXPROOF("You can't be the target of spells or abilities your opponents control."),
    HIDDEN_AGENDA("Start the game with this conspiracy face down in the command zone and secretly choose a card name. You may turn this conspiracy face up any time and reveal that name."),
    INDESTRUCTIBLE("Damage and effects that say \"destroy\" don't destroy it. If its toughness is 0 or less, it's still put into its owner's graveyard."),
    INTIMIDATE("This creature can't be blocked except by artifact creatures and/or creatures that share a color with it."),
    INVESTIGATE("Create a colorless Clue artifact token with \"{2}, Sacrifice this artifact: Draw a card.\""),
    KICKER("You may pay an additional {~} as you cast this spell."),
    LEARN("You may reveal a Lesson card you own from outside the game and put it into your hand, or discard a card to draw a card."),
    LIFELINK("Damage dealt by this creature also causes you to gain that much life."),
    MADNESS("If you discard this card, discard it into exile. When you do, cast it for its madness cost or put it into your graveyard."),
    MEGAMORPH("You may cast this card face down as a 2/2 creature for {3}. Turn it face up any time for its megamorph cost and put a +1/+1 counter on it."),
    MELEE("Whenever this creature attacks, it gets +1/+1 until end of turn for each opponent you attacked this combat."),
    MENACE("This creature can't be blocked except by two or more creatures."),
    MODIFIED("Equipment, Auras you control, and counters are modifications."),
    MORPH("You may cast this card face down as a 2/2 creature for {3}. Turn it face up any time for its morph cost."),
    MULTIKICKER("You may pay an additional {~} any number of times as you cast this spell."),
    OUTLAST("{~}, {T}: Put a +1/+1 counter on this creature. Outlast only as a sorcery."),
    PARTNER("You can have two commanders if both have partner."),
    PARTY("Your party consists of up to one each of Cleric, Rogue, Warrior, and Wizard."),
    PERSIST("When this creature dies, if it had no -1/-1 counters on it, return it to the battlefield under its owner's control with a -1/-1 counter on it."),
    PROLIFERATE("Choose any number of permanents and/or players, then give each another counter of each kind already there."),
    PROWESS("Whenever you cast a noncreature spell, this creature gets +1/+1 until end of turn."),
    RAVENOUS("This creature enters the battlefield with X +1/+1 counters on it. If X is 5 or more, draw a card when it enters."),
    REACH("This creature can block creatures with flying."),
    RECONFIGURE("{~}: Attach to target creature you control; or unattach from a creature. Reconfigure only as a sorcery. While attached, this isn't a creature."),
    RENOWN("When this creature deals combat damage to a player, if it isn't renowned, put a +1/+1 counter on it and it becomes renowned."),
    SHIELD_COUNTER("If it would be dealt damage or destroyed, remove a shield counter from it instead."),
    SHROUD("It can't be the target of spells or abilities."),
    SNOW_MANA("{S} can be paid with one mana from a snow source."),
    SPLIT_SECOND("As long as this spell is on the stack, players can't cast spells or activate abilities that aren't mana abilities."),
    STORM("When you cast this spell, copy it for each spell cast before it this turn."),
    TOXIC("Players dealt combat damage by this creature also get a poison counter."),
    TRAINING("Whenever this creature attacks with another creature with greater power, put a +1/+1 counter on this creature."),
    TRAMPLE("This creature can deal excess combat damage to the player or planeswalker it's attacking."),
    UNEARTH("{~}: Return this card from your graveyard to the battlefield. It gains haste. Exile it at the beginning of the next end step or if it would leave the battlefield. Unearth only as a sorcery."),
    VIGILANCE("Attacking doesn't cause it to tap."),
    WARD("Whenever this creature becomes the target of a spell or ability an opponent controls, counter it unless that player pays {~}."),

    // Plural
    BOLSTER_PLURAL(""),
    FABRICATE_PLURAL("When this creature enters the battlefield, put {~} +1/+1 counters on it or create {~} 1/1 colorless Servo artifact creature tokens."),
    FADING_PLURAL("This creature enters the battlefield with {~} fade counters on it. At the beginning of your upkeep, remove a fade counter from it. If you can't, sacrifice it."),
    RENOWN_PLURAL("When this creature deals combat damage to a player, if it isn't renowned, put {~} +1/+1 counters on it and it becomes renowned."),

    // Devotion
    DEVOTION_WHITE("Each {W} in the mana costs of permanents you control counts toward your devotion to white."),
    DEVOTION_BLUE("Each {U} in the mana costs of permanents you control counts toward your devotion to blue."),
    DEVOTION_BLACK("Each {B} in the mana costs of permanents you control counts toward your devotion to black."),
    DEVOTION_RED("Each {R} in the mana costs of permanents you control counts toward your devotion to red."),
    DEVOTION_GREEN("Each {G} in the mana costs of permanents you control counts toward your devotion to green."),

    // Landwalk
    PLAINSWALK("This creature can't be blocked as long as defending player controls a Plains."),
    ISLANDWALK("This creature can't be blocked as long as defending player controls a Island."),
    SWAMPWALK("This creature can't be blocked as long as defending player controls a Swamp."),
    MOUNTAINWALK("This creature can't be blocked as long as defending player controls a Mountain."),
    FORESTWALK("This creature can't be blocked as long as defending player controls a Forest."),
    DESERTWALK("This creature can't be blocked as long as defending player controls a Desert."),

    // Cycling
    CYCLING("{~}, Discard this card: Draw a card."),
    BASIC_LANDCYCLING("{~}, Discard this card: Search your library for a basic land card, reveal it, put it into your hand, then shuffle"),
    PLAINSCYCLING("{~}, Discard this card: Search your library for a Plains card, reveal it, put it into your hand, then shuffle."),

    // Unset
    CONTRAPTION("Put the top card of your Contraption deck face up onto one of your sprockets."),
    WORDY("A spell is wordy if it has four or more lines of rules text."),
    ;

    private final String text;

    ReminderText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "<i>(" + text + ")</i>";
    }

    public String getWithSymbol(String symbol) {
        return this.toString().replace("{~}", symbol);
    }
}
