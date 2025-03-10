package chess;

import boardgame.Position;

public class King extends ChessPiece {

	private ChessMatch chessMatch;

	public King(Color color, int moveCount, ChessMatch chessMatch) {
		super(color, moveCount);
		this.chessMatch = chessMatch;
	}

	public void getChessPosition() {

	}

	protected boolean isThereOpponentPiece(Position position) {
		return true;
	}

	protected void increaseMoveCount() {
		this.setMoveCount(1);
	}

	protected void decreaseMoveCount() {
		this.setMoveCount(-1);
	}

}
