/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.gui;

import com.tictactoe.game.Board;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static com.tictactoe.game.Minimax.*;
import com.tictactoe.game.Move;

/**
 *
 * @author minh
 */
public class TileListener implements ActionListener {

    private final Tile tile;
    private final GameDisplay display;
    public TileListener(Tile button, GameDisplay display) {
        this.tile = button;
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        tile.setText("x");
        display.board.place('x', tile.i, tile.j);
        if (display.board.checkTerminalState() == -10) {
            System.out.println("X win!");
        }
        if (!display.board.isMovesLeft()) {
            System.out.println("Draw!");
            return;
        }
        Move move = findBestMove(display.board);
        display.board.place('o', move.getI(), move.getJ());
        display.placeTile('o', move.getI(), move.getJ());
        if (display.board.checkTerminalState() == 10) {
            System.out.println("O win!");
        }
    }
}
