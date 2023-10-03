package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle warPlane = new Plane();
        Vehicle train = new Train();
        Vehicle cargoTrain = new Train();
        Vehicle bus = new Bus();
        Vehicle schoolBus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{plane, warPlane, train, cargoTrain, bus, schoolBus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
