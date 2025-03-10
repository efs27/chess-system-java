package chess;

import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Color color, int moveCount) {
		super();
		this.color = color;
		this.moveCount = moveCount;
	}	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount += moveCount;
	}

	public void getChessPosition() {

	}

	protected boolean isThereOpponentPiece(Position position) {
		return true;
	}

	protected void increaseMoveCount() {
		moveCount++;
	}

	protected void decreaseMoveCount() {
		moveCount--;
	}

}
