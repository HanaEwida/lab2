import ru.ifmo.se.pokemon.*;

import pokemon.ultimate.Reshiram;
import pokemon.ultimate.Salazzle;
import pokemon.ultimate.Blissey;
import pokemon.Chansey;
import pokemon.base.Happiny;
import pokemon.base.Salandit;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Reshiram("Zyra", 50));
        battle.addAlly(new Salazzle("Vex", 45));
        battle.addAlly(new Blissey("Joy", 50));

        battle.addFoe(new Chansey("Guardian", 50));
        battle.addFoe(new Happiny("Pip", 10));
        battle.addFoe(new Salandit("Ember", 40));

        battle.go();
    }
}



