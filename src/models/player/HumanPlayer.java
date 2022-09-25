package models.player;

import enums.PlayerType;
import models.Board;
import models.Move;
import models.Symbol;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private String name;
    public HumanPlayer(String name, Symbol symbol){

        super(PlayerType.HUMAN,symbol);
        this.name=name;
    }

    @Override
    public Move makeMove(Board board) {
        // take input from the command line.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Tell Row Number starting from 1");
        int row = myObj.nextInt();
        System.out.println("Tell Column Number where you want to make the move from 1");
        int col = myObj.nextInt();

        Move move=new Move(board.getCell(row-1,col-1),this.getSymbol(),this );
        return move;
    }
}
