package org.example;

public abstract class Soldier {
    private final String name;
    private final int damage;

    public Soldier(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    protected void reportYourself(Type type){
        System.out.println("Soldier " + this.name + " here. Type - " + type.toString());
    }

    abstract public void getSpecialMove();

}
