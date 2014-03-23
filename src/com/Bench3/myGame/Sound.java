package com.Bench3.myGame;
import sun.audio.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.applet.AudioClip;
import java.awt.event.*;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 12/3/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */



public class Sound {

/*
    public static void music(){
        System.out.println("Sound.music accessed");
        AudioPlayer BGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData   BGD;
        ContinuousAudioDataStream loop = null;
            try{
                BGM = new AudioStream(new FileInputStream("src/sound/Avalanche.wav"));
                System.out.println("Sound file accessed");
                BGD = BGM.getData();
                loop = new ContinuousAudioDataStream(BGD);
            }catch(IOException error){System.out.println(error);}

        BGP.start(loop);
    }
*/

    public void music(boolean toggle, String filePath)
    {
        AudioPlayer BGP = AudioPlayer.player;
        AudioStream BGM;

        if(toggle){
            try{
                InputStream test = new FileInputStream("src/sound/Avalanche.wav");
                BGM = new AudioStream(test);
                AudioPlayer.player.start(BGM);
            }
            catch(FileNotFoundException e){
                System.out.print(e.toString());
            }
            catch(IOException error)
            {
                System.out.print(error.toString());
            }
        }
        if(!toggle){
            System.out.println("MUSIC STOPPED");

            try{
                InputStream test = new FileInputStream("src/sound/Avalanche.wav");
                BGM = new AudioStream(test);
                AudioPlayer.player.stop(BGM);
            }
            catch(FileNotFoundException e){
                System.out.print(e.toString());
            }
            catch(IOException error)
            {
                System.out.print(error.toString());
            }

        }

    }

    public void track(String filePath){

        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(Sound.class.getResource("src/sound/Avalanche.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch(Exception e){
            System.out.println(e.toString());
            //e.printStackTrace();
        }

    }

}

