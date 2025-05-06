package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private Connection get_Db_Connection() {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "MySQL123");

            System.out.println("Connected to database");
        }

        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }

    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.get_Db_Connection();
        try{
            con.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}