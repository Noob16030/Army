package org.example;

import org.example.interfaceForSoldiers.Attack;
import org.example.interfaceForSoldiers.Defend;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Army {
   private final List<Soldier> armyList = new ArrayList<>();
   private boolean printedA;
   private boolean printedB;
   private boolean printedC;


    public void addSoldier(Soldier soldier){
        this.armyList.add(soldier);
    }

    public void reportYourself(){
        System.out.println("----------------REPORT----------------");
        for (Soldier soldier: armyList){
            soldier.reportYourself(soldier.getType());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void attack(){
        System.out.println("----------------ATTACK----------------");
        for (Soldier soldier: armyList){
            if (soldier instanceof Attack){
                ((Attack) soldier).attack();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void defend(){
        System.out.println("----------------DEFEND----------------");
        for (Soldier soldier: armyList){
            if (soldier instanceof Defend){
                ((Defend) soldier).defend();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void specialMove(){
        printedA = false;
        printedB = false;
        printedC = false;
        for (Soldier soldier: armyList){
            if(soldier instanceof Attacker && !printedA){
                if (!printedA) {
                    System.out.println("----------------" + soldier.getSpecial() + "----------------");
                    printedA = true;
                }
                for (Soldier soldier1: armyList){
                    if(soldier1 instanceof Attacker){
                        soldier1.getSpecialMove();
                    }
                }
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }

            if(soldier instanceof Defender && !printedB){
                if (!printedB) {
                    System.out.println("----------------" + soldier.getSpecial() + "----------------");
                    printedB = true;
                }
                for (Soldier soldier1: armyList){
                    if(soldier1 instanceof Defender){
                        soldier1.getSpecialMove();
                    }
                }
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }

            if(soldier instanceof Adaptable && !printedC){
                if (!printedC) {
                    System.out.println("----------------" + soldier.getSpecial() + "----------------");
                    printedC = true;
                }
                for (Soldier soldier1: armyList){
                    if(soldier1 instanceof Adaptable){
                        soldier1.getSpecialMove();
                    }
                }
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
        }
    }
}
