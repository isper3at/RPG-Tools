package ind.isper.rpg.musicboard.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JPanel;

/**
 * Main panel for navigating around the musicboard.
 */
public class MainFrame extends JPanel {
    private static final long serialVersionUID = 1L;

    private final Map<File, Set<File>> musicFolders;

    /**
     * Creates a new {@link MainFrame}.
     * @param root - The root directory for where music is located. (not null)
     */
    public MainFrame(final Path root) {
        musicFolders = new HashMap<>();
        buildFolderStruct(root.toFile());
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        final GridBagConstraints g = new GridBagConstraints();

    }

    private void buildFolderStruct(final File loc) {
        //if its a directory, its a new category.
        if(loc.isDirectory()) {
            final Set<File> files = new HashSet<>();
            for(final File file : loc.listFiles()) {
                buildFolderStruct(file);
                files.add(file);
            }
            musicFolders.put(loc, files);
        } else {
            return;
        }
    }
}
