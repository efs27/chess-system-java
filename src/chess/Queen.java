package chess;

import boardgame.Position;

public class Queen extends ChessPiece {
	
	public Queen(Color color, int moveCount) {
		super(color, moveCount);
	}

	public void getChessPosition() {

	}

	protected boolean isThereOpponentPiece(Position position) {
		return true;
	}

	protected void increaseMoveCount() {
		this.setMoveCount(1);;
	}

	protected void decreaseMoveCount() {
		this.setMoveCount(-1);;
	}

}
