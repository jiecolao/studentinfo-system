package com.plm.sis.frames;

import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;

public class Dashboard extends javax.swing.JFrame {

    private Timer timer;
    
    
    public Dashboard() {
        initComponents();
        setResizableImage();
        startClock();
        setDate();
        
        // setMaximized(); maximized window
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jL_Date = new javax.swing.JLabel();
        jL_PLMicon = new javax.swing.JLabel();
        jL_Time = new javax.swing.JLabel();
        jL_Personal = new javax.swing.JLabel();
        jL_Personal1 = new javax.swing.JLabel();
        jB_Personal = new javax.swing.JButton();
        jL_Grades = new javax.swing.JLabel();
        jL_Grades1 = new javax.swing.JLabel();
        jB_Grades = new javax.swing.JButton();
        jL_Attendance = new javax.swing.JLabel();
        jL_Attendance1 = new javax.swing.JLabel();
        jB_Attendance = new javax.swing.JButton();
        jL_Curriculum = new javax.swing.JLabel();
        jL_Curriculum1 = new javax.swing.JLabel();
        jB_Curriculum = new javax.swing.JButton();
        jB_Logout = new javax.swing.JButton();

        jButton6.setText("jButton1");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setName(""); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_Date.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jL_Date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Date.setText("January 1, 2000");
        getContentPane().add(jL_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 0, 347, 70));

