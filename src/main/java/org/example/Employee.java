package org.example;



import java.util.ArrayList;
import java.util.List;



public class Employee extends Person implements ContractDepartment {


    private String position;
    private double salary;
    private String entryDate;
    private int contractDuration;
    private int noticePeriod;
    private List<Project> projects;

    public Employee(String name, int age,String position, double salary, String entryDate, int contractDuration, int noticePeriod) {
        super(name, age);

        this.position = position;
        this.salary = salary;
        this.entryDate = entryDate;
        this.contractDuration = contractDuration;
        this.noticePeriod = noticePeriod;
    }


    public Employee() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void setEntryDate(String entryDate) {
    }
    @Override
    public void setContractDuration(int contractDuration) {
    }
    @Override
    public void setNoticePeriod(int noticePeriod) {
    }
    public String getEntryDate() {
        return entryDate;
    }
    public int getContractDuration() {
        return contractDuration;
    }
    public int getNoticePeriod() {
        return noticePeriod;
    }
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Project> getProjects() {
        return projects;
    }
    public double calculateSalary() {
         /*if ("manager".equals(position)) {
            salary = 80000;
        }
        else if ("Developer".equals(position)) {
            salary = 60000;
        }
        else {
            salary = 20000;
        }
        // Methods for managing projects
return salary;
    }*/
        switch (position.toLowerCase()){
            case "manager":
                salary=80000;
                break;
            case "developer":
                salary=50000;
                break;
            default:
                salary=20000;
                break;
        }
        return salary;
    }
    public void addProject(Project project){
       if (projects==null){
           projects=new ArrayList<>();
       }
        projects.add(project);
    }
    public void removeProject(Project project){
        projects.remove(project);
    }
}
