public class ManagerApp {
    public static void main(String[] args){

        var manager = new Manager("Jignesh");
        manager.sayHello("Adi");
        manager.sayCompany("Petrolink");

        var vicePresident = new VicePresident("Jon");
        vicePresident.sayHello("Ching");

        System.out.println(manager);
    }
}
