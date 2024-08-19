import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;

    // delay for timer
    static final int DELAY = 75;

    // arrays holding coordinates of snake body including the head
    // array holds GAME_UNITS due to the snake not being bigger than the game itself
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    int bodyParts = 6;
    int appleaEaten = 0;

    // coordinate x of where apple is located
    int appleX;
    // coordinate y of where apple is located
    int appleY;
    char direction = 'R';
    boolean running = false;

    Timer timer;
    Random random;

    GamePanel(){
        // finish creating instance of the random class
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    }
    public void startGame(){

    }
    public void paintComponent(Graphics g){

    }
    public void draw(Graphics g){

    }
    public void move(){

    }
    // snake eats apple
    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameOver(Graphics g){

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}