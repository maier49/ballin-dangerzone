package com.Bench3.myGame;

import java.awt.*;
import javax.swing.*;

public class Images extends JPanel{

    private static final long serialVersionUID = 1L;

    public int w = Main.w;
    public int h = Main.h;

    public boolean imagesLoaded = false;

    public Image lvl1, lvl2, select, tileset, tileset180, BO, menuBG, cursor, attack, flee, charUp, charDown, charLeft, fight, items, magic, charRight, dragon1, dragon2, bmRight, wmRight, rmRight, battleBg1;

    public Images(){
        this.setBackground(Color.black);

    }
    public void loadImages(){
        battleBg1 = new ImageIcon("src/imgs/battlebg2.png").getImage();
        lvl1      = new ImageIcon("src/imgs/lvl1.png").getImage();
        lvl2      = new ImageIcon("src/imgs/lvl2.png").getImage();
        tileset   = new ImageIcon("src/imgs/tileset.png").getImage();
        tileset180= new ImageIcon("src/imgs/tileset180.png").getImage();
        charUp    = new ImageIcon("src/imgs/charUp.gif").getImage();
        charDown  = new ImageIcon("src/imgs/charDown.gif").getImage();
        charLeft  = new ImageIcon("src/imgs/charLeft.gif").getImage();
        charRight = new ImageIcon("src/imgs/charRight.gif").getImage();
        bmRight   = new ImageIcon("src/imgs/bm.gif").getImage();
        wmRight   = new ImageIcon("src/imgs/wm.gif").getImage();
        rmRight   = new ImageIcon("src/imgs/rm.gif").getImage();
        dragon1   = new ImageIcon("src/imgs/drag.gif").getImage();
        BO        = new ImageIcon("src/imgs/blackout.png").getImage();
        menuBG    = new ImageIcon("src/imgs/menubg.png").getImage();
        cursor    = new ImageIcon("src/imgs/cursor.png").getImage();
        fight     = new ImageIcon("src/imgs/fight.png").getImage();
        items     = new ImageIcon("src/imgs/items.png").getImage();
        magic     = new ImageIcon("src/imgs/magic.png").getImage();
        attack    = new ImageIcon("src/imgs/attack.png").getImage();
        flee      = new ImageIcon("src/imgs/Flee.png").getImage();
        select    = new ImageIcon("src/imgs/select.png").getImage();

        imagesLoaded = true;
    }
}