package strategies.winStrategy;

import models.Board;
import models.Symbol;

public class CornerWinStrategy implements WinStrategy{
    @Override
    public boolean checkWin(Board board, Symbol symbol) {
        return false;
    }
}