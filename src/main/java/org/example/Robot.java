package org.example;

public class Robot {
    public String name;
    public String weaponName;
    public int weaponPower;

     //Constructor
    public Robot() {
        this.name = "Fade";
        this.weaponName = "Butterfly Knife";
        this.weaponPower = 50;

    }
        //Methods
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weaponName + " for " + this.weaponPower + " damage! ");
        };



}
