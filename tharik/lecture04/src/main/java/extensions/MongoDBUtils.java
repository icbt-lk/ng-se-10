/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extensions;

/**
 *
 * @author icbt
 */
public class MongoDBUtils implements DBUtils {
    
    @Override
    public void connect() {
        System.out.println("Connecting to Mongo DB");
    }

    @Override
    public void addData() {
         System.out.println("Adding data to Mongo DB");
    }
    
}
