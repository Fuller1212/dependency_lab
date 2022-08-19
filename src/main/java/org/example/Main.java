package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Weapons
        Knife knife = new Knife();
        Bow bow = new Bow();
        Sword sword = new Sword();

        //Robots
        Robot robotOne = new Robot(knife, "Postman");
        Robot robotTwo = new Robot(bow, "React");
        Robot robotThree = new Robot(sword, "Django");

        // Call Robot Attacks
        robotOne.Attack();
        robotTwo.Attack();
        robotThree.Attack();
    }
}