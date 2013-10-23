package com.Bench3.myGame.levels;

import com.Bench3.myGame.gameState;
import javafx.util.Pair;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is abstract, so you can't actually create a base level,
 * but it implements a subset of the <code>Level</code> interface's methods,
 * so that other Level classes don't have to. It doesn't have to implement all of them though
 * because it's abstract
 */
public abstract class BaseLevel implements Level {

    @Override
    public ArrayList<Point> loadWalls(String fileName) {
        ArrayList<Point> walls = new ArrayList<Point>();
        BufferedReader wallFileReader = null;
        try {
            wallFileReader = new BufferedReader(new FileReader(fileName));
            String crntLine = wallFileReader.readLine();
            while (crntLine != null) {
                String[] coords = crntLine.split(",");
                if (crntLine.startsWith("//")) {
                    //comment so ignore it
                } else {
                    if (coords.length != 2) {
                        System.out.println("Improperly formatted line in wall file: " + fileName);
                        System.out.print("The invalid line was: " + crntLine);
                    } else {
                        walls.add(new Point(
                                Integer.valueOf(coords[0].trim()),
                                Integer.valueOf(coords[1].trim())
                        ));

                    }
                }

                crntLine = wallFileReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Failed to read file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while trying to read from text file: " + fileName);

        } finally {
            if (wallFileReader != null) {
                try {
                    wallFileReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file");
                }
            }
        }

        return walls;
    }

    @Override
    public boolean detectCollisions(Rectangle collidableObject, ArrayList<Point> walls) {
        for (Point wall : walls) {
            if (isColliding(collidableObject, getRectangle(wall))) {
                return true;
            }
        }
        return false;
    }

    //Returns true if there was a collision
    private boolean isColliding(Rectangle checkForCollisions, Rectangle wall) {
        //First see if one box is completely above or below the other

        if (checkForCollisions.getMaxY() < wall.getMinY() ||
                checkForCollisions.getMinY() > wall.getMaxY()) {
            //They can't be colliding so do nothing and return
            return false;
        }


        //If the right side of the object is between the left and right side of the wall then they're colliding.
        // Similarly if the left side of the object is between the wall's sides they're colliding. Since the wall could
        // theoretically fit completelyinside the object, we should have to do the same check on the wall's sides with
        // respect to the object. But since we're assuming that the character cannot move more than halfway through a
        // wall in one frame we can forgo those checks.
        boolean rightSideIsInWall = (checkForCollisions.getMaxX() <= wall.getMaxX() && checkForCollisions.getMaxX() >= wall.getMinX());
        boolean leftSideIsInWall = (checkForCollisions.getMinX() <= wall.getMaxX() && checkForCollisions.getMinX() >= wall.getMinX());
        return (rightSideIsInWall || leftSideIsInWall);

    }


    private Rectangle getRectangle(Point wall) {
        return new Rectangle(wall.x * gameState.BLOCK_SIZE, wall.y * gameState.BLOCK_SIZE, gameState.BLOCK_SIZE, gameState.BLOCK_SIZE);
    }
}
