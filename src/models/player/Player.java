package models.player;

import enums.PlayerType;
import models.Symbol;

public abstract class Player {
    private PlayerType playerType;
    Symbol symbol;
    Player(PlayerType playerType,Symbol symbol){
        this.playerType=playerType;
        this.symbol=symbol;
    }
}
