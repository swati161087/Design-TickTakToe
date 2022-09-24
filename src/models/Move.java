package models;

import models.player.Player;

public class Move {
    private Cell cell;
    private Symbol symbol;
    private Player player;
    public Move(Cell cell, Symbol symbol, Player player) {
        this.cell = cell;
        this.symbol = symbol;
        this.player=player;
    }
    public Cell getCell() {
        return cell;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
