package controllers;

import enums.GameStatus;
import exceptions.EmptyMovesUndoOperationException;
import models.Game;
import models.player.Player;
import strategies.undoStrategy.UndoStrategy;
import strategies.winStrategy.WinStrategy;

import java.util.List;

public class GameController {
    // Start a game
// Make a move
// Undo
// CheckWinner
// GetCurrentState
    public Game createGame(int dimension, List<Player> players, List<WinStrategy> winStrategies, UndoStrategy undoStrategy){
        Game game=null;
        try {
            game=Game.getBuilder()
                    .setDimension(dimension)
                    .addAllPlayers(players)
                    .addAllWinStrategy(winStrategies)
                    .setUndoStrategy(undoStrategy)
                    .build();
        }
        catch (Exception exception){
            System.out.println("Something went wrong");
            exception.printStackTrace();
        }
        return game;
    }
    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game) throws EmptyMovesUndoOperationException {
        game.undo();
    }
    public Player getWinner(Game game)
    {
        return game.getWinner();
    }
    public GameStatus getStatus(Game game){
        return game.getGameStatus();
    }
    public void printBoard(Game game){
        game.printBoard();
    }
}
