package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacTokGame {

	public char[] assignmentBoard() {

		char[] board = new char[10];

		for (int i = 1; i <= board.length - 1; i++) {

			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {

		TicTacTokGame tictactoe = new TicTacTokGame();
		char[] board = tictactoe.assignmentBoard();
	}
}
