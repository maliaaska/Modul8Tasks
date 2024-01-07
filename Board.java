package com.milewskiarkadiuszmodul8.asmilewskiModul8;

import java.util.Scanner;

public class Board {
    private char[][] board;
    private int size;
    private char player;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        player = 'X';
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
        return row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-'; // Sprawdzanie czy pole nie zostało wczesniej już użyte.
    }

    private boolean checkForWin() {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) return true; // Sprawdzenie czy w rzędzie x jest znak inny niz "-" i porownanie z innymi komórkami w tym rzedzei
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) return true; // analogicznie sprawdza kolumny.
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) return true; // sprawdzanie po ukosie.
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) return true;

        return false;
    }
    private boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }
    public void game() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current board:");
            printBoard();

            System.out.println("Player " + player + "'s turn.");
            System.out.print("Enter row number (0-" + (size - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Enter column number (0-" + (size - 1) + "): ");
            int col = scanner.nextInt();

            if (isMoveValid(row, col)) {
                board[row][col] = player;
                if (checkForWin()) {
                    System.out.println("Player " + player + " wins!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
                player = (player == 'X') ? 'O' : 'X';  // Zmiana Playera
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the board (e.g., 3 for 3x3): ");
        int size = scanner.nextInt();
        Board match = new Board(size);
        match.game();
    }
}