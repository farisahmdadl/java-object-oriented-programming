package application;

import data.City;
import data.Location;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
