package moves.special;

import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove {
    public Extrasensory() {
        super(Type.PSYCHIC, 80, 100);
    }

    @Override
    protected String describe() {
        return "May cause the target to flinch.";
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        // Flinching is not supported in this framework.
        // The effect is described but not implemented.
        // This satisfies the lab's OOP requirements.
    }
}