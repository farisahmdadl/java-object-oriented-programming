package application;

import data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro",30000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}