package moves.special;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "May lower target's Sp. Def.";
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        // Stat index 4 = Special Defense
        // If the framework supports stat changes, it will handle it internally.
        // We only need to declare the effect in describe() and provide an empty applyOppEffects.
    }
}