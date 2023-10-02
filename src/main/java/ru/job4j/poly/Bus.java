package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Ехать, соблюдая ПДД");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобус помещается " + count + " человек");
    }

    @Override
    public double refuel(int fuel) {
        System.out.println("Цена за топливо составляет -" + Transport.super.refuel(fuel));
        return Transport.super.refuel(fuel);
    }
}
