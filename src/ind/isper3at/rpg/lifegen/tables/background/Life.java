package ind.isper3at.rpg.lifegen.tables.background;

import java.util.ArrayList;
import java.util.List;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;
import ind.isper3at.rpg.lifegen.model.BackgroundEvent.StatChange;
import ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats;
import ind.isper3at.rpg.lifegen.tables.GenTable;

public class Life extends GenTable {
    private static final String NAME = "Life";
    private static final List<BackgroundEvent> events   = new ArrayList<>();
    private static final Life                  INSTANCE = new Life();

    static {
        /*1*/ events.add(new BackgroundEvent("Arrested. Sentence, infantry service.", Military.getInstance()));
        /*2*/ events.add(new BackgroundEvent("Dusty hovel you moved into had three books left behind.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*3*/ events.add(new BackgroundEvent("Tracked an animal for two weeks across snow and ice.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*4*/ events.add(new BackgroundEvent("Dock worker. Loading and unloading.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*5*/ events.add(new BackgroundEvent("Learned to juggle.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*6*/ events.add(new BackgroundEvent("Born with great looks.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*7*/ events.add(new BackgroundEvent("Stable work. Worked with many horses.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*8*/ events.add(new BackgroundEvent("Arrested. One month hard labor.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*9*/ events.add(new BackgroundEvent("Studied the philosophy of nothingness.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*10*/ events.add(new BackgroundEvent("Scholarship awarded. Enroll at local Academy.", Academic.getInstance()));
        /*11*/ events.add(new BackgroundEvent("Sold snake oil until the Towne Council shut you down.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*12*/ events.add(new BackgroundEvent("Made ends meet by doing street magic. Sleight of hand.", INSTANCE, new StatChange(Stats.DEXTERITY, 2)));
        /*13*/ events.add(new BackgroundEvent("Owned a pub for a month.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*14*/ events.add(new BackgroundEvent("Worked the shell game in a large city.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*15*/ events.add(new BackgroundEvent("Survived a fever that killed many.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*16*/ events.add(new BackgroundEvent("Sailed a ship using the stars for guidance.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*17*/ events.add(new BackgroundEvent("Family home attacked by bandits. Rendered first aid to those injured.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*18*/ events.add(new BackgroundEvent("Built a log cabin by hand.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*19*/ events.add(new BackgroundEvent("Natural with a musical instrument. Not fond of reading.", INSTANCE, new StatChange(Stats.CHARISMA, +2), new StatChange(Stats.INTELLIGENCE, -1)));
        /*20*/ events.add(new BackgroundEvent("Traveled with a carnival. Worked with the knife thrower.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*21*/ events.add(new BackgroundEvent("Played in a band.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*22*/ events.add(new BackgroundEvent("Escaped capture when guards were out to arrest you.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*23*/ events.add(new BackgroundEvent("Come from a noble background.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*24*/ events.add(new BackgroundEvent("Avid bird hunter. Crossbow is weapon of choice.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*25*/ events.add(new BackgroundEvent("Survived merchant ship sinking.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*26*/ events.add(new BackgroundEvent("Worked as an appraiser for several clients.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*27*/ events.add(new BackgroundEvent("Part-time grave digging work.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*28*/ events.add(new BackgroundEvent("Discovered a cave network behind a waterfall.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*29*/ events.add(new BackgroundEvent("Farm job pays the bills.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*30*/ events.add(new BackgroundEvent("Got drunk and passed out on a stack of books.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*31*/ events.add(new BackgroundEvent("Have a natural talent for negotiating.", INSTANCE, new StatChange(Stats.CHARISMA, 2)));
        /*32*/ events.add(new BackgroundEvent("Grew up as an orphan on the streets.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*33*/ events.add(new BackgroundEvent("You were groomed to be the village story teller.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*34*/ events.add(new BackgroundEvent("You are greedy. If you see something you want, you just lift it.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*35*/ events.add(new BackgroundEvent("Cut across the face in a bar fight.", INSTANCE, new StatChange(Stats.CHARISMA, -1), new StatChange(Stats.CONSTITUTION, 1)));
        /*36*/ events.add(new BackgroundEvent("You track and hunted creatures opposed to your morality.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*37*/ events.add(new BackgroundEvent("Your village was attack when you were a child. You harbor urges for revenge.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*38*/ events.add(new BackgroundEvent("After a string of defeats, you learned humility.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*39*/ events.add(new BackgroundEvent("You are a seducer. You manipulate the opposite sex with your charm.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*40*/ events.add(new BackgroundEvent("Trained as the village bell ringer.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*41*/ events.add(new BackgroundEvent("Allowed to train with monks.", INSTANCE, new StatChange(Stats.DEXTERITY, 2)));
        /*42*/ events.add(new BackgroundEvent("You murdered someone over something minor. Feel guilty.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*43*/ events.add(new BackgroundEvent("Voice cracks every time you try to speak.", INSTANCE, new StatChange(Stats.CHARISMA, -1)));
        /*44*/ events.add(new BackgroundEvent("You swam a great lake near your hometown.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*45*/ events.add(new BackgroundEvent("Your people have a tradition of walking on hot coals.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*46*/ events.add(new BackgroundEvent("Supervised a trade caravan on a long dangerous trek.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*47*/ events.add(new BackgroundEvent("Assisted a clock maker for many weeks.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*48*/ events.add(new BackgroundEvent("Eloquent speaker with a huge vocabulary.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*49*/ events.add(new BackgroundEvent("Suffered hand injury while loading crates.", INSTANCE, new StatChange(Stats.DEXTERITY, -1)));
        /*50*/ events.add(new BackgroundEvent("Worked as a bouncer at a local pub.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*51*/ events.add(new BackgroundEvent("Failed to pay debts. Leg broken.", INSTANCE, new StatChange(Stats.DEXTERITY, -1)));
        /*52*/ events.add(new BackgroundEvent("Born leader.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*53*/ events.add(new BackgroundEvent("Your people are renowned for their archery skills.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*54*/ events.add(new BackgroundEvent("You are a liar. You lie all the time. You could be lying right now.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*55*/ events.add(new BackgroundEvent("Captured live birds and sold them to travelers.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*56*/ events.add(new BackgroundEvent("Body odor is unbearable.", INSTANCE, new StatChange(Stats.CHARISMA, -1)));
        /*57*/ events.add(new BackgroundEvent("On a dare, you did find a needle in a haystack.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*58*/ events.add(new BackgroundEvent("Crossed a 300 foot rope bridge in a wind storm.", INSTANCE, new StatChange(Stats.DEXTERITY, 2)));
        /*59*/ events.add(new BackgroundEvent("You made a chunk of money arm wrestling in pubs.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*60*/ events.add(new BackgroundEvent("Youngest person elected to the Towne Council.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*61*/ events.add(new BackgroundEvent("Studied under an enlightened monk.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*62*/ events.add(new BackgroundEvent("Worked as a guard. Tied up prisoners.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /* 63 */ events.add(new BackgroundEvent("Manual Labor job.", INSTANCE, new StatChange(Stats.STRENGTH, +1),
                new StatChange(Stats.DEXTERITY, -1)));
        /*64*/ events.add(new BackgroundEvent("Chopped wood for days at a time after your last breakup.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*65*/ events.add(new BackgroundEvent("Survived in the wild for a month after a natural disaster.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*66*/ events.add(new BackgroundEvent("Part time blacksmith.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*67*/ events.add(new BackgroundEvent("Escaped a prison after you were wrongly arrested.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*68*/ events.add(new BackgroundEvent("You are a talented Tenor.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*69*/ events.add(new BackgroundEvent("Spent some time as a snaked handler.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*70*/ events.add(new BackgroundEvent("Gamble frequently. Great bluffer.", INSTANCE, new StatChange(Stats.CHARISMA, 2)));
        /*71*/ events.add(new BackgroundEvent("You have an affinity for the law, but have never gone to school.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*72*/ events.add(new BackgroundEvent("When you were born, you were left to die. You survived.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*73*/ events.add(new BackgroundEvent("Lived with a native tribe for a while. Learned to forage berries.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*74*/ events.add(new BackgroundEvent("Competed in a strong man event. Came in third.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*75*/ events.add(new BackgroundEvent("You are one of those annoying people full of trivia.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*76*/ events.add(new BackgroundEvent("Tortured to reveal a partner's location.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*77*/ events.add(new BackgroundEvent("Circus work. Tight-rope walker.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*78*/ events.add(new BackgroundEvent("Worked undercover as a spy for rival nobles.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*79*/ events.add(new BackgroundEvent("Make a meager living picking pockets.", INSTANCE, new StatChange(Stats.DEXTERITY, +2), new StatChange(Stats.CONSTITUTION, -1)));
        /*80*/ events.add(new BackgroundEvent("You are a rabble rouser. You alone have started five riots.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*81*/ events.add(new BackgroundEvent("Apprenticed as a sculptor.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*82*/ events.add(new BackgroundEvent("You are wonderful with children. They love you.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*83*/ events.add(new BackgroundEvent("Your people were persecuted. The clergy hid and cared for you.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*84*/ events.add(new BackgroundEvent("Carried a broken wagon four miles to the nearest town.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*85*/ events.add(new BackgroundEvent("You survived a demonic possession as a child.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*86*/ events.add(new BackgroundEvent("You collect rare books.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*87*/ events.add(new BackgroundEvent("Self-taught on the flute.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*88*/ events.add(new BackgroundEvent("You have great hand-eye coordination. Enjoy sport.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*89*/ events.add(new BackgroundEvent("You know every pub song ever sung.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*90*/ events.add(new BackgroundEvent("Worked the ropes on a ship for a month.", INSTANCE, new StatChange(Stats.DEXTERITY, 2)));
        /*91*/ events.add(new BackgroundEvent("Local Militia offer signing bonus.", Military.getInstance()));
        /*92*/ events.add(new BackgroundEvent("Attended to the injured after earthquake.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*93*/ events.add(new BackgroundEvent("Manned the gong for the royal court.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*94*/ events.add(new BackgroundEvent("Forgave an enemy on his death bed.", INSTANCE, new StatChange(Stats.WISDOM, 1)));
        /*95*/ events.add(new BackgroundEvent("Leader of a highway bandit crew.", INSTANCE, new StatChange(Stats.CHARISMA, 1)));
        /*96*/ events.add(new BackgroundEvent("Worked as the town animal catcher.", INSTANCE, new StatChange(Stats.DEXTERITY, 1)));
        /*97*/ events.add(new BackgroundEvent("Construction work at a nearby Keep.", INSTANCE, new StatChange(Stats.STRENGTH, 1)));
        /*98*/ events.add(new BackgroundEvent("Traded in scrolls for a brief time.", INSTANCE, new StatChange(Stats.INTELLIGENCE, 1)));
        /*99*/ events.add(new BackgroundEvent("You can hold your breath for five minutes.", INSTANCE, new StatChange(Stats.CONSTITUTION, 1)));
        /*100*/ events.add(new BackgroundEvent("A Higher Power calls.", Academic.getInstance()));
    }

    private Life() {
        super(events, NAME);
    }

    public static Life getInstance() {
        return INSTANCE;
    }
}
