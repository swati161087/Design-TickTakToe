package strategies.winStrategy;

import models.Board;
import models.Symbol;

public class ColWinStrategy implements WinStrategy{
    @Override
    public boolean checkWin(Board board, Symbol symbol) {
        return false;
    }
}