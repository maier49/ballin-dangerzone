package com.Bench3.myGame;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 10/20/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public enum pixCo {
    STONE_FLOOR_TOP_LEFT_X(1),
    STONE_FLOOR_TOP_LEFT_Y(64),
    STONE_FLOOR_BOTTOM_LEFT_X(32),
    STONE_FLOOR_BOTTOM_RIGHT_Y(96),

    GRAVEL_FLOOR_TOP_X(320),
    GRAVEL_FLOOR_TOP_Y(64),
    GRAVEL_FLOOR_BOTTOM_X(352),
    GRAVEL_FLOOR_BOTTOM_Y(96),

    GRASS_FLOOR_TOP_X(256),
    GRASS_FLOOR_TOP_Y(64),
    GRASS_FLOOR_BOTTOM_X(287),
    GRASS_FLOOR_BOTTOM_Y(96);


    public int value;

    private pixCo(int value){
        this.value = value;
    }
}

