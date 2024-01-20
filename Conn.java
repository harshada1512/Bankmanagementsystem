/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try {

            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Harshada");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}