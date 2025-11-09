package moves.special;

import ru.ifmo.se.pokemon.*;

public class Ember extends SpecialMove {
    public Ember() {
        super(Type.FIRE, 40, 100);
    }

    @Override
    protected String describe() {
        return "May burn the target.";
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() < 0.1) {
            Effect.burn(target);
        }
    }
}