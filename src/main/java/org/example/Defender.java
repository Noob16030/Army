package org.example;
import org.example.interfaceForSoldiers.Defend;

public class Defender extends Soldier implements Defend {
    private final Type type = Type.DEFENSIVE;
    private final String name;
    private final int damage;
    private final String SPECIAL = "ROAR";

    public String getSPECIAL() {
        return SPECIAL;
    }

    public Defender(String name, int damage) {
        super(name, damage);
        this.name = name;
        this.damage = damage;

    }

    @Override
    public void getSpecialMove() {
        System.out.println("Soldier " + this.name + " roar to increase the morale of the soldiers.");
    }

    public Type getType() {
        return type;
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + this.name + " defends " + this.damage + " damage.");
    }
}
