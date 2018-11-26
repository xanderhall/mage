package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public final class ChampionsOfKamigawa extends ExpansionSet {

    private static final ChampionsOfKamigawa instance = new ChampionsOfKamigawa();

    public static ChampionsOfKamigawa getInstance() {
        return instance;
    }

    private ChampionsOfKamigawa() {
        super("Champions of Kamigawa", "CHK", ExpansionSet.buildDate(2004, 9, 1), SetType.EXPANSION);
        this.blockName = "Kamigawa";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Akki Avalanchers", 151, Rarity.COMMON, mage.cards.a.AkkiAvalanchers.class));
        cards.add(new SetCardInfo("Akki Coalflinger", 152, Rarity.UNCOMMON, mage.cards.a.AkkiCoalflinger.class));
        cards.add(new SetCardInfo("Akki Lavarunner", 153, Rarity.RARE, mage.cards.a.AkkiLavarunner.class));
        cards.add(new SetCardInfo("Akki Rockspeaker", 154, Rarity.COMMON, mage.cards.a.AkkiRockspeaker.class));
        cards.add(new SetCardInfo("Akki Underminer", 155, Rarity.UNCOMMON, mage.cards.a.AkkiUnderminer.class));
        cards.add(new SetCardInfo("Ashen-Skin Zubera", 101, Rarity.COMMON, mage.cards.a.AshenSkinZubera.class));
        cards.add(new SetCardInfo("Aura of Dominion", 51, Rarity.UNCOMMON, mage.cards.a.AuraOfDominion.class));
        cards.add(new SetCardInfo("Azami, Lady of Scrolls", 52, Rarity.RARE, mage.cards.a.AzamiLadyOfScrolls.class));
        cards.add(new SetCardInfo("Azusa, Lost but Seeking", 201, Rarity.RARE, mage.cards.a.AzusaLostButSeeking.class));
        cards.add(new SetCardInfo("Battle-Mad Ronin", 156, Rarity.COMMON, mage.cards.b.BattleMadRonin.class));
        cards.add(new SetCardInfo("Befoul", 102, Rarity.COMMON, mage.cards.b.Befoul.class));
        cards.add(new SetCardInfo("Ben-Ben, Akki Hermit", 157, Rarity.RARE, mage.cards.b.BenBenAkkiHermit.class));
        cards.add(new SetCardInfo("Blessed Breath", 1, Rarity.COMMON, mage.cards.b.BlessedBreath.class));
        cards.add(new SetCardInfo("Blind with Anger", 158, Rarity.UNCOMMON, mage.cards.b.BlindWithAnger.class));
        cards.add(new SetCardInfo("Blood Rites", 159, Rarity.UNCOMMON, mage.cards.b.BloodRites.class));
        cards.add(new SetCardInfo("Blood Speaker", 103, Rarity.UNCOMMON, mage.cards.b.BloodSpeaker.class));
        cards.add(new SetCardInfo("Bloodthirsty Ogre", 104, Rarity.UNCOMMON, mage.cards.b.BloodthirstyOgre.class));
        cards.add(new SetCardInfo("Boseiju, Who Shelters All", 273, Rarity.RARE, mage.cards.b.BoseijuWhoSheltersAll.class));
        cards.add(new SetCardInfo("Brothers Yamazaki", "160a", Rarity.UNCOMMON, mage.cards.b.BrothersYamazaki.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brothers Yamazaki", "160b", Rarity.UNCOMMON, mage.cards.b.BrothersYamazaki.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brutal Deceiver", 161, Rarity.COMMON, mage.cards.b.BrutalDeceiver.class));
        cards.add(new SetCardInfo("Budoka Gardener", 202, Rarity.RARE, mage.cards.b.BudokaGardener.class));
        cards.add(new SetCardInfo("Burr Grafter", 203, Rarity.COMMON, mage.cards.b.BurrGrafter.class));
        cards.add(new SetCardInfo("Bushi Tenderfoot", 2, Rarity.UNCOMMON, mage.cards.b.BushiTenderfoot.class));
        cards.add(new SetCardInfo("Cage of Hands", 3, Rarity.COMMON, mage.cards.c.CageOfHands.class));
        cards.add(new SetCardInfo("Call to Glory", 4, Rarity.COMMON, mage.cards.c.CallToGlory.class));
        cards.add(new SetCardInfo("Callous Deceiver", 53, Rarity.COMMON, mage.cards.c.CallousDeceiver.class));
        cards.add(new SetCardInfo("Candles' Glow", 5, Rarity.UNCOMMON, mage.cards.c.CandlesGlow.class));
        cards.add(new SetCardInfo("Cleanfall", 6, Rarity.UNCOMMON, mage.cards.c.Cleanfall.class));
        cards.add(new SetCardInfo("Cloudcrest Lake", 274, Rarity.UNCOMMON, mage.cards.c.CloudcrestLake.class));
        cards.add(new SetCardInfo("Commune with Nature", 204, Rarity.COMMON, mage.cards.c.CommuneWithNature.class));
        cards.add(new SetCardInfo("Consuming Vortex", 54, Rarity.COMMON, mage.cards.c.ConsumingVortex.class));
        cards.add(new SetCardInfo("Counsel of the Soratami", 55, Rarity.COMMON, mage.cards.c.CounselOfTheSoratami.class));
        cards.add(new SetCardInfo("Cranial Extraction", 105, Rarity.RARE, mage.cards.c.CranialExtraction.class));
        cards.add(new SetCardInfo("Cruel Deceiver", 106, Rarity.COMMON, mage.cards.c.CruelDeceiver.class));
        cards.add(new SetCardInfo("Crushing Pain", 162, Rarity.COMMON, mage.cards.c.CrushingPain.class));
        cards.add(new SetCardInfo("Cursed Ronin", 107, Rarity.COMMON, mage.cards.c.CursedRonin.class));
        cards.add(new SetCardInfo("Cut the Tethers", 56, Rarity.UNCOMMON, mage.cards.c.CutTheTethers.class));
        cards.add(new SetCardInfo("Dampen Thought", 57, Rarity.UNCOMMON, mage.cards.d.DampenThought.class));
        cards.add(new SetCardInfo("Dance of Shadows", 108, Rarity.UNCOMMON, mage.cards.d.DanceOfShadows.class));
        cards.add(new SetCardInfo("Deathcurse Ogre", 109, Rarity.COMMON, mage.cards.d.DeathcurseOgre.class));
        cards.add(new SetCardInfo("Desperate Ritual", 163, Rarity.COMMON, mage.cards.d.DesperateRitual.class));
        cards.add(new SetCardInfo("Devoted Retainer", 7, Rarity.COMMON, mage.cards.d.DevotedRetainer.class));
        cards.add(new SetCardInfo("Devouring Greed", 110, Rarity.COMMON, mage.cards.d.DevouringGreed.class));
        cards.add(new SetCardInfo("Devouring Rage", 164, Rarity.COMMON, mage.cards.d.DevouringRage.class));
        cards.add(new SetCardInfo("Distress", 111, Rarity.COMMON, mage.cards.d.Distress.class));
        cards.add(new SetCardInfo("Dosan the Falling Leaf", 205, Rarity.RARE, mage.cards.d.DosanTheFallingLeaf.class));
        cards.add(new SetCardInfo("Dripping-Tongue Zubera", 206, Rarity.COMMON, mage.cards.d.DrippingTongueZubera.class));
        cards.add(new SetCardInfo("Earthshaker", 165, Rarity.UNCOMMON, mage.cards.e.Earthshaker.class));
        cards.add(new SetCardInfo("Eerie Procession", 58, Rarity.UNCOMMON, mage.cards.e.EerieProcession.class));
        cards.add(new SetCardInfo("Eiganjo Castle", 275, Rarity.RARE, mage.cards.e.EiganjoCastle.class));
        cards.add(new SetCardInfo("Eight-and-a-Half-Tails", 8, Rarity.RARE, mage.cards.e.EightAndAHalfTails.class));
        cards.add(new SetCardInfo("Ember-Fist Zubera", 166, Rarity.COMMON, mage.cards.e.EmberFistZubera.class));
        cards.add(new SetCardInfo("Ethereal Haze", 9, Rarity.COMMON, mage.cards.e.EtherealHaze.class));
        cards.add(new SetCardInfo("Eye of Nowhere", 59, Rarity.COMMON, mage.cards.e.EyeOfNowhere.class));
        cards.add(new SetCardInfo("Feast of Worms", 207, Rarity.UNCOMMON, mage.cards.f.FeastOfWorms.class));
        cards.add(new SetCardInfo("Feral Deceiver", 208, Rarity.COMMON, mage.cards.f.FeralDeceiver.class));
        cards.add(new SetCardInfo("Field of Reality", 60, Rarity.COMMON, mage.cards.f.FieldOfReality.class));
        cards.add(new SetCardInfo("Floating-Dream Zubera", 61, Rarity.COMMON, mage.cards.f.FloatingDreamZubera.class));
        cards.add(new SetCardInfo("Forbidden Orchard", 276, Rarity.RARE, mage.cards.f.ForbiddenOrchard.class));
        cards.add(new SetCardInfo("Forest", 303, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 304, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 305, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 306, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frostwielder", 167, Rarity.COMMON, mage.cards.f.Frostwielder.class));
        cards.add(new SetCardInfo("Gale Force", 209, Rarity.UNCOMMON, mage.cards.g.GaleForce.class));
        cards.add(new SetCardInfo("General's Kabuto", 251, Rarity.RARE, mage.cards.g.GeneralsKabuto.class));
        cards.add(new SetCardInfo("Ghostly Prison", 10, Rarity.UNCOMMON, mage.cards.g.GhostlyPrison.class));
        cards.add(new SetCardInfo("Gibbering Kami", 112, Rarity.COMMON, mage.cards.g.GibberingKami.class));
        cards.add(new SetCardInfo("Gifts Ungiven", 62, Rarity.RARE, mage.cards.g.GiftsUngiven.class));
        cards.add(new SetCardInfo("Glacial Ray", 168, Rarity.COMMON, mage.cards.g.GlacialRay.class));
        cards.add(new SetCardInfo("Glimpse of Nature", 210, Rarity.RARE, mage.cards.g.GlimpseOfNature.class));
        cards.add(new SetCardInfo("Godo, Bandit Warlord", 169, Rarity.RARE, mage.cards.g.GodoBanditWarlord.class));
        cards.add(new SetCardInfo("Graceful Adept", 63, Rarity.UNCOMMON, mage.cards.g.GracefulAdept.class));
        cards.add(new SetCardInfo("Guardian of Solitude", 64, Rarity.UNCOMMON, mage.cards.g.GuardianOfSolitude.class));
        cards.add(new SetCardInfo("Gutwrencher Oni", 113, Rarity.UNCOMMON, mage.cards.g.GutwrencherOni.class));
        cards.add(new SetCardInfo("Hair-Strung Koto", 252, Rarity.RARE, mage.cards.h.HairStrungKoto.class));
        cards.add(new SetCardInfo("Hall of the Bandit Lord", 277, Rarity.RARE, mage.cards.h.HallOfTheBanditLord.class));
        cards.add(new SetCardInfo("Hana Kami", 211, Rarity.UNCOMMON, mage.cards.h.HanaKami.class));
        cards.add(new SetCardInfo("Hanabi Blast", 170, Rarity.UNCOMMON, mage.cards.h.HanabiBlast.class));
        cards.add(new SetCardInfo("Hankyu", 253, Rarity.UNCOMMON, mage.cards.h.Hankyu.class));
        cards.add(new SetCardInfo("Harsh Deceiver", 11, Rarity.COMMON, mage.cards.h.HarshDeceiver.class));
        cards.add(new SetCardInfo("He Who Hungers", 114, Rarity.RARE, mage.cards.h.HeWhoHungers.class));
        cards.add(new SetCardInfo("Heartbeat of Spring", 212, Rarity.RARE, mage.cards.h.HeartbeatOfSpring.class));
        cards.add(new SetCardInfo("Hearth Kami", 171, Rarity.COMMON, mage.cards.h.HearthKami.class));
        cards.add(new SetCardInfo("Hideous Laughter", 115, Rarity.UNCOMMON, mage.cards.h.HideousLaughter.class));
        cards.add(new SetCardInfo("Hikari, Twilight Guardian", 12, Rarity.RARE, mage.cards.h.HikariTwilightGuardian.class));
        cards.add(new SetCardInfo("Hinder", 65, Rarity.UNCOMMON, mage.cards.h.Hinder.class));
        cards.add(new SetCardInfo("Hisoka's Defiance", 67, Rarity.COMMON, mage.cards.h.HisokasDefiance.class));
        cards.add(new SetCardInfo("Hisoka's Guard", 68, Rarity.COMMON, mage.cards.h.HisokasGuard.class));
        cards.add(new SetCardInfo("Hisoka, Minamo Sensei", 66, Rarity.RARE, mage.cards.h.HisokaMinamoSensei.class));
        cards.add(new SetCardInfo("Hold the Line", 13, Rarity.RARE, mage.cards.h.HoldTheLine.class));
        cards.add(new SetCardInfo("Honden of Cleansing Fire", 14, Rarity.UNCOMMON, mage.cards.h.HondenOfCleansingFire.class));
        cards.add(new SetCardInfo("Honden of Infinite Rage", 172, Rarity.UNCOMMON, mage.cards.h.HondenOfInfiniteRage.class));
        cards.add(new SetCardInfo("Honden of Life's Web", 213, Rarity.UNCOMMON, mage.cards.h.HondenOfLifesWeb.class));
        cards.add(new SetCardInfo("Honden of Night's Reach", 116, Rarity.UNCOMMON, mage.cards.h.HondenOfNightsReach.class));
        cards.add(new SetCardInfo("Honden of Seeing Winds", 69, Rarity.UNCOMMON, mage.cards.h.HondenOfSeeingWinds.class));
        cards.add(new SetCardInfo("Honor-Worn Shaku", 254, Rarity.UNCOMMON, mage.cards.h.HonorWornShaku.class));
        cards.add(new SetCardInfo("Horizon Seed", 15, Rarity.UNCOMMON, mage.cards.h.HorizonSeed.class));
        cards.add(new SetCardInfo("Horobi, Death's Wail", 117, Rarity.RARE, mage.cards.h.HorobiDeathsWail.class));
        cards.add(new SetCardInfo("Humble Budoka", 214, Rarity.COMMON, mage.cards.h.HumbleBudoka.class));
        cards.add(new SetCardInfo("Hundred-Talon Kami", 16, Rarity.COMMON, mage.cards.h.HundredTalonKami.class));
        cards.add(new SetCardInfo("Imi Statue", 255, Rarity.RARE, mage.cards.i.ImiStatue.class));
        cards.add(new SetCardInfo("Iname, Death Aspect", 118, Rarity.RARE, mage.cards.i.InameDeathAspect.class));
        cards.add(new SetCardInfo("Iname, Life Aspect", 215, Rarity.RARE, mage.cards.i.InameLifeAspect.class));
        cards.add(new SetCardInfo("Indomitable Will", 17, Rarity.COMMON, mage.cards.i.IndomitableWill.class));
        cards.add(new SetCardInfo("Initiate of Blood", 173, Rarity.UNCOMMON, mage.cards.i.InitiateOfBlood.class));
        cards.add(new SetCardInfo("Innocence Kami", 18, Rarity.UNCOMMON, mage.cards.i.InnocenceKami.class));
        cards.add(new SetCardInfo("Isamaru, Hound of Konda", 19, Rarity.RARE, mage.cards.i.IsamaruHoundOfKonda.class));
        cards.add(new SetCardInfo("Island", 291, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 292, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 293, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 294, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jade Idol", 256, Rarity.UNCOMMON, mage.cards.j.JadeIdol.class));
        cards.add(new SetCardInfo("Journeyer's Kite", 257, Rarity.RARE, mage.cards.j.JourneyersKite.class));
        cards.add(new SetCardInfo("Joyous Respite", 216, Rarity.COMMON, mage.cards.j.JoyousRespite.class));
        cards.add(new SetCardInfo("Jugan, the Rising Star", 217, Rarity.RARE, mage.cards.j.JuganTheRisingStar.class));
        cards.add(new SetCardInfo("Jukai Messenger", 218, Rarity.COMMON, mage.cards.j.JukaiMessenger.class));
        cards.add(new SetCardInfo("Junkyo Bell", 258, Rarity.RARE, mage.cards.j.JunkyoBell.class));
        cards.add(new SetCardInfo("Jushi Apprentice", 70, Rarity.RARE, mage.cards.j.JushiApprentice.class));
        cards.add(new SetCardInfo("Kabuto Moth", 20, Rarity.COMMON, mage.cards.k.KabutoMoth.class));
        cards.add(new SetCardInfo("Kami of Ancient Law", 21, Rarity.COMMON, mage.cards.k.KamiOfAncientLaw.class));
        cards.add(new SetCardInfo("Kami of Fire's Roar", 174, Rarity.COMMON, mage.cards.k.KamiOfFiresRoar.class));
        cards.add(new SetCardInfo("Kami of Lunacy", 119, Rarity.UNCOMMON, mage.cards.k.KamiOfLunacy.class));
        cards.add(new SetCardInfo("Kami of Old Stone", 22, Rarity.UNCOMMON, mage.cards.k.KamiOfOldStone.class));
        cards.add(new SetCardInfo("Kami of the Hunt", 219, Rarity.COMMON, mage.cards.k.KamiOfTheHunt.class));
        cards.add(new SetCardInfo("Kami of the Painted Road", 23, Rarity.COMMON, mage.cards.k.KamiOfThePaintedRoad.class));
        cards.add(new SetCardInfo("Kami of the Palace Fields", 24, Rarity.UNCOMMON, mage.cards.k.KamiOfThePalaceFields.class));
        cards.add(new SetCardInfo("Kami of the Waning Moon", 120, Rarity.COMMON, mage.cards.k.KamiOfTheWaningMoon.class));
        cards.add(new SetCardInfo("Kami of Twisted Reflection", 71, Rarity.COMMON, mage.cards.k.KamiOfTwistedReflection.class));
        cards.add(new SetCardInfo("Kashi-Tribe Reaver", 220, Rarity.UNCOMMON, mage.cards.k.KashiTribeReaver.class));
        cards.add(new SetCardInfo("Kashi-Tribe Warriors", 221, Rarity.COMMON, mage.cards.k.KashiTribeWarriors.class));
        cards.add(new SetCardInfo("Keiga, the Tide Star", 72, Rarity.RARE, mage.cards.k.KeigaTheTideStar.class));
        cards.add(new SetCardInfo("Kiki-Jiki, Mirror Breaker", 175, Rarity.RARE, mage.cards.k.KikiJikiMirrorBreaker.class));
        cards.add(new SetCardInfo("Kiku, Night's Flower", 121, Rarity.RARE, mage.cards.k.KikuNightsFlower.class));
        cards.add(new SetCardInfo("Kitsune Blademaster", 25, Rarity.COMMON, mage.cards.k.KitsuneBlademaster.class));
        cards.add(new SetCardInfo("Kitsune Diviner", 26, Rarity.COMMON, mage.cards.k.KitsuneDiviner.class));
        cards.add(new SetCardInfo("Kitsune Healer", 27, Rarity.COMMON, mage.cards.k.KitsuneHealer.class));
        cards.add(new SetCardInfo("Kitsune Mystic", 28, Rarity.RARE, mage.cards.k.KitsuneMystic.class));
        cards.add(new SetCardInfo("Kitsune Riftwalker", 29, Rarity.COMMON, mage.cards.k.KitsuneRiftwalker.class));
        cards.add(new SetCardInfo("Kodama of the North Tree", 222, Rarity.RARE, mage.cards.k.KodamaOfTheNorthTree.class));
        cards.add(new SetCardInfo("Kodama of the South Tree", 223, Rarity.RARE, mage.cards.k.KodamaOfTheSouthTree.class));
        cards.add(new SetCardInfo("Kodama's Might", 224, Rarity.COMMON, mage.cards.k.KodamasMight.class));
        cards.add(new SetCardInfo("Kodama's Reach", 225, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Kokusho, the Evening Star", 122, Rarity.RARE, mage.cards.k.KokushoTheEveningStar.class));
        cards.add(new SetCardInfo("Konda's Banner", 259, Rarity.RARE, mage.cards.k.KondasBanner.class));
        cards.add(new SetCardInfo("Konda's Hatamoto", 31, Rarity.UNCOMMON, mage.cards.k.KondasHatamoto.class));
        cards.add(new SetCardInfo("Konda, Lord of Eiganjo", 30, Rarity.RARE, mage.cards.k.KondaLordOfEiganjo.class));
        cards.add(new SetCardInfo("Kumano's Pupils", 177, Rarity.UNCOMMON, mage.cards.k.KumanosPupils.class));
        cards.add(new SetCardInfo("Kumano, Master Yamabushi", 176, Rarity.RARE, mage.cards.k.KumanoMasterYamabushi.class));
        cards.add(new SetCardInfo("Kuro, Pitlord", 123, Rarity.RARE, mage.cards.k.KuroPitlord.class));
        cards.add(new SetCardInfo("Kusari-Gama", 260, Rarity.RARE, mage.cards.k.KusariGama.class));
        cards.add(new SetCardInfo("Lantern Kami", 32, Rarity.COMMON, mage.cards.l.LanternKami.class));
        cards.add(new SetCardInfo("Lantern-Lit Graveyard", 278, Rarity.UNCOMMON, mage.cards.l.LanternLitGraveyard.class));
        cards.add(new SetCardInfo("Lava Spike", 178, Rarity.COMMON, mage.cards.l.LavaSpike.class));
        cards.add(new SetCardInfo("Lifted by Clouds", 73, Rarity.COMMON, mage.cards.l.LiftedByClouds.class));
        cards.add(new SetCardInfo("Long-Forgotten Gohei", 261, Rarity.RARE, mage.cards.l.LongForgottenGohei.class));
        cards.add(new SetCardInfo("Lure", 226, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Mana Seism", 179, Rarity.UNCOMMON, mage.cards.m.ManaSeism.class));
        cards.add(new SetCardInfo("Marrow-Gnawer", 124, Rarity.RARE, mage.cards.m.MarrowGnawer.class));
        cards.add(new SetCardInfo("Masako the Humorless", 33, Rarity.RARE, mage.cards.m.MasakoTheHumorless.class));
        cards.add(new SetCardInfo("Matsu-Tribe Decoy", 227, Rarity.COMMON, mage.cards.m.MatsuTribeDecoy.class));
        cards.add(new SetCardInfo("Meloku the Clouded Mirror", 74, Rarity.RARE, mage.cards.m.MelokuTheCloudedMirror.class));
        cards.add(new SetCardInfo("Midnight Covenant", 125, Rarity.COMMON, mage.cards.m.MidnightCovenant.class));
        cards.add(new SetCardInfo("Minamo, School at Water's Edge", 279, Rarity.RARE, mage.cards.m.MinamoSchoolAtWatersEdge.class));
        cards.add(new SetCardInfo("Mindblaze", 180, Rarity.RARE, mage.cards.m.Mindblaze.class));
        cards.add(new SetCardInfo("Moonring Mirror", 262, Rarity.RARE, mage.cards.m.MoonringMirror.class));
        cards.add(new SetCardInfo("Moss Kami", 228, Rarity.COMMON, mage.cards.m.MossKami.class));
        cards.add(new SetCardInfo("Mothrider Samurai", 34, Rarity.COMMON, mage.cards.m.MothriderSamurai.class));
        cards.add(new SetCardInfo("Mountain", 299, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 300, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 301, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 302, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myojin of Cleansing Fire", 35, Rarity.RARE, mage.cards.m.MyojinOfCleansingFire.class));
        cards.add(new SetCardInfo("Myojin of Infinite Rage", 181, Rarity.RARE, mage.cards.m.MyojinOfInfiniteRage.class));
        cards.add(new SetCardInfo("Myojin of Life's Web", 229, Rarity.RARE, mage.cards.m.MyojinOfLifesWeb.class));
        cards.add(new SetCardInfo("Myojin of Night's Reach", 126, Rarity.RARE, mage.cards.m.MyojinOfNightsReach.class));
        cards.add(new SetCardInfo("Myojin of Seeing Winds", 75, Rarity.RARE, mage.cards.m.MyojinOfSeeingWinds.class));
        cards.add(new SetCardInfo("Mystic Restraints", 76, Rarity.COMMON, mage.cards.m.MysticRestraints.class));
        cards.add(new SetCardInfo("Nagao, Bound by Honor", 36, Rarity.UNCOMMON, mage.cards.n.NagaoBoundByHonor.class));
        cards.add(new SetCardInfo("Nature's Will", 230, Rarity.RARE, mage.cards.n.NaturesWill.class));
        cards.add(new SetCardInfo("Nezumi Bone-Reader", 127, Rarity.UNCOMMON, mage.cards.n.NezumiBoneReader.class));
        cards.add(new SetCardInfo("Nezumi Cutthroat", 128, Rarity.COMMON, mage.cards.n.NezumiCutthroat.class));
        cards.add(new SetCardInfo("Nezumi Graverobber", 129, Rarity.UNCOMMON, mage.cards.n.NezumiGraverobber.class));
        cards.add(new SetCardInfo("Nezumi Ronin", 130, Rarity.COMMON, mage.cards.n.NezumiRonin.class));
        cards.add(new SetCardInfo("Nezumi Shortfang", 131, Rarity.RARE, mage.cards.n.NezumiShortfang.class));
        cards.add(new SetCardInfo("Night Dealings", 132, Rarity.RARE, mage.cards.n.NightDealings.class));
        cards.add(new SetCardInfo("Night of Souls' Betrayal", 133, Rarity.RARE, mage.cards.n.NightOfSoulsBetrayal.class));
        cards.add(new SetCardInfo("Nine-Ringed Bo", 263, Rarity.UNCOMMON, mage.cards.n.NineRingedBo.class));
        cards.add(new SetCardInfo("No-Dachi", 264, Rarity.UNCOMMON, mage.cards.n.NoDachi.class));
        cards.add(new SetCardInfo("Numai Outcast", 134, Rarity.UNCOMMON, mage.cards.n.NumaiOutcast.class));
        cards.add(new SetCardInfo("Oathkeeper, Takeno's Daisho", 265, Rarity.RARE, mage.cards.o.OathkeeperTakenosDaisho.class));
        cards.add(new SetCardInfo("Okina, Temple to the Grandfathers", 280, Rarity.RARE, mage.cards.o.OkinaTempleToTheGrandfathers.class));
        cards.add(new SetCardInfo("Oni Possession", 135, Rarity.UNCOMMON, mage.cards.o.OniPossession.class));
        cards.add(new SetCardInfo("Orbweaver Kumo", 231, Rarity.UNCOMMON, mage.cards.o.OrbweaverKumo.class));
        cards.add(new SetCardInfo("Order of the Sacred Bell", 232, Rarity.COMMON, mage.cards.o.OrderOfTheSacredBell.class));
        cards.add(new SetCardInfo("Ore Gorger", 182, Rarity.UNCOMMON, mage.cards.o.OreGorger.class));
        cards.add(new SetCardInfo("Orochi Eggwatcher", 233, Rarity.UNCOMMON, mage.cards.o.OrochiEggwatcher.class));
        cards.add(new SetCardInfo("Orochi Hatchery", 266, Rarity.RARE, mage.cards.o.OrochiHatchery.class));
        cards.add(new SetCardInfo("Orochi Leafcaller", 234, Rarity.COMMON, mage.cards.o.OrochiLeafcaller.class));
        cards.add(new SetCardInfo("Orochi Ranger", 235, Rarity.COMMON, mage.cards.o.OrochiRanger.class));
        cards.add(new SetCardInfo("Orochi Sustainer", 236, Rarity.COMMON, mage.cards.o.OrochiSustainer.class));
        cards.add(new SetCardInfo("Otherworldly Journey", 37, Rarity.UNCOMMON, mage.cards.o.OtherworldlyJourney.class));
        cards.add(new SetCardInfo("Pain Kami", 183, Rarity.UNCOMMON, mage.cards.p.PainKami.class));
        cards.add(new SetCardInfo("Painwracker Oni", 136, Rarity.UNCOMMON, mage.cards.p.PainwrackerOni.class));
        cards.add(new SetCardInfo("Part the Veil", 77, Rarity.RARE, mage.cards.p.PartTheVeil.class));
        cards.add(new SetCardInfo("Peer Through Depths", 78, Rarity.COMMON, mage.cards.p.PeerThroughDepths.class));
        cards.add(new SetCardInfo("Petals of Insight", 79, Rarity.UNCOMMON, mage.cards.p.PetalsOfInsight.class));
        cards.add(new SetCardInfo("Pinecrest Ridge", 281, Rarity.UNCOMMON, mage.cards.p.PinecrestRidge.class));
        cards.add(new SetCardInfo("Pious Kitsune", 38, Rarity.COMMON, mage.cards.p.PiousKitsune.class));
        cards.add(new SetCardInfo("Plains", 287, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 288, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 289, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 290, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Psychic Puppetry", 80, Rarity.COMMON, mage.cards.p.PsychicPuppetry.class));
        cards.add(new SetCardInfo("Pull Under", 137, Rarity.COMMON, mage.cards.p.PullUnder.class));
        cards.add(new SetCardInfo("Quiet Purity", 39, Rarity.COMMON, mage.cards.q.QuietPurity.class));
        cards.add(new SetCardInfo("Rag Dealer", 138, Rarity.COMMON, mage.cards.r.RagDealer.class));
        cards.add(new SetCardInfo("Ragged Veins", 139, Rarity.COMMON, mage.cards.r.RaggedVeins.class));
        cards.add(new SetCardInfo("Reach Through Mists", 81, Rarity.COMMON, mage.cards.r.ReachThroughMists.class));
        cards.add(new SetCardInfo("Reciprocate", 40, Rarity.UNCOMMON, mage.cards.r.Reciprocate.class));
        cards.add(new SetCardInfo("Reito Lantern", 267, Rarity.UNCOMMON, mage.cards.r.ReitoLantern.class));
        cards.add(new SetCardInfo("Rend Flesh", 140, Rarity.COMMON, mage.cards.r.RendFlesh.class));
        cards.add(new SetCardInfo("Rend Spirit", 141, Rarity.COMMON, mage.cards.r.RendSpirit.class));
        cards.add(new SetCardInfo("Reverse the Sands", 41, Rarity.RARE, mage.cards.r.ReverseTheSands.class));
        cards.add(new SetCardInfo("Reweave", 82, Rarity.RARE, mage.cards.r.Reweave.class));
        cards.add(new SetCardInfo("River Kaijin", 83, Rarity.COMMON, mage.cards.r.RiverKaijin.class));
        cards.add(new SetCardInfo("Ronin Houndmaster", 184, Rarity.COMMON, mage.cards.r.RoninHoundmaster.class));
        cards.add(new SetCardInfo("Rootrunner", 237, Rarity.UNCOMMON, mage.cards.r.Rootrunner.class));
        cards.add(new SetCardInfo("Ryusei, the Falling Star", 185, Rarity.RARE, mage.cards.r.RyuseiTheFallingStar.class));
        cards.add(new SetCardInfo("Sachi, Daughter of Seshiro", 238, Rarity.UNCOMMON, mage.cards.s.SachiDaughterOfSeshiro.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 239, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Samurai Enforcers", 42, Rarity.UNCOMMON, mage.cards.s.SamuraiEnforcers.class));
        cards.add(new SetCardInfo("Samurai of the Pale Curtain", 43, Rarity.UNCOMMON, mage.cards.s.SamuraiOfThePaleCurtain.class));
        cards.add(new SetCardInfo("Scuttling Death", 142, Rarity.COMMON, mage.cards.s.ScuttlingDeath.class));
        cards.add(new SetCardInfo("Seizan, Perverter of Truth", 143, Rarity.RARE, mage.cards.s.SeizanPerverterOfTruth.class));
        cards.add(new SetCardInfo("Sensei Golden-Tail", 44, Rarity.RARE, mage.cards.s.SenseiGoldenTail.class));
        cards.add(new SetCardInfo("Sensei's Divining Top", 268, Rarity.UNCOMMON, mage.cards.s.SenseisDiviningTop.class));
        cards.add(new SetCardInfo("Serpent Skin", 240, Rarity.COMMON, mage.cards.s.SerpentSkin.class));
        cards.add(new SetCardInfo("Seshiro the Anointed", 241, Rarity.RARE, mage.cards.s.SeshiroTheAnointed.class));
        cards.add(new SetCardInfo("Shell of the Last Kappa", 269, Rarity.RARE, mage.cards.s.ShellOfTheLastKappa.class));
        cards.add(new SetCardInfo("Shimatsu the Bloodcloaked", 186, Rarity.RARE, mage.cards.s.ShimatsuTheBloodcloaked.class));
        cards.add(new SetCardInfo("Shinka, the Bloodsoaked Keep", 282, Rarity.RARE, mage.cards.s.ShinkaTheBloodsoakedKeep.class));
        cards.add(new SetCardInfo("Shisato, Whispering Hunter", 242, Rarity.RARE, mage.cards.s.ShisatoWhisperingHunter.class));
        cards.add(new SetCardInfo("Shizo, Death's Storehouse", 283, Rarity.RARE, mage.cards.s.ShizoDeathsStorehouse.class));
        cards.add(new SetCardInfo("Sideswipe", 187, Rarity.UNCOMMON, mage.cards.s.Sideswipe.class));
        cards.add(new SetCardInfo("Sift Through Sands", 84, Rarity.COMMON, mage.cards.s.SiftThroughSands.class));
        cards.add(new SetCardInfo("Silent-Chant Zubera", 45, Rarity.COMMON, mage.cards.s.SilentChantZubera.class));
        cards.add(new SetCardInfo("Sire of the Storm", 85, Rarity.UNCOMMON, mage.cards.s.SireOfTheStorm.class));
        cards.add(new SetCardInfo("Soilshaper", 243, Rarity.UNCOMMON, mage.cards.s.Soilshaper.class));
        cards.add(new SetCardInfo("Sokenzan Bruiser", 188, Rarity.COMMON, mage.cards.s.SokenzanBruiser.class));
        cards.add(new SetCardInfo("Soratami Cloudskater", 86, Rarity.COMMON, mage.cards.s.SoratamiCloudskater.class));
        cards.add(new SetCardInfo("Soratami Mirror-Guard", 87, Rarity.COMMON, mage.cards.s.SoratamiMirrorGuard.class));
        cards.add(new SetCardInfo("Soratami Mirror-Mage", 88, Rarity.UNCOMMON, mage.cards.s.SoratamiMirrorMage.class));
        cards.add(new SetCardInfo("Soratami Rainshaper", 89, Rarity.COMMON, mage.cards.s.SoratamiRainshaper.class));
        cards.add(new SetCardInfo("Soratami Savant", 90, Rarity.UNCOMMON, mage.cards.s.SoratamiSavant.class));
        cards.add(new SetCardInfo("Soratami Seer", 91, Rarity.UNCOMMON, mage.cards.s.SoratamiSeer.class));
        cards.add(new SetCardInfo("Sosuke, Son of Seshiro", 244, Rarity.UNCOMMON, mage.cards.s.SosukeSonOfSeshiro.class));
        cards.add(new SetCardInfo("Soul of Magma", 189, Rarity.COMMON, mage.cards.s.SoulOfMagma.class));
        cards.add(new SetCardInfo("Soulblast", 190, Rarity.RARE, mage.cards.s.Soulblast.class));
        cards.add(new SetCardInfo("Soulless Revival", 144, Rarity.COMMON, mage.cards.s.SoullessRevival.class));
        cards.add(new SetCardInfo("Squelch", 92, Rarity.UNCOMMON, mage.cards.s.Squelch.class));
        cards.add(new SetCardInfo("Stone Rain", 191, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Strange Inversion", 192, Rarity.UNCOMMON, mage.cards.s.StrangeInversion.class));
        cards.add(new SetCardInfo("Strength of Cedars", 245, Rarity.UNCOMMON, mage.cards.s.StrengthOfCedars.class));
        cards.add(new SetCardInfo("Struggle for Sanity", 145, Rarity.UNCOMMON, mage.cards.s.StruggleForSanity.class));
        cards.add(new SetCardInfo("Student of Elements", 93, Rarity.UNCOMMON, mage.cards.s.StudentOfElements.class));
        cards.add(new SetCardInfo("Swallowing Plague", 146, Rarity.UNCOMMON, mage.cards.s.SwallowingPlague.class));
        cards.add(new SetCardInfo("Swamp", 295, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 296, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 297, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 298, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Takeno, Samurai General", 46, Rarity.RARE, mage.cards.t.TakenoSamuraiGeneral.class));
        cards.add(new SetCardInfo("Tatsumasa, the Dragon's Fang", 270, Rarity.RARE, mage.cards.t.TatsumasaTheDragonsFang.class));
        cards.add(new SetCardInfo("Teller of Tales", 95, Rarity.COMMON, mage.cards.t.TellerOfTales.class));
        cards.add(new SetCardInfo("Tenza, Godo's Maul", 271, Rarity.UNCOMMON, mage.cards.t.TenzaGodosMaul.class));
        cards.add(new SetCardInfo("Terashi's Cry", 47, Rarity.COMMON, mage.cards.t.TerashisCry.class));
        cards.add(new SetCardInfo("The Unspeakable", 98, Rarity.RARE, mage.cards.t.TheUnspeakable.class));
        cards.add(new SetCardInfo("Thief of Hope", 147, Rarity.UNCOMMON, mage.cards.t.ThiefOfHope.class));
        cards.add(new SetCardInfo("Thoughtbind", 96, Rarity.COMMON, mage.cards.t.Thoughtbind.class));
        cards.add(new SetCardInfo("Thousand-legged Kami", 246, Rarity.UNCOMMON, mage.cards.t.ThousandLeggedKami.class));
        cards.add(new SetCardInfo("Through the Breach", 193, Rarity.RARE, mage.cards.t.ThroughTheBreach.class));
        cards.add(new SetCardInfo("Tide of War", 194, Rarity.RARE, mage.cards.t.TideOfWar.class));
        cards.add(new SetCardInfo("Time of Need", 247, Rarity.UNCOMMON, mage.cards.t.TimeOfNeed.class));
        cards.add(new SetCardInfo("Time Stop", 97, Rarity.RARE, mage.cards.t.TimeStop.class));
        cards.add(new SetCardInfo("Tranquil Garden", 284, Rarity.UNCOMMON, mage.cards.t.TranquilGarden.class));
        cards.add(new SetCardInfo("Uba Mask", 272, Rarity.RARE, mage.cards.u.UbaMask.class));
        cards.add(new SetCardInfo("Uncontrollable Anger", 195, Rarity.COMMON, mage.cards.u.UncontrollableAnger.class));
        cards.add(new SetCardInfo("Unearthly Blizzard", 196, Rarity.COMMON, mage.cards.u.UnearthlyBlizzard.class));
        cards.add(new SetCardInfo("Unnatural Speed", 197, Rarity.COMMON, mage.cards.u.UnnaturalSpeed.class));
        cards.add(new SetCardInfo("Untaidake, the Cloud Keeper", 285, Rarity.RARE, mage.cards.u.UntaidakeTheCloudKeeper.class));
        cards.add(new SetCardInfo("Uyo, Silent Prophet", 99, Rarity.RARE, mage.cards.u.UyoSilentProphet.class));
        cards.add(new SetCardInfo("Vassal's Duty", 48, Rarity.RARE, mage.cards.v.VassalsDuty.class));
        cards.add(new SetCardInfo("Venerable Kumo", 248, Rarity.COMMON, mage.cards.v.VenerableKumo.class));
        cards.add(new SetCardInfo("Vigilance", 49, Rarity.COMMON, mage.cards.v.Vigilance.class));
        cards.add(new SetCardInfo("Villainous Ogre", 148, Rarity.COMMON, mage.cards.v.VillainousOgre.class));
        cards.add(new SetCardInfo("Vine Kami", 249, Rarity.COMMON, mage.cards.v.VineKami.class));
        cards.add(new SetCardInfo("Waking Nightmare", 149, Rarity.COMMON, mage.cards.w.WakingNightmare.class));
        cards.add(new SetCardInfo("Wandering Ones", 100, Rarity.COMMON, mage.cards.w.WanderingOnes.class));
        cards.add(new SetCardInfo("Waterveil Cavern", 286, Rarity.UNCOMMON, mage.cards.w.WaterveilCavern.class));
        cards.add(new SetCardInfo("Wear Away", 250, Rarity.COMMON, mage.cards.w.WearAway.class));
        cards.add(new SetCardInfo("Wicked Akuba", 150, Rarity.COMMON, mage.cards.w.WickedAkuba.class));
        cards.add(new SetCardInfo("Yamabushi's Flame", 198, Rarity.COMMON, mage.cards.y.YamabushisFlame.class));
        cards.add(new SetCardInfo("Yamabushi's Storm", 199, Rarity.COMMON, mage.cards.y.YamabushisStorm.class));
        cards.add(new SetCardInfo("Yosei, the Morning Star", 50, Rarity.RARE, mage.cards.y.YoseiTheMorningStar.class));
        cards.add(new SetCardInfo("Zo-Zu the Punisher", 200, Rarity.RARE, mage.cards.z.ZoZuThePunisher.class));
    }
}