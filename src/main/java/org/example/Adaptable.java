package org.example;
import org.example.interfaceForSoldiers.Attack;
import org.example.interfaceForSoldiers.Defend;

public class Adaptable extends Soldier implements Attack, Defend {
    private final Type type = Type.ADAPTABLE;
    private final String name;
    private final int damage;
    private final String SPECIAL = "MOUNT";

    public String getSPECIAL() {
        return SPECIAL;
    }

    public Adaptable(String name, int damage) {
        super(name, damage);
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void getSpecialMove() {
        System.out.println("Soldier " + this.name + " mount the horse.");
    }

    public Type getType() {
        return type;
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + this.name + " deals " + this.damage + " damage.");
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + this.name + " defends " + this.damage + " damage.");
    }
}
