package ind.isper3at.rpg.lifegen.tables;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;

/**
 * Table used when generating a character.
 * @param <T> - The type of information that is generated.
 */
public interface GenTable {
    /**
     * @return The name of the table.
     */
    public String getName();
    
    /**
     * Get the row of a table based on a dice roll.
     * @param roll - The non-negative roll to decide which row.
     * @throws IndexOutOfBoundsException - If the roll is larger than the number of rows in the table.
     */
    public BackgroundEvent getResult(int roll);
}
