package data;

public interface Car extends HasCountry, Maintained{

    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }
}
