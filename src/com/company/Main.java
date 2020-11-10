package com.company;

public class Main {

    public static void main(String[] args) {

        Cottage vip = new Cottage("Рублево-Успенское шоссе, 20км",200,200000000,10, 4, 700);
        vip.litthestolve();
        System.out.println(vip.getFloors());
        vip.clean(20);

        Flat medium = new Flat("Улица Академика Глушко 12", 28, 6000000, 20, 13, 10000);
        medium.goForAWalk();
        medium.payKomunalka();
        medium.eat();
        medium.clean(30);
        medium.buy();

    }
}
