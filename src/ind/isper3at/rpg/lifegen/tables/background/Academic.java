package ind.isper3at.rpg.lifegen.tables.background;

import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.CHARISMA;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.CONSTITUTION;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.DEXTERITY;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.INTELLIGENCE;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.NONE;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.STRENGTH;
import static ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats.WISDOM;

import java.util.ArrayList;
import java.util.List;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;
import ind.isper3at.rpg.lifegen.tables.GenTable;

/**
 * A table of life events to occur along the Academic path.
 */
public class Academic implements GenTable {
    private static final List<BackgroundEvent> events = new ArrayList<>();
    private static final Academic INSTANCE = new Academic();
    private static final String NAME = "Academic";

    //create the academic events
    static {
        /*1*/   events.add(new BackgroundEvent("Caught with banned books. Expelled.", Life.getInstance(), NONE, 0));
        /*2*/   events.add(new BackgroundEvent("Joined scientific expedition for month.", INSTANCE, STRENGTH, 1));
        /*3*/   events.add(new BackgroundEvent("Poisoned by large spider in Library. Recover.", INSTANCE, CONSTITUTION, 1));
        /*4*/   events.add(new BackgroundEvent("Took job as delivery boy for campus mail system.", INSTANCE, DEXTERITY, 1));
        /*5*/   events.add(new BackgroundEvent("Spent month studying nature.", INSTANCE, WISDOM, 1));
        /*6*/   events.add(new BackgroundEvent("Discovered rare tome of obscure subject.", INSTANCE, INTELLIGENCE, 1));
        /*7*/   events.add(new BackgroundEvent("Took a month to rally for workers rights under a brutal leader.", INSTANCE, CHARISMA, 1));
        /*8*/   events.add(new BackgroundEvent("Forced to avoid crazy Ex while attending classes.", INSTANCE, DEXTERITY, 1));
        /*9*/   events.add(new BackgroundEvent("Roomed with a student from another realm.", INSTANCE, CHARISMA, 1));
        /*10*/  events.add(new BackgroundEvent("Shanghaied. Forced to serve on pirate ship. Move to Military Table.", INSTANCE, CHARISMA, 1));
        /*11*/  events.add(new BackgroundEvent("Earned money transcribing spell books for a month. INT +1 61 Joined the choir to impress the opposite sex. CHA +1", INSTANCE, CHARISMA, 1));
        /*12*/  events.add(new BackgroundEvent("Death of a close friend brings meaning to your life. WIS +2 62 Researched venomous snakes. Wrote a paper. WIS +1", INSTANCE, CHARISMA, 1));
        /*13*/  events.add(new BackgroundEvent("Spent month studying Architecture of nearby castle. INT +1 63 You take a month off to find yourself. CHA +1, WIS -1", INSTANCE, CHARISMA, 1));
        /*14*/  events.add(new BackgroundEvent("Omens become more clear and meaningful to you. WIS +1 64 Repaired fishing nets for room and board. DEX +1", INSTANCE, CHARISMA, 1));
        /*15*/  events.add(new BackgroundEvent("Hiked across realm collecting insect samples. CON +1 65 static Elected Academic body president. CHA +1", INSTANCE, CHARISMA, 1));
        /*16*/  events.add(new BackgroundEvent("Worked in a mine as a mineral identifier. STR +1 66 Shortest route to class was across roof tops. DEX +1", INSTANCE, CHARISMA, 1));
        /*17*/  events.add(new BackgroundEvent("Ran for local political office. CHA +1 67 Successfully brew homemade healing potion. WIS +1", INSTANCE, CHARISMA, 1));
        /*18*/  events.add(new BackgroundEvent("Grew up hunting with a bow. DEX +1 68 Received a \"first\" in cantrips. INT +1", INSTANCE, CHARISMA, 1));
        /*19*/  events.add(new BackgroundEvent("Father instilled love of books. Didn't play outside much. INT +2, CON -1 69 Introduced to mysticism. WIS +1", INSTANCE, CHARISMA, 1));
        /*20*/  events.add(new BackgroundEvent("Cared for elderly relative. WIS +1 70 Created overly elaborate mechanism to turn book pages. INT +2", INSTANCE, CHARISMA, 1));
        /*21*/  events.add(new BackgroundEvent("Raised by low level noble parents. Best of all things. Educated. INT +1 71 Was assigned a dorm on the 8th floor. STR +1", INSTANCE, CHARISMA, 1));
        /*22*/  events.add(new BackgroundEvent("First Aid course turns real when goblins attack. WIS +1 72 Went without sleep for three days while exams were given. CON +1", INSTANCE, CHARISMA, 1));
        /*23*/  events.add(new BackgroundEvent("Have a knack for Chess. Play constantly. INT +1 73 Started \"filling out\". Better late than never. CHA +1", INSTANCE, CHARISMA, 1));
        /*24*/  events.add(new BackgroundEvent("Study animal tracks in the field. WIS +1 74 Lonely nights. You learned to roll coins on your fingers. DEX +1", INSTANCE, CHARISMA, 1));
        /*25*/  events.add(new BackgroundEvent("Housekeeper is a horrible cook. Manage to survive. CON +1 75 Research trip to ancient ruins. Pack animals died. STR +1", INSTANCE, CHARISMA, 1));
        /*26*/  events.add(new BackgroundEvent("Like to gamble. Lose regularly. Have to fight off bookies. STR +1 76 One month at a local monastery. CON +1", INSTANCE, CHARISMA, 1));
        /*27*/  events.add(new BackgroundEvent("Hang head wizard's hat on flagpole. DEX +1 77 Sat in on inquest jury. WIS +1", INSTANCE, CHARISMA, 1));
        /*28*/  events.add(new BackgroundEvent("Overcome your shyness and become more outgoing. CHA +1 78 Professor killed by bugbear. Visiting elven scholar fills in. INT +1", INSTANCE, CHARISMA, 1));
        /*29*/  events.add(new BackgroundEvent("Scale the highest peak in the area in your free time. CON +1 79 Tamed Elementals for basics course. Rock drop on foot. WIS +2, DEX -1", INSTANCE, CHARISMA, 1));
        /*30*/  events.add(new BackgroundEvent("Wizard creates spell to build muscle. He gets rich. You get stronger. STR +1 80 Conjured a devil, just to see if it actually worked. INT +1", INSTANCE, CHARISMA, 1));
        /*31*/  events.add(new BackgroundEvent("Discovered extinct primitive cult. Wrote book on their lore. INT +2 81 Delivered a baby during a terrible storm. WIS +1", INSTANCE, CHARISMA, 1));
        /*32*/  events.add(new BackgroundEvent("Close relative was a healer. Taught you many things. WIS +1 82 Translated ancient scroll into common INT +1", INSTANCE, CHARISMA, 1));
        /*33*/  events.add(new BackgroundEvent("Solved riddle that barred entry to an ancient tomb. INT +1 83 Passed off transmuted copper as silver. Made 300GP CHA +1", INSTANCE, CHARISMA, 1));
        /*34*/  events.add(new BackgroundEvent("Helped clear out an undead problem at local cemetery. WIS +1 84 Snuck into class late every day for a month. DEX +1", INSTANCE, CHARISMA, 1));
        /*35*/  events.add(new BackgroundEvent("Alchemy experiment goes awry. You get faster. DEX +1, INT -1 85 Survived childhood sickness. CON +1", INSTANCE, CHARISMA, 1));
        /*36*/  events.add(new BackgroundEvent("Crashed the Dean's Dinner uninvited. Blended in. CHA +1 86 Saved fellow student from a collapsing bookshelf. STR +1", INSTANCE, CHARISMA, 1));
        /*37*/  events.add(new BackgroundEvent("Whittled small wooden animals for local children. DEX +1 87 Pranked the University with an illusionary Dragon. INT +1", INSTANCE, CHARISMA, 1));
        /*38*/  events.add(new BackgroundEvent("Learned to dance. CHA +1 88 Lived with primitive people learned from their medicine man. WIS +1", INSTANCE, CHARISMA, 1));
        /*39*/  events.add(new BackgroundEvent("Field trip to other planes of existence. INT +1 89 Enchanted a kobold that followed you around for a week. INT +1", INSTANCE, CHARISMA, 1));
        /*40*/  events.add(new BackgroundEvent("Campus hit by worst ice storm in history. DEX +1 90 Blessed words from your deity fall on your ears. WIS+2", INSTANCE, CHARISMA, 1));
        /*41*/  events.add(new BackgroundEvent("Preformed autopsies on several condemned prisoners. WIS +2 91 Disillusioned with academic system. Move to Life Experience Table.", INSTANCE, CHARISMA, 1));
        /*42*/  events.add(new BackgroundEvent("Learned to play the flute. CHA +1 92 Talked your way into a class you were not qualified for. CHA +1", INSTANCE, CHARISMA, 1));
        /*43*/  events.add(new BackgroundEvent("Spell backfires. Fries your frontal lobe. INT -1 93 Fireball training! DEX +1", INSTANCE, CHARISMA, 1));
        /*44*/  events.add(new BackgroundEvent("Rebound books for extra money. DEX +1 94 Worked special effects for local theater. CHA +1", INSTANCE, CHARISMA, 1));
        /*45*/  events.add(new BackgroundEvent("Sampling tree bark run into Treant. Exchange knowledge. WIS +1 95 Four weeks with a Master Diviner. INT +1", INSTANCE, CHARISMA, 1));
        /*46*/  events.add(new BackgroundEvent("Study Astronomy and the movements of the moon. INT +1 96 One month crafting Holy Symbols WIS +1", INSTANCE, CHARISMA, 1));
        /*47*/  events.add(new BackgroundEvent("Identified illness spreading through village. WIS +1 97 Locked yourself out of your own room. Picked the lock. DEX +1", INSTANCE, CHARISMA, 1));
        /*48*/  events.add(new BackgroundEvent("Edited Professor's newly written book. INT +2 98 Climbed a cliff face to retrieve rare feather for spell. STR +1", INSTANCE, CHARISMA, 1));
        /*49*/  events.add(new BackgroundEvent("One month tutelage under bad teacher. WIS -1 99 Completed a four week fast. CON +1", INSTANCE, CHARISMA, 1));
        /*50*/  events.add(new BackgroundEvent("Mapped nearby river. INT +1", INSTANCE, INTELLIGENCE, 1));
        /*51*/  events.add(new BackgroundEvent("Developed a drug habit.", INSTANCE, WISDOM, -1));
        /*52*/  events.add(new BackgroundEvent("Discovered two new species of plants. Useful in Alchemy.", INSTANCE, INTELLIGENCE, 2));
        /*53*/  events.add(new BackgroundEvent("Helped elderly cleric minister to the poor. WIS +1", INSTANCE, INTELLIGENCE, 2));
        /*54*/  events.add(new BackgroundEvent("Helped create constructs for head wizard. INT +1", INSTANCE, INTELLIGENCE, 2));
        /*55*/  events.add(new BackgroundEvent("Forecasted a major flood and saved numerous lives. WIS +1", INSTANCE, INTELLIGENCE, 2));
        /*56*/  events.add(new BackgroundEvent("Contract major illness. Unable to study or attend classes. INT -1", INSTANCE, INTELLIGENCE, 2));
        /*57*/  events.add(new BackgroundEvent("Robbed at knife point. Talked thugs out of it. CHA +1", INSTANCE, INTELLIGENCE, 2));
        /*58*/  events.add(new BackgroundEvent("Tamed a small bear with treats and soft words. WIS +2", INSTANCE, INTELLIGENCE, 2));
        /*59*/  events.add(new BackgroundEvent("Out ran a supposedly tamed bear when it attacked a crowd. DEX +1", INSTANCE, INTELLIGENCE, 2));
        /*60*/  events.add(new BackgroundEvent("You find a ship wreck, in the desert. Copied strange symbols. INT +1", INSTANCE, INTELLIGENCE, 1));
        /*100*/ events.add(new BackgroundEvent("War breaks out. Drafted in military service. Move to Military Table.", INSTANCE, CHARISMA, 1));
    }

    public static Academic getInstance() {
        return INSTANCE;
    }

    private Academic() {
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BackgroundEvent getResult(final int roll) {
        return null;
    }
}
