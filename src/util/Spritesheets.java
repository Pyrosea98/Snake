package util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Makes reference to a spritesheet
 *
 * @author EinerZG
 * @version 1.0
 */
public class Spritesheets {

    // Stores a reference of the spritesheet
    private BufferedImage sheet;
    // width and heigth of the sprites
    private int imgWidth, imgHeight;

    /**
     * Initilize the spritesheet
     *
     * @param path     image path
     * @param imgWidth pixel width of each sprite
     * @param imgHeight pixel height of each sprite
     */
    public Spritesheets(String path, int imgWidth, int imgHeight) {

        this.imgWidth = imgWidth;
        this.imgHeight = imgHeight;

        try {
            sheet = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Returns the sprite reference
     *
     * @param x sprite number in x
     * @param y sprite number in y
     * @return sprite in the indicated position
     */
    public BufferedImage getImage(int x, int y) {
        return sheet.getSubimage(x * (imgWidth), y * (imgHeight), imgWidth, imgHeight);
    }

    /**
     * @return tile number in x
     */
    public int xTileNumber() {
        return sheet.getWidth() / imgWidth;
    }

    /**
     * @return tile number in y
     */
    public int yTileNumber() {
        return sheet.getHeight() / imgHeight;
    }

}

