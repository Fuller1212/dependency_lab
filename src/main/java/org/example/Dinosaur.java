package org.example;

public class Dinosaur implements Attacker{
    //Instance variables (Has A)
    public String name;
    public int attackPower;

    public Dinosaur(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {

    }
}
