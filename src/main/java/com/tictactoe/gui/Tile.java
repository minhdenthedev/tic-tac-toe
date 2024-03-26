/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.gui;

import javax.swing.JButton;

/**
 *
 * @author minh
 */
public class Tile extends JButton {
    public int i, j;
    
    public Tile(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
