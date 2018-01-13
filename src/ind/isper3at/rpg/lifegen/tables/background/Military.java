package ind.isper3at.rpg.lifegen.tables.background;

public class Military {
    private static final Military INSTANCE = new Military();
    
    public static Military getInstance() {
        return INSTANCE;
    }
    
    private Military() {
        
    }
}
