package moves.special;

import ru.ifmo.se.pokemon.*;

public class DragonBreath extends SpecialMove {
    public DragonBreath() {
        super(Type.DRAGON, 60, 100);
    }

    @Override
    protected String describe() {
        return "May paralyze the target.";
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() < 0.3) { // 30% chance
            Effect.paralyze(target);
        }
    }
}