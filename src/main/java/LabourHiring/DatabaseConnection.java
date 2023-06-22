package LabourHiring;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection() {

        String Url = "jdbc:mysql://localhost/Labour_Hiring";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        databaseLink = DriverManager.getConnection(Url,"root","ya1000ar");

    }catch(Exception e){
        e.printStackTrace();
    }
        System.out.println("output of database is "+ databaseLink);
        return databaseLink;

    }


}
