package strategies.makeMoveStrategy;

import enums.DifficultyLevel;

public class MakeMoveStrategyFactory {
    public static MakeMoveStrategy getMakeMoveStrategy(DifficultyLevel difficultyLevel){
        switch (difficultyLevel){
            case EASY : return  new EasyMakeMoveStrategy();
            case MEDIUM:return new MediumMakeMoveStrategy();
            case HARD:return new HardMakeMoveStrategy();
        }
    throw new RuntimeException("Difficulty level does not exists"+difficultyLevel);
    }
}
