package com.zredtea.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test_db";
    private static final String USER = "root";
    private static final String PASS = "root7645";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
