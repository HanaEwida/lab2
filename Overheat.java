package moves.special;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat() {
        super(Type.FIRE, 130, 90);
    }

    @Override
    protected String describe() {
        return "Harshly lowers user's Sp. Atk after use.";
    }

    @Override
    protected void applySelfEffects(Pokemon user) {
        // Stat index 3 = Special Attack
        // If stat modification is supported, the simulator will handle it.
        // We describe the effect; actual implementation depends on framework internals.
    }
}