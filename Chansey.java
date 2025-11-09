package pokemon;

import ru.ifmo.se.pokemon.*;
import moves.physical.SeismicToss;
import pokemon.base.Happiny;

public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        setStats(250, 5, 5, 35, 105, 50);
        addMove(new SeismicToss());
    }
}