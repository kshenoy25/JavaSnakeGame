package SnakeProject;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
        /*
        SnakeProject.GamePanel gamePanel = new SnakeProject.GamePanel();
        this.add(gamePanel);

         */
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // JFrame and fit it around components of the frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
