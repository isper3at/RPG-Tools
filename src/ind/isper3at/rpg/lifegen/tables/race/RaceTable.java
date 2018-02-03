package ind.isper3at.rpg.lifegen.tables.race;

import ind.isper3at.rpg.lifegen.model.Race;

public class RaceTable {
    private static final String NAME = "Race";

    public String getName() {
        return NAME;
    }

    public Race getResult(final int roll) {
        if(roll < 6) {
            return Race.TIEFLING;
        } else if(roll < 11) {
            return Race.HALF_ORC;
        } else if(roll < 16) {
            return Race.HALF_ELF;
        } else if(roll < 21) {
            return Race.HILL_DWARF;
        } else if(roll < 26) {
            return Race.MOUNTAIN_DWARF;
        } else if(roll < 31) {
            return Race.LIGHTFOOT_HALFLING;
        } else if(roll < 36) {
            return Race.STOUT_HALFLING;
        } else if(roll < 71) {
            return Race.HUMAN;
        } else if(roll < 76) {
            return Race.HIGH_ELF;
        } else if(roll < 81) {
            return Race.WOOD_ELF;
        } else if(roll < 86) {
            return Race.DROW_ELF;
        } else if(roll < 91) {
            return Race.FOREST_GNOME;
        } else if(roll < 96) {
            return Race.ROCK_GNOME;
        } else if(roll < 101) {
            return Race.DRAGONBORN;
        } else {
            throw new IndexOutOfBoundsException("There is not a race that exists at table row: " + roll);
        }
    }
}
