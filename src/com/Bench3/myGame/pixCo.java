package com.Bench3.myGame;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 10/20/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public enum pixCo {
    //*****************
    //** FLOOR TILES **
    //*****************
    STONE_FLOOR_TOP_LEFT_X(0),
    STONE_FLOOR_TOP_LEFT_Y(64),
    STONE_FLOOR_BOTTOM_LEFT_X(32),
    STONE_FLOOR_BOTTOM_RIGHT_Y(96),
    STONE_FLOOR_WIDTH(32),
    STONE_FLOOR_HEIGHT(32),

    GRAVEL_FLOOR_TOP_X(320),
    GRAVEL_FLOOR_TOP_Y(64),
    GRAVEL_FLOOR_BOTTOM_X(352),
    GRAVEL_FLOOR_BOTTOM_Y(96),
    GRAVEL_FLOOR_WIDTH(32),
    GRAVEL_FLOOR_HEIGHT(32),

    GRASS_FLOOR_TOP_X(256),
    GRASS_FLOOR_TOP_Y(64),
    GRASS_FLOOR_BOTTOM_X(288),
    GRASS_FLOOR_BOTTOM_Y(96),
    GRASS_FLOOR_WIDTH(32),
    GRASS_FLOOR_HEIGHT(32),


    //****************
    //** WALL TILES **
    //****************
    WOOD_WALL_TOP_X(896),
    WOOD_WALL_TOP_Y(704),
    WOOD_WALL_BOTTOM_X(960),
    WOOD_WALL_BOTTOM_Y(768),
    WOOD_WALL_WIDTH(64),
    WOOD_WALL_HEIGHT(64),

    WOOD_WALL2_TOP_X(960),
    WOOD_WALL2_TOP_Y(704),
    WOOD_WALL2_BOTTOM_X(1024),
    WOOD_WALL2_BOTTOM_Y(768),
    WOOD_WALL2_WIDTH(64),
    WOOD_WALL2_HEIGHT(64),

    STONE_WALL_TOP_X(704),
    STONE_WALL_TOP_Y(704),
    STONE_WALL_BOTTOM_X(768),
    STONE_WALL_BOTTOM_Y(768),
    STONE_WALL_WIDTH(64),
    STONE_WALL_HEIGHT(64),


    //**************
    //** ROOFTOPS **
    //**************
    YELLOW_ROOF_TOP_X(576),
    YELLOW_ROOF_TOP_Y(640),
    YELLOW_ROOF_BOTTOM_X(640),
    YELLOW_ROOF_BOTTOM_Y(703),
    YELLOW_ROOF_WIDRH(64),
    YELLOW_ROOF_HEIGHT(64),
    YELLOW180_ROOF_TOP_X(576),
    YELLOW180_ROOF_TOP_Y(1312),
    YELLOW180_ROOF_BOTTOM_X(640),
    YELLOW180_ROOF_BOTTOM_Y(1376),
    YELLOW180_ROOF_WIDRH(64),
    YELLOW180_ROOF_HEIGHT(64),

    CLAY_ROOF_TOP_X(832),
    CLAY_ROOF_TOP_Y(640),
    CLAY_ROOF_BOTTOM_X(896),
    CLAY_ROOF_BOTTOM_Y(704),
    CLAY_ROOF_WIDTH(64),
    CLAY_ROOF_HEIGHT(64),
    //NOT DONE
    CLAY180_ROOF_TOP_X(704),
    CLAY180_ROOF_TOP_Y(1312),
    CLAY180_ROOF_BOTTOM_X(768),
    CLAY180_ROOF_BOTTOM_Y(1376),
    CLAY180_ROOF_WIDTH(64),
    CLAY180_ROOF_HEIGHT(64),

    GRAY_ROOF_TOP_X(768),
    GRAY_ROOF_TOP_Y(640),
    GRAY_ROOF_BOTTOM_X(832),
    GRAY_ROOF_BOTTOM_Y(704),
    GRAY_ROOF_WIDTH(64),
    GRAY_ROOF_HEIGHT(64),
    //NOT DONE
    GRAY180_ROOF_TOP_X(704),
    GRAY180_ROOF_TOP_Y(1312),
    GRAY180_ROOF_BOTTOM_X(768),
    GRAY180_ROOF_BOTTOM_Y(1376),
    GRAY180_ROOF_WIDTH(64),
    GRAY180_ROOF_HEIGHT(64),

    RED_ROOF_TOP_X(512),
    RED_ROOF_TOP_Y(640),
    RED_ROOF_BOTTOM_X(576),
    RED_ROOF_BOTTOM_Y(704),
    RED_ROOF_WIDTH(64),
    RED_ROOF_HEIGHT(64),
    RED180_ROOF_TOP_X(512),
    RED180_ROOF_TOP_Y(1312),
    RED180_ROOF_BOTTOM_X(576),
    RED180_ROOF_BOTTOM_Y(1376),
    RED180_ROOF_WIDTH(64),
    RED180_ROOF_HEIGHT(64),

    BLUE_ROOF_TOP_X(704),
    BLUE_ROOF_TOP_Y(640),
    BLUE_ROOF_BOTTOM_X(768),
    BLUE_ROOF_BOTTOM_Y(704),
    BLUE_ROOF_WIDTH(64),
    BLUE_ROOF_HEIGHT(64),
    BLUE180_ROOF_TOP_X(704),
    BLUE180_ROOF_TOP_Y(1312),
    BLUE180_ROOF_BOTTOM_X(768),
    BLUE180_ROOF_BOTTOM_Y(1376),
    BLUE180_ROOF_WIDTH(64),
    BLUE180_ROOF_HEIGHT(64),

    GREEN_ROOF_TOP_X(640),
    GREEN_ROOF_TOP_Y(640),
    GREEN_ROOF_BOTTOM_X(704),
    GREEN_ROOF_BOTTOM_Y(704),
    GREEN_ROOF_WIDTH(64),
    GREEN_ROOF_HEIGHT(64),
    GREEN180_ROOF_TOP_X(640),
    GREEN180_ROOF_TOP_Y(1312),
    GREEN180_ROOF_BOTTOM_X(704),
    GREEN180_ROOF_BOTTOM_Y(1376),
    GREEN180_ROOF_WIDTH(64),
    GREEN180_ROOF_HEIGHT(64),


    //*************
    //** WINDOWS **
    //*************
    SHUTTER_WINDOW_CLOSED_TOP_X(467),
    SHUTTER_WINDOW_CLOSED_TOP_Y(522),
    SHUTTER_WINDOW_CLOSED_BOTTOM_X(492),
    SHUTTER_WINDOW_CLOSED_BOTTOM_Y(555),
    SHUTTER_WINDOW_CLOSED_WIDTH(25),
    SHUTTER_WINDOW_CLOSED_HEIGHT(33),

    WOOD_WINDOW_TOP_X(6),
    WOOD_WINDOW_TOP_Y(833),
    WOOD_WINDOW_BOTTOM_X(25),
    WOOD_WINDOW_BOTTOM_Y(852),
    WOOD_WINDOW_WIDTH(18),
    WOOD_WINDOW_HEIGHT(18),


    //***********
    //** DOORS **
    //***********
    WOOD_DOOR_TOP_X(420),
    WOOD_DOOR_TOP_Y(648),
    WOOD_DOOR_BOTTOM_X(445),
    WOOD_DOOR_BOTTOM_Y(673),
    WOOD_DOOR_WIDTH(25),
    WOOD_DOOR_HEIGHT(25),

    OPEN_DOOR_TOP_X(387),
    OPEN_DOOR_TOP_Y(681),
    OPEN_DOOR_BOTTOM_X(413),
    OPEN_DOOR_BOTTOM_Y(703),
    OPEN_DOOR_WIDTH(26),
    OPEN_DOOR_HEIGHT(22),

    DOUBLE_DOOR_TOP_X(224),
    DOUBLE_DOOR_TOP_Y(961),
    DOUBLE_DOOR_BOTTOM_X(256),
    DOUBLE_DOOR_BOTTOM_Y(992),
    DOUBLE_DOOR_WIDTH(32),
    DOUBLE_DOOR_HEIGHT(32),



    //*************
    //** FOILAGE **
    //*************
    SKINNY_TREE_TOP_X(160),
    SKINNY_TREE_TOP_Y(1408),
    SKINNY_TREE_BOTTOM_X(191),
    SKINNY_TREE_BOTTOM_Y(1471),
    SKINNY_TREE_WIDTH(32),
    SKINNY_TREE_HEIGHT(64),

    FOREST_TREE_TOP_X(160),
    FOREST_TREE_TOP_Y(1024),
    FOREST_TREE_BOTTOM_X(191),
    FOREST_TREE_BOTTOM_Y(1087),
    FOREST_TREE_WIDTH(32),
    FOREST_TREE_HEIGHT(64),

    FLOWER_BUSH_TOP_X(96),
    FLOWER_BUSH_TOP_Y(1411),
    FLOWER_BUSH_BOTTOM_X(128),
    FLOWER_BUSH_BOTTOM_Y(1438),
    FLOWER_BUSH_WIDTH(32),
    FLOWER_BUSH_HEIGHT(28),

    NORM_BUSH_TOP_X(128),
    NORM_BUSH_TOP_Y(1411),
    NORM_BUSH_BOTTOM_X(160),
    NORM_BUSH_BOTTOM_Y(1439),
    NORM_BUSH_WIDTH(32),
    NORM_BUSH_HEIGHT(28);



    public int value;

    private pixCo(int value){
        this.value = value;
    }
}

