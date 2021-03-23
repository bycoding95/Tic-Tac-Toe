public class Spiel {

	public static void main(String[] args) {
//		Hier wird der Spieler gespeichert, der gerade am Zug ist
		int turn = 0;
		char winner = '#';
		int[] board = new int[9]; // Spielfeld mit 9 Elementen als Array

		for (int i = 0; i < board.length; i++) {
			board[i] = '#';
		}

		Player a = new Player(0);
		Player b = new Player(1);
		Player[] players = new Player[2];
		players[0] = a;
		players[1] = b;

		while (winner == '#') {
			printBoard(board);
			int turnField = players[turn].getTurn();	// hier wird der Spielzug gesetzt (Eingabe des Spielers) über Methodenaufruf
			if (players[turn].validateTurn(board, turnField)) {		// validiert ob der Spieler tatsächlich an der Reihe ist
				board[turnField] = players[turn].number;		// hier wird das Feld wo der Spieler setzt mit der Nummer des Spielers gesetzt
				turn = (turn + 1) % 2;	// 		Die Reihe des Spielers: Spieler 0, Spieler 1, Spieler 0, Spieler 1, Spieler 0, Spieler 1...
			}
			winner = checkWinner(board);	// Zuweisung von winner indem die Methode checkWinner aufgerufen wird, die überprüft ob winner immer noch '#' ist oder board[...]
		}
//		Winner ist nicht mehr '#', also ist winner einer von board[...] in checkWinner() Methode
		System.out.println("Herzlichen Glückwunsch, Spieler " + winner + ". Du hast gewonnen!");

	}

	public static char checkWinner(char[] board) {
		char winner = '#';
		if (board[0] == board[1] && board[0] == board[2] && board[0] != -1) {
			winner = board[0];
		} else if (board[3] == board[4] && board[3] == board[5] && board[3] != -1) {
			winner = board[3];
		} else if (board[6] == board[7] && board[6] == board[8] && board[6] != -1) {
			winner = board[6];
		} else if (board[0] == board[3] && board[0] == board[6] && board[0] != -1) {
			winner = board[0];
		} else if (board[1] == board[4] && board[1] == board[7] && board[1] != -1) {
			winner = board[1];
		} else if (board[2] == board[5] && board[2] == board[8] && board[2] != -1) {
			winner = board[2];
		} else if (board[0] == board[4] && board[0] == board[8] && board[0] != -1) {
			winner = board[0];
		} else if (board[6] == board[4] && board[6] == board[2] && board[6] != -1) {
			winner = board[6];
		} else {
			winner = -1;
		}
		return winner;
	}

	public static void printBoard(int[] meinBoard) {
		System.out.println(meinBoard[0] + " | " + meinBoard[1] + " | " + meinBoard[2]);
		System.out.println("____________");
		System.out.println(meinBoard[3] + " | " + meinBoard[4] + " | " + meinBoard[5]);
		System.out.println("____________");
		System.out.println(meinBoard[6] + " | " + meinBoard[7] + " | " + meinBoard[8]);
	}
}
