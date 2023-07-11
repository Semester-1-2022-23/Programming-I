import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        return false;
    }

    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to Tic-Tac-Toe!");

        while (!gameOver) {
            game.printBoard();

            int row, col;

            do {
                System.out.print("Player " + game.currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (!game.makeMove(row, col));

            if (game.checkForWin()) {
                System.out.println("Player " + game.currentPlayer + " wins!");
                gameOver = true;
            } else if (game.isBoardFull()) {
                System.out.println("It's a tie!");
                gameOver = true;
            } else {
                game.changePlayer();
            }
        }

        scanner.close();
    }
}
