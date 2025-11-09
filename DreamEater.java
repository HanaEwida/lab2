package moves.special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected String describe() {
        return "User recovers half the HP inflicted if target is asleep.";
    }

    @Override
    protected void applySelfEffects(Pokemon user) {
        // HP healing based on damage is not supported in this framework.
        // The effect is described for completeness; simulation handles it internally (if at all).
    }
}