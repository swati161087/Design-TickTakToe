package strategies.winStrategy;

import models.Board;
import models.Cell;
import models.Symbol;

public class DiagonalWinStrategy implements WinStrategy{
    @Override
    public boolean checkIfWin(Board board, Cell lastMovedCell,Symbol symbol)  {
        // check left diagonal
        int row=lastMovedCell.getRow();
        int col=lastMovedCell.getCol();
        int dimension=board.getBoard().size();
        if(row==col)
        {
           for(int i=0;i<dimension;i++)
           {
               Cell cell=board.getCell(i,i);
               if(cell.isEmpty() || cell.getSymbol().getChar()!=symbol.getChar())
               {
                   return false;
               }
           }
           return true;
        }
        else if(row+col==dimension-1) {
            for(int i=0;i<dimension;i++)
            {
                Cell cell=board.getCell(i,dimension-i-1);
                if(cell.isEmpty() || cell.getSymbol().getChar()!=symbol.getChar())
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}