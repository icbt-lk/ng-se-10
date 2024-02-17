/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rest.service.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icbt
 */
public class DBUtils {
    static final String DB_URL = "jdbc:mysql://localhost:3306/student_mnagament_system";
    static final String USER = "root";
    static final String PASS = "";
    
    public DBUtils() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            
        }
    }
    
    public Student getStudent(int id) throws SQLException {
        Student st = null;
         try {

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                    Statement stmt = conn.createStatement(); 
                    ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id="+ id);) {
                while (rs.next()) {
                    st = new Student();
                    st.setId( rs.getInt("id"));
                    st.setName(rs.getString("name"));
                    st.setDateOfBirth(rs.getString("dateOfBirth"));
                    break;
                }
            } catch (SQLException e) {
                System.err.print(e);
                throw e;
            }

        } catch (SQLException e) {
            System.err.print(e);
            throw e;
        }

        return st;
    }
    
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
         try {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                    Statement stmt = conn.createStatement(); 
                    ResultSet rs = stmt.executeQuery("SELECT * FROM students");) {
                while (rs.next()) {
                    Student st = new Student();
                    st.setId( rs.getInt("id"));
                    st.setName(rs.getString("name"));
                    st.setDateOfBirth(rs.getString("dateOfBirth"));
                    students.add(st);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }

        return students;
    }
    
    public boolean addStudent(Student st) {
        try {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                    Statement stmt = conn.createStatement(); 
                    ) {
                stmt.executeUpdate("INSERT INTO students (id, name, dateOfBirth) "
                        + "VALUES ('"+ st.getId()+"', '"+ st.getName() +"', '"+ st.getDateOfBirth()+"');");
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }
        return false;
    }
   
    public boolean updateStudent(Student st) {
        try {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                    Statement stmt = conn.createStatement(); 
                    ) {
                stmt.executeUpdate("UPDATE students SET name = '" +st.getName() + "', dateOfBirth = '" + st.getDateOfBirth()+ "' WHERE (id = '" + st.getId() +"');");
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }
        return false;
    }
    
    public boolean deleteStudent(int id) {
        try {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                    Statement stmt = conn.createStatement(); 
                    ) {
                stmt.executeUpdate("DELETE FROM students WHERE (id = '"+ id + "');");
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }
        return false;
    }
}
