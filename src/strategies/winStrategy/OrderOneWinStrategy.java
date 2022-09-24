package strategies.winStrategy;

import models.Board;
import models.Cell;

public class OrderOneWinStrategy implements WinStrategy{
    @Override
    public boolean checkIfWin(Board board, Cell lastMovedCell) {
        return false;
    }
}
