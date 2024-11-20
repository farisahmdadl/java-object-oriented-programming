package data;

public class Truck implements Car{
    @Override
    public void drive() {
        System.out.println("Truck Drive!");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getCountry() {
        return "United Kingdom";
    }

    @Override
    public boolean isMaintained() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
