public class ParentApp {
    public static void main (String[] args) {

        Child child = new Child();
        child.name = "Teguh";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.name = "Budhi";
        parent.doIt();
        System.out.println(parent.name);
        System.out.println(child.name);
    }
}