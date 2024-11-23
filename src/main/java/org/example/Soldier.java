package org.example;

public abstract class Soldier {
    private final String name;
    private final int damage;
    private final Type type;
    private final String special;


    public Soldier(String name, int damage, Type type, String special) {
        this.name = name;
        this.damage = damage;
        this.type = type;
        this.special = special;
    }

    public Type getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getSpecial() {
        return special;
    }


    protected void reportYourself(Type type){
        System.out.println("Soldier " + this.name + " here. Type - " + type.toString());
    }

    abstract public void getSpecialMove();

}
