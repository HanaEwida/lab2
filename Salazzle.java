package pokemon.ultimate;

import ru.ifmo.se.pokemon.*;
import moves.physical.Pound;
import pokemon.base.Salandit;

public final class Salazzle extends Salandit {
    public Salazzle(String name, int level) {
        super(name, level);
        setStats(68, 117, 60, 111, 60, 117);
        addMove(new Pound());
    }
}