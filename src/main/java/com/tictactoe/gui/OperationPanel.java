/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author minh
 */
public class OperationPanel extends JPanel{
    
    JButton resetButton;
    GameDisplay display;
    
    public OperationPanel(GameDisplay display) {
        setPreferredSize(new Dimension(100, 300));
        setBackground(Color.GRAY);
        
        this.display = display;
        
        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ResetListener(display));
        resetButton.setFocusable(false);
        add(resetButton);
    }
}
