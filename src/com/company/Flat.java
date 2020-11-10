package com.company;

public class Flat extends Home {
    private int floor;
    private  int priceForKounalka;


    Flat(String adress, double area, int price, int polluted, int floor, int priceForKounalka) {
        super(adress, area, price, polluted);
        this.floor = floor;
        this.priceForKounalka = priceForKounalka;
    }

    public void payKomunalka() {
        System.out.println("С вашего счета списано " + this.priceForKounalka);
    }

    public void goDownOn1() {
        System.out.println("Вы спустились на первый этаж!");
    }

    public void goForAWalk() {
        goDownOn1();
        System.out.println("Хорошей прогулки...");
    }

}
