package com.scaler.strategies.winningstrategy;

import com.scaler.models.Board;
import com.scaler.models.Move;

public class RowWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        for(int col = 0; col < board.getDimension(); ++col) {
            //should work for null i.e. empty cell as well
             if(board.getCell(lastMove.getRow(), col).getPlayer() != lastMove.getPlayer()) {
                 return false;
             }
        }
        return true;
    }


    /*@Override
    public boolean checkVictory(Board board, Move lastMove) {
        return board.getPlayerToRowCountMap().get(lastMove.getPlayer()).get(lastMove.getRow()) == board.getDimension();
    }*/
}
