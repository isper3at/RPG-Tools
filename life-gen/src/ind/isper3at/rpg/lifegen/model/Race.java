package ind.isper3at.rpg.lifegen.model;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import com.google.common.collect.Lists;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent.StatChange;
import ind.isper3at.rpg.lifegen.model.BackgroundEvent.Stats;

/**
 * A possible playable race for characters to play as.
 */
public class Race {
                                                                                                  //ST DX CN WS IN CA ANY
    public static final Race        TIEFLING           = new Race("Tiefling",           new int[] { 0, 0, 0, 0, 1, 2, 0 });
    public static final Race        HALF_ORC           = new Race("Half-Orc",           new int[] { 2, 0, 1, 0, 0, 0, 0 });
    public static final Race        HALF_ELF           = new Race("Half Elf",           new int[] { 0, 0, 0, 0, 0, 2, 1 });
    public static final Race        HILL_DWARF         = new Race("Hill Dwarf",         new int[] { 0, 0, 2, 1, 0, 0, 0 });
    public static final Race        MOUNTAIN_DWARF     = new Race("Mountain Dwarf",     new int[] { 1, 0, 2, 0, 0, 0, 0 });
    public static final Race        LIGHTFOOT_HALFLING = new Race("Lightfoot Halfling", new int[] { 0, 2, 0, 0, 0, 1, 0 });
    public static final Race        STOUT_HALFLING     = new Race("Stout Halfling",     new int[] { 0, 2, 1, 0, 0, 0, 0 });
    public static final Race        HUMAN              = new Race("Human",              new int[] { 1, 1, 1, 1, 1, 1, 0 });
    public static final Race        HIGH_ELF           = new Race("High Elf",           new int[] { 0, 2, 0, 0, 1, 0, 0 });
    public static final Race        WOOD_ELF           = new Race("Wood Elf",           new int[] { 0, 2, 0, 1, 0, 0, 0 });
    public static final Race        DROW_ELF           = new Race("Drow Elf",           new int[] { 0, 2, 0, 0, 0, 1, 0 });
    public static final Race        FOREST_GNOME       = new Race("Forest Gnome",       new int[] { 0, 0, 1, 0, 2, 0, 0 });
    public static final Race        ROCK_GNOME         = new Race("Rock Gnome",         new int[] { 0, 1, 0, 0, 2, 0, 0 });
    public static final Race        DRAGONBORN         = new Race("Dragonborn",         new int[] { 2, 0, 0, 0, 0, 1, 0 });
    private static final List<Race> races;

    static {
        races = Lists.newArrayList(
                TIEFLING,
                HALF_ORC,
                HALF_ELF,
                HILL_DWARF,
                MOUNTAIN_DWARF,
                LIGHTFOOT_HALFLING,
                STOUT_HALFLING,
                HUMAN,
                HIGH_ELF,
                WOOD_ELF,
                DROW_ELF,
                FOREST_GNOME,
                ROCK_GNOME,
                DRAGONBORN);
    }
    private final String name;

    /**
     * A size 7 array.  If the 7th index has a value, it can be used in any of the abilities.
     */
    private final StatChange[] statChangeBlock;

    /**
     * Creates a new Race.
     *
     * @param name - The name of the race. (not null)
     * @param statChangeBlock - The stats changes gained by playing as this
     *        race. (not null)
     */
    private Race(final String name, final int... statChangeBlock) {
        this.name = requireNonNull(name);
        this.statChangeBlock = new StatChange[] { 
                new StatChange(Stats.STRENGTH, statChangeBlock[0]),
                new StatChange(Stats.DEXTERITY, statChangeBlock[1]),
                new StatChange(Stats.CONSTITUTION, statChangeBlock[2]),
                new StatChange(Stats.WISDOM, statChangeBlock[3]),
                new StatChange(Stats.INTELLIGENCE, statChangeBlock[4]),
                new StatChange(Stats.CHARISMA, statChangeBlock[5]),
                new StatChange(Stats.FLOATING, statChangeBlock[6])
            };
    }

    public static Race roll() {
        final Random rand = new Random();
        return races.get(rand.nextInt(races.size()));
    }

    /**
     * @return - The name of this race.
     */
    public String getName() {
        return name;
    }

    /**
     * @return - The stat changes for using this race.
     */
    public StatChange[] getStatChange() {
        return statChangeBlock;
    }

    /**
     * Builder for constructing custom races.
     */
    public class Builder {
        private String name;
        private int str = 0;
        private int dex = 0;
        private int con = 0;
        private int wis = 0;
        private int jnt = 0;
        private int cha = 0;
        private int    any = 0;

        /**
         * @param name - The name of the race to use.
         * @return The builder to enable builder chaining
         */
        public Builder setName(final String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        /**
         * @param str - The amount of strength to change for this race.
         * @return The builder to enable builder chaining
         */
        public Builder setSTR(final int str) {
            this.str = str;
            return this;
        }

        /**
         * @param dex - The amount of dexterity to change for this race.
         * @return The builder to enable builder chaining
         */
        public Builder setDEX(final int dex) {
            this.dex = dex;
            return this;
        }

        /**
         * @param con - The amount of constitution to change for this race.
         * @return The builder to enable builder chaining
         */
        public Builder setCON(final int con) {
            this.con = con;
            return this;
        }

        /**
         * @param wis - The amount of wisdom to change for this race.
         * @return The builder to enable builder chaining
         */
        public Builder setWIS(final int wis) {
            this.wis = wis;
            return this;
        }

        /**
         * @param jnt - The amount of intelligence to change for this race.
         * @return The builder to enable builder chaining
         */
        public Builder setINT(final int jnt) {
            this.jnt = jnt;
            return this;
        }

        /**
         * @param cha - The amount of charisma to change for this race.
         * @return The builder to enable builder chaining
         */
        public Builder setCHA(final int cha) {
            this.cha = cha;
            return this;
        }

        /**
         * @param any - The amount of floating stats to give this race.
         * @return The builder to enable builder chaining
         */
        public Builder setFloating(final int any) {
            this.any = any;
            return this;
        }

        /**
         * @return The {@link Race} created by this builder.
         */
        public Race build() {
            return new Race(name, new int[] { str, con, dex, wis, jnt, cha, any });
        }
    }
}
