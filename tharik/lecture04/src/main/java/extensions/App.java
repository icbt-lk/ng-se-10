/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extensions;

import bl.BusinessOperations;

/**
 *
 * @author icbt
 */
public class App {
    public static void main(String[] args) {
        DBUtils utils = new MongoDBUtils();
        BusinessOperations.process(utils);
    }
}
