package com.milewskiarkadiuszmodul8.asmilewskiModul8;

import java.util.Scanner;

public class KolkoIKrzyzyk {
    private char[][] board;
    private int size;
    private char currentPlayer;

    public KolkoIKrzyzyk(int size) {
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

    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < size; i++) {
            System.out.print("| ");
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private boolean isMoveValid(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-';
    }

    private boolean checkForWin() {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) return true;
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) return true;
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) return true;
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) return true;

        return false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current board:");
            printBoard();

            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row number (0-" + (size - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Enter column number (0-" + (size - 1) + "): ");
            int col = scanner.nextInt();

            if (isMoveValid(row, col)) {
                board[row][col] = currentPlayer;
                if (checkForWin()) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the board (e.g., 3 for 3x3): ");
        int size = scanner.nextInt();
        KolkoIKrzyzyk game = new KolkoIKrzyzyk(size);
        game.play();
    }
}