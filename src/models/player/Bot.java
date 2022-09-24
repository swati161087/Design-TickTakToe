package models.player;

import enums.DifficultyLevel;
import enums.PlayerType;
import models.Symbol;
import strategies.makeMoveStrategy.MakeMoveStrategy;

public class Bot extends Player{
    private DifficultyLevel difficultyLevel;
    private MakeMoveStrategy makeMoveStrategy;

    public Bot(DifficultyLevel difficultyLevel, MakeMoveStrategy makeMoveStrategy, Symbol symbol) {
        super(PlayerType.BOT,symbol);
        this.difficultyLevel = difficultyLevel;
        this.makeMoveStrategy = makeMoveStrategy;
    }
}
