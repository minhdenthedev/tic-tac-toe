/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tictactoe.game;

/**
 *
 * @author minh
 */
public class Minimax {
    public static int minimax(Board board, int depth, boolean isMaximizer) {
        int score = board.checkTerminalState();
        if (score == 10) {
            return 10;
        }
        
        if (score == -10) {
            return -10;
        }
        if (!board.isMovesLeft()) return 0;
        
        if (isMaximizer) {
            int bestValue = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.getBoard()[i][j] == '_') {
                        board.place('o', i, j);
                        int value = minimax(board, depth + 1, !isMaximizer);
                        bestValue = Integer.max(value, bestValue);
                        board.unPlace(i, j);
                    }
                }
            }
            return bestValue;
        } else {
            int bestValue = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.getBoard()[i][j] == '_') {
                        board.place('x', i, j);
                        int value = minimax(board, depth + 1, !isMaximizer);
                        bestValue = Integer.min(value, bestValue);
                        board.unPlace(i, j);
                    }
                }
            }
            System.out.println("Best value: " + bestValue);
            return bestValue;
        }
    }
    
    public static Move findBestMove(Board board) {
        int[] bestMove = {-1, -1};
        int bestValue = -1000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getBoard()[i][j] == '_') {
                    board.place('o', i, j);
                    int value = minimax(board, 0, false);
                    board.unPlace(i, j);
                    if (value > bestValue) {
                        System.out.println("Best value: " + value);
                        bestValue = value;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }
        
        return new Move(bestValue, bestMove[0], bestMove[1]);
    }
}
