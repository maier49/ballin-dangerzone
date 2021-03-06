package com.Bench3.myGame.levels;


import com.Bench3.myGame.*;
import com.Bench3.myGame.gameState;
import com.Bench3.myGame.Sound;

import java.awt.*;
import java.awt.event.*;


public class Level1 extends BaseLevel {
    public Rectangle character, battleChar;
    public Rectangle leftWall, bottomWall, rightWall1, topDoor, topDoorTrigger;
    public Rectangle hallwayTop, nub1, nub2, hallwayNub1, hallwayNub2, hallwayNub3, hallwayNub4, hallwayNub5, hallwayNub6, hallwayNub7;
    public Rectangle t1Top, t1Bottom, t1Back, t1Trigger; //treasure 1 walls
    public Rectangle t2Top, t2Bottom, t2Back, t2Trigger; //treasure 2 walls
    public Rectangle t3Top, t3Right; //treasure 3 top and right
    public Rectangle stairsLeft, stairsRight, stairsBottom; //bottom stairs and walls
    public Rectangle hdLeft, hdRight; //hallway down left and right walls
    public Rectangle orLeft, orLeftTop, orRightTop1, orRightTop2, orRight1, orRight2;//or = Open Room
    public Rectangle p1, p2, p3, p4, m1, m2, m3, m4; //health = rectangle.width
    public Rectangle t3nr1, t3nr2, t3nt1, t3nt2, t3HallwayTop, t3HallwayBottom; //hallway
    public Rectangle nook1, nook2, nook3, nook4, nook5, nook6, nook7, t4Bottom, t4n1, t4n2, t4n3, t4n4, tnook1, tnook2, tnook3, tnook4, t4Left, t4Top, t4Trigger, t4TriggerN, t4Right;
    //Left and Right battle sprite positions(4)  //cursor positions (x,y)
    public Point l1, l2, l3, l4, r1, r2, r3, r4, c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

    public int cPos = 4;//which point the cursor is at.
    public int target = 0;
    public int attacker = -1;
    public int charW = 18;
    public int charH = 18; //65
    public int level = 1;
    public int select = 0;
    public int partySize = 1;
    public int turnNumber = 1;
    public int mouseOffset = charH;
    public long jumpingTime = 1000;


    public boolean collision, right, fightMenu, itemMenu, magicMenu, fightMenu2, cursorMove, dragonKilled, m1Dead, m2Dead, m3Dead, m4Dead, p1Dead, p2Dead, p3Dead, p4Dead, inBattle, left, up, down, bRight, bLeft, bUp, bDown, drawUp, drawDown, drawLeft, drawRight, drag, jumping, mouseActive = false;
    public Point mouse;
    public boolean soundStart = true;


