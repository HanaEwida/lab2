package pokemon.base;

import ru.ifmo.se.pokemon.*;
import moves.status.Refresh;
import moves.special.Psychic;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        setType(Type.NORMAL); // ✅ Correct method name
        setStats(100, 5, 5, 35, 105, 30);
        addMove(new Refresh());
        addMove(new Psychic());
    }
}