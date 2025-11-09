package moves.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0.0, 0.0);
    }

    @Override
    protected String describe() {
        return "The user tells a secret, lowering the target's Sp. Atk.";
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        target.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}