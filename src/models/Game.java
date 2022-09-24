package models;

import models.player.Player;
import strategies.undoStrategy.UndoStrategy;
import strategies.winStrategy.WinStrategy;

import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<WinStrategy> winStrategies;
    private UndoStrategy undoStrategy;
    int indexOfLastMovedPlayer;

}
