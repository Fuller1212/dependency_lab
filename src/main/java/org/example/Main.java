package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Weapon butterfly_knife = new Weapon("Butterfly Knife", 50);
        Weapon sword = new Weapon("Sword", 30);
        Robot robotOne = new Robot(sword);
        System.out.println(robotOne.name);
        robotOne.Attack();
    }
}