package tictactoe.playable;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void makeMove(char[][] board, Scanner input) {

        int row, col;

        while (true) {
            System.out.println(name + " enter row (0-2): ");
            row = input.nextInt();

            System.out.println(name + " enter col (0-2): ");
            col = input.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            }
            System.out.println("Invalid move! try again!");
        }
    }
}