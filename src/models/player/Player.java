package models.player;

import enums.PlayerType;
import models.Board;
import models.Move;
import models.Symbol;

public abstract class Player {
    private PlayerType playerType;
    Symbol symbol;
    Player(PlayerType playerType,Symbol symbol){
        this.playerType=playerType;
        this.symbol=symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }
    public abstract Move makeMove(Board board);
}
