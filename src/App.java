import gui.PrincipalGUI;

import java.util.ResourceBundle;

/**
 * Class to initilize the game
 * @author Juan Alvarez
 */
public class App {
    //Main
    public static void main(String[] args) {
        new App();
    }

    //Constructor
    public App(){
        ResourceBundle rb = ResourceBundle.getBundle("string_resources");
        new PrincipalGUI(rb);
    }
}
