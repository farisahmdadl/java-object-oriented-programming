package application;

import data.Customer;
import data.Level;

public class EnumApp {

    public static void main (String[] args) {
        Customer customer = new Customer();
        customer.setName("Faris");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());


        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level:");
        for (var value : Level.values()) {
            System.out.print(value + " ");
        }
    }
}
