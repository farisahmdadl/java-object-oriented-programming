package application;

import static data.Application.Processors;
import static data.Constant.*;
import data.Country;
import util.MathUtil;

public class StaticApp {
    public static void main (String[] args) {
        System.out.println(Application);
        System.out.println(Version);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Jakarta");
        System.out.println(city.getName());

        System.out.println(Processors);
    }
}
