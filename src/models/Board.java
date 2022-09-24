package models;

import models.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Board {
   private ArrayList<ArrayList<Cell>> board;
   Board(int dimension){
       this.board=new ArrayList<>(dimension);
       for(int i=0;i<dimension;i++)
       {
           this.board.add(new ArrayList<>(dimension));
       }
   }
    public ArrayList<ArrayList<Cell>> getBoard() {
        return board;
    }
    public Cell getCell(int i,int j){
     return this.board.get(i).get(j);
    }
}
