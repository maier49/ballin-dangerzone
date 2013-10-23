package com.Bench3.myGame.levels;


import com.Bench3.myGame.Keying;
import javafx.util.Pair;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Bradley
 * Date: 10/20/13
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Level {
    public void battle(Graphics g);
    public void moveCharacter();
    public void paintComponent(Graphics g);
    public void drawBG(Graphics g);

    /**
     * Accesses the file specified by file name,
     * which is expected to have 1 or more lines, each with
     * two integers separated by a comma, representing the X and Y tile coordinates
     * respectively of a wall.
     * @param fileName

     * @return the walls
     */
    public ArrayList<Point> loadWalls(String fileName);

    /**
     * Checks the passed in 'collidableObjects' to see if it collides with any of the passed in walls.
     *
     * @param collidableObject
     * @param walls
     */
    public boolean detectCollisions(Rectangle collidableObject, ArrayList<Point> walls);

}

