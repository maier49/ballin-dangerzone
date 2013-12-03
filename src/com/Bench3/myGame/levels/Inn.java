package com.Bench3.myGame.levels;

import com.Bench3.myGame.*;
import com.sun.org.apache.xml.internal.utils.IntVector;
import javafx.util.Pair;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 10/20/13
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */


public class Inn extends BaseLevel{
    public boolean drawUp, drawLeft, drawRight, drawDown, up, left, right, down;
    public int charW = 18;
    public int charH = 18; //65
    //public int i = 0;
    //public int j = 0;
    public Rectangle character, northExit, rightExit, southExit;
    public ArrayList<Point> walls = loadWalls("src/wallFiles/level0.txt");
    boolean drawTheWalls = true;


    public Inn(Display f, Images i) {

        character = new Rectangle(390, 2, charW, charH);
        southExit = new Rectangle(345, 600, 105, 1);

        //***********************
        //** KEYMAPPING/MOVING **
        //***********************
        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // Right Move (D Key)
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    right = true;
                    drawRight = true;
                    drawUp = false;
                    drawDown = false;
                    drawLeft = false;
                }// Left Move (A Key)
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    left = true;
                    drawLeft = true;
                    drawUp = false;
                    drawDown = false;
                    drawRight = false;
                }// Up Move (W Key)
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    up = true;
                    drawUp = true;
                    drawRight = false;
                    drawDown = false;
                    drawLeft = false;
                }// Down Move (S Key)
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    down = true;
                    drawDown = true;
                    drawUp = false;
                    drawRight = false;
                    drawLeft = false;
                }// Reset (Esc)
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    character.x = 390;
                    character.y = 0;

                }


            }

            public void keyReleased(KeyEvent e) {

                //KeyRelease aka stop moving/single button presses.
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    right = false;
                    //System.out.println("right=false");
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    left = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    up = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    down = false;
                }
            }
        });

    }


    public void paintComponent(Graphics g) {
        drawDown = true;
        drawBG(g);

        //********************
        //** DRAW TOP FLOOR **
        //********************
        for(int i=4; i<21; i++){
           for(int j=2; j<7; j++){
               drawWoodFloor2(g, i, j);
           }
        }

        //********************
        //** DRAW 1ST FLOOR **
        //********************
        for(int i=4; i<21; i++){
            for(int j=12; j<17; j++){
                drawWoodFloor2(g, i, j);
            }
        }

        for(int i=4; i<21; i++){
            drawDecoWall(g, i, 2);
        }




        //**********************
        //** NORTH EXIT EVENT **
        //**********************
        if (southExit.contains(character.x,character.y) || southExit.contains(character.x+character.width,character.y+character.height)) {
            down = false;
            character.y++;
            //ssgameState.level=1;
        }


        //* DRAW SPRITES *
        //****************
        if (drawDown) {
            g.drawImage(Main.f.i.charDown, character.x, character.y, charW, charH, null);
            // g.drawImage(Main.f.i.BO, character.x-800, character.y-800, 1600, 1600, null);
        }
        if (drawLeft) {
            g.drawImage(Main.f.i.charLeft, character.x, character.y, charW, charH, null);
        }
        if (drawRight) {
            g.drawImage(Main.f.i.charRight, character.x, character.y, charW, charH, null);
        }
        if (drawUp) {
            g.drawImage(Main.f.i.charUp, character.x, character.y, charW, charH, null);
        }

        moveCharacter();

        if (drawTheWalls) {
            drawWalls(g);
        }


    }

    private void drawWalls(Graphics g) {
        float thickness = 1;
        Stroke oldStroke = null;
        if (g instanceof Graphics2D) {
            oldStroke = ((Graphics2D) g).getStroke();
            ((Graphics2D) g).setStroke(new BasicStroke(thickness));
        }


        for (Point wall : walls) {
            //g.drawRect(wall.x * gameState.BLOCK_SIZE, wall.y * gameState.BLOCK_SIZE, gameState.BLOCK_SIZE, gameState.BLOCK_SIZE);
        }

        if (g instanceof Graphics2D) {
            ((Graphics2D) g).setStroke(oldStroke);

        }
    }

    @Override
    public void battle(Graphics g) {

    }

    @Override
    public void drawBG(Graphics g){
      g.setColor(Color.BLACK);
        g.fillRect(0,0,800,608);
    }

    public void drawWoodFloor2(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)*32),   ((x)+1)*32,     ((y)+1)*32, pixCo.WOOD_FLOOR2_TOP_X.value, pixCo.WOOD_FLOOR2_TOP_Y.value, pixCo.WOOD_FLOOR2_BOTTOM_X.value, pixCo.WOOD_FLOOR2_BOTTOM_Y.value, null);
    }

    public void drawDecoWall(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)*32),   ((x)+1)*32,     ((y)+1)*32, pixCo.DECO_WALL_TOP_X.value, pixCo.DECO_WALL_TOP_Y.value, pixCo.DECO_WALL_BOTTOM_X.value, pixCo.DECO_WALL_BOTTOM_Y.value, null);
    }

    @Override
    public void moveCharacter() {
        // RIGHT MOVE Right bound
        if (right && (character.x != Main.w - charW)) {
            character.x += 1; // LEFT MOVE Left bound
            if (detectCollisions(character, walls)) character.x -=1;
        }
        if (left && (character.x >= 1)) {
            character.x -= 1; // MOVE UP Upwards bound
            if (detectCollisions(character, walls)) character.x +=1;
        }
        if (up && (character.y >= 1)) {
            character.y -= 1; // MOVE DOWN Downwards bound
            if (detectCollisions(character, walls)) character.y +=1;
        }
        if (down && (character.y != (Main.h))) {
            character.y += 1;
            if (detectCollisions(character, walls)) character.y -=1;
        }

    }


}

