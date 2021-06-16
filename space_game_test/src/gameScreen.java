import javax.swing.*;
import java.awt.*;

public class gameScreen extends JFrame {

    public gameScreen(String title) throws HeadlessException {
        
    }

    public static void main(String[] args){

        gameScreen screen = new gameScreen("Space War");

        screen.setResizable(false);
        screen.setFocusable(false);
        screen.setSize(800,600);

        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        game game = new game();

        game.requestFocus();

        game.addKeyListener(game);

        game.setFocusable(true);

        game.setFocusTraversalKeysEnabled(false);

        screen.add(game);

        screen.setVisible(true);


    }
}
