package models;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;

    public Cell setSymbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }
    public Cell setLocation(int row,int col)
    {
        this.row=row;
        this.col=col;
        return this;
    }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Symbol getSymbol() {
        return symbol;
    }
    public boolean isEmpty(){
        return (symbol==null);
    }
}
