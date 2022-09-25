package strategies.undoStrategy;

import models.Move;

import java.util.List;

public class RemoveUndoStrategy implements UndoStrategy{
    @Override
    public Move undo(List<Move> moves) {
        Move move=moves.remove(moves.size()-1);
        move.getCell().clearCell();
        return move;
    }
}
