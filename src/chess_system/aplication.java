package chess_system;

import board_game.Board;
import board_game.Position;
import chess.ChessMatch;

public class aplication {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
