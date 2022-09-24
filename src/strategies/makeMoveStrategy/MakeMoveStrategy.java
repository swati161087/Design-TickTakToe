package strategies.makeMoveStrategy;

import models.Board;
import models.Cell;
import models.Move;
import models.Symbol;
import models.player.Player;

public interface MakeMoveStrategy {
    Move makeNextMove(Board board, Symbol symbol, Player player);
}