    public Level1(Display f, Images i) {

        select = 0;

        //TILE HEIGHT = 22
        //TILE WIDTH  = 26
        if(gameState.level == 1){
        character = new Rectangle(50, 88, charW, charH);
        drawDown = true;
        }
        if(gameState.level == 3){
        character = new Rectangle(423, 524, charW, charH);
        drawUp = true;
        }
        battleChar = new Rectangle(235, 225, 32, 32);
        //Declare Rectangles        X    Y    W    H
        topDoor = new Rectangle(20, 82, 75, 1);
        topDoorTrigger = new Rectangle(45, 82, 26, 1);
        leftWall = new Rectangle(21, 0, 1, 238);
        bottomWall = new Rectangle(0, 238, 320, 1);
        rightWall1 = new Rectangle(95, 0, 1, 215);

        hallwayTop = new Rectangle(95, 215, 150, 1);
        hallwayNub1 = new Rectangle(245, 194, 1, 22);
        hallwayNub2 = new Rectangle(245, 194, 26, 1);
        hallwayNub3 = new Rectangle(270, 172, 1, 22);
        hallwayNub4 = new Rectangle(271, 172, 50, 1);
        hallwayNub5 = new Rectangle(320, 0, 1, 172);
        nub1 = new Rectangle(320, 216, 1, 50);
        nub2 = new Rectangle(320, 216, 51, 1);

        t1Top = new Rectangle(168, 479, 177, 1);
        t1Bottom = new Rectangle(168, 502, 251, 1);
        t1Back = new Rectangle(168, 480, 1, 22);
        t1Trigger = new Rectangle(168, 480, 29, 22);

        t2Top = new Rectangle(470, 436, 199, 1);
        t2Bottom = new Rectangle(445, 458, 224, 1);
        t2Back = new Rectangle(668, 437, 1, 22);
        t2Trigger = new Rectangle(642, 437, 1, 22);


        t3Top = new Rectangle(320, 105, 76, 1);
        t3Right = new Rectangle(396, 105, 1, 45);//45 instead of 146
        t3nr1 = new Rectangle(396, 149, 25, 1);
        t3nr2 = new Rectangle(396, 215, 25, 1);
        t3nt1 = new Rectangle(421, 193, 1, 22);
        t3nt2 = new Rectangle(421, 149, 1, 22);
        t3HallwayTop = new Rectangle(421, 171, 177, 1);
        t3HallwayBottom = new Rectangle(421, 193, 101, 1);

        t4Bottom = new Rectangle(623, 192, 101, 1);
        t4n1 = new Rectangle(723, 170, 25, 1);
        t4n2 = new Rectangle(723, 170, 1, 22);
        t4n3 = new Rectangle(748, 148, 25, 1);
        t4n4 = new Rectangle(748, 150, 1, 22);
        t4Left = new Rectangle(697, 127, 1, 44);
        t4Top = new Rectangle(697, 127, 51, 1);
        t4Trigger = new Rectangle(747, 105, 25, 1);
        t4TriggerN = new Rectangle(747, 105, 1, 22);
        t4Right = new Rectangle(773, 83, 1, 75);


        tnook1 = new Rectangle(597, 149, 1, 22);
        tnook2 = new Rectangle(597, 149, 51, 1);
        tnook3 = new Rectangle(647, 149, 1, 22);
        tnook4 = new Rectangle(647, 171, 51, 1);


        hdRight = new Rectangle(396, 215, 1, 154);
        hdLeft = new Rectangle(370, 217, 1, 175);

        orLeftTop = new Rectangle(345, 392, 25, 1);
        orLeft = new Rectangle(345, 392, 1, 88);
        orRightTop1 = new Rectangle(396, 369, 50, 1);
        orRightTop2 = new Rectangle(446, 391, 25, 1);
        orRight1 = new Rectangle(446, 369, 1, 23);
        orRight2 = new Rectangle(470, 391, 1, 45);
        stairsLeft = new Rectangle(419, 502, 1, 44);
        stairsRight = new Rectangle(444, 458, 1, 88);
        stairsBottom = new Rectangle(419, 546, 25, 1);

        nook1 = new Rectangle(522, 192, 1, 22);
        nook2 = new Rectangle(522, 214, 25, 1);
        nook3 = new Rectangle(547, 214, 1, 22);
        nook4 = new Rectangle(547, 236, 51, 1);
        nook5 = new Rectangle(597, 214, 1, 22);
        nook6 = new Rectangle(597, 214, 26, 1);
        nook7 = new Rectangle(622, 192, 1, 22);

        //Health  //Bar Height
        p1 = new Rectangle(0, 0, 30, 2);
        p2 = new Rectangle(0, 0, 30, 2);
        p3 = new Rectangle(0, 0, 30, 2);
        p4 = new Rectangle(0, 0, 30, 2);
        m1 = new Rectangle(0, 0, 60, 3);
        m2 = new Rectangle(0, 0, 60, 3);
        m3 = new Rectangle(0, 0, 60, 3);
        m4 = new Rectangle(0, 0, 60, 3);

        //Cursor Battle Positions: c0-c3 = Players  c4-c6 = Menu  c7-c10 = Monsters
        c0 = new Point(265, 235);
        c1 = new Point(225, 274);
        c2 = new Point(225, 312);
        c3 = new Point(225, 350);
        c4 = new Point(160, 390);
        c5 = new Point(160, 407);
        c6 = new Point(160, 425);
        c7 = new Point(480, 225);
        c8 = new Point(560, 255);
        c9 = new Point(480, 305);
        c10 = new Point(560, 335);

        //Left character positions(players)
        l1 = new Point(275, 225);
        l2 = new Point(237, 264);
        l3 = new Point(239, 302);
        l4 = new Point(241, 340);

        //right character positions(monsters)
        r1 = new Point(490, 200);
        r2 = new Point(570, 230);
        r3 = new Point(490, 280);
        r4 = new Point(570, 310);


        //***********************
        //** KEYMAPPING/MOVING **
        //***********************
        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // Right Move (D Key)
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    right = true;
                    bRight = true;
                    drawRight = true;
                    drawUp = false;
                    drawDown = false;
                    drawLeft = false;
                }// Left Move (A Key)
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    left = true;
                    bLeft = true;
                    drawLeft = true;
                    drawUp = false;
                    drawDown = false;
                    drawRight = false;
                }// Up Move (W Key)
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    up = true;
                    bUp = true;
                    drawUp = true;
                    drawRight = false;
                    drawDown = false;
                    drawLeft = false;
                }// Down Move (S Key)
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    down = true;
                    bDown = true;
                    drawDown = true;
                    drawUp = false;
                    drawRight = false;
                    drawLeft = false;
                }// Reset (Esc)
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    character.x = 50;
                    character.y = 88;
                    select = 0;
                    m1Dead = false;
                    m2Dead = false;
                    m3Dead = false;
                    m4Dead = false;
                    m1.width = 60;
                    m2.width = 60;
                    m3.width = 60;
                    m4.width = 60;
                }
                //Down Move (S Key)
                //MOUSE TOGGLE
                //	if(e.getKeyCode() == KeyEvent.VK_M){
                //		mouseActive = true;
                //	}

                //JUMPING
                //	if(e.getKeyCode() == KeyEvent.VK_SPACE){
                //		jumping = true;
                //		new Thread(new jumpThread()).start();
                //	}

            }

            public void keyReleased(KeyEvent e) {

                //KeyRelease aka stop moving/single button presses.
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    right = false;
                    bRight = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    left = false;
                    bLeft = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    up = false;
                    bUp = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    down = false;
                    bDown = false;
                }

                if (e.getKeyCode() == KeyEvent.VK_X) {
                    if (cPos == 4 || cPos == 5 || cPos == 6) { //Allows selection only if cursor is on the three menu locations
                        if (select == 1)
                            select = 2;
                        if (select == 0)
                            select = 1;
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_X && select == 2 && fightMenu2) {//This stuff happens when a target is selected.
                    target = cPos;
                    attacker = turnNumber - 1;
                    select = 0;
                    cPos = 4;
                    fightMenu = false;
                    fightMenu2 = false;
                    if (target == 7) {
                        m1.width -= 30;
                        if (m1.width <= 0)
                            m1Dead = true;
                    }
                    if (target == 8) {
                        m2.width -= 30;
                        if (m2.width <= 0)
                            m2Dead = true;
                    }
                    if (target == 9) {
                        m3.width -= 30;
                        if (m3.width <= 0)
                            m3Dead = true;
                    }
                    if (target == 10) {
                        m4.width -= 30;
                        if (m4.width <= 0)
                            m4Dead = true;
                    }
                    turnNumber++;
                    if (turnNumber == 2) {
                        l1.x -= 40;
                        c0.x -= 40;
                        l2.x += 40;
                        c1.x += 40;
                    }
                    if (turnNumber == 3) {
                        l2.x -= 40;
                        c1.x -= 40;
                        l3.x += 40;
                        c2.x += 40;
                    }
                    if (turnNumber == 4) {
                        l3.x -= 40;
                        c2.x -= 40;
                        l4.x += 40;
                        c3.x += 40;
                    }
                    if (turnNumber == 5) {
                        turnNumber = 1;
                        l4.x -= 40;
                        c3.x -= 40;
                        l1.x += 40;
                        c0.x += 40;
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_Z) {
                    if (cPos == 4 || cPos == 5 || cPos == 6) { //Allows user to go back in menus
                        if (select == 1)
                            select = 0;
                    }
                    if (select == 2)
                        select = 1;

                    if (fightMenu2) {
                        select = 1;
                        cPos = 4;
                    }
                }

                //Cursor Movement
                if (e.getKeyCode() == KeyEvent.VK_W && inBattle && cPos == 0) {//Loops from top of list to bottom
                    cPos = 11;
                }
                if (e.getKeyCode() == KeyEvent.VK_W && inBattle && cPos == 7 && fightMenu2) {//Loops from top of list to bottom in battle
                    cPos = 11;
                }

                if (e.getKeyCode() == KeyEvent.VK_W && inBattle && cPos >= 1) {
                    cPos--;
                    if (cPos == 10 && m4Dead)
                        cPos--;
                    if (cPos == 9 && m3Dead)
                        cPos--;
                    if (cPos == 8 && m2Dead)
                        cPos--;
                    if (cPos == 7 && m1Dead && fightMenu2)
                        cPos = 10;
                    if (cPos == 7 && m1Dead)
                        cPos = 6;
                }

                if (e.getKeyCode() == KeyEvent.VK_W && inBattle && cPos == 7 && fightMenu2 && m1Dead) {
                    cPos = 10;
                    System.out.println(cPos + " 265");
                }

                if (e.getKeyCode() == KeyEvent.VK_S && inBattle && cPos == 10) {
                    cPos = -1;
                }

                if (e.getKeyCode() == KeyEvent.VK_S && inBattle && cPos <= 9) {
                    cPos++;
                    if (cPos == 7 && m1Dead)
                        cPos++;
                    if (cPos == 8 && m2Dead)
                        cPos++;
                    if (cPos == 9 && m3Dead)
                        cPos++;
                    if (cPos == 10 && m4Dead)
                        cPos = 0;
                }

                if (e.getKeyCode() == KeyEvent.VK_D && inBattle && cPos <= 6) {
                    cPos = 7;
                    if (m1Dead) {
                        cPos = 8;
                    }
                    if (m2Dead) {
                        cPos = 9;
                    }
                    if (m3Dead) {
                        cPos = 10;
                    }
                    if (m4Dead) {
                        cPos = 7;
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_A && inBattle && cPos >= 7) {
                    cPos = 0;
                    System.out.println(cPos + "285");
                }
            }
        });

        //Mouse Motion Listener(Movement)
        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                mouse = new Point(e.getX(), e.getY() - mouseOffset);
                if (mouseActive && (character.x != Main.w - charW)) {
                    character.x = mouse.x;
                    character.y = mouse.y;
                }

            }
        });

        //Mouse Click Listener(Clicks)
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                mouse = new Point(e.getX(), e.getY() - mouseOffset);

                if (e.getButton() == MouseEvent.BUTTON1 && !mouseActive) {
                    character.x = mouse.x;
                    character.y = mouse.y;
                }
            }
        });
    }
    @Override
    public void battle(Graphics g) {
        g.drawImage(Main.f.i.battleBg1, 144, 144, 512, 312, null);


        if (!m1Dead) {
            g.drawImage(Main.f.i.dragon1, r1.x, r1.y, 64, 64, null);
            g.setColor(Color.RED);
            g.fillRect(r1.x, r1.y - 5, 60, 3);
            g.setColor(Color.GREEN);
            g.fillRect(r1.x, r1.y - 5, m1.width, 3);
        }
        if (!m2Dead) {
            g.drawImage(Main.f.i.dragon1, r2.x, r2.y, 64, 64, null);
            g.setColor(Color.RED);
            g.fillRect(r2.x, r2.y - 5, 60, 3);
            g.setColor(Color.GREEN);
            g.fillRect(r2.x, r2.y - 5, m2.width, 3);
        }
        if (!m3Dead) {
            g.drawImage(Main.f.i.dragon1, r3.x, r3.y, 64, 64, null);
            g.setColor(Color.RED);
            g.fillRect(r3.x, r3.y - 5, 60, 3);
            g.setColor(Color.GREEN);
            g.fillRect(r3.x, r3.y - 5, m3.width, 3);
        }
        if (!m4Dead) {
            g.drawImage(Main.f.i.dragon1, r4.x, r4.y, 64, 64, null);
            g.setColor(Color.RED);
            g.fillRect(r4.x, r4.y - 5, 60, 3);
            g.setColor(Color.GREEN);
            g.fillRect(r4.x, r4.y - 5, m4.width, 3);
        }

        if (!p1Dead) {
            g.drawImage(Main.f.i.charRight, l1.x, l1.y, 32, 32, null);
            g.setColor(Color.RED);
            g.fillRect(l1.x, l1.y - 5, 30, p1.height);
            g.setColor(Color.GREEN);
            g.fillRect(l1.x, l1.y - 5, p1.width, p1.height);
        }
        if (!p2Dead) {
            g.drawImage(Main.f.i.bmRight, l2.x, l2.y, 32, 32, null);
            g.setColor(Color.RED);
            g.fillRect(l2.x, l2.y - 5, 30, p2.height);
            g.setColor(Color.GREEN);
            g.fillRect(l2.x, l2.y - 5, p2.width, p2.height);
        }
        if (!p3Dead) {
            g.drawImage(Main.f.i.wmRight, l3.x, l3.y, 32, 32, null);
            g.setColor(Color.RED);
            g.fillRect(l3.x, l3.y - 5, 30, p3.height);
            g.setColor(Color.GREEN);
            g.fillRect(l3.x, l3.y - 5, p3.width, p3.height);
        }
        if (!p4Dead) {
            g.drawImage(Main.f.i.rmRight, l4.x, l4.y, 32, 32, null);
            g.setColor(Color.RED);
            g.fillRect(l4.x, l4.y - 5, 30, p4.height);
            g.setColor(Color.GREEN);
            g.fillRect(l4.x, l4.y - 5, p4.width, p4.height);
        }
                /*
                if(m1Dead && cPos == 7){
                    cPos = 8;
                }
                if(m2Dead && cPos == 8){
                    cPos = 7;
                }
                if(m3Dead && cPos == 9){
                    cPos = 7;
                }
                if(m4Dead && cPos == 10){
                    cPos = 7;
                }*/
        if (m1Dead && m2Dead && m3Dead && m4Dead) {
            // ********************
            // DISPLAY BATTLE WON
            // ETC ETC ETC ETC ETC
            // ********************
            character.x += 1; // move character out of battle trigger
            fightMenu = false;
            fightMenu2 = false;
            itemMenu = false;
            inBattle = false;
            magicMenu = false;
            cPos = 4;
            select = 0;
        }
        // *******************
        // ** MENU BULLSHIT **
        // *******************
        if (select == 0) {
            g.drawImage(Main.f.i.menuBG, 149, 380, 500, 70, null);
            g.drawImage(Main.f.i.fight, 175, 393, 28, 11, null);
            g.drawImage(Main.f.i.items, 175, 409, 28, 11, null);
            g.drawImage(Main.f.i.flee, 175, 427, 22, 8, null);
            fightMenu = false;
            itemMenu = false;
            fightMenu2 = false;
            magicMenu = false;
        }
        // SELECT FIGHT(4,1)
        if ((cPos <= 4 || cPos >= 7) && select == 1 && !itemMenu) {
            fightMenu2 = false;
            itemMenu = false;
            magicMenu = false;
            fightMenu = true;
        }// SELECT ATTACK(4,2)
        if (cPos == 4 && select == 2 && !magicMenu && !itemMenu) {
            fightMenu = false;
            itemMenu = false;
            magicMenu = false;
            fightMenu2 = true;
        }// SELECT ITEM(5,1)
        if (cPos == 5 && select == 1 && !fightMenu && !magicMenu) {
            fightMenu = false;
            fightMenu2 = false;
            magicMenu = false;
            itemMenu = true;
        }// Don't select item if user selects Magic(5,1)
        if (cPos == 5 && select == 1 && !fightMenu && !itemMenu) {
            fightMenu = true;
            fightMenu2 = false;
            magicMenu = false;
            itemMenu = false;
        }// SELECT MAGIC(5,2)
        if (cPos == 5 && select == 2 && fightMenu && !itemMenu) {
            fightMenu = false;
            fightMenu2 = false;
            itemMenu = false;
            magicMenu = true;
        }
        // ****************
        // ** MAGIC MENU **
        // ****************
        if (magicMenu) {
            fightMenu = false;
            fightMenu2 = false;
            itemMenu = false;
            g.drawImage(Main.f.i.menuBG, 149, 380, 500, 70, null);
            g.drawImage(Main.f.i.magic, 175, 409, 29, 12, null);
        }
        // ****************
        // ** ITEMS MENU **
        // ****************
        if (itemMenu) {
            fightMenu = false;
            fightMenu2 = false;
            magicMenu = false;
            g.drawImage(Main.f.i.menuBG, 149, 380, 500, 70, null);
            g.drawImage(Main.f.i.items, 175, 409, 28, 11, null);
        }
        //****************
        //** FIGHT MENU **
        //****************
        if (fightMenu) { //Fight menu with options of ATTACK, MAGIC
            fightMenu2 = false;
            itemMenu = false;
            magicMenu = false;
            g.drawImage(Main.f.i.menuBG, 149, 380, 500, 70, null);
            g.drawImage(Main.f.i.attack, 175, 393, 36, 9, null);
            g.drawImage(Main.f.i.magic, 175, 409, 29, 12, null);
        }
        //*****************************
        //** SELECT MENU(fightMenu2) **
        //*****************************
        if (fightMenu2) { //Select target to attack

            fightMenu = false;
            itemMenu = false;
            magicMenu = false;

            if (cPos < 7) { //traps the cursor on the enemies while selecting target
                cPos = 7;
                System.out.println(cPos + " 682");
                if (m1Dead) {
                    cPos = 8;
                    System.out.println(cPos + " 684");
                }
                if (m2Dead) {
                    cPos = 9;
                    System.out.println(cPos + " 686");
                }
                if (m3Dead) {
                    cPos = 10;
                    System.out.println(cPos + " 688");
                }
                if (m4Dead) {
                    cPos = 0;
                    System.out.println(cPos + " 705");
                }
            }
            g.drawImage(Main.f.i.menuBG, 149, 380, 500, 70, null);
            g.drawImage(Main.f.i.select, 175, 393, 106, 10, null);
        }
        //**********
        //** FLEE **
        //**********
        if (cPos == 6 && select == 1 && !fightMenu && !itemMenu && !fightMenu2 && !magicMenu) {
            character.x += 1;
            fightMenu = false;
            fightMenu2 = false;
            itemMenu = false;
            inBattle = false;
            magicMenu = false;
            cPos = 4;
            System.out.println(cPos + " 617");
            select = 0;
        }
        //*****************
        //** DRAW CURSOR ** Draws cursor in one of 10 spots
        //*****************
        if (cPos == 0)
            g.drawImage(Main.f.i.cursor, c0.x, c0.y, 7, 15, null);
        if (cPos == 1)
            g.drawImage(Main.f.i.cursor, c1.x, c1.y, 7, 15, null);
        if (cPos == 2)
            g.drawImage(Main.f.i.cursor, c2.x, c2.y, 7, 15, null);
        if (cPos == 3)
            g.drawImage(Main.f.i.cursor, c3.x, c3.y, 7, 15, null);
        if (cPos == 4)
            g.drawImage(Main.f.i.cursor, c4.x, c4.y, 7, 15, null);
        if (cPos == 5)
            g.drawImage(Main.f.i.cursor, c5.x, c5.y, 7, 15, null);
        if (cPos == 6)
            g.drawImage(Main.f.i.cursor, c6.x, c6.y, 7, 15, null);
        if (cPos == 7)
            g.drawImage(Main.f.i.cursor, c7.x, c7.y, 7, 15, null);
        if (cPos == 8)
            g.drawImage(Main.f.i.cursor, c8.x, c8.y, 7, 15, null);
        if (cPos == 9)
            g.drawImage(Main.f.i.cursor, c9.x, c9.y, 7, 15, null);
        if (cPos == 10)
            g.drawImage(Main.f.i.cursor, c10.x, c10.y, 7, 15, null);

        up = false;
        down = false;
        left = false;
        right = false;
        collision = true; // change collision to move in battle
    }

    @Override
    public void moveCharacter() {
        if (right && (character.x != Main.w - charW))
            character.x += 1; // LEFT MOVE Left bound
        if (left && (character.x >= 1))
            character.x -= 1; // MOVE UP Upwards bound
        if (up && (character.y >= 1))
            character.y -= 1; // MOVE DOWN Downwards bound
        if (down && (character.y != (Main.h)))
            character.y += 1; // RIGHT MOVE Right bound
        if (bRight && !collision && (battleChar.x != Main.w - 32))
            battleChar.x += 1; // LEFT MOVE Left bound
        if (bLeft && !collision && (battleChar.x >= 1))
            battleChar.x -= 1; // MOVE UP Upwards bound
        if (bUp && !collision && (battleChar.y >= 1))
            battleChar.y -= 1; // MOVE DOWN Downwards bound
        if (bDown && !collision && (battleChar.y != (Main.h - 54)))
            battleChar.y += 1;
    }

    @Override
    public void paintComponent(Graphics g) {

          //  if(gameState.level ==1)
          //  gameState.level = 2;
        Sound gameSound = new Sound();
        //if(soundStart){
        //gameSound.music(true, "blah");
       // soundStart = false;
       // }

        if(soundStart){
            gameSound.track("src/sound/Avalanche.wav");
            soundStart = false;
        }

               drawBG(g);


            g.setColor(Color.WHITE);


            //****************
            //* DRAW SPRITES *
            //****************
            if (drawDown) {
                g.drawImage(Main.f.i.charDown, character.x, character.y, charW, charH, null);
                g.drawImage(Main.f.i.BO, character.x-791, character.y-791, 1600, 1600, null);
            }
            if (drawLeft) {
                g.drawImage(Main.f.i.charLeft, character.x, character.y, charW, charH, null);
                g.drawImage(Main.f.i.BO, character.x-791, character.y-791, 1600, 1600, null);
            }
            if (drawRight) {
                g.drawImage(Main.f.i.charRight, character.x, character.y, charW, charH, null);
                g.drawImage(Main.f.i.BO, character.x-791, character.y-791, 1600, 1600, null);
            }
            if (drawUp) {
                g.drawImage(Main.f.i.charUp, character.x, character.y, charW, charH, null);
                g.drawImage(Main.f.i.BO, character.x-791, character.y-791, 1600, 1600, null);
            }

            //************************
            //* POINTS FOR COLLISION *
            //************************
            Point pt1 = new Point(character.x, character.y);                    //TOP LEFT
            Point pt2 = new Point(character.x + charW, character.y);            //TOP RIGHT
            Point pt3 = new Point(character.x, character.y + charH);            //BOTTOM LEFT
            Point pt4 = new Point(character.x + charW, character.y + charH);    //BOTTOM RIGHT
            Point b1 = new Point(battleChar.x, battleChar.y);                    //BATTLE TOP LEFT
            Point b2 = new Point(battleChar.x + 32, battleChar.y);                //BATTLE TOP RIGHT
            Point b3 = new Point(battleChar.x, battleChar.y + 32);                //BATTLE BOTTOM LEFT
            Point b4 = new Point(battleChar.x + 32, battleChar.y + 32);        //BATTLE BOTTOM RIGHT
            Point bM = new Point(battleChar.x + 16, battleChar.y + 16);        //BATTLE MID

            //TOP Collision
            if (topDoor.contains(pt1) || topDoor.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (hallwayTop.contains(pt1) || hallwayTop.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (hallwayNub2.contains(pt1) || hallwayNub2.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (hallwayNub4.contains(pt1) || hallwayNub4.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t3Top.contains(pt1) || t3Top.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t1Top.contains(pt1) || t1Top.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t2Top.contains(pt1) || t2Top.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (orLeftTop.contains(pt1) || orLeftTop.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (orRightTop1.contains(pt1) || orRightTop1.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (orRightTop2.contains(pt1) || orRightTop2.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t4Top.contains(pt1) || t4Top.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (tnook2.contains(pt1) || tnook2.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (tnook4.contains(pt1) || tnook4.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t3HallwayTop.contains(pt1) || t3HallwayTop.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t3nr1.contains(pt1) || t3nr1.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (t4Trigger.contains(pt1) || t4Trigger.contains(pt2)) {
                up = false;
                collision = true;
            }
            if (topDoorTrigger.contains(pt1) || topDoorTrigger.contains(pt2)) {
                up = false;
                collision = true;
                gameSound.music(false, "blah");
                gameState.level = 0;
            }


            //LEFT Collision
            if (leftWall.contains(pt1) || leftWall.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (hallwayNub1.contains(pt1) || hallwayNub1.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (hallwayNub3.contains(pt1) || hallwayNub3.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (hallwayNub5.contains(pt1) || hallwayNub5.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (hdLeft.contains(pt1) || hdLeft.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (t1Back.contains(pt1) || t1Back.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (orLeft.contains(pt1) || orLeft.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (stairsLeft.contains(pt1) || stairsLeft.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (nook1.contains(pt1) || nook1.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (nook3.contains(pt1) || nook3.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (tnook1.contains(pt1) || tnook1.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (t4Left.contains(pt1) || t4Left.contains(pt3)) {
                left = false;
                collision = true;
            }
            if (t4TriggerN.contains(pt1) || t4TriggerN.contains(pt3)) {
                left = false;
                collision = true;
            }

            //if(t1Trigger.contains(pt1) || t1Trigger.contains(pt3))
            //		left = false; collision = true;

            //DOWN Collision
            if (bottomWall.contains(pt4) || bottomWall.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (nub2.contains(pt4) || nub2.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t1Bottom.contains(pt4) || t1Bottom.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t2Bottom.contains(pt4) || t2Bottom.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t4Bottom.contains(pt4) || t4Bottom.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t3HallwayBottom.contains(pt4) || t3HallwayBottom.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (nook2.contains(pt4) || nook2.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (nook6.contains(pt4) || nook6.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (nook4.contains(pt4) || nook4.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t3nr2.contains(pt4) || t3nr2.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t4n1.contains(pt4) || t4n1.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (t4n3.contains(pt4) || t4n3.contains(pt3)) {
                down = false;
                collision = true;
            }
            if (stairsBottom.contains(pt4) || stairsBottom.contains(pt3)) {
                down = false;
                collision = true;
                gameSound.music(false, "blah");
                gameState.level = 2;
                System.out.println(gameState.level);
            }

            //RIGHT Collision
            if (rightWall1.contains(pt4) || rightWall1.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (nub1.contains(pt4) || nub1.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (t3Right.contains(pt4) || t3Right.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (hdRight.contains(pt4) || hdRight.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (t2Back.contains(pt4) || t2Back.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (stairsRight.contains(pt4) || stairsRight.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (orRight1.contains(pt4) || orRight1.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (orRight2.contains(pt4) || orRight2.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (t3nt1.contains(pt4) || t3nt1.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (t3nt2.contains(pt4) || t3nt2.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (tnook3.contains(pt4) || tnook3.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (nook5.contains(pt4) || nook5.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (nook7.contains(pt4) || nook7.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (t4n2.contains(pt4) || t4n2.contains(pt2)) {
                right = false;
                collision = true;
            }
            if (t4n4.contains(pt4) || t4n4.contains(pt2)) {
                right = false;
                collision = true;
            }
        if (t4Right.contains(pt4) || t4Right.contains(pt2)) {
            right = false;
            collision = true;
        }

            //******************
            //***** EVENTS *****
            //******************
        /*
		if(stairsBottom.contains(pt4) || stairsBottom.contains(pt3) && level == 2){
			character.x = 50;
			character.y = 88;
			level = 3;
		}
		if(stairsBottom.contains(pt4) || stairsBottom.contains(pt3) && level == 1){
			character.x = 50;
			character.y = 88;
			level = 2;
		}
		if(stairsBottom.contains(pt4) || stairsBottom.contains(pt3) && level == 3){
			character.x = 50;
			character.y = 88;
			level = 1;
		} */

            //Battle Event
            if ((t1Trigger.contains(pt1) || t1Trigger.contains(pt3)) && (dragonKilled == false)) {
                inBattle = true;
                battle(g);
            }

            //******************
            //* MOVEMENT/SPEED *
            //****************** // RIGHT MOVE Right bound
            moveCharacter();


//		if(jumping) //JUMPING
//			character.y--;


         //************************
        //* DRAW INVISIBLE WALLS *
        //************************
        /*
		g.fillRect(topDoor.x, topDoor.y, topDoor.width, topDoor.height);
		g.fillRect(topDoorTrigger.x, topDoorTrigger.y, topDoorTrigger.width, topDoorTrigger.height);
		g.fillRect(leftWall.x, leftWall.y, leftWall.width, leftWall.height);
		g.fillRect(bottomWall.x, bottomWall.y, bottomWall.width, bottomWall.height);
		g.fillRect(rightWall1.x, rightWall1.y, rightWall1.width, rightWall1.height);
		g.fillRect(hallwayTop.x, hallwayTop.y, hallwayTop.width, hallwayTop.height);
		g.fillRect(hallwayNub1.x, hallwayNub1.y, hallwayNub1.width, hallwayNub1.height);
		g.fillRect(hallwayNub2.x, hallwayNub2.y, hallwayNub2.width, hallwayNub2.height);
		g.fillRect(hallwayNub3.x, hallwayNub3.y, hallwayNub3.width, hallwayNub3.height);
		g.fillRect(hallwayNub4.x, hallwayNub4.y, hallwayNub4.width, hallwayNub4.height);
		g.fillRect(hallwayNub5.x, hallwayNub5.y, hallwayNub5.width, hallwayNub5.height);
		g.fillRect(nub1.x, nub1.y, nub1.width, nub1.height);
		g.fillRect(nub2.x, nub2.y, nub2.width, nub2.height);
		g.fillRect(t1Top.x, t1Top.y, t1Top.width, t1Top.height);
		g.fillRect(t1Bottom.x, t1Bottom.y, t1Bottom.width, t1Bottom.height);
		g.fillRect(t1Back.x, t1Back.y, t1Back.width, t1Back.height);
		g.fillRect(t1Trigger.x, t1Trigger.y, t1Trigger.width, t1Trigger.height);
		g.fillRect(t2Top.x, t2Top.y, t2Top.width, t2Top.height);
		g.fillRect(t2Bottom.x, t2Bottom.y, t2Bottom.width, t2Bottom.height);
		g.fillRect(t2Back.x, t2Back.y, t2Back.width, t2Back.height);
		g.fillRect(t2Trigger.x, t2Trigger.y, t2Trigger.width, t2Trigger.height);
		g.fillRect(t3Top.x, t3Top.y, t3Top.width, t3Top.height);
		g.fillRect(t3Right.x, t3Right.y, t3Right.width, t3Right.height);
		g.fillRect(hdRight.x, hdRight.y, hdRight.width, hdRight.height);
		g.fillRect(hdLeft.x, hdLeft.y, hdLeft.width, hdLeft.height);
		g.fillRect(stairsLeft.x, stairsLeft.y, stairsLeft.width, stairsLeft.height);
		g.fillRect(stairsRight.x, stairsRight.y, stairsRight.width, stairsRight.height);
		g.fillRect(stairsBottom.x, stairsBottom.y, stairsBottom.width, stairsBottom.height);
		g.fillRect(orLeft.x, orLeft.y, orLeft.width, orLeft.height);
		g.fillRect(orLeftTop.x, orLeftTop.y, orLeftTop.width, orLeftTop.height);
		g.fillRect(orRightTop1.x, orRightTop1.y, orRightTop1.width, orRightTop1.height);
		g.fillRect(orRightTop2.x, orRightTop2.y, orRightTop2.width, orRightTop2.height);
		g.fillRect(orRight1.x, orRight1.y, orRight1.width, orRight1.height);
		g.fillRect(orRight2.x, orRight2.y, orRight2.width, orRight2.height);
		g.fillRect(t3nr1.x, t3nr1.y, t3nr1.width, t3nr1.height);
		g.fillRect(t3nr2.x, t3nr2.y, t3nr2.width, t3nr2.height);
		g.fillRect(t3nt1.x, t3nt1.y, t3nt1.width, t3nt1.height);
		g.fillRect(t3nt2.x, t3nt2.y, t3nt2.width, t3nt2.height);

		g.fillRect(t3HallwayTop.x, t3HallwayTop.y, t3HallwayTop.width, t3HallwayTop.height);
		g.fillRect(t3HallwayBottom.x, t3HallwayBottom.y, t3HallwayBottom.width, t3HallwayBottom.height);
		g.fillRect(nook1.x, nook1.y, nook1.width, nook1.height);
		g.fillRect(nook2.x, nook2.y, nook2.width, nook2.height);
		g.fillRect(nook3.x, nook3.y, nook3.width, nook3.height);
		g.fillRect(nook4.x, nook4.y, nook4.width, nook4.height);
		g.fillRect(nook5.x, nook5.y, nook5.width, nook5.height);
		g.fillRect(nook6.x, nook6.y, nook6.width, nook6.height);
		g.fillRect(nook7.x, nook7.y, nook7.width, nook7.height);
		g.fillRect(t4Bottom.x, t4Bottom.y, t4Bottom.width, t4Bottom.height);
		g.fillRect(t4n1.x, t4n1.y, t4n1.width, t4n1.height);
		g.fillRect(t4n2.x, t4n2.y, t4n2.width, t4n2.height);
		g.fillRect(t4n3.x, t4n3.y, t4n3.width, t4n3.height);
		g.fillRect(t4n4.x, t4n4.y, t4n4.width, t4n4.height);
		g.fillRect(tnook1.x, tnook1.y, tnook1.width, tnook1.height);
		g.fillRect(tnook2.x, tnook2.y, tnook2.width, tnook2.height);
		g.fillRect(tnook3.x, tnook3.y, tnook3.width, tnook3.height);
		g.fillRect(tnook4.x, tnook4.y, tnook4.width, tnook4.height);
		g.fillRect(t4Left.x, t4Left.y, t4Left.width, t4Left.height);
		g.fillRect(t4Top.x, t4Top.y, t4Top.width, t4Top.height);
		g.fillRect(t4Trigger.x, t4Trigger.y, t4Trigger.width, t4Trigger.height);
		g.fillRect(t4TriggerN.x, t4TriggerN.y, t4TriggerN.width, t4TriggerN.height);
		g.fillRect(t4Right.x, t4Right.y, t4Right.width, t4Right.height);
		//*/




    }

    @Override
    public void drawBG(Graphics g) {
        g.drawImage(Main.f.i.lvl1, 0, 0, 800, 600, null);
    }
}
