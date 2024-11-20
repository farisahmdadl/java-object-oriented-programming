public class PersonApp {
    public static void main (String[] args) {
        var person1 = new Person ("Faris","Jakarta");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Ninis");
        person1.myAddress("Surabaya");

        Person person2 = new Person("Atina");
        person2.address = "Aceh";
        person2.sayHello("Luthfi");
        person2.myAddress("Padang");

        Person person3;
        person3 = new Person();
        person3.name = "Putri";
        person3.sayHello("Sekar");
        person3.myAddress("Lombok");
    }
}
