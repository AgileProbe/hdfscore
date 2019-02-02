package com.cs.nju.hive;


import java.sql.*;

/**
 * Created by lch on 2017/6/25.
 */
public class HiveService {

    //hive的jdbc驱动�?
    public static String dirverName = "org.apache.hive.jdbc.HiveDriver";
    //连接hive的URL hive1.2.1版本�?要的是jdbc:hive2，�?�不�? jdbc:hive
    public static String url = "jdbc:hive2://localhost:10000/default";

    //系统登录用的密码和账�?
    public static String user = "root";
    public static String pass = "Icandobigdata!";
    /**
     * 创建连接
     * @return
     * @throws SQLException
     */
    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName(dirverName);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 创建命令
     * @param conn
     * @return
     * @throws SQLException
     */
    public static Statement getStmt(Connection conn) throws SQLException{

        if(conn == null){

        }
        return conn.createStatement();
    }

    /**
     * 关闭连接
     * @param conn
     */
    public static void closeConn(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 关闭命令
     * @param stmt
     */
    public static void closeStmt(Statement stmt){
        try {
            stmt.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

