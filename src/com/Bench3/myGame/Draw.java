import com.Bench3.myGame.*;
import java.awt.*;


/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 10/22/13
 * Time: 4:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Draw {

    public void drawHouseYFront(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.YELLOW_ROOF_TOP_X.value, pixCo.YELLOW_ROOF_TOP_Y.value, pixCo.YELLOW_ROOF_BOTTOM_X.value, pixCo.YELLOW_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+96,     (x*32)+34,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+96,     ((x+2)*32)+48,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+36), ((x+2)*32-12)+pixCo.WOOD_DOOR_HEIGHT.value, ((y+2)*32)+42+pixCo.WOOD_DOOR_WIDTH.value, pixCo.WOOD_DOOR_TOP_X.value, pixCo.WOOD_DOOR_TOP_Y.value, pixCo.WOOD_DOOR_BOTTOM_X.value, pixCo.WOOD_DOOR_BOTTOM_Y.value, null);
    }

    public void drawHouseYBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.YELLOW180_ROOF_TOP_X.value, pixCo.YELLOW180_ROOF_TOP_Y.value, pixCo.YELLOW180_ROOF_BOTTOM_X.value, pixCo.YELLOW180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawHouseRFront(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.RED_ROOF_TOP_X.value, pixCo.RED_ROOF_TOP_Y.value, pixCo.RED_ROOF_BOTTOM_X.value, pixCo.RED_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+96,     (x*32)+34,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+96,     ((x+2)*32)+48,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+34), ((x+2)*32-12)+pixCo.OPEN_DOOR_HEIGHT.value, ((y+2)*32)+40+pixCo.OPEN_DOOR_WIDTH.value, pixCo.OPEN_DOOR_TOP_X.value, pixCo.OPEN_DOOR_TOP_Y.value, pixCo.OPEN_DOOR_BOTTOM_X.value, pixCo.OPEN_DOOR_BOTTOM_Y.value, null);
    }

    public void drawHouseRBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.RED180_ROOF_TOP_X.value, pixCo.RED180_ROOF_TOP_Y.value, pixCo.RED180_ROOF_BOTTOM_X.value, pixCo.RED180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawHouseBFront(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.STONE_WALL_TOP_X.value, pixCo.STONE_WALL_TOP_Y.value, pixCo.STONE_WALL_BOTTOM_X.value, pixCo.STONE_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.BLUE_ROOF_TOP_X.value, pixCo.BLUE_ROOF_TOP_Y.value, pixCo.BLUE_ROOF_BOTTOM_X.value, pixCo.BLUE_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+96,     (x*32)+34,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+96,     ((x+2)*32)+48,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+34), ((x+2)*32-12)+pixCo.OPEN_DOOR_HEIGHT.value, ((y+2)*32)+40+pixCo.OPEN_DOOR_WIDTH.value, pixCo.OPEN_DOOR_TOP_X.value, pixCo.OPEN_DOOR_TOP_Y.value, pixCo.OPEN_DOOR_BOTTOM_X.value, pixCo.OPEN_DOOR_BOTTOM_Y.value, null);
    }

    public void drawHouseBBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.STONE_WALL_TOP_X.value, pixCo.STONE_WALL_TOP_Y.value, pixCo.STONE_WALL_BOTTOM_X.value, pixCo.STONE_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.BLUE180_ROOF_TOP_X.value, pixCo.BLUE180_ROOF_TOP_Y.value, pixCo.BLUE180_ROOF_BOTTOM_X.value, pixCo.BLUE180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawHouseGFront(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL_TOP_X.value, pixCo.WOOD_WALL_TOP_Y.value, pixCo.WOOD_WALL_BOTTOM_X.value, pixCo.WOOD_WALL_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.GREEN_ROOF_TOP_X.value, pixCo.GREEN_ROOF_TOP_Y.value, pixCo.GREEN_ROOF_BOTTOM_X.value, pixCo.GREEN_ROOF_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (x*32)+16, (y*32)+96,     (x*32)+34,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, ((x+2)*32)+30, (y*32)+96,     ((x+2)*32)+48,   (y*32)+114, pixCo.WOOD_WINDOW_TOP_X.value, pixCo.WOOD_WINDOW_TOP_Y.value, pixCo.WOOD_WINDOW_BOTTOM_X.value, pixCo.WOOD_WINDOW_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset, (((x+2)*32)-12), ((y+2)*32+34), ((x+2)*32-12)+pixCo.OPEN_DOOR_HEIGHT.value, ((y+2)*32)+40+pixCo.OPEN_DOOR_WIDTH.value, pixCo.OPEN_DOOR_TOP_X.value, pixCo.OPEN_DOOR_TOP_Y.value, pixCo.OPEN_DOOR_BOTTOM_X.value, pixCo.OPEN_DOOR_BOTTOM_Y.value, null);
    }

    public void drawHouseGBack(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, ((x)*32),     ((y)+2)*32,   ((x)+4)*32,     ((y)+4)*32, pixCo.WOOD_WALL2_TOP_X.value, pixCo.WOOD_WALL2_TOP_Y.value, pixCo.WOOD_WALL2_BOTTOM_X.value, pixCo.WOOD_WALL2_BOTTOM_Y.value, null);
        g.drawImage(Main.f.i.tileset180, (x)*32,     (y)*32,     ((x)+4)*32,     ((y)+2)*32, pixCo.GREEN180_ROOF_TOP_X.value, pixCo.GREEN180_ROOF_TOP_Y.value, pixCo.GREEN180_ROOF_BOTTOM_X.value, pixCo.GREEN180_ROOF_BOTTOM_Y.value, null);
    }

    public void drawSkinnyTree(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.SKINNY_TREE_WIDTH.value,     (y*32)+pixCo.SKINNY_TREE_HEIGHT.value, pixCo.SKINNY_TREE_TOP_X.value, pixCo.SKINNY_TREE_TOP_Y.value, pixCo.SKINNY_TREE_BOTTOM_X.value, pixCo.SKINNY_TREE_BOTTOM_Y.value, null);
    }
    public void drawFlowerBush(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.FLOWER_BUSH_WIDTH.value,     (y*32)+pixCo.FLOWER_BUSH_HEIGHT.value, pixCo.FLOWER_BUSH_TOP_X.value, pixCo.FLOWER_BUSH_TOP_Y.value, pixCo.FLOWER_BUSH_BOTTOM_X.value, pixCo.FLOWER_BUSH_BOTTOM_Y.value, null);
    }
    public void drawNormBush(Graphics g, int x, int y){
        g.drawImage(Main.f.i.tileset, (x*32),     (y)*32,   (x*32)+pixCo.NORM_BUSH_WIDTH.value,     (y*32)+pixCo.NORM_BUSH_HEIGHT.value, pixCo.NORM_BUSH_TOP_X.value, pixCo.NORM_BUSH_TOP_Y.value, pixCo.NORM_BUSH_BOTTOM_X.value, pixCo.NORM_BUSH_BOTTOM_Y.value, null);
    }
}
