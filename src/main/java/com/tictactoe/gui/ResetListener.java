/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author minh
 */
public class ResetListener implements ActionListener {
    
    GameDisplay display;
    
    public ResetListener(GameDisplay display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        display.reset();
        display.board.reset();
    }
}
