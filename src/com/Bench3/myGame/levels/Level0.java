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


public class Level0 extends BaseLevel{
    public boolean drawUp, drawLeft, drawRight, drawDown, up, left, right, down;
    public int charW = 18;
    public int charH = 18; //65
    //public int i = 0;
    //public int j = 0;
    public Rectangle character, northExit, rightExit, southExit;
    public ArrayList<Point> walls = loadWalls("src/wallFiles/level0.txt");
    boolean drawTheWalls = true;


    public Level0(Display f, Images i) {

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




        //**********************
        //** NORTH EXIT EVENT **
        //**********************
        if (southExit.contains(character.x,character.y) || southExit.contains(character.x+character.width,character.y+character.height)) {
            down = false;
            character.y++;
            gameState.level=1;
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
        for(int j = 0; j < 19; j++){
            for(int i = 0; i < 25; i++){
                g.drawImage(Main.f.i.tileset, (i*32), (j*32), (i+1)*32, (j+1)*32, pixCo.GRASS_FLOOR_TOP_X.value, pixCo.GRASS_FLOOR_TOP_Y.value, pixCo.GRASS_FLOOR_BOTTOM_X.value, pixCo.GRASS_FLOOR_BOTTOM_Y.value, null);
                //System.out.println("(" + i*32 + ", " + j*32 + ")");
            }
        }
    }

    public void drawHouseYFront(Graphics g, int x, int y, boolean chimney){
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.YELLOW_ROOF_TOP_X.value, pixCo.YELLOW_ROOF_TOP_Y.value, pixCo.YELLOW_ROOF_BOTTOM_X.value, pixCo.YELLOW_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+3)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+70,     (x*32)+34,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+70,     ((x+2)*32)+48,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+4), ((x+2)*32-12)+pixCo.WOOD_DOOR_HEIGHT.value, ((y+2)*32)+10+pixCo.WOOD_DOOR_WIDTH.value, pixCo.WOOD_DOOR_TOP_X.value, pixCo.WOOD_DOOR_TOP_Y.value, pixCo.WOOD_DOOR_BOTTOM_X.value, pixCo.WOOD_DOOR_BOTTOM_Y.value, null);
        if(chimney)
            g.drawImage(Main.f.i.tileset, ((x)*32), ((y)*32), ((x+1)*32), ((y+1)*32), pixCo.CHIMNEY_TOP_X.value, pixCo.CHIMNEY_TOP_Y.value, pixCo.CHIMNEY_BOTTOM_X.value, pixCo.CHIMNEY_BOTTOM_Y.value, null);

    }

    public void drawHouseYBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.YELLOW180_ROOF_TOP_X.value, pixCo.YELLOW180_ROOF_TOP_Y.value, pixCo.YELLOW180_ROOF_BOTTOM_X.value, pixCo.YELLOW180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawHouseRFront(Graphics g, int x, int y, boolean chimney){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+1)*32,   ((x)+2)*32,     ((y)+3)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32),     ((y)+1)*32,   ((x)+4)*32,     ((y)+3)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.RED_ROOF_TOP_X.value, pixCo.RED_ROOF_TOP_Y.value, pixCo.RED_ROOF_BOTTOM_X.value, pixCo.RED_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+70,     (x*32)+34,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+70,     ((x+2)*32)+48,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+2), ((x+2)*32-12)+pixCo.OPEN_DOOR_HEIGHT.value, ((y+2)*32)+8+pixCo.OPEN_DOOR_WIDTH.value, pixCo.OPEN_DOOR_TOP_X.value, pixCo.OPEN_DOOR_TOP_Y.value, pixCo.OPEN_DOOR_BOTTOM_X.value, pixCo.OPEN_DOOR_BOTTOM_Y.value, null);
        if(chimney)
            g.drawImage(Main.f.i.tileset, ((x)*32), ((y)*32), ((x+1)*32), ((y+1)*32), pixCo.CHIMNEY_TOP_X.value, pixCo.CHIMNEY_TOP_Y.value, pixCo.CHIMNEY_BOTTOM_X.value, pixCo.CHIMNEY_BOTTOM_Y.value, null);


    }

    public void drawHouseRBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+1)*32,   ((x)+2)*32,     ((y)+3)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32),     ((y)+1)*32,   ((x)+4)*32,     ((y)+3)*32, pixCo.WOOD_WALL2_TOP_X.value+1, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.RED180_ROOF_TOP_X.value, pixCo.RED180_ROOF_TOP_Y.value, pixCo.RED180_ROOF_BOTTOM_X.value, pixCo.RED180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawHouseBFront(Graphics g, int x, int y, boolean chimney){
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.BLUE_ROOF_TOP_X.value, pixCo.BLUE_ROOF_TOP_Y.value, pixCo.BLUE_ROOF_BOTTOM_X.value, pixCo.BLUE_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+3)*32, pixCo.STONE_WALL_TOP_X.value, pixCo.STONE_WALL_TOP_Y.value, pixCo.STONE_WALL_BOTTOM_X.value, pixCo.STONE_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+70,     (x*32)+34,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+70,     ((x+2)*32)+48,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+4), ((x+2)*32-12)+pixCo.WOOD_DOOR_HEIGHT.value, ((y+2)*32)+10+pixCo.WOOD_DOOR_WIDTH.value, pixCo.WOOD_DOOR_TOP_X.value, pixCo.WOOD_DOOR_TOP_Y.value, pixCo.WOOD_DOOR_BOTTOM_X.value, pixCo.WOOD_DOOR_BOTTOM_Y.value, null);
        if(chimney)
            g.drawImage(Main.f.i.tileset, ((x)*32), ((y)*32), ((x+1)*32), ((y+1)*32), pixCo.CHIMNEY_TOP_X.value, pixCo.CHIMNEY_TOP_Y.value, pixCo.CHIMNEY_BOTTOM_X.value, pixCo.CHIMNEY_BOTTOM_Y.value, null);

    }

    public void drawHouseBBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.STONE_WALL_TOP_X.value, pixCo.STONE_WALL_TOP_Y.value, pixCo.STONE_WALL_BOTTOM_X.value, pixCo.STONE_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.BLUE180_ROOF_TOP_X.value, pixCo.BLUE180_ROOF_TOP_Y.value, pixCo.BLUE180_ROOF_BOTTOM_X.value, pixCo.BLUE180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawHouseGFront(Graphics g, int x, int y, boolean chimney){
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.GREEN_ROOF_TOP_X.value, pixCo.GREEN_ROOF_TOP_Y.value, pixCo.GREEN_ROOF_BOTTOM_X.value, pixCo.GREEN_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+3)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+70,     (x*32)+34,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+70,     ((x+2)*32)+48,   (y*32)+88, pixCo.WOOD_WINDOWS_TOP_X.value, pixCo.WOOD_WINDOWS_TOP_Y.value, pixCo.WOOD_WINDOWS_BOTTOM_X.value, pixCo.WOOD_WINDOWS_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+4), ((x+2)*32-12)+pixCo.WOOD_DOOR_HEIGHT.value, ((y+2)*32)+10+pixCo.WOOD_DOOR_WIDTH.value, pixCo.WOOD_DOOR_TOP_X.value, pixCo.WOOD_DOOR_TOP_Y.value, pixCo.WOOD_DOOR_BOTTOM_X.value, pixCo.WOOD_DOOR_BOTTOM_Y.value, null);
        if(chimney)
            g.drawImage(Main.f.i.tileset, ((x)*32), ((y)*32), ((x+1)*32), ((y+1)*32), pixCo.CHIMNEY_TOP_X.value, pixCo.CHIMNEY_TOP_Y.value, pixCo.CHIMNEY_BOTTOM_X.value, pixCo.CHIMNEY_BOTTOM_Y.value, null);

    }

    public void drawHouseGBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+3)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.GREEN180_ROOF_TOP_X.value, pixCo.GREEN180_ROOF_TOP_Y.value, pixCo.GREEN180_ROOF_BOTTOM_X.value, pixCo.GREEN180_ROOF_BOTTOM_Y.value, null);
    }
    public void drawInnFront(Graphics g, int x, int y, boolean chimney){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y+3))*32,   ((x)+4)*32,     ((y)+6)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+4)*32-1),     ((y+3))*32,   ((x)+8)*32,     ((y)+6)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32+1,     ((y)+3)*32, pixCo.GRAY_ROOF_TOP_X.value, pixCo.GRAY_ROOF_TOP_Y.value, pixCo.GRAY_ROOF_BOTTOM_X.value, pixCo.GRAY_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x+4)*32-1,     (y)*32,     ((x)+8)*32,     ((y)+3)*32, pixCo.GRAY_ROOF_TOP_X.value+1, pixCo.GRAY_ROOF_TOP_Y.value, pixCo.GRAY_ROOF_BOTTOM_X.value, pixCo.GRAY_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x+4)*32-14,     (y+5)*32,     ((x)+3)*32+pixCo.DOUBLE_DOOR_WIDTH.value+10,     ((y+5))*32+pixCo.DOUBLE_DOOR_HEIGHT.value, pixCo.DOUBLE_DOOR_TOP_X.value, pixCo.DOUBLE_DOOR_TOP_Y.value, pixCo.DOUBLE_DOOR_BOTTOM_X.value, pixCo.DOUBLE_DOOR_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x+3)*32+15,     (y+4)*32+5,     ((x+3))*32+pixCo.SIGN_INN_WIDTH.value+15,     ((y+4))*32+pixCo.SIGN_INN_HEIGHT.value+5, pixCo.SIGN_INN_TOP_X.value, pixCo.SIGN_INN_TOP_Y.value, pixCo.SIGN_INN_BOTTOM_X.value, pixCo.SIGN_INN_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+1)*32), ((y+5)*32)-11,     ((x+2)*32),   ((y+6)*32)-11, pixCo.WOOD_WINDOWL_TOP_X.value, pixCo.WOOD_WINDOWL_TOP_Y.value, pixCo.WOOD_WINDOWL_BOTTOM_X.value, pixCo.WOOD_WINDOWL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+6)*32), ((y+5)*32)-11,     ((x+7)*32),   ((y+6)*32)-11, pixCo.WOOD_WINDOWL_TOP_X.value, pixCo.WOOD_WINDOWL_TOP_Y.value, pixCo.WOOD_WINDOWL_BOTTOM_X.value, pixCo.WOOD_WINDOWL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+1)*32), ((y+3)*32)+6,     ((x+2)*32),   ((y+4)*32)+6, pixCo.WOOD_WINDOWL_TOP_X.value, pixCo.WOOD_WINDOWL_TOP_Y.value, pixCo.WOOD_WINDOWL_BOTTOM_X.value, pixCo.WOOD_WINDOWL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+6)*32), ((y+3)*32)+6,     ((x+7)*32),   ((y+4)*32)+6, pixCo.WOOD_WINDOWL_TOP_X.value, pixCo.WOOD_WINDOWL_TOP_Y.value, pixCo.WOOD_WINDOWL_BOTTOM_X.value, pixCo.WOOD_WINDOWL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32+1,     ((y)+3)*32, pixCo.GRAY_ROOF_TOP_X.value, pixCo.GRAY_ROOF_TOP_Y.value, pixCo.GRAY_ROOF_BOTTOM_X.value, pixCo.GRAY_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+1)*32)+1, ((y+5)*32)-2,     ((x+2)*32),   ((y+6)*32)-2, pixCo.WOOD_WINDOWLY_TOP_X.value, pixCo.WOOD_WINDOWLY_TOP_Y.value, pixCo.WOOD_WINDOWLY_BOTTOM_X.value, pixCo.WOOD_WINDOWLY_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+6)*32)+1, ((y+5)*32)-2,     ((x+7)*32),   ((y+6)*32)-2, pixCo.WOOD_WINDOWLY_TOP_X.value, pixCo.WOOD_WINDOWLY_TOP_Y.value, pixCo.WOOD_WINDOWLY_BOTTOM_X.value, pixCo.WOOD_WINDOWLY_BOTTOM_Y.value, null);
        if(chimney)
            g.drawImage(Main.f.i.tileset, ((x+7)*32)-18, ((y)*32)+1, ((x+8)*32)-8, ((y+1)*32)+11, pixCo.CHIMNEY_TOP_X.value, pixCo.CHIMNEY_TOP_Y.value, pixCo.CHIMNEY_BOTTOM_X.value, pixCo.CHIMNEY_BOTTOM_Y.value, null);

    }
    public void drawSkinnyTree(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.SKINNY_TREE_WIDTH.value,     (y*32)+pixCo.SKINNY_TREE_HEIGHT.value, pixCo.SKINNY_TREE_TOP_X.value, pixCo.SKINNY_TREE_TOP_Y.value, pixCo.SKINNY_TREE_BOTTOM_X.value, pixCo.SKINNY_TREE_BOTTOM_Y.value, null);
    }
    public void drawForestTree(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.FOREST_TREE_WIDTH.value,     (y*32)+pixCo.FOREST_TREE_HEIGHT.value, pixCo.FOREST_TREE_TOP_X.value, pixCo.FOREST_TREE_TOP_Y.value, pixCo.FOREST_TREE_BOTTOM_X.value, pixCo.FOREST_TREE_BOTTOM_Y.value, null);
    }
    public void drawFlowerBush(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.FLOWER_BUSH_WIDTH.value,     (y*32)+pixCo.FLOWER_BUSH_HEIGHT.value, pixCo.FLOWER_BUSH_TOP_X.value, pixCo.FLOWER_BUSH_TOP_Y.value, pixCo.FLOWER_BUSH_BOTTOM_X.value, pixCo.FLOWER_BUSH_BOTTOM_Y.value, null);
    }
    public void drawNormBush(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.NORM_BUSH_WIDTH.value,     (y*32)+pixCo.NORM_BUSH_HEIGHT.value, pixCo.NORM_BUSH_TOP_X.value, pixCo.NORM_BUSH_TOP_Y.value, pixCo.NORM_BUSH_BOTTOM_X.value, pixCo.NORM_BUSH_BOTTOM_Y.value, null);
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

