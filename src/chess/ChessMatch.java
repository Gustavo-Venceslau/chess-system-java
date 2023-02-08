package chess;

import ChessPieces.King;
import ChessPieces.Rook;
import boardGame.Board;
import boardGame.Position;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getRows(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    public void initialSetup(){
        board.placePeace(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePeace(new King(board, Color.BLACK), new Position(0, 4));
    }

}
