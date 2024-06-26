package com.plm.sis.frames;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

import com.plm.sis.frames.*;
import com.plm.sis.model.User;
import com.plm.sis.database.DBaccess;


public class LoginForm extends javax.swing.JFrame {

    Dashboard DashB;
    DBaccess db = new DBaccess();
    User user;
    
    public LoginForm() {
        initComponents();
        setResizableImage();
    }

    private void setResizableImage() {
        // Load the image
        String filePath = "C:\\Users\\Victus\\Documents\\NetBeansProjects\\SIS\\src\\main\\resources\\pictest.jpg";
        ImageIcon originalIcon = new ImageIcon(filePath);

        // Get the original image
        Image originalImage = originalIcon.getImage();

        // Resize the image to fit the JLabel
        Image resizedImage = originalImage.getScaledInstance(jL_pic.getWidth(), jL_pic.getHeight(), Image.SCALE_SMOOTH);

        // Create a new ImageIcon from the resized image
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Set the resized image icon to the JLabel
        jL_pic.setIcon(resizedIcon);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_title = new javax.swing.JLabel();
        jL_studID = new javax.swing.JLabel();
        jTF_studID = new java.awt.TextField();
        jL_sudPass = new javax.swing.JLabel();
        jTF_studPass = new java.awt.TextField();
        LoginB = new javax.swing.JButton();
        SignupB = new javax.swing.JButton();
        jL_pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLM Student Information System");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jL_title.setBackground(new java.awt.Color(0, 0, 0));
        jL_title.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jL_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_title.setText("Log In");

        jL_studID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_studID.setForeground(java.awt.SystemColor.controlDkShadow);
        jL_studID.setText("Student ID");

        jTF_studID.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jTF_studID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTF_studID.setName(""); // NOI18N
        jTF_studID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_studIDActionPerformed(evt);
            }
        });

        jL_sudPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_sudPass.setForeground(java.awt.SystemColor.controlDkShadow);
        jL_sudPass.setText("Password");

        jTF_studPass.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jTF_studPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTF_studPass.setName(""); // NOI18N
        jTF_studPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_studPassActionPerformed(evt);
            }
        });

        LoginB.setBackground(new java.awt.Color(221, 59, 65));
        LoginB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginB.setForeground(new java.awt.Color(255, 255, 255));
        LoginB.setText("Login");
        LoginB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        SignupB.setForeground(java.awt.Color.red);
        SignupB.setText("Signup");
        SignupB.setBorder(null);
        SignupB.setBorderPainted(false);
        SignupB.setContentAreaFilled(false);
        SignupB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupB.setFocusPainted(false);
        SignupB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBActionPerformed(evt);
            }
        });

        jL_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictest.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(SignupB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_studID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_studPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_sudPass)
                                    .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_studID)))
                            .addComponent(jL_title, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jL_title)
                .addGap(27, 27, 27)
                .addComponent(jL_studID)
                .addGap(1, 1, 1)
                .addComponent(jTF_studID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jL_sudPass)
                .addGap(1, 1, 1)
                .addComponent(jTF_studPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SignupB)
                .addContainerGap(115, Short.MAX_VALUE))
            .addComponent(jL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_studIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_studIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_studIDActionPerformed

    private void jTF_studPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_studPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_studPassActionPerformed

    private void SignupBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBActionPerformed
        setVisible(false);
        SignupForm SF = new SignupForm();
        SF.setVisible(true);
//        System.out.println("Hey");
    }//GEN-LAST:event_SignupBActionPerformed

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBActionPerformed
        int stud_id;
        String stud_pass;
        
        try {
            stud_id = Integer.valueOf(jTF_studID.getText());
            stud_pass = jTF_studPass.getText();
            System.out.println(stud_id);
            if (db.checkAcc(stud_id, stud_pass) == true){
                user = new User(stud_id);
                dispose();
                DashB = new Dashboard();
                DashB.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No Record of " + stud_id, "NOTICE" ,JOptionPane.PLAIN_MESSAGE);
            }
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Student ID", "NOTICE" ,JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_LoginBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginB;
    private javax.swing.JButton SignupB;
    private javax.swing.JLabel jL_pic;
    private javax.swing.JLabel jL_studID;
    private javax.swing.JLabel jL_sudPass;
    private javax.swing.JLabel jL_title;
    private java.awt.TextField jTF_studID;
    private java.awt.TextField jTF_studPass;
    // End of variables declaration//GEN-END:variables
}
