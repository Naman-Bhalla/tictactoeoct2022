package com.scaler.strategies.winningstrategy;

import com.scaler.models.Board;
import com.scaler.models.Move;

public class ColWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        for(int row = 0; row < board.getDimension(); ++row) {
            //should work for null i.e. empty cell as well
             if(board.getCell(row, lastMove.getColumn()).getPlayer() != lastMove.getPlayer()) {
                 return false;
             }
        }
        return true;
    }

    /*public boolean checkVictory(Board board, Move lastMove) {
        return board.getPlayerToColCountMap().get(lastMove.getPlayer()).get(lastMove.getColumn()) == board.getDimension();
    }*/
}