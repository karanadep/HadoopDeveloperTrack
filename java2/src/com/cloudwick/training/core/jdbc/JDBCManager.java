package com.cloudwick.training.core.jdbc;

import java.sql.*;

/**
 * Created by cloudwickguest on 8/9/16.
 */
public class JDBCManager {
    private static Connection conn;
    public static void main(String[] args) {
        CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://172.17.5.241:3306/cloudwick","karanmac","password");
        //InsertData("karan6","karan6");
        //FetchData(2);
        InsertBatchData("karan7","karan7");
    }
    private static void CreateConnection(String driver, String url, String uname, String pwd){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,uname,pwd);
            //conn.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void InsertData(String username, String password) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into user (USERNAME, PASSWORD) values (?,?)");
            ps.setString(1,username);
            ps.setString(2,password);
            int data = ps.executeUpdate();
            System.out.println("Rows: " + data);
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
               // conn.commit();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void InsertBatchData(String username, String password) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into user (USERNAME, PASSWORD) values (?,?)");
            ps.setString(1,username);
            ps.setString(2,password);
            ps.addBatch();
            ps.setString(1,username);
            ps.setString(2,password);
            ps.addBatch();
            ps.setString(1,username);
            ps.setString(2,password);
            ps.addBatch();
            int[] data = ps.executeBatch();
            for(int d: data) {
                System.out.println("Rows: " + d);
            }
        } catch (SQLException e) {
            /*try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }*/
        } finally {
            try {
                //conn.commit();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void FetchData(int userId) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("Select * from user where USERID = ?");
            ps.setInt(1,userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.print("username: "+ rs.getString(1) + "\n");
                System.out.print("password: "+ rs.getString(2) + "\n");
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}