package com.company;

public class Cottage extends Home {
    private int floors;
    private  double areaaround;

    Cottage(String adress, double area, int price, int polluted, int floors, double areaaround) {
        super(adress, area, price, polluted);
        this.floors = floors;
        this.areaaround = areaaround;
        this.area += this.areaaround;
    }

    public int getFloors() {
        return this.floors;
    }

    public void litthestolve() {
        System.out.println("В доме становится тепло");
    }

    public void haveastroll() {
        System.out.println("Оденься по погоде");
    }
}
