package util;

/**
 * Class to optimize the sprite loading
 *
 * @author EinerZG
 * @version 1.0
 */
public class SpriteFactory {

    // class instance to point to a reference
    private static final SpriteFactory instance = new SpriteFactory();

    /**
     * Base constructor
     */
    private SpriteFactory() {}

    /**
     * Loads the sprite, if it is already loaded, then it's returned
     *
     * @param spriteFileName
     *            name of the sheet of the sprites
     * @param spriteNumber
     *            number of sprites to load
     * @param spriteWidth
     *            width of the sprites
     * @param spriteHeight
     *            height of the sprites
     * @return returns the array of the sprites
     */
    public Sprite[] loadSprite(String spriteFileName, int spriteNumber, int spriteWidth, int spriteHeight) {

        Sprite sprites[] = new Sprite[spriteNumber];
        Spritesheets spritesheets = new Spritesheets(spriteFileName, spriteWidth, spriteHeight);

        int col = spritesheets.xTileNumber();
        int row = spritesheets.yTileNumber();

        int index = 0;

        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {

                if (index >= spriteNumber)
                    break;

                sprites[index] = new Sprite(spritesheets, i, j);
                index++;

            }
        }

        return sprites;
    }

    /**
     * @return the instance
     */
    public static SpriteFactory getInstance() {
        return instance;
    }

}
