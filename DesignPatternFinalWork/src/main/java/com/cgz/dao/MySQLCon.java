package com.cgz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLCon {

    private static MySQLCon mySQLCon;
    public Connection con;

    private MySQLCon() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        String name = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "123456";
        Class.forName(name);
        con = DriverManager.getConnection(url,user,password);
    }

    public static synchronized MySQLCon getInstance() throws SQLException, ClassNotFoundException {
        if(mySQLCon==null){
            new MySQLCon();
        }
        return mySQLCon;
    }
}
