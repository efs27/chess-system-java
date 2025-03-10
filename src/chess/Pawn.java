package chess;

import boardgame.Position;

public class Pawn extends ChessPiece {

	private ChessMatch chessMatch;

	public Pawn(Color color, int moveCount, ChessMatch chessMatch) {
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
		;
	}

	protected void decreaseMoveCount() {
		this.setMoveCount(-1);
		;
	}
}
