package strategies.winStrategy;

import models.Board;
import models.Cell;
import models.Symbol;

public class DiagonalWinStrategy implements WinStrategy{
    @Override
    public boolean checkIfWin(Board board, Cell lastMovedCell)  {
        return false;
    }
}