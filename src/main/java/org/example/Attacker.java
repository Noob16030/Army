package org.example;
import org.example.interfaceForSoldiers.Attack;

public class Attacker extends Soldier implements Attack {
    private final Type type = Type.OFFENSIVE;
    private final String name;
    private final int damage;
    private final String SPECIAL = "BOOST POTION";

    public String getSPECIAL() {
        return SPECIAL;
    }

    public Type getType() {
        return type;
    }

    public Attacker(String name, int damage) {
        super(name, damage);
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void getSpecialMove() {
        System.out.println("Soldier " + this.name + " drink potion for boost damage.");
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + this.name + " deals " + this.damage + " damage.");
    }

}
