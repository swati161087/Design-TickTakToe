package strategies.winStrategy;

import models.Board;
import models.Cell;
import models.Symbol;

public class RowWinStrategy implements WinStrategy{
    @Override
    public boolean checkIfWin(Board board, Cell lastMovedCell,Symbol symbol) {
        int rowIndex=lastMovedCell.getRow();
        for(Cell cell:board.getBoard().get(rowIndex))
        {
            if(cell.isEmpty() || cell.getSymbol().getChar()!=symbol.getChar())
            {
                return false;
            }
        }
        return true;
    }
}
