class Parent {
    String name;
    void doIt() {
        System.out.println("Do it, parent class");
    }
}

class Child extends Parent {
    String name;
    void doIt() {
        System.out.println("Do it, child class");
    }
}