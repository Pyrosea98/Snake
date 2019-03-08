package domain;

import util.Sprite;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    public static int RIGHT_MOVEMENT = 0;
    public static int DOWN_MOVEMENT = 1;
    public static int UP_MOVEMENT = 2;
    public static int LEFT_MOVEMENT = 3;
    private Rectangle rec;
    private int size;
    private int velocity;
    private int posX;
    private int posY;

    private Sprite head_sprite, tail_sprite;
    private ArrayList<Sprite> body_sprite;

    public Snake(){
        head_sprite = new Sprite();
        rec = new Rectangle();
    }
}
