package org.example;

public class Main {
    public static void main(String[] args) {
        Attacker soldier0 = new Attacker("Swordsman 1", 10);
        Attacker soldier1 = new Attacker("Swordsman 2", 10);
        Defender soldier2 = new Defender("Shieldbearer 1", 14);
        Attacker soldier3= new Attacker("Knight 1", 19);
        Adaptable soldier4 = new Adaptable("Paladin 1", 12);
        Adaptable soldier5 = new Adaptable("Paladin 2", 12);
        Attacker soldier6 = new Attacker("Knight 2", 19);
        Defender soldier7 = new Defender("Shieldbearer 2", 14);
        Defender soldier8 = new Defender("Mage", 8);
        Adaptable soldier9 = new Adaptable("Engeneer", 15);
        Defender soldier10 = new Defender("Druid", 20);
        Adaptable soldier11 = new Adaptable("Palo", 1);


        Army army = new Army();
        army.addSoldier(soldier0);
        army.addSoldier(soldier1);
        army.addSoldier(soldier2);
        army.addSoldier(soldier3);
        army.addSoldier(soldier4);
        army.addSoldier(soldier5);
        army.addSoldier(soldier6);
        army.addSoldier(soldier7);
        army.addSoldier(soldier8);
        army.addSoldier(soldier9);
        army.addSoldier(soldier10);
        army.addSoldier(soldier11);

        army.reportYourself();

        army.attack();

        army.defend();

        army.specialMove();



    }
}












/*Difficulty: PRE-INTERMEDIATE
Remember to write readable, clean code with object oriented principles. The goal of this challenge
is to practice Java OOP concepts while maintaining simplicity. Beware of over engineering. The hardest thing
is to find balance.

Army description:
Create an army of soldiers with special abilities. Execute commands.

You are going to create an Army with at least 3 different soldiers (i.e. offensive, defensive and adaptable).
Soldiers have some common properties like name and damage. Issue commands to an army. Make defensive soldiers
defend and offensive soldiers attack. Have a command which makes everyone reports itself. (Everyone just prints his name).
Have any other commands you want. React on each command in your army with different soldiers.
You are going to practice inheritance and polymorphism.

Constrains:
Have at least 3 types of soldiers
Each soldier has a special ability which your army can use (i.e. Knights can flank an enemy)
Have at least 3 different commands
Have a command - report - which makes everyone just reports itself

Important part of this challenge is how are you going to create classes, interfaces and abstract classes.
Commands and soldiers doesn't have to do actually anything, just print something for example.
Special creative bonus: Create an enemy army which yours army attacks or defends.
Your army can actually destroy enemies army or vice versa. Program output example:


-------REPORT--------
Soldier Swordsman 1 here. Type - ADAPTABLE
Soldier Swordsman 2 here. Type - ADAPTABLE
Soldier Archer 1 here. Type - DEFENSIVE
Soldier Archer 2 here. Type - DEFENSIVE
Soldier Archer 3 here. Type - DEFENSIVE
Soldier Spearman 1 here. Type - DEFENSIVE
Soldier Spearman 2 here. Type - DEFENSIVE
Soldier berserk 1 here. Type - DEFENSIVE
Soldier Knight 1 here. Type - OFFENSIVE
Soldier Knight 2 here. Type - OFFENSIVE
Soldier Knight 3 here. Type - OFFENSIVE


-------ATTACK--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Berserk berserk 1 deals 3 damage.
Knight Knight 1 deals 5 damage.
Knight Knight 2 deals 5 damage.
Knight Knight 3 deals 5 damage.


-------DEFEND--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Archer Archer 1 deals 2 damage.
Archer Archer 2 deals 2 damage.
Archer Archer 3 deals 2 damage.
Spearman Spearman 1 deals 4 damage.
Spearman Spearman 2 deals 4 damage.


-------FURY ATTACK--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Berserk berserk 1 deals 6 damage.
Knight Knight 1 deals 5 damage.
Knight Knight 2 deals 5 damage.
Knight Knight 3 deals 5 damage.


-------FIRE DEFEND--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Archer Archer 1 deals 4 damage.
Archer Archer 2 deals 4 damage.
Archer Archer 3 deals 4 damage.
Spearman Spearman 1 deals 4 damage.
Spearman Spearman 2 deals 4 damage.


-------FLANK--------
Knight Knight 1 is flanking
Knight Knight 2 is flanking
Knight Knight 3 is flanking

Process finished with exit code 0



 */