package models;

import models.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Board {
   private ArrayList<ArrayList<Cell>> board;
   Board(int dimension){
       this.board=new ArrayList<ArrayList<Cell>>(dimension);
       for(int i=0;i<dimension;i++)
       {
           board.add(new ArrayList<>(dimension));
           for(int j=0;j<dimension;j++)
           {
               board.get(i).add(new Cell(i,j));
           }
       }
   }
    public ArrayList<ArrayList<Cell>> getBoard() {
        return board;
    }
    public Cell getCell(int i,int j){
     return this.board.get(i).get(j);
    }
    public void printBoard(){
        for(ArrayList<Cell> row:board)
        {
            for(Cell cell:row)
            {
                if(cell.getSymbol()==null)
                {
                    System.out.print("|   |");
                }
                else{
                    System.out.print("| "+cell.getSymbol().getChar()+" |");
                }
            }
            System.out.println();
        }
    }
}
