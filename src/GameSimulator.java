import controllers.GameController;
import enums.DifficultyLevel;
import enums.GameStatus;
import models.Cell;
import models.Game;
import models.Symbol;
import models.player.Bot;
import models.player.HumanPlayer;
import models.player.Player;
import strategies.undoStrategy.RemoveUndoStrategy;
import strategies.winStrategy.ColWinStrategy;
import strategies.winStrategy.DiagonalWinStrategy;
import strategies.winStrategy.RowWinStrategy;
import strategies.winStrategy.WinStrategy;

import java.util.ArrayList;
import java.util.List;

public class GameSimulator {
    public static void main(String[] args) {
        GameController gameController=new GameController();
        int dimension=3;
        Player p1=new HumanPlayer("swati",new Symbol('X'));
        Player p2=new Bot(DifficultyLevel.EASY,new Symbol('O'));
        WinStrategy rowWinStrategy=new RowWinStrategy();
        WinStrategy colWinStrategy=new ColWinStrategy();
        WinStrategy diagonalWinStrategy=new DiagonalWinStrategy();

       Game game= gameController.createGame(dimension, List.of(p1,p2),List.of(rowWinStrategy,colWinStrategy,diagonalWinStrategy),new RemoveUndoStrategy());
       while (game.getGameStatus().equals(GameStatus.RUNNING)){
           System.out.println("please make your move");
           game.makeMove();
           game.printBoard();
       }
       System.out.println("Game is "+gameController.getStatus(game)+" and winner is "+gameController.getWinner(game).getSymbol().getChar());
}
}
