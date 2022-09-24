package strategies.winStrategy;

import models.Board;
import models.Symbol;

public interface WinStrategy {
    boolean checkWin(Board board, Symbol symbol);
}
