package ind.isper.rpg.musicboard.view;

import static java.util.Objects.requireNonNull;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CategoryPane extends JPanel {
    private static final long serialVersionUID = 1L;
    private static final String CATEGORY_IMAGE_NAME = "background.png";

    private final File file;
    private final File[] subs;
    private BufferedImage categoryImage = new BufferedImage(0, 0, 0);

    /**
     * Creates a new {@link CategoryPane}.
     *
     * @param file - The directory this Category represents. (not null)
     * @throws IOException
     */
    public CategoryPane(final File file) throws IOException {
        this.file = requireNonNull(file);
        subs = file.listFiles();

        initComponents();

        for(final File image : subs) {
            if(image.getName().equals(CATEGORY_IMAGE_NAME)) {
                categoryImage = ImageIO.read(image);
                break;
            }
        }
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        final GridBagConstraints g = new GridBagConstraints();

    }

    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);

        final int width = categoryImage.getWidth();
        final int height = categoryImage.getHeight();

        final int centerWidth = getWidth() - width;
        final int centerHeight = getHeight() - width;
        g.drawImage(categoryImage, centerWidth / 2, centerHeight/2, width, height, this);
    }
}