        jL_PLMicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_PLMicon.setText("Logo");
        getContentPane().add(jL_PLMicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 6, 70, 70));

        jL_Time.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jL_Time.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Time.setText("12:00:00");
        getContentPane().add(jL_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 0, 207, 70));

        jL_Personal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Personal.setText("   Personal\n");
        jL_Personal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Personal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jL_Personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 266, 260, -1));

        jL_Personal1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Personal1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Personal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jL_Personal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 290, 250));

        jB_Personal.setBorder(null);
        jB_Personal.setBorderPainted(false);
        jB_Personal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Personal.setLabel("");
        jB_Personal.setName(""); // NOI18N
        jB_Personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PersonalActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 566, 274));

        jL_Grades.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Grades.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Grades.setText("Grades    ");
        jL_Grades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Grades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jL_Grades, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 230, 70));

        jL_Grades1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Grades1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Grades1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Grades1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_Grades1.setPreferredSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jL_Grades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jB_Grades.setBorder(null);
        jB_Grades.setBorderPainted(false);
        jB_Grades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Grades.setName(""); // NOI18N
        jB_Grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GradesActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Grades, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 509, 274));

        jL_Attendance.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Attendance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Attendance.setText("Attendance");
        jL_Attendance.setToolTipText("");
        jL_Attendance.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jL_Attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 270, 60));

        jL_Attendance1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Attendance1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Attendance1.setToolTipText("");
        jL_Attendance1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Attendance1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_Attendance1.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jL_Attendance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jB_Attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 410, 470, 225));

        jL_Curriculum.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Curriculum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Curriculum.setText("Curriculum    ");
        jL_Curriculum.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Curriculum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jL_Curriculum, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 310, 70));

        jL_Curriculum1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jL_Curriculum1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Curriculum1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jL_Curriculum1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_Curriculum1.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jL_Curriculum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        jB_Curriculum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Curriculum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CurriculumActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Curriculum, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 600, 225));

        jB_Logout.setText("Log out");
        jB_Logout.setFocusPainted(false);
        jB_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 90, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_GradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GradesActionPerformed
        System.out.println("Accessed Grades");
    }//GEN-LAST:event_jB_GradesActionPerformed

    private void jB_PersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PersonalActionPerformed
        System.out.println("Accessed Personal");
    }//GEN-LAST:event_jB_PersonalActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.out.println("Accessed Curriculum");
    }//GEN-LAST:event_jButton6ActionPerformed
   
    private void jB_AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AttendanceActionPerformed
        System.out.println("Accessed Attendance");
    }//GEN-LAST:event_jB_AttendanceActionPerformed

    private void jB_CurriculumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CurriculumActionPerformed
        System.out.println("Accessed Curriculum");
    }//GEN-LAST:event_jB_CurriculumActionPerformed

    private void jB_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_LogoutActionPerformed

    
    private void setResizableImage() {
        // Load the image
        String fileP = "C:\\Users\\Victus\\Documents\\NetBeansProjects\\SIS\\src\\main\\resources\\PLM_logo.png";
        ImageIcon img1 = new ImageIcon(fileP);
        // Get the original image
        Image originalImage = img1.getImage();
        // Resize the image to fit the JLabel
        Image resizedImage = originalImage.getScaledInstance(jL_PLMicon.getWidth(), jL_PLMicon.getHeight(), Image.SCALE_SMOOTH);
        // Create a new ImageIcon from the resized image
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Set the resized image icon to the JLabel
        jL_PLMicon.setIcon(resizedIcon);
        
        // Personal
        String fileP1 = "C:\\Users\\Victus\\Documents\\NetBeansProjects\\SIS\\src\\main\\resources\\user.png";
        ImageIcon img2 = new ImageIcon(fileP1);
        originalImage = img2.getImage();
        resizedImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
        jL_Personal1.setIcon(resizedIcon);
        
        // Grades
        String fileP2 = "C:\\Users\\Victus\\Documents\\NetBeansProjects\\SIS\\src\\main\\resources\\grades.png";
        ImageIcon img3 = new ImageIcon(fileP2);
        originalImage = img3.getImage();
        resizedImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
        jL_Grades1.setIcon(resizedIcon);
        
        // Attendance
        String fileP3 = "C:\\Users\\Victus\\Documents\\NetBeansProjects\\SIS\\src\\main\\resources\\attendance.png";
        ImageIcon img4 = new ImageIcon(fileP3);
        originalImage = img4.getImage();
        resizedImage = originalImage.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
        jL_Attendance1.setIcon(resizedIcon);
        
        // Attendance
        String fileP4 = "C:\\Users\\Victus\\Documents\\NetBeansProjects\\SIS\\src\\main\\resources\\curriculum.png";
        ImageIcon img5 = new ImageIcon(fileP4);
        originalImage = img5.getImage();
        resizedImage = originalImage.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
        jL_Curriculum1.setIcon(resizedIcon);
        
    }
    
    private void setMaximized() {
        setExtendedState(Dashboard.MAXIMIZED_BOTH);
    }
    
    // Method to start the clock
    private void startClock() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
    }
    
        // Method to update the clock
    private void updateClock() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        jL_Time.setText(currentTime);
    }
    
    private void setDate(){
        LocalDateTime curDate = LocalDateTime.now();
        int getYear = curDate.getYear();
        int getDay = curDate.getDayOfMonth();
        
        int getMonth = curDate.getMonthValue();
        String monthString;
        switch (getMonth){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "null";
        }
        
        String dateToday = monthString + " " + getDay + ", " + getYear;
        jL_Date.setText(dateToday);
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Attendance;
    private javax.swing.JButton jB_Curriculum;
    private javax.swing.JButton jB_Grades;
    private javax.swing.JButton jB_Logout;
    private javax.swing.JButton jB_Personal;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jL_Attendance;
    private javax.swing.JLabel jL_Attendance1;
    private javax.swing.JLabel jL_Curriculum;
    private javax.swing.JLabel jL_Curriculum1;
    private javax.swing.JLabel jL_Date;
    private javax.swing.JLabel jL_Grades;
    private javax.swing.JLabel jL_Grades1;
    private javax.swing.JLabel jL_PLMicon;
    private javax.swing.JLabel jL_Personal;
    private javax.swing.JLabel jL_Personal1;
    private javax.swing.JLabel jL_Time;
    // End of variables declaration//GEN-END:variables
}
