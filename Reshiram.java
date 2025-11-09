package pokemon.ultimate;

import ru.ifmo.se.pokemon.*;
import moves.status.Confide;
import moves.special.*;

public final class Reshiram extends Pokemon {
    public Reshiram(String name, int level) {
        super(name, level);
        setType(Type.DRAGON, Type.FIRE);
        setStats(100, 120, 100, 150, 120, 90);
        addMove(new Confide());
        addMove(new Extrasensory());
        addMove(new DragonBreath());
        addMove(new Overheat());
    }
}
