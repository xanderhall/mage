package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class WildsOfEldraineCommander extends ExpansionSet {

    private static final WildsOfEldraineCommander instance = new WildsOfEldraineCommander();

    public static WildsOfEldraineCommander getInstance() {
        return instance;
    }

    private WildsOfEldraineCommander() {
        super("Wilds of Eldraine Commander", "WOC", ExpansionSet.buildDate(2023, 9, 8), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Ajani's Chosen", 59, Rarity.RARE, mage.cards.a.AjanisChosen.class));
        cards.add(new SetCardInfo("Alela, Cunning Conqueror", 3, Rarity.MYTHIC, mage.cards.a.AlelaCunningConqueror.class));
        cards.add(new SetCardInfo("Ancestral Mask", 119, Rarity.COMMON, mage.cards.a.AncestralMask.class));
        cards.add(new SetCardInfo("Angelic Destiny", 60, Rarity.MYTHIC, mage.cards.a.AngelicDestiny.class));
        cards.add(new SetCardInfo("Arcane Denial", 84, Rarity.COMMON, mage.cards.a.ArcaneDenial.class));
        cards.add(new SetCardInfo("Arcane Signet", 367, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archmage of Echoes", 9, Rarity.RARE, mage.cards.a.ArchmageOfEchoes.class));
        cards.add(new SetCardInfo("Archon of Sun's Grace", 61, Rarity.RARE, mage.cards.a.ArchonOfSunsGrace.class));
        cards.add(new SetCardInfo("Aura Gnarlid", 120, Rarity.COMMON, mage.cards.a.AuraGnarlid.class));
        cards.add(new SetCardInfo("Austere Command", 62, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Bear Umbra", 121, Rarity.RARE, mage.cards.b.BearUmbra.class));
        cards.add(new SetCardInfo("Bojuka Bog", 152, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Brazen Borrower", 85, Rarity.MYTHIC, mage.cards.b.BrazenBorrower.class));
        cards.add(new SetCardInfo("Canopy Vista", 153, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Careful Cultivation", 122, Rarity.COMMON, mage.cards.c.CarefulCultivation.class));
        cards.add(new SetCardInfo("Castle Ardenvale", 154, Rarity.RARE, mage.cards.c.CastleArdenvale.class));
        cards.add(new SetCardInfo("Celestial Archon", 63, Rarity.RARE, mage.cards.c.CelestialArchon.class));
        cards.add(new SetCardInfo("Choked Estuary", 155, Rarity.RARE, mage.cards.c.ChokedEstuary.class));
        cards.add(new SetCardInfo("Cloud of Faeries", 86, Rarity.COMMON, mage.cards.c.CloudOfFaeries.class));
        cards.add(new SetCardInfo("Command Tower", 156, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Consider", 87, Rarity.COMMON, mage.cards.c.Consider.class));
        cards.add(new SetCardInfo("Court of Ardenvale", 21, Rarity.RARE, mage.cards.c.CourtOfArdenvale.class));
        cards.add(new SetCardInfo("Danitha Capashen, Paragon", 64, Rarity.UNCOMMON, mage.cards.d.DanithaCapashenParagon.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 157, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Daybreak Coronet", 65, Rarity.RARE, mage.cards.d.DaybreakCoronet.class));
        cards.add(new SetCardInfo("Destiny Spinner", 123, Rarity.UNCOMMON, mage.cards.d.DestinySpinner.class));
        cards.add(new SetCardInfo("Dig Through Time", 88, Rarity.RARE, mage.cards.d.DigThroughTime.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 158, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dimir Signet", 146, Rarity.UNCOMMON, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Distant Melody", 89, Rarity.COMMON, mage.cards.d.DistantMelody.class));
        cards.add(new SetCardInfo("Eidolon of Blossoms", 124, Rarity.RARE, mage.cards.e.EidolonOfBlossoms.class));
        cards.add(new SetCardInfo("Eidolon of Countless Battles", 66, Rarity.RARE, mage.cards.e.EidolonOfCountlessBattles.class));
        cards.add(new SetCardInfo("Ellivere of the Wild Court", 2, Rarity.MYTHIC, mage.cards.e.EllivereOfTheWildCourt.class));
        cards.add(new SetCardInfo("Enchantress's Presence", 125, Rarity.RARE, mage.cards.e.EnchantresssPresence.class));
        cards.add(new SetCardInfo("Ethereal Armor", 67, Rarity.COMMON, mage.cards.e.EtherealArmor.class));
        cards.add(new SetCardInfo("Exotic Orchard", 159, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Fact or Fiction", 90, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faerie Formation", 91, Rarity.RARE, mage.cards.f.FaerieFormation.class));
        cards.add(new SetCardInfo("Faerie Seer", 92, Rarity.COMMON, mage.cards.f.FaerieSeer.class));
        cards.add(new SetCardInfo("Fellwar Stone", 147, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Fertile Ground", 126, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Frantic Search", 93, Rarity.COMMON, mage.cards.f.FranticSearch.class));
        cards.add(new SetCardInfo("Generous Gift", 68, Rarity.UNCOMMON, mage.cards.g.GenerousGift.class));
        cards.add(new SetCardInfo("Glen Elendra Archmage", 94, Rarity.RARE, mage.cards.g.GlenElendraArchmage.class));
        cards.add(new SetCardInfo("Glen Elendra Liege", 138, Rarity.RARE, mage.cards.g.GlenElendraLiege.class));
        cards.add(new SetCardInfo("Gylwain, Casting Director", 4, Rarity.MYTHIC, mage.cards.g.GylwainCastingDirector.class));
        cards.add(new SetCardInfo("Hall of Heliod's Generosity", 162, Rarity.RARE, mage.cards.h.HallOfHeliodsGenerosity.class));
        cards.add(new SetCardInfo("Halo Forager", 139, Rarity.UNCOMMON, mage.cards.h.HaloForager.class));
        cards.add(new SetCardInfo("Hullbreaker Horror", 95, Rarity.RARE, mage.cards.h.HullbreakerHorror.class));
        cards.add(new SetCardInfo("Hypnotic Sprite", 96, Rarity.UNCOMMON, mage.cards.h.HypnoticSprite.class));
        cards.add(new SetCardInfo("Illusionist's Gambit", 97, Rarity.RARE, mage.cards.i.IllusionistsGambit.class));
        cards.add(new SetCardInfo("Indomitable Might", 127, Rarity.RARE, mage.cards.i.IndomitableMight.class));
        cards.add(new SetCardInfo("Jukai Naturalist", 140, Rarity.UNCOMMON, mage.cards.j.JukaiNaturalist.class));
        cards.add(new SetCardInfo("Keep Watch", 98, Rarity.COMMON, mage.cards.k.KeepWatch.class));
        cards.add(new SetCardInfo("Kenrith's Transformation", 128, Rarity.UNCOMMON, mage.cards.k.KenrithsTransformation.class));
        cards.add(new SetCardInfo("Kindred Dominance", 113, Rarity.RARE, mage.cards.k.KindredDominance.class));
        cards.add(new SetCardInfo("Kor Spiritdancer", 69, Rarity.RARE, mage.cards.k.KorSpiritdancer.class));
        cards.add(new SetCardInfo("Krosan Verge", 163, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Loamcrafter Faun", 19, Rarity.RARE, mage.cards.l.LoamcrafterFaun.class));
        cards.add(new SetCardInfo("Mantle of the Ancients", 70, Rarity.RARE, mage.cards.m.MantleOfTheAncients.class));
        cards.add(new SetCardInfo("Midnight Clock", 99, Rarity.RARE, mage.cards.m.MidnightClock.class));
        cards.add(new SetCardInfo("Mind Stone", 148, Rarity.COMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Myriad Landscape", 164, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Nightmare Unmaking", 114, Rarity.RARE, mage.cards.n.NightmareUnmaking.class));
        cards.add(new SetCardInfo("Nightveil Sprite", 100, Rarity.UNCOMMON, mage.cards.n.NightveilSprite.class));
        cards.add(new SetCardInfo("Nymris, Oona's Trickster", 141, Rarity.RARE, mage.cards.n.NymrisOonasTrickster.class));
        cards.add(new SetCardInfo("Oona, Queen of the Fae", 142, Rarity.RARE, mage.cards.o.OonaQueenOfTheFae.class));
        cards.add(new SetCardInfo("Opt", 101, Rarity.COMMON, mage.cards.o.Opt.class));
        cards.add(new SetCardInfo("Ox Drover", 6, Rarity.RARE, mage.cards.o.OxDrover.class));
        cards.add(new SetCardInfo("Paradise Druid", 129, Rarity.UNCOMMON, mage.cards.p.ParadiseDruid.class));
        cards.add(new SetCardInfo("Path of Ancestry", 165, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Perplexing Test", 102, Rarity.RARE, mage.cards.p.PerplexingTest.class));
        cards.add(new SetCardInfo("Pollenbright Wings", 143, Rarity.UNCOMMON, mage.cards.p.PollenbrightWings.class));
        cards.add(new SetCardInfo("Puppeteer Clique", 115, Rarity.RARE, mage.cards.p.PuppeteerClique.class));
        cards.add(new SetCardInfo("Quickling", 103, Rarity.UNCOMMON, mage.cards.q.Quickling.class));
        cards.add(new SetCardInfo("Rankle, Master of Pranks", 116, Rarity.RARE, mage.cards.r.RankleMasterOfPranks.class));
        cards.add(new SetCardInfo("Reality Shift", 104, Rarity.UNCOMMON, mage.cards.r.RealityShift.class));
        cards.add(new SetCardInfo("Realm-Cloaked Giant", 71, Rarity.MYTHIC, mage.cards.r.RealmCloakedGiant.class));
        cards.add(new SetCardInfo("Reckless Spite", 117, Rarity.UNCOMMON, mage.cards.r.RecklessSpite.class));
        cards.add(new SetCardInfo("Reconnaissance Mission", 105, Rarity.UNCOMMON, mage.cards.r.ReconnaissanceMission.class));
        cards.add(new SetCardInfo("Reflections of Littjara", 106, Rarity.RARE, mage.cards.r.ReflectionsOfLittjara.class));
        cards.add(new SetCardInfo("Repulse", 107, Rarity.COMMON, mage.cards.r.Repulse.class));
        cards.add(new SetCardInfo("Retether", 72, Rarity.RARE, mage.cards.r.Retether.class));
        cards.add(new SetCardInfo("Rishkar's Expertise", 130, Rarity.RARE, mage.cards.r.RishkarsExpertise.class));
        cards.add(new SetCardInfo("Run Away Together", 108, Rarity.COMMON, mage.cards.r.RunAwayTogether.class));
        cards.add(new SetCardInfo("Sage's Reverie", 73, Rarity.UNCOMMON, mage.cards.s.SagesReverie.class));
        cards.add(new SetCardInfo("Sanctum Weaver", 131, Rarity.RARE, mage.cards.s.SanctumWeaver.class));
        cards.add(new SetCardInfo("Scion of Oona", 109, Rarity.RARE, mage.cards.s.ScionOfOona.class));
        cards.add(new SetCardInfo("Secluded Glen", 166, Rarity.RARE, mage.cards.s.SecludedGlen.class));
        cards.add(new SetCardInfo("Setessan Champion", 132, Rarity.RARE, mage.cards.s.SetessanChampion.class));
        cards.add(new SetCardInfo("Shalai, Voice of Plenty", 74, Rarity.RARE, mage.cards.s.ShalaiVoiceOfPlenty.class));
        cards.add(new SetCardInfo("Siona, Captain of the Pyleas", 144, Rarity.UNCOMMON, mage.cards.s.SionaCaptainOfThePyleas.class));
        cards.add(new SetCardInfo("Snake Umbra", 133, Rarity.UNCOMMON, mage.cards.s.SnakeUmbra.class));
        cards.add(new SetCardInfo("Snap", 110, Rarity.COMMON, mage.cards.s.Snap.class));
        cards.add(new SetCardInfo("Sol Ring", 149, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Sower of Temptation", 111, Rarity.RARE, mage.cards.s.SowerOfTemptation.class));
        cards.add(new SetCardInfo("Spectral Steel", 75, Rarity.UNCOMMON, mage.cards.s.SpectralSteel.class));
        cards.add(new SetCardInfo("Starfield Mystic", 76, Rarity.RARE, mage.cards.s.StarfieldMystic.class));
        cards.add(new SetCardInfo("Sun Titan", 77, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 167, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunken Hollow", 168, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 78, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Sylvan Ranger", 134, Rarity.COMMON, mage.cards.s.SylvanRanger.class));
        cards.add(new SetCardInfo("Tainted Isle", 169, Rarity.UNCOMMON, mage.cards.t.TaintedIsle.class));
        cards.add(new SetCardInfo("Talisman of Dominance", 150, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(new SetCardInfo("Tegwyll, Duke of Splendor", 1, Rarity.MYTHIC, mage.cards.t.TegwyllDukeOfSplendor.class));
        cards.add(new SetCardInfo("Temple of Deceit", 170, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Plenty", 171, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of the False God", 172, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Theoretical Duplication", 112, Rarity.RARE, mage.cards.t.TheoreticalDuplication.class));
        cards.add(new SetCardInfo("Thrilling Encore", 118, Rarity.RARE, mage.cards.t.ThrillingEncore.class));
        cards.add(new SetCardInfo("Timber Paladin", 20, Rarity.RARE, mage.cards.t.TimberPaladin.class));
        cards.add(new SetCardInfo("Timely Ward", 79, Rarity.RARE, mage.cards.t.TimelyWard.class));
        cards.add(new SetCardInfo("Tithe Taker", 80, Rarity.RARE, mage.cards.t.TitheTaker.class));
        cards.add(new SetCardInfo("Transcendent Envoy", 81, Rarity.COMMON, mage.cards.t.TranscendentEnvoy.class));
        cards.add(new SetCardInfo("Umbra Mystic", 82, Rarity.RARE, mage.cards.u.UmbraMystic.class));
        cards.add(new SetCardInfo("Utopia Sprawl", 135, Rarity.COMMON, mage.cards.u.UtopiaSprawl.class));
        cards.add(new SetCardInfo("Verdant Embrace", 136, Rarity.RARE, mage.cards.v.VerdantEmbrace.class));
        cards.add(new SetCardInfo("Vitu-Ghazi, the City-Tree", 173, Rarity.UNCOMMON, mage.cards.v.VituGhaziTheCityTree.class));
        cards.add(new SetCardInfo("Warbriar Blessing", 137, Rarity.COMMON, mage.cards.w.WarbriarBlessing.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 151, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Winds of Rath", 83, Rarity.RARE, mage.cards.w.WindsOfRath.class));
    }
}