/*
(0, 0)
(32, 0)
(64, 0)
(96, 0)
(128, 0)
(160, 0)
(192, 0)
(224, 0)
(256, 0)
(288, 0)
(320, 0)
(352, 0)
(384, 0)
(416, 0)
(448, 0)
(480, 0)
(512, 0)
(544, 0)
(576, 0)
(608, 0)
(640, 0)
(672, 0)
(704, 0)
(736, 0)
(768, 0)


(0, 32)
(32, 32)
(64, 32)
(96, 32)
(128, 32)
(160, 32)
(192, 32)
(224, 32)
(256, 32)
(288, 32)
(320, 32)
(352, 32)
(384, 32)
(416, 32)
(448, 32)
(480, 32)
(512, 32)
(544, 32)
(576, 32)
(608, 32)
(640, 32)
(672, 32)
(704, 32)
(736, 32)
(768, 32)


(0, 64)
(32, 64)
(64, 64)
(96, 64)
(128, 64)
(160, 64)
(192, 64)
(224, 64)
(256, 64)
(288, 64)
(320, 64)
(352, 64)
(384, 64)
(416, 64)
(448, 64)
(480, 64)
(512, 64)
(544, 64)
(576, 64)
(608, 64)
(640, 64)
(672, 64)
(704, 64)
(736, 64)
(768, 64)


(0, 96)
(32, 96)
(64, 96)
(96, 96)
(128, 96)
(160, 96)
(192, 96)
(224, 96)
(256, 96)
(288, 96)
(320, 96)
(352, 96)
(384, 96)
(416, 96)
(448, 96)
(480, 96)
(512, 96)
(544, 96)
(576, 96)
(608, 96)
(640, 96)
(672, 96)
(704, 96)
(736, 96)
(768, 96)


(0, 128)
(32, 128)
(64, 128)
(96, 128)
(128, 128)
(160, 128)
(192, 128)
(224, 128)
(256, 128)
(288, 128)
(320, 128)
(352, 128)
(384, 128)
(416, 128)
(448, 128)
(480, 128)
(512, 128)
(544, 128)
(576, 128)
(608, 128)
(640, 128)
(672, 128)
(704, 128)
(736, 128)
(768, 128)


(0, 160)
(32, 160)
(64, 160)
(96, 160)
(128, 160)
(160, 160)
(192, 160)
(224, 160)
(256, 160)
(288, 160)
(320, 160)
(352, 160)
(384, 160)
(416, 160)
(448, 160)
(480, 160)
(512, 160)
(544, 160)
(576, 160)
(608, 160)
(640, 160)
(672, 160)
(704, 160)
(736, 160)
(768, 160)


(0, 192)
(32, 192)
(64, 192)
(96, 192)
(128, 192)
(160, 192)
(192, 192)
(224, 192)
(256, 192)
(288, 192)
(320, 192)
(352, 192)
(384, 192)
(416, 192)
(448, 192)
(480, 192)
(512, 192)
(544, 192)
(576, 192)
(608, 192)
(640, 192)
(672, 192)
(704, 192)
(736, 192)
(768, 192)


(0, 224)
(32, 224)
(64, 224)
(96, 224)
(128, 224)
(160, 224)
(192, 224)
(224, 224)
(256, 224)
(288, 224)
(320, 224)
(352, 224)
(384, 224)
(416, 224)
(448, 224)
(480, 224)
(512, 224)
(544, 224)
(576, 224)
(608, 224)
(640, 224)
(672, 224)
(704, 224)
(736, 224)
(768, 224)


(0, 256)
(32, 256)
(64, 256)
(96, 256)
(128, 256)
(160, 256)
(192, 256)
(224, 256)
(256, 256)
(288, 256)
(320, 256)
(352, 256)
(384, 256)
(416, 256)
(448, 256)
(480, 256)
(512, 256)
(544, 256)
(576, 256)
(608, 256)
(640, 256)
(672, 256)
(704, 256)
(736, 256)
(768, 256)


(0, 288)
(32, 288)
(64, 288)
(96, 288)
(128, 288)
(160, 288)
(192, 288)
(224, 288)
(256, 288)
(288, 288)
(320, 288)
(352, 288)
(384, 288)
(416, 288)
(448, 288)
(480, 288)
(512, 288)
(544, 288)
(576, 288)
(608, 288)
(640, 288)
(672, 288)
(704, 288)
(736, 288)
(768, 288)


(0, 320)
(32, 320)
(64, 320)
(96, 320)
(128, 320)
(160, 320)
(192, 320)
(224, 320)
(256, 320)
(288, 320)
(320, 320)
(352, 320)
(384, 320)
(416, 320)
(448, 320)
(480, 320)
(512, 320)
(544, 320)
(576, 320)
(608, 320)
(640, 320)
(672, 320)
(704, 320)
(736, 320)
(768, 320)


(0, 352)
(32, 352)
(64, 352)
(96, 352)
(128, 352)
(160, 352)
(192, 352)
(224, 352)
(256, 352)
(288, 352)
(320, 352)
(352, 352)
(384, 352)
(416, 352)
(448, 352)
(480, 352)
(512, 352)
(544, 352)
(576, 352)
(608, 352)
(640, 352)
(672, 352)
(704, 352)
(736, 352)
(768, 352)


(0, 384)
(32, 384)
(64, 384)
(96, 384)
(128, 384)
(160, 384)
(192, 384)
(224, 384)
(256, 384)
(288, 384)
(320, 384)
(352, 384)
(384, 384)
(416, 384)
(448, 384)
(480, 384)
(512, 384)
(544, 384)
(576, 384)
(608, 384)
(640, 384)
(672, 384)
(704, 384)
(736, 384)
(768, 384)


(0, 416)
(32, 416)
(64, 416)
(96, 416)
(128, 416)
(160, 416)
(192, 416)
(224, 416)
(256, 416)
(288, 416)
(320, 416)
(352, 416)
(384, 416)
(416, 416)
(448, 416)
(480, 416)
(512, 416)
(544, 416)
(576, 416)
(608, 416)
(640, 416)
(672, 416)
(704, 416)
(736, 416)
(768, 416)


(0, 448)
(32, 448)
(64, 448)
(96, 448)
(128, 448)
(160, 448)
(192, 448)
(224, 448)
(256, 448)
(288, 448)
(320, 448)
(352, 448)
(384, 448)
(416, 448)
(448, 448)
(480, 448)
(512, 448)
(544, 448)
(576, 448)
(608, 448)
(640, 448)
(672, 448)
(704, 448)
(736, 448)
(768, 448)


(0, 480)
(32, 480)
(64, 480)
(96, 480)
(128, 480)
(160, 480)
(192, 480)
(224, 480)
(256, 480)
(288, 480)
(320, 480)
(352, 480)
(384, 480)
(416, 480)
(448, 480)
(480, 480)
(512, 480)
(544, 480)
(576, 480)
(608, 480)
(640, 480)
(672, 480)
(704, 480)
(736, 480)
(768, 480)


(0, 512)
(32, 512)
(64, 512)
(96, 512)
(128, 512)
(160, 512)
(192, 512)
(224, 512)
(256, 512)
(288, 512)
(320, 512)
(352, 512)
(384, 512)
(416, 512)
(448, 512)
(480, 512)
(512, 512)
(544, 512)
(576, 512)
(608, 512)
(640, 512)
(672, 512)
(704, 512)
(736, 512)
(768, 512)


(0, 544)
(32, 544)
(64, 544)
(96, 544)
(128, 544)
(160, 544)
(192, 544)
(224, 544)
(256, 544)
(288, 544)
(320, 544)
(352, 544)
(384, 544)
(416, 544)
(448, 544)
(480, 544)
(512, 544)
(544, 544)
(576, 544)
(608, 544)
(640, 544)
(672, 544)
(704, 544)
(736, 544)
(768, 544)


(0, 576)
(32, 576)
(64, 576)
(96, 576)
(128, 576)
(160, 576)
(192, 576)
(224, 576)
(256, 576)
(288, 576)
(320, 576)
(352, 576)
(384, 576)
(416, 576)
(448, 576)
(480, 576)
(512, 576)
(544, 576)
(576, 576)
(608, 576)
(640, 576)
(672, 576)
(704, 576)
(736, 576)
(768, 576)
*/