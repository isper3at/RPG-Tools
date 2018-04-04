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
    private final StatChange[] changes;

    /**
     * Creates a new {@link BackgroundEvent}
     *
     * @param description - The description of what occurred. (not null)
     * @param nextTable - The next Table, if required, this event points to.
     *        (not null)
     * @param changes - The {@link StatChange}s to make with this event.
     */
    public BackgroundEvent(final String description, final GenTable nextTable, final StatChange... changes) {
        this.description = requireNonNull(description);
        this.nextTable = requireNonNull(nextTable);
        this.changes = changes;
    }

    /**
     * Creates a new {@link BackgroundEvent} that is just a table change.
     *
     * @param string - The description of the event. (not null)
     * @param nextTable - The events table to change to. (not null)
     */
    public BackgroundEvent(final String description, final GenTable nextTable) {
        this(description, nextTable, new StatChange[] {});
    }

    /**
     * Creates a new {@link BackgroundEvent} that alters a single stat.
     *
     * @param description - The description of the event. (not null)
     * @param nextTable - The events table to change to. (not null)
     * @param statChange - The {@link StatChange} to make with this event. (not
     *        null)
     */
    public BackgroundEvent(final String description, final GenTable nextTable, final StatChange statChange) {
        this(description, nextTable, new StatChange[] { requireNonNull(statChange) });
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
     * @return - The {@link StatChange}s to make.
     */
    public StatChange[] getStatChanges() {
        return changes;
    }

    @Override
    public String toString() {
        return description;
    }

    /**
     * The possible stats to change during character creation.
     */
    public enum Stats {
        STRENGTH, CONSTITUTION, DEXTERITY, WISDOM, INTELLIGENCE, CHARISMA, FLOATING, NONE;
    }

    /**
     * Represents a change in a character's stat.
     */
    public static class StatChange {
        private final Stats stat;
        private final int   change;

        /**
         * Creates a new {@link StatChange}.
         *
         * @param stat - The {@link Stats} to change. (not null)
         * @param change - The amount to change the {@link Stats}.
         */
        public StatChange(final Stats stat, final int change) {
            this.stat = requireNonNull(stat);
            this.change = change;
        }

        /**
         * @return - The {@link Stats} to change.
         */
        public Stats getStat() {
            return stat;
        }

        /**
         * @return - The amount to change the {@link Stats} by.
         */
        public int getChange() {
            return change;
        }
    }
}