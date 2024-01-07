package com.milewskiarkadiuszmodul8.asmilewskiModul8;

public class KolkoIKrzyzyk {
    private char[][] board;
    private int size;
    private char currentPlayer;

    public void board(int size) {
        this.size = size;
        board = new char[size][size];
        currentPlayer = 'X';
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }
}
