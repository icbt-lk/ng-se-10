/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.rest.service.resources;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author icbt
 */
public class DBUtilsTest {
    
    public DBUtilsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of getStudent method, of class DBUtils.
     */
    @org.junit.jupiter.api.Test
    public void testCRUDStudent() throws Exception {
        System.out.println("getStudent");
        int id = 1;
        DBUtils instance = new DBUtils();
        Student expResult = new Student(1, "Max", "1996");
        
        instance.addStudent(expResult);
        Student result = instance.getStudent(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getDateOfBirth(), result.getDateOfBirth());
        
        expResult = new Student(1, "Lewis", "1984");
        instance.updateStudent(expResult);
        result = instance.getStudent(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getDateOfBirth(), result.getDateOfBirth());
        
         instance.deleteStudent(expResult.getId());
         result = instance.getStudent(id);
         assertEquals(null, result);
    }

   
    
}
