package com.company;

public class Home {
    private String adress;
    protected double area;
    private int price;
    private int polluted;




    Home(String adress, double area, int price, int polluted) {
        this.adress = adress;
        this.area = area;
        this.price = price;
        this.polluted = polluted;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void cell(int price) {
        setPrice(price);
        System.out.println("Выставлено за " + price);
    }

    public void buy() {
        System.out.println("C Вас: " + this.price);
    }

    public void clean(int timemin) {
        if(this.polluted - timemin <= 0){
            this.polluted = 0;
            System.out.print("Идеальная чистота, уровень загрязненности 0");
        }else {
            this.polluted -= timemin;
            System.out.println("Уровень загрязненности " + this.polluted);
        }
    }

    public void eat() {
        this.polluted += 20;
        System.out.println("Уровень загрязненности " + this.polluted);
    }
}