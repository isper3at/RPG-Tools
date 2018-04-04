package ind.isper3at.rpg.lifegen.tables;

import static java.util.Objects.requireNonNull;

import java.util.List;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;

/**
 * Table used when generating a character.
 */
public abstract class GenTable {
    private final List<BackgroundEvent> events;
    private final String                name;

    protected GenTable(final List<BackgroundEvent> events, final String name) {
        this.events = requireNonNull(events);
        this.name = requireNonNull(name);
    }
    /**
     * @return The name of the table.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the row of a table based on a dice roll.
     * @param roll - The non-negative roll to decide which row.
     * @throws IndexOutOfBoundsException - If the roll is larger than the number of rows in the table.
     */
    public BackgroundEvent getResult(final int roll) {
        return events.get(roll);
    }
}
