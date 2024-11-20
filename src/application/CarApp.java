package application;

import data.Car;
import data.Honda;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Honda();
        System.out.println(car.getTier());
        car.drive();
    }
}
