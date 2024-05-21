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

public class DBaccess {
    
    // CHANGE NIYO YUNG INFORMATION DITO PARA MATRY NYO RIN SAINYO
    private static final String username = "root";
    private static final String pass = "SqlSakalam765";
    private static final String dataConnect = "jdbc:mysql://localhost:3306/studdb";

    private Connection sqlConn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    
    // for Creation of DATABASE
    public void createDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConnect, username, pass);
            
            // CREATE DATABASE
            String sqlcmd = "CREATE DATABASE IF NOT EXISTS sisdb";
            pst = sqlConn.prepareStatement(sqlcmd);
            pst.executeUpdate();
            
            // SET DATABASE
            sqlConn.setCatalog("sisdb");
            
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
    
    
    // for SIGNUP
    
    
    // for DASHBOARD
    
   
    
}
