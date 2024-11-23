package org.example;
import org.example.interfaceForSoldiers.Defend;

public class Defender extends Soldier implements Defend {

    public Defender(String name, int damage) {
        super(name, damage, Type.DEFENSIVE, "ROAR");
    }

    @Override
    public void getSpecialMove() {
        System.out.println("Soldier " + getName() + " roar to increase the morale of the soldiers.");
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + getName() + " defends " + getDamage()+ " damage.");
    }
}
