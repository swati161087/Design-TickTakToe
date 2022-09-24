package strategies.undoStrategy;

import models.Move;

import java.util.List;

public interface UndoStrategy {
     void undo(List<Move> moves);
}
