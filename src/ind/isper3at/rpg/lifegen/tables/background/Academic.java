package ind.isper3at.rpg.lifegen.tables.background;

import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.CHARISMA;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.CONSTITUTION;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.DEXTERITY;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.INTELLIGENCE;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.STRENGTH;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.WISDOM;

import java.util.ArrayList;
import java.util.List;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;
import ind.isper3at.rpg.lifegen.model.BackgroundEvent.StatChange;
import ind.isper3at.rpg.lifegen.tables.GenTable;

/**
 * A table of life events to occur along the Academic path.
 */
public class Academic extends GenTable {
    private static final List<BackgroundEvent> events   = new ArrayList<>();
    private static final Academic              INSTANCE = new Academic();
    private static final String                NAME     = "Academic";

    //create the academic events
    static {
        /*1*/   events.add(new BackgroundEvent("Caught with banned books. Expelled.", Life.getInstance()));
        /*2*/   events.add(new BackgroundEvent("Joined scientific expedition for month.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*3*/   events.add(new BackgroundEvent("Poisoned by large spider in Library. Recover.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*4*/   events.add(new BackgroundEvent("Took job as delivery boy for campus mail system.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*5*/   events.add(new BackgroundEvent("Spent month studying nature.", INSTANCE, new StatChange(WISDOM, 1)));
        /*6*/   events.add(new BackgroundEvent("Discovered rare tome of obscure subject.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*7*/   events.add(new BackgroundEvent("Took a month to rally for workers rights under a brutal leader.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*8*/   events.add(new BackgroundEvent("Forced to avoid crazy Ex while attending classes.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*9*/   events.add(new BackgroundEvent("Roomed with a student from another realm.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*10*/  events.add(new BackgroundEvent("Shanghaied. Forced to serve on pirate ship.", Military.getInstance()));
        /*11*/  events.add(new BackgroundEvent("Earned money transcribing spell books for a month.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*12*/  events.add(new BackgroundEvent("Death of a close friend brings meaning to your life.", INSTANCE, new StatChange(WISDOM, 2)));
        /*13*/  events.add(new BackgroundEvent("Spent month studying Architecture of nearby castle.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*14*/  events.add(new BackgroundEvent("Omens become more clear and meaningful to you.", INSTANCE, new StatChange(WISDOM, 1)));
        /*15*/  events.add(new BackgroundEvent("Hiked across realm collecting insect samples.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*16*/  events.add(new BackgroundEvent("Worked in a mine as a mineral identifier.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*17*/  events.add(new BackgroundEvent("Ran for local political office.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*18*/  events.add(new BackgroundEvent("Grew up hunting with a bow.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*19*/  events.add(new BackgroundEvent("Father instilled love of books. Didn't play outside much.", INSTANCE, new StatChange(INTELLIGENCE, 1), new StatChange(CONSTITUTION, -1)));
        /*20*/  events.add(new BackgroundEvent("Cared for elderly relative.", INSTANCE, new StatChange(WISDOM, 1)));
        /*21*/  events.add(new BackgroundEvent("Raised by low level noble parents. Best of all things. Educated.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*22*/  events.add(new BackgroundEvent("First Aid course turns real when goblins attack.", INSTANCE, new StatChange(WISDOM, 1)));
        /*23*/  events.add(new BackgroundEvent("Have a knack for Chess. Play constantly.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*24*/  events.add(new BackgroundEvent("Study animal tracks in the field.", INSTANCE, new StatChange(WISDOM, 1)));
        /*25*/  events.add(new BackgroundEvent("Housekeeper is a horrible cook. Manage to survive.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*26*/  events.add(new BackgroundEvent("Like to gamble. Lose regularly. Have to fight off bookies.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*27*/  events.add(new BackgroundEvent("Hang head wizard's hat on flagpole.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*28*/  events.add(new BackgroundEvent("Overcome your shyness and become more outgoing.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*29*/  events.add(new BackgroundEvent("Scale the highest peak in the area in your free time.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*30*/  events.add(new BackgroundEvent("Wizard creates spell to build muscle. He gets rich. You get stronger.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*31*/  events.add(new BackgroundEvent("Discovered extinct primitive cult. Wrote book on their lore.", INSTANCE, new StatChange(INTELLIGENCE, 2)));
        /*32*/  events.add(new BackgroundEvent("Close relative was a healer. Taught you many things.", INSTANCE, new StatChange(WISDOM, 1)));
        /*33*/  events.add(new BackgroundEvent("Solved riddle that barred entry to an ancient tomb.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*34*/  events.add(new BackgroundEvent("Helped clear out an undead problem at local cemetery.", INSTANCE, new StatChange(WISDOM, 1)));
        /*35*/  events.add(new BackgroundEvent("Alchemy experiment goes awry. You get faster.", INSTANCE, new StatChange(DEXTERITY, 1), new StatChange(INTELLIGENCE, -1)));
        /*36*/  events.add(new BackgroundEvent("Crashed the Dean's Dinner uninvited. Blended in.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*37*/  events.add(new BackgroundEvent("Whittled small wooden animals for local children.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*38*/  events.add(new BackgroundEvent("Learned to dance.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*39*/  events.add(new BackgroundEvent("Field trip to other planes of existence.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*40*/  events.add(new BackgroundEvent("Campus hit by worst ice storm in history.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*41*/  events.add(new BackgroundEvent("Preformed autopsies on several condemned prisoners.", INSTANCE, new StatChange(WISDOM, 2)));
        /*42*/  events.add(new BackgroundEvent("Learned to play the flute.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*43*/  events.add(new BackgroundEvent("Spell backfires. Fries your frontal lobe.", INSTANCE, new StatChange(INTELLIGENCE, -1)));
        /*44*/  events.add(new BackgroundEvent("Rebound books for extra money.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*45*/  events.add(new BackgroundEvent("Sampling tree bark run into Treant. Exchange knowledge.", INSTANCE, new StatChange(WISDOM, 1)));
        /*46*/  events.add(new BackgroundEvent("Study Astronomy and the movements of the moon.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*47*/  events.add(new BackgroundEvent("Identified illness spreading through village.", INSTANCE, new StatChange(WISDOM, 1)));
        /*48*/  events.add(new BackgroundEvent("Edited Professor's newly written book. INT +2", INSTANCE, new StatChange(INTELLIGENCE, 2)));
        /*49*/  events.add(new BackgroundEvent("One month tutelage under bad teacher.", INSTANCE, new StatChange(WISDOM, -1)));
        /*50*/  events.add(new BackgroundEvent("Mapped nearby river.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*51*/  events.add(new BackgroundEvent("Developed a drug habit.", INSTANCE, new StatChange(WISDOM, -1)));
        /*52*/  events.add(new BackgroundEvent("Discovered two new species of plants. Useful in Alchemy.", INSTANCE, new StatChange(INTELLIGENCE, 2)));
        /*53*/  events.add(new BackgroundEvent("Helped elderly cleric minister to the poor.", INSTANCE, new StatChange(WISDOM, 1)));
        /*54*/  events.add(new BackgroundEvent("Helped create constructs for head wizard.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*55*/  events.add(new BackgroundEvent("Forecasted a major flood and saved numerous lives.", INSTANCE, new StatChange(WISDOM, 1)));
        /*56*/  events.add(new BackgroundEvent("Contract major illness. Unable to study or attend classes.", INSTANCE, new StatChange(INTELLIGENCE, -1)));
        /*57*/  events.add(new BackgroundEvent("Robbed at knife point. Talked thugs out of it.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*58*/  events.add(new BackgroundEvent("Tamed a small bear with treats and soft words.", INSTANCE, new StatChange(WISDOM, 2)));
        /*59*/  events.add(new BackgroundEvent("Out ran a supposedly tamed bear when it attacked a crowd.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*60*/  events.add(new BackgroundEvent("You find a ship wreck, in the desert. Copied strange symbols.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*61*/  events.add(new BackgroundEvent("Joined the choir to impress the opposite sex.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*62*/  events.add(new BackgroundEvent("Researched venomous snakes. Wrote a paper.", INSTANCE, new StatChange(WISDOM, 1)));
        /*63*/  events.add(new BackgroundEvent("You take a month off to find yourself.", INSTANCE, new StatChange(CHARISMA, 1), new StatChange(WISDOM, -1)));
        /*64*/  events.add(new BackgroundEvent("Repaired fishing nets for room and board.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*65*/  events.add(new BackgroundEvent("Elected Academic body president.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*66*/  events.add(new BackgroundEvent("Shortest route to class was across roof tops.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*67*/  events.add(new BackgroundEvent("Successfully brew homemade healing potion.", INSTANCE, new StatChange(WISDOM, 1)));
        /*68*/  events.add(new BackgroundEvent("Received a \"first\" in cantrips.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*69*/  events.add(new BackgroundEvent("Introduced to mysticism.", INSTANCE, new StatChange(WISDOM, 1)));
        /*70*/  events.add(new BackgroundEvent("Created overly elaborate mechanism to turn book pages.", INSTANCE, new StatChange(INTELLIGENCE, 2)));
        /*71*/  events.add(new BackgroundEvent("Was assigned a dorm on the 8th floor.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*72*/  events.add(new BackgroundEvent("Went without sleep for three days while exams were given.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*73*/  events.add(new BackgroundEvent("Started \"filling out\". Better late than never.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*74*/  events.add(new BackgroundEvent("Lonely nights. You learned to roll coins on your fingers.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*75*/  events.add(new BackgroundEvent("Research trip to ancient ruins. Pack animals died.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*76*/  events.add(new BackgroundEvent("One month at a local monastery.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*77*/  events.add(new BackgroundEvent("Sat in on inquest jury.", INSTANCE, new StatChange(WISDOM, 1)));
        /*78*/  events.add(new BackgroundEvent("Professor killed by bugbear. Visiting elven scholar fills in.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*79*/  events.add(new BackgroundEvent("Tamed Elementals for basics course. Rock drop on foot.", INSTANCE, new StatChange(WISDOM, 2), new StatChange(DEXTERITY, -1)));
        /*80*/  events.add(new BackgroundEvent("Conjured a devil, just to see if it actually worked.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*81*/  events.add(new BackgroundEvent("Delivered a baby during a terrible storm.", INSTANCE, new StatChange(WISDOM, 1)));
        /*82*/  events.add(new BackgroundEvent("Translated ancient scroll into common.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*83*/  events.add(new BackgroundEvent("Passed off transmuted copper as silver. Made 300GP.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*84*/  events.add(new BackgroundEvent("Snuck into class late every day for a month.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*85*/  events.add(new BackgroundEvent("Survived childhood sickness.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*86*/  events.add(new BackgroundEvent("Saved fellow student from a collapsing bookshelf.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*87*/  events.add(new BackgroundEvent("Pranked the University with an illusionary Dragon.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*88*/  events.add(new BackgroundEvent("Lived with primitive people learned from their medicine man.", INSTANCE, new StatChange(WISDOM, 1)));
        /*89*/  events.add(new BackgroundEvent("Enchanted a kobold that followed you around for a week.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*90*/  events.add(new BackgroundEvent("Blessed words from your deity fall on your ears.", INSTANCE, new StatChange(WISDOM, 2)));
        /*91*/  events.add(new BackgroundEvent("Disillusioned with academic system. Move to Life Experience Table.", Life.getInstance()));
        /*92*/  events.add(new BackgroundEvent("Talked your way into a class you were not qualified for.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*93*/  events.add(new BackgroundEvent("Fireball training!", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*94*/  events.add(new BackgroundEvent("Worked special effects for local theater.", INSTANCE, new StatChange(CHARISMA, 1)));
        /*95*/  events.add(new BackgroundEvent("Four weeks with a Master Diviner.", INSTANCE, new StatChange(INTELLIGENCE, 1)));
        /*96*/  events.add(new BackgroundEvent("One month crafting Holy Symbols.", INSTANCE, new StatChange(WISDOM, 1)));
        /*97*/  events.add(new BackgroundEvent("Locked yourself out of your own room. Picked the lock.", INSTANCE, new StatChange(DEXTERITY, 1)));
        /*98*/  events.add(new BackgroundEvent("Climbed a cliff face to retrieve rare feather for spell.", INSTANCE, new StatChange(STRENGTH, 1)));
        /*99*/  events.add(new BackgroundEvent("Completed a four week fast.", INSTANCE, new StatChange(CONSTITUTION, 1)));
        /*100*/ events.add(new BackgroundEvent("War breaks out. Drafted in military service.", Military.getInstance()));
    }

    /**
     * @return - The singleton instance of an {@link Academic} table.
     */
    public static Academic getInstance() {
        return INSTANCE;
    }

    /**
     * Private to enforce Singleton.
     */
    private Academic() {
        super(events, NAME);
    }
}
