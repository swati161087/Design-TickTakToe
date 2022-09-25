package strategies.undoStrategy;

import models.Move;

import java.util.List;

public interface UndoStrategy {
     Move undo(List<Move> moves);
}
