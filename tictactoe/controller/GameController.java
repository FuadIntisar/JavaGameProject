package tictactoe.controller;

import java.util.*;

import tictactoe.playable.*;

public class GameController implements Playables {

    private char[][] board = new char[3][3];

    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Scanner input = new Scanner(System.in);

    public GameController() {
        initializeBoard();
        setupPlayers();
    }

    @Override
    public void startGame() {

        while (!isGameOver()) {

            drawBoard();
            System.out.println(currentPlayer.getName() + "'s turn");
            currentPlayer.makeMove(board, input);
            switchPlayer();
        }

        drawBoard();
        printResult();
    }

    private void initializeBoard() {
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }
    }

    private void setupPlayers() {

        System.out.print("Player 1: ");
        String p1 = input.nextLine();

        System.out.print("Player 2: ");
        String p2 = input.nextLine();

        player1 = new HumanPlayer(p1, 'X');
        player2 = new HumanPlayer(p2, 'O');

        currentPlayer = player1;
    }

    private void drawBoard() {

          System.out.println("\n|---|---|---|");

        for (char[] row : board) {
            System.out.printf("| %c | %c | %c |\n", row[0], row[1], row[2]);
            System.out.println("|---|---|---|");
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    @Override
    public boolean isGameOver() {
        return checkWin() || isBoardFull();
    }

    private boolean isBoardFull() {

        for (char[] row : board) {
            for (char c : row) {
                if (c == ' ')
                    return false;
            }
        }
        return true;
    }

    private boolean checkWin() {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) return true;

            if (board[0][i] != ' ' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) return true;
        }

        if (board[0][0] != ' ' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) return true;

        if (board[0][2] != ' ' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) return true;

        return false;
    }

    private void printResult() {

        if (checkWin()) {
            switchPlayer();
            System.out.println(currentPlayer.getName() + " wins!");
        }
        else {
            System.out.println("Draw!");
        }
    }
}