package application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Faris";
        first = first + " " + "Adli";

        System.out.println(first);

        String second = "Faris Adli";

        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Faris Adli";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
