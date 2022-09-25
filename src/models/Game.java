package models;

import enums.GameStatus;
import enums.PlayerType;
import exceptions.EmptyMovesUndoOperationException;
import exceptions.MultipleBotException;
import models.player.Player;
import strategies.undoStrategy.UndoStrategy;
import strategies.winStrategy.WinStrategy;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<WinStrategy> winStrategies;
    private List<Move> moves;
    private UndoStrategy undoStrategy;
    private int indexOfLastMovedPlayer;
    private GameStatus gameStatus;
    private Player winner;
    private Game(){
        this.players = new ArrayList<>();
        this.moves = new ArrayList<>();
        this.winStrategies = new ArrayList<>();
        this.indexOfLastMovedPlayer = -1;
        this.gameStatus = GameStatus.RUNNING;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void makeMove()
    {
        // this will move index in circles.
        this.indexOfLastMovedPlayer=(this.indexOfLastMovedPlayer+1)%this.players.size();
        Move move=this.players.get(indexOfLastMovedPlayer).makeMove(board);
        if(!move.getCell().isEmpty()){
            System.out.println("wrong move");
            this.indexOfLastMovedPlayer=(this.indexOfLastMovedPlayer-1+this.players.size())%this.players.size();
            return;
        }
        move.getCell().setSymbol(move.getSymbol());
        this.moves.add(move);
        int dimension=this.board.getBoard().size();

        for(WinStrategy winStrategy:this.winStrategies)
        {
            if(winStrategy.checkIfWin(this.board,move.getCell(),move.getSymbol())){
                gameStatus=GameStatus.WON;
                winner=this.players.get(indexOfLastMovedPlayer);
                break;
            }
        }
//        if(moves.size()==dimension*dimension) {
//            gameStatus=GameStatus.DRAW;
//            return;
//        }
    }
    public boolean undo() throws EmptyMovesUndoOperationException {
        if(this.moves.size()==0)throw new EmptyMovesUndoOperationException();
        this.indexOfLastMovedPlayer=(this.indexOfLastMovedPlayer-1+players.size())%players.size();
        this.undoStrategy.undo(moves);
        return true;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public void printBoard(){
        this.board.printBoard();
    }
    public static class Builder{
        private List<Player> players;
        private List<WinStrategy> winStrategies;
        private UndoStrategy undoStrategy;
        private int dimension;
        private int minBoardSize=3;
        private int minNoOfPlayer=2;

        Builder(){
            this.players=new ArrayList<>();
            this.winStrategies=new ArrayList<>();
        }
        private boolean checkMultipleBots(){
            int count=0;
            for(Player p:this.players)
            {
                if(p.getPlayerType().equals(PlayerType.BOT))
                {
                    count++;
                }
            }
           return count<=1;
        }
        public Game build() throws Exception {

            if(this.winStrategies.size()==0 ||
                    this.players.size()<minNoOfPlayer ||
                    this.undoStrategy==null ||
                    this.dimension<minBoardSize)
                throw new InvalidParameterException();
            if(!checkMultipleBots()){
                throw new MultipleBotException();
            }
            Game game=new Game();
            Board board=new Board(this.dimension);
            game.board=board;
            game.gameStatus=GameStatus.RUNNING;
            game.moves=new ArrayList<>();
            game.indexOfLastMovedPlayer=0;
            game.players.addAll(this.players);
            game.winStrategies.addAll(this.winStrategies);
            game.undoStrategy=this.undoStrategy;
            return game;
        }

        public Builder addPlayers(Player player) {
            this.players.add(player);
            return this;
        }
        public Builder addAllPlayers(List<Player> players) {
            this.players.addAll(players);
            return this;
        }

        public Builder addWinStrategy(WinStrategy winStrategy) {
            this.winStrategies.add(winStrategy);
            return this;
        }
        public Builder addAllWinStrategy(List<WinStrategy> winStrategies) {
            this.winStrategies.addAll(winStrategies);
            return this;
        }
        public Builder setUndoStrategy(UndoStrategy undoStrategy) {
            this.undoStrategy = undoStrategy;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
    }


}
