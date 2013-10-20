package com.Bench3.myGame.levels;


import com.Bench3.myGame.Keying;

import java.awt.*;

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

}
