/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture04;

/**
 *
 * @author icbt
 */
public class Student extends Person {
    private String studentNo;

    public Student() {
    }

    public Student(String studentNo, String nic, String firstName, String lastName) {
        super(nic, firstName, lastName);
        this.studentNo = studentNo;
    }
    
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
}
