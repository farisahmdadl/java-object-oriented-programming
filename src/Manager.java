class Manager extends Employee{

    String company;
    Manager(String name) {
        super(name);
    }

    Manager (String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello (String name){
        System.out.println("Hi " + name + ", my name is Manager " + this.name);
    }

    void sayCompany (String company){
        System.out.println("I work for " + company);
    }

    void sayMainCompany (){
        System.out.println("I worked for " + this.company);
    }
}
