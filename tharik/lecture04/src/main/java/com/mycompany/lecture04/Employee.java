/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture04;

/**
 *
 * @author icbt
 */
public class Employee extends Person {
    private String employeeNo;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeNo, double salary, String nic, String firstName, String lastName) {
        super(nic, firstName, lastName);
        this.employeeNo = employeeNo;
        this.salary = salary;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
