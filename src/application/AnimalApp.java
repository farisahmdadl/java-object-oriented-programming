package application;

import data.Animal;
import data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Kiko";
        animal.run();
    }
}
