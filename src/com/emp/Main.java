package com.emp;



public class Main {
	public static void main(String[] args) {
        Employee emp = new Employee("Vishnu", 101, 50000);
        
        EmployeePrinter printer = new EmployeePrinter();
        printer.printEmployeeDetails(emp);
        
        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("Annual Salary: " + calculator.calculateAnnualSalary(emp));
        
        EmployeePersistence persistence = new EmployeePersistence();
        persistence.saveToFile(emp, "employee.txt");
    }

}