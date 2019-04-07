package com;

public class TicTacToe{

	private static int[][] model = new int[3][3];
	private static final int x=1,y=-1;

	public void enterTicTacToeDetails(int p, int q, int player) {
			model[p][q] = player;
		printModel();	
	}
	private void printModel() {
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				switch(model[i][j]) {
				case x :
					sb.append(" X ");
					break;
				case y:
					sb.append(" O ");
					break;
				
				default:
					sb.append("   ");
				}
				if(j<2)
				sb.append("|");
			}
			sb.append("\n-----------\n");
		}
		System.out.println(sb.toString());
	}
	
	public boolean calculateWinner(int player) {
		if((model[0][0]+ model[0][1]+ model[0][2]  == player*3) ||
		   (model[1][0]+ model[1][1]+ model[1][2]  == player*3) ||
		   (model[2][0]+ model[2][1]+ model[2][2]  == player*3) ||
		   (model[0][0]+ model[1][1]+ model[2][2]  == player*3) ||
		   (model[0][0]+ model[1][0]+ model[2][0]  == player*3) ||
		   (model[0][1]+ model[1][1]+ model[2][1]  == player*3) ||
		   (model[0][2]+ model[1][2]+ model[2][2]  == player*3) ||
		   (model[0][2]+ model[1][1]+ model[2][0]  == player*3)
		   )
			return true;
		else
			return false;	
		
	}
}