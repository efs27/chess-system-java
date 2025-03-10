package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int rows;
	private int columns;

	private List<Piece> pieces = new ArrayList<Piece>();

	public Board(int rows, int columns, List<Piece> pieces) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.pieces = pieces;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

	public Piece piece(int row, int column) {
		return new Piece(new Position(row, column), this);
	}

	public Piece piece(Position position) {
		return new Piece(position, this);
	}

	public void placePiece(Piece piece, Position position) {

	}

	public Piece removePiece(Position position) {
		return new Piece(position, this);
	}

	public boolean positionExists(Position position) {
		return true;
	}

	public boolean thereIsAPiece(Position position) {
		return true;
	}
}
