
public class main {

	public static void main(String[] args) {
//		Hier wird der Spieler gespeichert, der gerade am Zug ist
		int turn= 0;
		int winner = -1;
		int[] board = new int[9];
		
		for(int i=0; i<board.length ; i++ ) {
			board[i] = -1;
		}
		
		while(winner == -1) {
			winner = checkWinner(board);
		}
	
		printBoard(board);
	}
	
	public static int checkWinner(int[] board) {
		int winner = -1;
		if(board[0] == board[1] && board[0] == board[2] && board[0] != -1) {
			winner = board[0];
		}
		else if(board[3] == board[4] && board[3] == board[5] && board[3] != -1){
			winner = board[3];
		}
		else if(board[6] == board[7] && board[6] == board[8] && board[6] != -1){
			winner = board[6];
		}
		else if(board[0] == board[3] && board[0] == board[6] && board[0] != -1){
			winner = board[0];
		}
		else if(board[1] == board[4] && board[1] == board[7] && board[1] != -1){
			winner = board[1];
		}
		else if(board[2] == board[5] && board[2] == board[8] && board[2] != -1){
			winner = board[2];
		}
		else if(board[0] == board[4] && board[0] == board[8] && board[0] != -1){
			winner = board[0];
		}
		else if(board[6] == board[4] && board[6] == board[2] && board[6] != -1){
			winner = board[6 ];
		}
		else {
			winner = -1;
		}
		return winner;
	}
	
	public static void printBoard(int[] meinBoard) {
		System.out.println(meinBoard[0] + " | " + meinBoard[1] +" | " + meinBoard[2] );
		System.out.println("____________");
		System.out.println(meinBoard[3] + " | " + meinBoard[4] +" | " + meinBoard[5] );
		System.out.println("____________");
		System.out.println(meinBoard[6] + " | " + meinBoard[7] +" | " + meinBoard[8] );
	}
}
