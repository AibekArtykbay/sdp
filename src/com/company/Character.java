package com.company;

public abstract class Character {


   private WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
       weaponBehavior.useWeapon();
    }

    public abstract void display();


}
