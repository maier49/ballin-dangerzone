package com.Bench3.myGame;

import com.Bench3.myGame.levels.*;
import com.Bench3.myGame.gameState;

import javax.swing.*;
import java.awt.*;

public class Keying extends JPanel {

    private static final long serialVersionUID = 1L;

    private long frameRate = 400;
    private long timeBetweenFrames = 1000/frameRate;
    Level currentLevel = null;
    Display f = null;
    Images i = null;


    public Keying(Display f, Images i) {

        //********************
        //** STARTING LEVEL **
        //********************
        currentLevel = new Level0(f, i);
        this.f = f;
        this.i = i;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(gameState.level == 0){
            currentLevel = new Level0(f, i);
            gameState.level = -1;
        }
        if(gameState.level == 1){
            currentLevel = new Level1(f, i);
            gameState.level = -1;
        }
        if(gameState.level == 3){
            currentLevel = new Level1(f, i);
            gameState.level = -1;
        }

        if(gameState.level == 2){
            currentLevel = new Level2(f, i);
            gameState.level = -1;
        }
        if(gameState.level == 4){
            currentLevel = new Inn(f, i);
            gameState.level = -1;
        }

            currentLevel.paintComponent(g);
        try {
            Thread.sleep(timeBetweenFrames);
        } catch (InterruptedException e){
            //who cares
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