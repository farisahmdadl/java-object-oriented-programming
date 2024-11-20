package data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Samsung S22", 9000000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Samsung A54", 5000000);
        Product product3 = new Product("Samsung A54", 5000000);

        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product.equals(product3));
        System.out.println(product2.equals(product3));
        System.out.println(product2.hashCode() == product3.hashCode());
    }
}
