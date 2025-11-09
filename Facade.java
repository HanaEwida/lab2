package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }


    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        Status status = attacker.getCondition();
        if (status == Status.BURN ||
                status == Status.POISON ||
                status == Status.PARALYZE) {
            return super.calcBaseDamage(attacker, defender) * 2;
        }
        return super.calcBaseDamage(attacker, defender);
    }

    @Override
    protected String describe() {
        return "uses Facade";
    }
}