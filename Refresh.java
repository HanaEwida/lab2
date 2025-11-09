package moves.status;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0.0, 100.0);
    }

    @Override
    protected String describe() {
        return "The user heals its status condition.";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // Do nothing.
        // The battle simulator automatically cures status for this move.
        // Calling setCondition(null) causes NullPointerException.
    }
}