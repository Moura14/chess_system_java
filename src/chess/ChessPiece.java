package chess;

import board_game.Board;
import board_game.Piece;
import board_game.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	protected boolean isThereOpponentPiece(Position postion) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
