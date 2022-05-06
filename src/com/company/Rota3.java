package com.company;

public class Rota3 extends Rota2{
    private String attackType;
    private int attack;
    private int attackDamage;

    public Rota3(int health, int damage, Enum3 enum3) {
        super(health, damage, enum3);
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    @Override
    public int awm(int damage,int speed){
        return super.awm(damage,speed);
    }
}
