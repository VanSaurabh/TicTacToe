package com;

import java.util.Scanner;

public class AppMain {

	private static Scanner sc = new Scanner(System.in);
	private static TicTacToe tic = new TicTacToe();
	public static void main(String[] args) {

		for(int i=0;i<9;i++) {
			if(i%2 == 0) {
				System.out.println("X's turn");
				if(callTicTacToeMethod(1)) {
					System.out.println("Winner is X!!");
					break;
				}
			}else {
				System.out.println("O's turn");
				if(callTicTacToeMethod(-1)){
					System.out.println("Winner is O!!");
					break;
				}
			}
		}
	}
	private static boolean callTicTacToeMethod(int player) {
		System.out.println("Enter the coordinate:");
		System.out.println("x coordinate: ");
		int x = sc.nextInt();
		System.out.println("y coordinate:");
		int y = sc.nextInt();
		
		tic.enterTicTacToeDetails(x, y, player);
		boolean winner = tic.calculateWinner(player);
		return winner;
		
	}
}
