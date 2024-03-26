/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.game;

/**
 *
 * @author minh
 */
public class Board {
    
    private char[][] board;
    
    public Board() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }
    
    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }
    
    public void place(char x, int i, int j) {
        board[i][j] = x;
    }
    
    public void unPlace(int i, int j) {
        board[i][j] = '_';
    }
    
    public boolean isMovesLeft() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') return true;
            }
        }
        
        return false;
    }
    
    public int checkTerminalState() {
        
        // Check for row win condition
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 'x') {
                    return -10;
                } else if (board[i][0] == 'o') {
                    return 10;
                }
            }
        }
        
        // Check for col win condition
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 'x') {
                    return -10;
                } else if (board[0][i] == 'o') {
                    return 10;
                }
            }
        }
        
        // Check for diagonal win condition
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 'x') {
                return -10;
            } else if (board[0][0] == 'o') {
                return 10;
            }
        }
        
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            if (board[2][0] == 'x') {
                return -10;
            } else if (board[2][0] == 'o') {
                return 10;
            }
        }
        return 0;
    }
    
    public char[][] getBoard() {
        return board;
    }
}
