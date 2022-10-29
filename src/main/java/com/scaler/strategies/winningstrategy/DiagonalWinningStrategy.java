package com.scaler.strategies.winningstrategy;

import com.scaler.models.Board;
import com.scaler.models.Move;

public class DiagonalWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        //check if the move qualifies to be one of the l-r diagonal elements
        if(lastMove.getRow() == lastMove.getColumn()) {
            for(int i=0;i<board.getDimension();++i) {
                if(lastMove.getPlayer() != board.getCell(i,i).getPlayer()) {
                    return false;
                }
            }
            return true;
        } else if(lastMove.getRow() + lastMove.getColumn() == board.getDimension() -1) {
            //move is on r-l diagonal
            for(int i=0;i<board.getDimension();++i) {
                if(lastMove.getPlayer() != board.getCell(i, board.getDimension() - 1 - i).getPlayer()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /*@Override
    public boolean checkVictory(Board board, Move lastMove) {
        //check if the move qualifies to be one of the l-r diagonal elements
        if(lastMove.getRow() == lastMove.getColumn()) {
            return board.getPlayerToDiagonalCountMap().get(lastMove.getPlayer()).get(0) == board.getDimension();
        } else if(lastMove.getRow() + lastMove.getColumn() == board.getDimension() -1) {
            return board.getPlayerToDiagonalCountMap().get(lastMove.getPlayer()).get(1) == board.getDimension();
        }
        return false;
    }*/
}