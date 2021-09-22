package com.company;

public class Queen extends Character {
    public Queen() {
        super(new AxeBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am a Queen");
    }

}
