package org.example;
import org.example.interfaceForSoldiers.Attack;
import org.example.interfaceForSoldiers.Defend;

public class Adaptable extends Soldier implements Attack, Defend {

    public Adaptable(String name, int damage) {
        super(name, damage, Type.ADAPTABLE, "MOUNT");
    }

    @Override
    public void getSpecialMove() {
        System.out.println("Soldier " + getName() + " mount the horse.");
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + getName() + " defends " + getDamage() + " damage.");
    }
}
