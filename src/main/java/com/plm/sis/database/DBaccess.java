/*
    DITO SA CLASS FILE NATO NAKALAGAY LAHAT NG ANYTHING RELATED SA
    SQL AND DATABASE NATEN
    DITO NAKALAGAY LAHAT NG METHODS NA MAGIINTERACT SA DATABASE NATEN 
    
    Basically, dito manggagaling lahat ng mai-invoke nating methods para
    makapag INSERT, SELECT, UPDATE, etc sa DATABASE naten. 
    
    kapag maglalagay kayo methods sa assigned frame nyo, lagyan niyo nlng
    palatandaan (nasa baba)

*/

package com.plm.sis.database;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBaccess {
    
    // CHANGE NIYO YUNG INFORMATION DITO PARA MATRY NYO RIN SAINYO
    private static final String username = "root";
    private static final String pass = "SqlSakalam765";
    private static final String dataConnect = "jdbc:mysql://localhost:3306/";
    private static final String db_name = "sisdb";

    private Connection sqlConn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    
    // for Creation of DATABASE
    public void createDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConnect, username, pass);
            
            // CREATE DATABASE
            String sqlcmd = "CREATE DATABASE IF NOT EXISTS " + db_name;
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.executeUpdate();
            
            // SET DATABASE
            sqlConn.setCatalog(db_name);
            
            // CREATE TABLES
            // users
            sqlcmd = "CREATE TABLE IF NOT EXISTS users (" +
                    "stud_id INT PRIMARY KEY, " +
                    "stud_pass VARCHAR(50)); ";
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.executeUpdate();
            
            // info
            sqlcmd = "CREATE TABLE IF NOT EXISTS info (" +
                    "stud_id INT, " +
                    "stud_email VARCHAR(50), " +
                    "stud_name VARCHAR(100), " +
                    "stud_contact INT, " +
                    "stud_col VARCHAR(50), " +
                    "stud_crs VARCHAR(10), " +
                    "stud_type VARCHAR(20), " +
                    "stud_yrlvl INT, " + 
                    "FOREIGN KEY(stud_id) REFERENCES users(stud_id));";
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.executeUpdate();
            
            // grades
            sqlcmd = "CREATE TABLE IF NOT EXISTS grades (" +
                    "stud_id INT, " +
                    "subj_code VARCHAR(10), " +
                    "subj_sec INT, " +
                    "subj_title VARCHAR(100), " +
                    "subj_units INT, " +
                    "subj_days INT, " +
                    "subj_time INT, " +
                    "subj_room VARCHAR(10), " +
                    "subj_sem1_grade DECIMAL(5, 2), " +
                    "subj_sem2_grade DECIMAL(5, 2), " +
                    "subj_gwa DECIMAL(5, 2), " +
                    "FOREIGN KEY(stud_id) REFERENCES users(stud_id));";
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.executeUpdate();

//            // attendance
//            sqlcmd = "CREATE TABLE IF NOT EXISTS grades (" +
//                    "stud_id INT, " +
//                    "stud_attd VARCHAR(10), " +
//                    "subj_sec INT, " +
//                    "subj_title VARCHAR(100), " +
//                    "subj_units INT, " +
//                    "subj_days INT, " +
//                    "subj_time INT, " +
//                    "subj_room VARCHAR(10), " +
//                    "subj_sem1_grade DECIMAL(5, 2), " +
//                    "subj_sem2_grade DECIMAL(5, 2), " +
//                    "subj_gwa DECIMAL(5, 2), " +
//                    "FOREIGN KEY(stud_id) REFERENCES users(stud_id));";
//            pst = sqlConn.prepareStatement(sqlcmd);
//            pst.executeUpdate();
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) { 
            e.printStackTrace();    
            throw new RuntimeException("Failed to load MySQL JDBC driver");
        } finally {                             
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // ===== DATABASE METHODS PER FRAME =====
    
    // NOTE: invoke nyo createDB sa class nyo para maverify if merong database
    
    // for LOGIN
    public boolean checkAcc(int stud_id, String stud_pass){
        boolean isExist = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConnect + db_name, username, pass);
            String sqlcmd = "SELECT * FROM users WHERE stud_id = ? AND stud_pass = ?";
            pst = sqlConn.prepareStatement(sqlcmd);
            
            pst.setInt(1, stud_id);
            pst.setString(2, stud_pass);
            
            rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                isExist = true; 
                System.out.println("Account exists");
            } 
            
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) { 
            e.printStackTrace();    
            throw new RuntimeException("Failed to load MySQL JDBC driver");
        } finally {                             
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isExist;
    }
    
    // for SIGNUP
    public boolean checkUser(int stud_id){
        boolean isNotRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConnect + db_name, username, pass);
            String sqlcmd = "SELECT * FROM info "
                    + "WHERE stud_id = ? ;";
            pst = sqlConn.prepareStatement(sqlcmd);
            
            pst.setInt(1, stud_id);
            
            rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Account already exists");
                JOptionPane.showMessageDialog(null, "Student ID already exists", "NOTICE" ,JOptionPane.PLAIN_MESSAGE);
                isNotRegistered = false; 
            } else {
                System.out.println("Account UNIQUE");
                isNotRegistered = true;
            }
            
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) { 
            e.printStackTrace();    
            throw new RuntimeException("Failed to load MySQL JDBC driver");
        } finally {                             
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isNotRegistered;
    }
    
    public void registerUser(int stud_id, String stud_pass, String user_email, String user_fN){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConnect + db_name, username, pass);
            String sqlcmd = "INSERT INTO users "
                    + "VALUES (?, ?);";
            pst = sqlConn.prepareStatement(sqlcmd);
            
            pst.setInt(1, stud_id);
            pst.setString(2, stud_pass);
            pst.executeUpdate();
            
            sqlcmd = "INSERT INTO info (stud_id, stud_email, stud_name) "
                    + "VALUES (?, ?, ?);";
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.setInt(1, stud_id);
            pst.setString(2, user_email);
            pst.setString(3, user_fN);
            pst.executeUpdate();
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) { 
            e.printStackTrace();    
            throw new RuntimeException("Failed to load MySQL JDBC driver");
        } finally {                             
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // for DASHBOARD
    
    
    // for PERSONAL
    
    
    // for GRADES
    
    
    // VVVVV TEMPLATE NYO VVVVV
    public void methodName(){ // add parameters if necessary
        try {
            // -- DEFAULT -- 
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConnect + db_name, username, pass);
            // -- DEFAULT --
            
            // -- CODE NYO -- 
            String sqlcmd = ""; // sql command nyo
            // -- CODE NYO --
            
            // -- DEFAULT --
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.executeUpdate(); // .executeQuery() if doing SELECT
            // -- DEFAULT -- (wag na galawin yung mga nasa baba catch, finally, throw, etc.)
        } catch (SQLException e) {
                e.printStackTrace(); 
        } catch (ClassNotFoundException e) { 
            e.printStackTrace();    
            throw new RuntimeException("Failed to load MySQL JDBC driver");
        } finally {                             
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
