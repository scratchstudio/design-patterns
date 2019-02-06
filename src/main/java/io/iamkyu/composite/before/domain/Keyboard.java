package io.iamkyu.composite.before.domain;

public class Keyboard {
    private int price;
    private int power;

    public Keyboard(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
