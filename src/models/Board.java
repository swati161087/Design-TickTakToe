package models;

import models.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Board {
   private ArrayList<ArrayList<Cell>> cells;
   private int dimension;
   Board(int dimension){
       this.dimension=dimension;
       this.cells=new ArrayList<>(dimension);
   }
}
