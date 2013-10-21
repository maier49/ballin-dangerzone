package com.Bench3.myGame.levels;

import com.Bench3.myGame.Display;
import com.Bench3.myGame.Images;
import com.Bench3.myGame.Main;
import com.Bench3.myGame.pixCo;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 10/20/13
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Level2 implements Level{

    public Level2(Display f, Images i) {

    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(Main.f.i.tileset, 0, 0, 32, 32, pixCo.GRAVEL_FLOOR_TOP_X.value, pixCo.GRAVEL_FLOOR_TOP_Y.value, pixCo.GRAVEL_FLOOR_BOTTOM_X.value, pixCo.GRAVEL_FLOOR_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, 32, 0, 64, 32, pixCo.GRASS_FLOOR_TOP_X.value, pixCo.GRASS_FLOOR_TOP_Y.value, pixCo.GRASS_FLOOR_BOTTOM_X.value, pixCo.GRASS_FLOOR_BOTTOM_Y.value, null);
      //  g.drawImage(Main.f.i.tileset, 0, 0, 800, 600, null);


    }

    @Override
    public void battle(Graphics g) {

    }

    @Override
    public void moveCharacter() {

    }


}
