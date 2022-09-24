package models.player;

import enums.DifficultyLevel;
import enums.PlayerType;
import models.Board;
import models.Move;
import models.Symbol;
import strategies.makeMoveStrategy.MakeMoveStrategy;
import factories.MakeMoveStrategyFactory;

public class Bot extends Player{
    private DifficultyLevel difficultyLevel;
    private MakeMoveStrategy makeMoveStrategy;

    public Bot(DifficultyLevel difficultyLevel, Symbol symbol) {
        super(PlayerType.BOT,symbol);
        this.difficultyLevel = difficultyLevel;
        this.makeMoveStrategy = MakeMoveStrategyFactory.getMakeMoveStrategy(difficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        return this.makeMoveStrategy.makeNextMove(board,this.getSymbol(),this);
    }
}
