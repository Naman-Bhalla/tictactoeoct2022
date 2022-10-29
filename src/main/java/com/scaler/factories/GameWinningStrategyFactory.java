package com.scaler.factories;


import com.scaler.models.GameWinningStrategyName;
import com.scaler.strategies.winningstrategy.*;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy
    getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName) {
        if(GameWinningStrategyName.ROW.equals(gameWinningStrategyName)) {
            return new RowWinningStrategy();
        } else if (GameWinningStrategyName.COLUMN.equals(gameWinningStrategyName)) {
            return new ColWinningStrategy();
        } else if (GameWinningStrategyName.DIAGONAL.equals(gameWinningStrategyName)) {
            return new DiagonalWinningStrategy();
        }
        return new NotGonnaWinGameWinningStrategy();
    }

}
