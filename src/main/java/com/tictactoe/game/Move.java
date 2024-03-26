/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.game;

/**
 *
 * @author minh
 */
public class Move {
    private int value;
    private int[] move;
    
    public Move(int value, int i, int j) {
        this.move = new int[2];
        this.move[0] = i;
        this.move[1] = j;
        this.value = value;
    }
    
    public int getI() {
        return move[0];
    }
    
    public int getJ() {
        return move[1];
    }
}
