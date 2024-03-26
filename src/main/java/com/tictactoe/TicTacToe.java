/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tictactoe;

import com.tictactoe.game.Board;
import com.tictactoe.gui.GameDisplay;
import com.tictactoe.gui.OperationPanel;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author minh
 */
public class TicTacToe {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GameDisplay gameDisplay = new GameDisplay(frame);
        frame.add(gameDisplay, BorderLayout.CENTER);
        
        OperationPanel panel = new OperationPanel(gameDisplay);
        frame.add(panel, BorderLayout.EAST);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
