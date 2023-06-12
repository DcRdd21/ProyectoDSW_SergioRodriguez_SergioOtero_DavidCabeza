package com.gf.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection con;
    private static final String MYSQL_DB_URL = "jdbc:mysql://localhost:3306/bdentornos";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWD = "";

    public static Connection getConnection() throws SQLException {
        con = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_USER, MYSQL_PASSWD);
        return con;

    }

}
