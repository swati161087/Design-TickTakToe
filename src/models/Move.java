package models;

public class Move {
    private Cell cell;
    private Symbol symbol;

    public Move(Cell cell, Symbol symbol) {
        this.cell = cell;
        this.symbol = symbol;
    }
    public Cell getCell() {
        return cell;
    }
    public Symbol getSymbol() {
        return symbol;
    }
}
