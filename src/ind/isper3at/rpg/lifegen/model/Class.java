package ind.isper3at.rpg.lifegen.model;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import com.google.common.collect.Lists;

/**
 * Playable classes for characters to play as.
 */
public class Class {
    public static final Class BARBARIAN = new Class("Barbarian");
    public static final Class BARD      = new Class("Bard");
    public static final Class FIGHTER   = new Class("Fighter");
    public static final Class MONK      = new Class("Monk");
    public static final Class RANGER    = new Class("Ranger");
    public static final Class ROGUE     = new Class("Rogue");
    public static final Class SORCEROR  = new Class("Sorceror");
    public static final Class WIZARD    = new Class("Wizard");
    public static final Class WARLOCK   = new Class("Warlock");
    private static final List<Class> classes;

    static {
        classes = Lists.newArrayList(
                BARBARIAN,
                BARD,
                FIGHTER,
                MONK,
                RANGER,
                ROGUE,
                SORCEROR,
                WIZARD,
                WARLOCK);
    }
    private final String name;


    public static Class roll() {
        final Random rand = new Random();
        return classes.get(rand.nextInt(classes.size()));
    }
    /**
     * Creates a new Class.
     *
     * @param name - The name of the class.
     */
    private Class(final String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * @return - The name of this class.
     */
    public String getName() {
        return name;
    }
}
