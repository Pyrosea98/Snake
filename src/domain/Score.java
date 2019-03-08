package domain;

import java.io.Serializable;

/**
 * This class is used to store information of the player
 * @author Juan Alvarez
 */
public class Score implements Serializable {
    //Variables
    private String name;
    private int score;

    /**
     * Constructor
     * @param name the name of the player
     * @param score the score of the player
     */
    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    //Getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
