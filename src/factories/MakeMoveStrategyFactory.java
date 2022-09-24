package factories;

import enums.DifficultyLevel;
import strategies.makeMoveStrategy.EasyMakeMoveStrategy;
import strategies.makeMoveStrategy.HardMakeMoveStrategy;
import strategies.makeMoveStrategy.MakeMoveStrategy;
import strategies.makeMoveStrategy.MediumMakeMoveStrategy;

public class MakeMoveStrategyFactory {
    public static MakeMoveStrategy getMakeMoveStrategy(DifficultyLevel difficultyLevel){
        return switch (difficultyLevel){
            case UNDEFINED -> throw new RuntimeException("Difficulty level does not exists"+difficultyLevel);
            case EASY ->  new EasyMakeMoveStrategy();
            case MEDIUM -> new MediumMakeMoveStrategy();
            case HARD->  new HardMakeMoveStrategy();
        };

    }
}
