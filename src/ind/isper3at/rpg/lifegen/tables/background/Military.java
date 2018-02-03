package ind.isper3at.rpg.lifegen.tables.background;

import java.util.ArrayList;
import java.util.List;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;
import ind.isper3at.rpg.lifegen.model.BackgroundEvent.StatChange;
import ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats;
import ind.isper3at.rpg.lifegen.tables.GenTable;

public class Military extends GenTable {
    private static final List<BackgroundEvent> events   = new ArrayList<>();
    private static final Military              INSTANCE = new Military();
    private static final String                NAME     = "Military";

    static {
        /*1*/ events.add(new BackgroundEvent("Insubordination. Relieved from duty.", Life.getInstance()));
        /*2*/ events.add(new BackgroundEvent("Studied historical battles.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*3*/ events.add(new BackgroundEvent("Mediated military disputes between soldiers.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*4*/ events.add(new BackgroundEvent("Joined the Archer corps.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*5*/ events.add(new BackgroundEvent("Marched barefoot for twenty miles.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*6*/ events.add(new BackgroundEvent("In charge of placing the horses in armor.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*7*/ events.add(new BackgroundEvent("Lead your men on an assault.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*8*/ events.add(new BackgroundEvent("Dodged every arrow during an ambush.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*9*/ events.add(new BackgroundEvent("Rallied your troops when the odds were against you.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*10*/ events.add(new BackgroundEvent("Master Tactician. Promoted to Officer School.", Academic.getInstance()));
        /*11*/ events.add(new BackgroundEvent("Built a bridge during a campaign against enemy forces.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*12*/ events.add(new BackgroundEvent("Channeled your inner rage.", INSTANCE, new StatChange(Stats.CONSTITUTION, 2)));
        /*13*/ events.add(new BackgroundEvent("Weapon training with heavy arms.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*14*/ events.add(new BackgroundEvent("Served on a ship. Learned to drink like a sailor.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*15*/ events.add(new BackgroundEvent("Assistant to the General. Worked with battle maps.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*16*/ events.add(new BackgroundEvent("Integrated magic into an assault.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*17*/ events.add(new BackgroundEvent("Lead a mounted division.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*18*/ events.add(new BackgroundEvent("Crossbow practice. Placed first.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*19*/ events.add(new BackgroundEvent("Wrestled bears to show off and prove strength.", INSTANCE, new StatChange(Stats.STRENGTH, 1), new StatChange(Stats.INTELLIGENCE, -1)));
        /*20*/ events.add(new BackgroundEvent("Bitter winter during a tour of duty.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*21*/ events.add(new BackgroundEvent("Naturally athletic.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*22*/ events.add(new BackgroundEvent("Jungle mission. Withstood thousands of insect bites.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*23*/ events.add(new BackgroundEvent("Deck Duty on a Navy Ship. Riggings and sails.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*24*/ events.add(new BackgroundEvent("Food poisoning spreads through camp. Your mom cooks worse.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*25*/ events.add(new BackgroundEvent("Successfully tracked enemy troops through mountains.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*26*/ events.add(new BackgroundEvent("Planned a perfect ambush. Lost no men.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*27*/ events.add(new BackgroundEvent("Infiltrated enemy headquarters. Extracted information.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*28*/ events.add(new BackgroundEvent("Turned a double agent.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*29*/ events.add(new BackgroundEvent("Identified a spy in your ranks.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*30*/ events.add(new BackgroundEvent("Got a ship to port after the death of your captain.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*31*/ events.add(new BackgroundEvent("Loaded the catapult during a siege.", INSTANCE, new StatChange(Stats.STRENGTH, 2)));
        /*32*/ events.add(new BackgroundEvent("Survived several battles with numerous injuries.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*33*/ events.add(new BackgroundEvent("Carried two injured soldiers to safety.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*34*/ events.add(new BackgroundEvent("Ate the heart of your enemy.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*35*/ events.add(new BackgroundEvent("Fought a giant scorpion. Only got stung once.", INSTANCE, new StatChange(Stats.DEXTERITY, 1), new StatChange(Stats.CONSTITUTION, -1)));
        /*36*/ events.add(new BackgroundEvent("Instigated a successful mutiny.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*37*/ events.add(new BackgroundEvent("Worked the crow’s nest during rough seas.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*38*/ events.add(new BackgroundEvent("Appointed liaison for an occupied town.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*39*/ events.add(new BackgroundEvent("Hoisted up the anchor on a ship.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*40*/ events.add(new BackgroundEvent("Deserted a battle and escaped while being pursued.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*41*/ events.add(new BackgroundEvent("Worked the war-forge making weapons.", INSTANCE, new StatChange(Stats.CONSTITUTION, 2)));
        /*42*/ events.add(new BackgroundEvent("Gambled with the officers. Took them for two months wages.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*43*/ events.add(new BackgroundEvent("Kicked by a Calvary horse. In coma for a month.", INSTANCE, new StatChange(Stats.STRENGTH, -1)));
        /*44*/ events.add(new BackgroundEvent("Screwed up. Got put on potato peeling duty.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*45*/ events.add(new BackgroundEvent("Stuck out a one month siege of your keep.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*46*/ events.add(new BackgroundEvent("Buried the fallen.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*47*/ events.add(new BackgroundEvent("Had four arrows removed from your leg.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*48*/ events.add(new BackgroundEvent("Worked the battering ram.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*49*/ events.add(new BackgroundEvent("Contracted disease while serving abroad.", INSTANCE, new StatChange(Stats.CONSTITUTION, -1)));
        /*50*/ events.add(new BackgroundEvent("Dug latrines for entire company ", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*51*/ events.add(new BackgroundEvent("Punctured a lung in a battle.", INSTANCE, new StatChange(Stats.CONSTITUTION, -1)));
        /*52*/ events.add(new BackgroundEvent("Captured and used as slave labor.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*53*/ events.add(new BackgroundEvent("Completed a 300 mile crusade in the name of King and God.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*54*/ events.add(new BackgroundEvent("Forage patrol. Looted a ten mile swath along the main line.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*55*/ events.add(new BackgroundEvent("Rode out a famine while pinned down at a fort.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*56*/ events.add(new BackgroundEvent("Tore shoulder muscle in a duel.", INSTANCE, new StatChange(Stats.STRENGTH, -1)));
        /*57*/ events.add(new BackgroundEvent("Conscripted peasants for large offensive.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*58*/ events.add(new BackgroundEvent("Stranded on deserted island after shipwreck.", INSTANCE, new StatChange(Stats.CONSTITUTION, 2)));
        /*59*/ events.add(new BackgroundEvent("Repaired saddles for the mounted division.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*60*/ events.add(new BackgroundEvent("Cut timber and helped build a barracks.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*61*/ events.add(new BackgroundEvent("Negotiated a surrender from an enemy.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*62*/ events.add(new BackgroundEvent("Received forty lashes for punching an officer.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*63*/ events.add(new BackgroundEvent("Talked your way out of Physical Training.", INSTANCE, new StatChange(Stats.CHARISMA, 1), new StatChange(Stats.STRENGTH, -1)));
        /*64*/ events.add(new BackgroundEvent("Learned dozens of knots while working on ship.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*65*/ events.add(new BackgroundEvent("Swore vengeance against a foe that wiped out your company.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*66*/ events.add(new BackgroundEvent("Functioned as a sniper.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*67*/ events.add(new BackgroundEvent("Stood guard duty in the worst weather possible.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*68*/ events.add(new BackgroundEvent("Lifted a horse off a comrade that was cut down.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*69*/ events.add(new BackgroundEvent("You often boxed fellow soldiers for cash and rations.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*70*/ events.add(new BackgroundEvent("Was assigned oar duty on a warship.", INSTANCE, new StatChange(Stats.STRENGTH, 2)));
        /*71*/ events.add(new BackgroundEvent("Calculated trajectories for siege weapons.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*72*/ events.add(new BackgroundEvent("Served as a scout.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*73*/ events.add(new BackgroundEvent("Inspired a dying soldier.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*74*/ events.add(new BackgroundEvent("Assassinated a commander of enemy troops with one shot.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*75*/ events.add(new BackgroundEvent("Created a logistical system to supply the main army.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*76*/ events.add(new BackgroundEvent("Helped out in the medical camp. Tended to the injured.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*77*/ events.add(new BackgroundEvent("Had an arrow pushed through and snapped off.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*78*/ events.add(new BackgroundEvent("Nine kills during hand to hand combat.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /* 79 */ events.add(new BackgroundEvent("Arm was caught in the main ropes of a war machine.", INSTANCE,
                new StatChange(Stats.CONSTITUTION, 2), new StatChange(Stats.DEXTERITY, -1)));
        /*80*/ events.add(new BackgroundEvent("Appointed executioner of prisoners. Beheading with an axe.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*81*/ events.add(new BackgroundEvent("Endured hot iron branding.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*82*/ events.add(new BackgroundEvent("Holy words inspired your bravery and made you stronger.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*83*/ events.add(new BackgroundEvent("Impressed the General and received a promotion.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*84*/ events.add(new BackgroundEvent("Snuck onto an enemy ship and sabotaged it.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*85*/ events.add(new BackgroundEvent("Saw a deity on the battlefield.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*86*/ events.add(new BackgroundEvent("Managed supply lines for a battalion.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*87*/ events.add(new BackgroundEvent("Carried your regimental colors.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*88*/ events.add(new BackgroundEvent("Went without sleep for days while observing enemy positions.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*89*/ events.add(new BackgroundEvent("Cranked back a ballista by yourself.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*90*/ events.add(new BackgroundEvent("Your whole body is tattooed.", INSTANCE, new StatChange(Stats.CONSTITUTION, 2)));
        /*91*/ events.add(new BackgroundEvent("Angered a group of officers. Discharged.", INSTANCE));
        /*92*/ events.add(new BackgroundEvent("Bestowed honors of bravery by the King of the realm.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*93*/ events.add(new BackgroundEvent("Ran a message through the battlefield to the Lord in charge.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*94*/ events.add(new BackgroundEvent("Honorably disarmed and faced an enemy with fists.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*95*/ events.add(new BackgroundEvent("Fought off a pack of war dogs while defending a fallen soldier.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*96*/ events.add(new BackgroundEvent("Continued fighting while you were on fire.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*97*/ events.add(new BackgroundEvent("Disarmed an enemy trap.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*98*/ events.add(new BackgroundEvent("Made money dealing in contraband. Economic of war.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*99*/ events.add(new BackgroundEvent("Saw the true face of evil and swore to destroy it.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*100*/ events.add(new BackgroundEvent("Military cuts. The brightest are sent to College.", Academic.getInstance()));

    }


    public static Military getInstance() {
        return INSTANCE;
    }

    private Military() {
        super(events, NAME);
    }
}
