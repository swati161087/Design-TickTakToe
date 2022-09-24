package strategies.winStrategy;

import models.Board;
import models.Cell;
import models.Symbol;

public interface WinStrategy {
    boolean checkIfWin(Board board, Cell lastMovedCell);
}
