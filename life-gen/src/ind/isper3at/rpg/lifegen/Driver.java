package ind.isper3at.rpg.lifegen;

import java.util.Random;

import ind.isper3at.rpg.lifegen.model.Character;
import ind.isper3at.rpg.lifegen.model.Class;
import ind.isper3at.rpg.lifegen.model.Race;
import ind.isper3at.rpg.lifegen.tables.GenTable;
import ind.isper3at.rpg.lifegen.tables.background.Academic;
import ind.isper3at.rpg.lifegen.tables.background.Life;
import ind.isper3at.rpg.lifegen.tables.background.Military;

public class Driver {
    public static void main(final String[] args) {
        final Character bob = new Character("Bob", Race.roll(), Class.roll());

        final Random rand = new Random();
        final int table = rand.nextInt(3);
        GenTable curTable;
        if (table == 0) {
            curTable = Military.getInstance();
        } else if (table == 1) {
            curTable = Life.getInstance();
        } else {
            curTable = Academic.getInstance();
        }

        for (int ii = 0; ii < 15; ii++) {
            try {
                bob.changeEvent(curTable.getResult(rand.nextInt(100)));
            } catch (final NullPointerException e) {
                e.printStackTrace();
            }
        }
        System.out.println(bob.toString());
    }
}
