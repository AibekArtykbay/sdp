package com.company;

import org.w3c.dom.ls.LSOutput;

public class Troll extends Character{
    public Troll() {
        super(new BowAndArrowBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am a Troll");
    }
}
