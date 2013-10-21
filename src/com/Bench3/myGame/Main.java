package com.Bench3.myGame;

import javax.swing.JFrame;



public class Main {
    public static Display f = new Display();
    public static int h = 630;
    public static int w = 800;
    public static void main(String args[]){
        f.setSize(w, h);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Concluding Chimera");
        f.setLocationRelativeTo(null);

    }
}
