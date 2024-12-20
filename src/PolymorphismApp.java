public class PolymorphismApp {
    public static void main(String[] args) {
            Employee employee = new Employee("Teguh");
            employee.sayHello("Christ");

            employee = new Manager("Budhi");
            employee.sayHello("Ivanie");

            employee = new VicePresident("Jon");
            employee.sayHello("Adi");

            Manager manager = new Manager ("Dewi", "Petrolink");
            manager.sayHello("Gionata");
            manager.sayCompany("Goldteak");
            manager.sayMainCompany();

            sayHello(new Employee("Risda"));
            sayHello(new Manager("Hamood"));
            sayHello(new VicePresident("Richard"));
    }

    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }

    }
}
