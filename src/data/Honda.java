package data;

public class Honda implements Car{

    public void drive() {
        System.out.println("Drive the car!");
    }

    public int getTier() {
        return 4;
    }

    public String getCountry() {
        return "Japan";
    }

    @Override
    public boolean isMaintained() {
        return false;
    }
}
