package application;

import data.Company;

public class CompanyApp {
    public static void main (String[] args) {
        Company company =  new Company();
        company.setName("Petrolink");

        Company.Employee employee = company.new Employee();
        employee.setName("Faris");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("IDX");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Dzul");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}
