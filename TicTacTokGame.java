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
	
	public char userInput(char select) {
		if(select == 'X')
			return 'X';
		else
			return '0';
	}
	
	public void initializeBoard(char[] board) {	
		System.out.println("| "+board[1]+" | "+board[2]+" | "+ board[3]+" | ");
		System.out.println("|-----------|");
		System.out.println("| "+board[4]+" | "+board[5]+" | "+ board[6]+" | ");
		System.out.println("|-----------|");
		System.out.println("| "+board[7]+" | "+board[8]+" | "+ board[9]+" | ");
		System.out.println("|-----------|");

	}


	public static void main(String[] args) {

		TicTacTokGame tictactoe = new TicTacTokGame();
		char[] board = tictactoe.assignmentBoard();
		Scanner inputuser = new Scanner(System.in);
		System.out.println("Enter X OR 0 to play");
		char useSelect = inputuser.next().charAt(0);
		if (useSelect == '0' || useSelect == 'X') 
			useSelect = tictactoe.userInput(useSelect);
		else
			System.out.println("Wrong Input, Please Try Again");
		System.out.println(useSelect);
		
		tictactoe.initializeBoard(board);
	}
}
