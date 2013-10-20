package com.Bench3.myGame;

import com.Bench3.myGame.levels.Level;
import com.Bench3.myGame.levels.Level1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Keying extends JPanel {

    private static final long serialVersionUID = 1L;

    private long time;
    private double frameRate = 300;
    Level currentLevel = null;


    public Keying(Display f, Images i) {
        time = System.currentTimeMillis();
        currentLevel = new Level1(f, i);

    }


    @SuppressWarnings("unused")
    public void paintComponent(Graphics g) {
        if (System.currentTimeMillis() - time > (1000 / frameRate)) {
            time = System.currentTimeMillis();
            super.paintComponent(g);
            currentLevel.paintComponent(g);
        }
        repaint();
    }

    private void battle(Graphics g) {
        currentLevel.battle(g);
    }

    private void moveCharacter() {
        currentLevel.moveCharacter();
    }

    public class jumpThread implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
                new Thread(this).start();
                System.exit(0);
            }
        }
    }
}