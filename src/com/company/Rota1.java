package com.company;

public class Rota1 {
    private int health;
    private int damage;
    private Enum3 enum3;

    public Rota1(int health, int damage, Enum3 enum3) {
        this.health = health;
        this.damage = damage;
        this.enum3 = enum3;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Enum3 getEnum3() {
        return enum3;
    }
    public String getInfo() {
        return "health =" + health +
                "ndamage =" + damage +
                "nPersonage =" + enum3;
    }
}
