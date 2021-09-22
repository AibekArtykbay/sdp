package com.company;

public class King extends Character{
    public King() {
        super(new BowAndArrowBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am a King");
    }

}
