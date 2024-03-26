/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.gui;

import com.tictactoe.game.Board;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author minh
 */
public class GameDisplay extends JPanel {

    GridLayout layout;
    List<Tile> tiles;
    public Board board;
    public JFrame frame;

    public GameDisplay(JFrame frame) {

        board = new Board();

        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.WHITE);
        tiles = new ArrayList<>();
        layout = new GridLayout(3, 3);
        setLayout(layout);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tile tile = new Tile(i, j);
                tile.setFocusable(false);
                tile.addActionListener(new TileListener(tile, this));
                tiles.add(tile);
                add(tile);
            }
        }
    }

    public void reset() {
        for (Tile tile : tiles) {
            tile.setText("");
        }
    }
    
    public void placeTile(char x, int i, int j) {
        for (Tile tile : tiles) {
            if (tile.i == i && tile.j == j) {
                tile.setText(Character.toString(x));
            }
        }
    }
}
