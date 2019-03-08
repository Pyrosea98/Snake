package domain;

/**
 * This class abstracts the elements during gameplay
 *
 * @author Juan Alvarez
 */
public class Game {
    private int time;
    private int lives;
    private int score;
    private String player;
    private boolean onPause;

    /**
     * Constructor method
     *
     * @param time    the time to wait until every point obtained by the player
     * @param lives   the lives of the player
     * @param score   the score of the player
     * @param player  the name of the player
     * @param onPause the state of the game
     */
    public Game(int time, int lives, int score, String player, boolean onPause) {
        this.time = time;
        this.lives = lives;
        this.score = score;
        this.player = player;
        this.onPause = onPause;
    }

    //Getters & setters
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public boolean isOnPause() {
        return onPause;
    }

    public void setOnPause(boolean onPause) {
        this.onPause = onPause;
    }
}
