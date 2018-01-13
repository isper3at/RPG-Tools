package ind.isper3at.rpg.lifegen.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 * Represents the core information to a Dungeons and Dragons character.
 */
public class Character {
    private final Race   race;
    private final Class  clazz;
    private final String name;

    private int strength;
    private int dexterity;
    private int constitution;
    private int wisdom;
    private int intelligence;
    private int charisma;

    private int floating;

    private final List<BackgroundEvent> lifeEvents;

    /**
     * Creates a new Dungeons and Dragons character.
     *
     * @param name - The name of the character. (not empty or null)
     * @param race - The {@link Race} of the character. (not null)
     * @param clazz - The {@link Class} of the character. (not null)
     */
    public Character(final String name, final Race race, final Class clazz) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(name));
        this.name = name;
        this.race = race;
        this.clazz = clazz;
        lifeEvents = new ArrayList<>();
    }

    /**
     * changes a {@link BackgroundEvent} to this character.
     *
     * @param event - The Event that transpired. (not null)
     */
    public void changeEvent(final BackgroundEvent event) {
        lifeEvents.add(Objects.requireNonNull(event));
    }

    /**
     * @param change - The amount to change this characters Strength by.
     */
    public void changeStrength(final int change) {
        strength += change;
    }

    /**
     * @param change - The amount to change this characters Dexterity by.
     */
    public void changeDexterity(final int change) {
        dexterity += change;
    }

    /**
     * @param change - The amount to change this characters Constitution by.
     */
    public void changeConstitution(final int change) {
        constitution += change;
    }

    /**
     * @param change - The amount to change this characters Wisdom by.
     */
    public void changeWisdom(final int change) {
        wisdom += change;
    }

    /**
     * @param change - The amount to change this characters Intelligence by.
     */
    public void changeIntelligence(final int change) {
        intelligence += change;
    }

    /**
     * @param change - The amount to change this characters Charisma by.
     */
    public void changeCharisma(final int change) {
        charisma += change;
    }

    /**
     * @param change - The amount to change this characters floating stats by.
     */
    public void changeFloating(final int change) {
        floating += change;
    }

    /**
     * @return - This character's current Strength.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @return - This character's current Dexterity.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * @return - This character's current Constitution.
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * @return - This character's current Wisdom.
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * @return - This character's current Intelligence.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * @return - This character's current Charisma.
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * @return - This character's current floating stats.
     */
    public int getFloating() {
        return floating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, dexterity, constitution, wisdom, intelligence, charisma, floating, name, race,
                clazz);
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        } else {
            if (other instanceof Character) {
                final Character car = (Character) other;
                return Objects.equals(name, car.name) && Objects.equals(race, car.race)
                        && Objects.equals(clazz, car.clazz) && Objects.equals(strength, car.strength)
                        && Objects.equals(dexterity, car.dexterity) && Objects.equals(constitution, car.constitution)
                        && Objects.equals(wisdom, car.wisdom) && Objects.equals(intelligence, car.intelligence)
                        && Objects.equals(charisma, car.charisma) && Objects.equals(floating, car.floating);
            } else {
                return false;
            }
        }
    }
}
