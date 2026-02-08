/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tictoegame;
import java.util.Scanner;

public class TicToeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        // initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println("Tic-Tac-Toe Game Starts!");
        printBoard(board);

        for (int turn = 0; turn < 9; turn++) {
            char symbol = (turn % 2 == 0) ? '*' : '#';  // Player 1=* , Player 2=#
            System.out.println("Player " + (symbol == '*' ? "1" : "2") + " (" + symbol + ") enter row and column (0-2):");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (r < 0 || r >= 3 || c < 0 || c >= 3 || board[r][c] != '-') {
                System.out.println("Invalid move! Try again.");
                turn--; // repeat the same turn
                continue;
            }

            board[r][c] = symbol;
            printBoard(board);

            if (checkWinner(board, symbol)) {
                System.out.println("Player " + (symbol == '*' ? "1" : "2") + " WINS!");
                return; // game ends
            }
        }

        System.out.println("Game is a DRAW!");
    }

    // print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // check win
    public static boolean checkWinner(char[][] b, char sym) {
        // check rows and columns
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == sym && b[i][1] == sym && b[i][2] == sym) return true; // row
            if (b[0][i] == sym && b[1][i] == sym && b[2][i] == sym) return true; // column
        }
        // diagonals
        if (b[0][0] == sym && b[1][1] == sym && b[2][2] == sym) return true;
        if (b[0][2] == sym && b[1][1] == sym && b[2][0] == sym) return true;

        return false;
    }
}
