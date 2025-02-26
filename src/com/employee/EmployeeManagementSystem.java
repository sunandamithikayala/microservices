package com.employee;


//Abstraction: Employee Interface (ISP & DIP applied)
interface Employee {
 void work();
 double getSalary();
}

//Concrete Class for Manager
class Manager implements Employee {
 private double salary;

 public Manager(double salary) {
     this.salary = salary;
 }
 
 @Override
 public void work() {
     System.out.println("Managing the team and projects.");
 }
 
 @Override
 public double getSalary() {
     return salary;
 }
}

//Concrete Class for Developer
class Developer implements Employee {
 private double salary;

 public Developer(double salary) {
     this.salary = salary;
 }
 
 @Override
 public void work() {
     System.out.println("Writing and maintaining code.");
 }
 
 @Override
 public double getSalary() {
     return salary;
 }
}

//Concrete Class for Security Guard
class SecurityGuard implements Employee {
 private double salary;

 public SecurityGuard(double salary) {
     this.salary = salary;
 }
 
 @Override
 public void work() {
     System.out.println("Ensuring security and monitoring premises.");
 }
 
 @Override
 public double getSalary() {
     return salary;
 }
}

//High-level module depending on abstraction (DIP)
class EmployeeManagementSystem {
 public static void main(String[] args) {
     Employee manager = new Manager(80000);
     Employee developer = new Developer(60000);
     Employee securityGuard = new SecurityGuard(30000);
     
     manageEmployee(manager);
     manageEmployee(developer);
     manageEmployee(securityGuard);
 }
 
 private static void manageEmployee(Employee employee) {
     employee.work();
     System.out.println("Salary: $" + employee.getSalary());
     System.out.println("----------------------");
 }
}
