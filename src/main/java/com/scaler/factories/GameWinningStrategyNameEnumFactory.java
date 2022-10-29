package com.scaler.factories;

import com.scaler.models.GameWinningStrategyName;


public class GameWinningStrategyNameEnumFactory {

    public static GameWinningStrategyName getGameWinningStrategyNameFromString(String name) {
        if (name.equalsIgnoreCase("row")) {
            return GameWinningStrategyName.ROW;
        } else if(name.equalsIgnoreCase("column")) {
            return GameWinningStrategyName.COLUMN;
        } else if(name.equalsIgnoreCase("diagonal")) {
            return GameWinningStrategyName.DIAGONAL;
        }
        return GameWinningStrategyName.CORNER;
    }
}
