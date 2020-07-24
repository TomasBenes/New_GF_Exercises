package com.company;

public class Aircraft {
    int maxAmmo;
    int baseDamage;
    int ammoStorage;

    public Aircraft () {
        this.ammoStorage = 0;
    }

    public int fight () {
        int damage = this.baseDamage * this.ammoStorage;
        this.ammoStorage= 0;
        return damage;
    }
}
