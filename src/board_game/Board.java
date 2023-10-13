package board_game;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		if(rows < 1  || columns < 1) {
			throw new BoardException("Erro creating board: there must be at laast 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}



	public int getColumns() {
		return columns;
	}

	
	public Piece piece(int row, int column) {
		if(!postionExists(row, column)) {
			throw new BoardException("Posation not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!postionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	
	}
	
	public void placePiece(Piece piece, Position position) {
		if(threIsAPice(position)) {
			throw new BoardException("There is açeready a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	} 
	
	
	private boolean postionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean postionExists(Position position) {
		return postionExists(position.getRow(), position.getColumn());
	}
	
	public boolean threIsAPice(Position position) {
		if(!postionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
