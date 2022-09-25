package strategies.winStrategy;

import models.Board;
import models.Cell;
import models.Symbol;

public class ColWinStrategy implements WinStrategy{
    @Override
    public boolean checkIfWin(Board board, Cell lastMovedCell,Symbol symbol) {
        int colIndex=lastMovedCell.getCol();
        for(int i=0;i<board.getBoard().size();i++)
        {
            Cell cell=board.getCell(i,colIndex);
            if(cell.isEmpty() || cell.getSymbol().getChar()!=symbol.getChar())
            {
                return false;
            }
        }
        return true;
    }
}