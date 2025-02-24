package com.emp;

class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}

class EmployeePersistence {
    public void saveToFile(Employee employee, String fileName) {
        System.out.println("Saving employee " + employee.getName() + " to file: " + fileName);
    }
}