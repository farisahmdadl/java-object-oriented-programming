public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person (String name){
        this(name, null);
    }

    Person(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is " + this.name);
    }

    void myAddress(String address){
        System.out.println("I come from " + this.address + ". Do you come from " + this.address + " too? or " + address + "?");
    }
}
