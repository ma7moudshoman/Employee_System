package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Employee("Mahmoud",25,"manager",15000,"1/2/2024",3,15);

        Employee developer = new Employee("Mazen",22,"Developer",12000,"1/5/2024",2,10);


        Project project1 = new Project("Project A");
        Project project2 = new Project("Project B");



        manager.addProject(project1);
        developer.addProject(project2);



        // Display employee
        displayEmployeeInfo(manager);
        displayEmployeeInfo(developer);
    }

    private static void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Position: " + employee.getPosition());
        System.out.println("Entry Date: " + employee.getEntryDate());
        System.out.println("Contract Duration: " + employee.getContractDuration() + " Years");
        System.out.println("Notice Period: " + employee.getNoticePeriod() + " Days");

    System.out.println("Projects:");
        for (Project project : employee.getProjects()) {
            System.out.println(" " + project.getProjectName());
        }

        System.out.println("Salary:  EG " + employee.calculateSalary());
        System.out.println("------------------------------");
    }
}
