/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icbt
 */
public class Lecture04 {

    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Smith");
        person1.setNic("123456V");
        
        Person person2 = new Person("67890V", "George", "Whey");
        
        System.out.println("Hello "  + person1.getFirstName());
        System.out.println("Hello "  + person2.getFirstName());
        
        useArrayList();

    }
    
    public void useArray() {
        Person[] persons = new Person[4];
        
        persons[0] = new Student("S01", "3454V", "Aryton", "Senna");
        persons[1] = new Student("S02", "3654V", "Lewis", "Hamilton");
        persons[2] = new Employee("E01", 50000, "8342V", "Max", "Verstapann");
        persons[3] = new Employee("E02", 40000, "2342V", "Carlos", "Sainz");
        System.out.println("**************************************************");
//        for (int i = 0; i < persons.length; i++) {
//             System.out.println(persons[i].getFirstName());
//        }       
        for (Person person : persons) {
            System.out.println(person.getFirstName());
        } 
       
    }
    
    
    public static void useArrayList() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Student("S01", "3454V", "Aryton", "Senna"));
        persons.add(new Student("S02", "3654V", "Lewis", "Hamilton"));
        persons.add(new Employee("E01", 50000, "8342V", "Max", "Verstapann"));
        persons.add(new Employee("E02", 40000, "2342V", "Carlos", "Sainz"));
        System.out.println("**************************************************");     
        for (Person person : persons) {
            System.out.println(person.getFirstName());
        } 
    }
}
