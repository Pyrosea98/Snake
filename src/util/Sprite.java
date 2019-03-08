package util;

import java.awt.image.BufferedImage;

/**
 * Class to handle sprites
 *
 * @author EinerZG
 * @version 1.0
 */
public class Sprite {

    // Obtains the image reference
    private BufferedImage image;

    /**
     * Initilize the image to draw
     *
     * @param sheet the sprite sheet where the image is obtained
     * @param x     x position in the sprite sheet
     * @param y     y position of the sprite sheet
     */
    public Sprite(Spritesheets sheet, int x, int y) {
        image = sheet.getImage(x, y);
    }

    /**
     * Obtains the reference of the buffer of the image to draw
     *
     * @return returns the buffer of the image
     */
    public BufferedImage getImage() {
        return image;
    }

}