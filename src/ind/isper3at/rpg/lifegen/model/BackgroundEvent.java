package ind.isper3at.rpg.lifegen.model;

import static java.util.Objects.requireNonNull;

import ind.isper3at.rpg.lifegen.tables.GenTable;

/**
 * Represents an event in a character's life. The event can change which table
 * to draw future events from. The event can cause a particular stat to change.
 */
public class BackgroundEvent {
    private final String   description;
    private final GenTable nextTable;
    private final int      change;
    private final Stats    stat;

    /**
     * Creates a new {@link BackgroundEvent}
     *
     * @param description - The description of what occurred. (not null)
     * @param nextTable - The next Table, if required, this event points to.
     *        (not null)
     * @param stat - The {@link Stats} to change with this event. (not null)
     * @param change - The amount to change the stat.
     */
    public BackgroundEvent(final String description, final GenTable nextTable, final Stats stat, final int change) {
        this.description = requireNonNull(description);
        this.nextTable = requireNonNull(nextTable);
        this.stat = requireNonNull(stat);
        this.change = change;
    }

    /**
     * @return - The description of this life event.
     */
    public String eventDescription() {
        return description;
    }

    /**
     * @return - The next {@link GenTable} this event points at.
     */
    public GenTable nextTable() {
        return nextTable;
    }

    /**
     * @return - The {@link Stats} to change.
     */
    public Stats getState() {
        return stat;
    }

    /**
     * @return - The amount a stat changes with this even.
     */
    public int getChange() {
        return change;
    }

    /**
     * The possible stats to change during character creation.
     */
    public enum Stats {
        STRENGTH, CONSTITUTION, DEXTERITY, WISDOM, INTELLIGENCE, CHARISMA, FLOATING, NONE;
    }
}