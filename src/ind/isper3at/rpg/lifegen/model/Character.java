package ind.isper3at.rpg.lifegen.model;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Strings;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent.StatChange;

/**
 * Represents the core information to a Dungeons and Dragons character.
 */
public class Character {
    private final Race   race;
    private final Class  clazz;
    private final String name;

    private int strength = 9;
    private int dexterity = 9;
    private int constitution = 9;
    private int wisdom = 9;
    private int intelligence = 9;
    private int charisma = 9;

    private int floating = 0;

    private final List<BackgroundEvent> lifeEvents;

    /**
     * Creates a new Dungeons and Dragons character.
     *
     * @param name - The name of the character. (not empty or null)
     * @param race - The {@link Race} of the character. (not null)
     * @param clazz - The {@link Class} of the character. (not null)
     */
    public Character(final String name, final Race race, final Class clazz) {
        checkArgument(!Strings.isNullOrEmpty(name));
        this.name = name;
        this.race = race;
        this.clazz = clazz;
        lifeEvents = new ArrayList<BackgroundEvent>();
        for (final StatChange change : race.getStatChange()) {
            applyStatChange(change);
        }
    }

    /**
     * changes a {@link BackgroundEvent} to this character.
     *
     * @param event - The Event that transpired. (not null)
     */
    public void changeEvent(final BackgroundEvent event) {
        lifeEvents.add(requireNonNull(event));
        final StatChange[] changes = event.getStatChanges();
        for (final StatChange change : changes) {
            applyStatChange(change);
        }
    }

    private void applyStatChange(final StatChange change) {
        switch (change.getStat()) {
            case CHARISMA:
                changeCharisma(change.getChange());
                break;
            case CONSTITUTION:
                changeConstitution(change.getChange());
                break;
            case DEXTERITY:
                changeDexterity(change.getChange());
                break;
            case FLOATING:
                changeFloating(change.getChange());
                break;
            case INTELLIGENCE:
                changeIntelligence(change.getChange());
                break;
            case NONE:
                break;
            case STRENGTH:
                changeStrength(change.getChange());
                break;
            case WISDOM:
                changeWisdom(change.getChange());
                break;
        }
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("|===========================================================================|\n");
        sb.append(String.format("|%s|\n", StringUtils.center(name, 75)));
        sb.append("|===========================================================================|\n");
        sb.append("|\n");
        sb.append(String.format("| Race: %s\n", race.getName()));
        sb.append(String.format("| Class: %s\n", clazz.getName()));
        sb.append("|\n");
        sb.append("| Stats\n");
        sb.append(String.format("| STR: %d\n", strength));
        sb.append(String.format("| CON: %d\n", constitution));
        sb.append(String.format("| DEX: %d\n", dexterity));
        sb.append(String.format("| WIS: %d\n", wisdom));
        sb.append(String.format("| INT: %d\n", intelligence));
        sb.append(String.format("| CHA: %d\n", charisma));
        sb.append("|\n");
        sb.append("| Events\n");
        for (final BackgroundEvent event : lifeEvents) {
            sb.append(String.format("| %s\n", event.toString()));
        }
        sb.append("|===========================================================================|\n");
        return sb.toString();
    }
}
