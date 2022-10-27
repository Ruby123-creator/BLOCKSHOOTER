/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.blockshooter;

import javax.swing.JFrame;

/**
 *
 * @author Ruby
 */
public class BLOCKSHOOTER {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
                  JFrame obj = new JFrame();
        playgame game = new playgame();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game);

    }
}
