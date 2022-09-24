package strategies.makeMoveStrategy;

import models.Board;
import models.Cell;
import models.Move;
import models.Symbol;
import models.player.Player;

import java.util.List;

public class EasyMakeMoveStrategy implements MakeMoveStrategy{
    @Override
    public Move makeNextMove(Board board, Symbol symbol, Player player) {
        for(List<Cell> row:board.getBoard())
        {
            for(Cell cell:row)
            {
                if(cell.isEmpty())
                {
                    Move move=new Move(cell,symbol,player);
                    return move;
                }
            }
        }
        return null;
    }
}
