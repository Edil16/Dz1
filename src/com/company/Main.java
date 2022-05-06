package com.company;

import javax.swing.*;

import static com.company.Enum3.BERSERK;

public class Main {

    public static void main(String[] args) {
        Rota1 objectA = new Rota1(100,5,Enum3.DOKTOR);
        Rota2 objectB = new Rota2(200,25,Enum3.MAGIC);
        Rota3 objectC = new Rota3(120,23,BERSERK);
        System.out.println("objectA" + objectA.getInfo() + "\nobjectB" + objectB.getInfo() +
                "\nobjectC" + objectC.getInfo());


    }
}
