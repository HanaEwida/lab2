package moves.physical;

import ru.ifmo.se.pokemon.*;

public class SeismicToss extends PhysicalMove {
    public SeismicToss() {
        super(Type.FIGHTING, 0, 100); // Power = 0 → signals fixed damage
    }

    @Override
    protected String describe() {
        return "Inflicts damage equal to the user's level.";
    }

}
