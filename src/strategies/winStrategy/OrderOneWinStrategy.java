package strategies.winStrategy;

import models.Board;
import models.Cell;
import models.Symbol;

public class OrderOneWinStrategy implements WinStrategy{
    @Override
    public boolean checkIfWin(Board board, Cell lastMovedCell, Symbol symbol) {
        return false;
    }
}
