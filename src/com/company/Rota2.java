package com.company;

public class Rota2 extends Rota1{
    private int defence;
    private int speed;

    public Rota2(int health, int damage, Enum3 enum3) {
        super(health, damage, enum3);
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
    public int awm(int damage, int speed){
        return damage;
    }
    public final int awm (int speed){
        return speed;
    }
}
