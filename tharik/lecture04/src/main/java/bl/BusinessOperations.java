/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bl;

import extensions.DBUtils;

/**
 *
 * @author icbt
 */
public class BusinessOperations {
    public static void process(DBUtils utils) {
        utils.connect();
        
        utils.addData();
        utils.addData();
        utils.addData();
        utils.addData();
    }
}
