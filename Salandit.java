package pokemon.base;

import ru.ifmo.se.pokemon.*;
import moves.physical.Facade;
import moves.special.Ember;
import moves.status.Confide;

public class Salandit extends Pokemon {
    public Salandit(String name, int level) {
        super(name, level);
        setType(Type.POISON, Type.FIRE); // ✅ FIXED: setType, not setTypes
        setStats(48, 78, 44, 61, 44, 70);
        addMove(new Facade());
        addMove(new Ember());
        addMove(new Confide());
    }
}