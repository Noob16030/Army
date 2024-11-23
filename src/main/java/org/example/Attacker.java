package org.example;
import org.example.interfaceForSoldiers.Attack;

public class Attacker extends Soldier implements Attack {

    public Attacker(String name, int damage) {
        super(name, damage, Type.OFFENSIVE, "BOOST POTION");
    }

    @Override
    public void getSpecialMove() {
        System.out.println("Soldier " + getName() + " drink potion for boost damage.");
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + getName()+ " deals " + getDamage() + " damage.");
    }

}
