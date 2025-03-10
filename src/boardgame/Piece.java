package boardgame;

public class Piece {

	protected Position position;

	private Board board;

	public Piece(Position position, Board board) {
		super();
		this.position = position;
		this.board = board;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public boolean[][] possibleMoves() {
		return false;
	}

	public boolean possibleMove(Position position) {
		return false;
	}

	public boolean isThereAnyPossibleMove() {
		return true;
	}
}
