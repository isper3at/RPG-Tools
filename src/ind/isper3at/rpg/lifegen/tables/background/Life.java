package ind.isper3at.rpg.lifegen.tables.background;

import ind.isper3at.rpg.lifegen.model.BackgroundEvent;
import ind.isper3at.rpg.lifegen.tables.GenTable;

public class Life implements GenTable {
    private static final String NAME = "Life Table";
    
    public String getName() {
        return NAME;
    }

    public BackgroundEvent getResult(int roll) {
        return null;
    }
    
    private static final Life INSTANCE = new Life();
    
    public static Life getInstance() {
        return INSTANCE;
    }
    
    private Life() {
        
    }
}
