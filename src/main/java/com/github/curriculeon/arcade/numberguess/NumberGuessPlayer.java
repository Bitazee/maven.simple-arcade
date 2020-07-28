package com.github.curriculeon.arcade.numberguess;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer implements PlayerInterface {

    ArcadeAccount currentPlayer;

    public NumberGuessPlayer(ArcadeAccount player){
        currentPlayer = player;
    }
    @Override
    public ArcadeAccount getArcadeAccount() {
        return currentPlayer;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}