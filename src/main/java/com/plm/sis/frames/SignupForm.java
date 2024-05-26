package com.plm.sis.frames;

import java.awt.Image;
import javax.swing.ImageIcon;

import com.plm.sis.frames.*;
import com.plm.sis.model.User;
import javax.swing.JOptionPane;

import com.plm.sis.database.DBaccess;
import com.plm.sis.frames.*;

public class SignupForm extends javax.swing.JFrame {

    DBaccess db = new DBaccess();
    
    public SignupForm() {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_pic = new javax.swing.JLabel();
        jL_title = new javax.swing.JLabel();
        jL_fullN = new javax.swing.JLabel();
        jTF_fullN = new java.awt.TextField();
        jL_studID = new javax.swing.JLabel();
        jTF_studID = new java.awt.TextField();
        jL_studPass = new javax.swing.JLabel();
        jTF_studPass = new java.awt.TextField();
        jL_PLMemail = new javax.swing.JLabel();
        jTF_PLMemail = new java.awt.TextField();
        jB_Register = new javax.swing.JButton();
        jB_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLM Student Information System");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jL_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictest.jpg"))); // NOI18N

        jL_title.setBackground(new java.awt.Color(0, 0, 0));
        jL_title.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jL_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_title.setText("Sign up");

        jL_fullN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_fullN.setForeground(java.awt.SystemColor.controlDkShadow);
        jL_fullN.setText("Full Name");

        jTF_fullN.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jTF_fullN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTF_fullN.setName(""); // NOI18N
        jTF_fullN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_fullNActionPerformed(evt);
            }
        });

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

        jL_studPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_studPass.setForeground(java.awt.SystemColor.controlDkShadow);
        jL_studPass.setText("Password");

        jTF_studPass.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jTF_studPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTF_studPass.setName(""); // NOI18N
        jTF_studPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_studPassActionPerformed(evt);
            }
        });

        jL_PLMemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_PLMemail.setForeground(java.awt.SystemColor.controlDkShadow);
        jL_PLMemail.setText("PLM Email");

        jTF_PLMemail.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jTF_PLMemail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTF_PLMemail.setName(""); // NOI18N
        jTF_PLMemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_PLMemailActionPerformed(evt);
            }
        });

        jB_Register.setBackground(new java.awt.Color(221, 59, 65));
        jB_Register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_Register.setForeground(new java.awt.Color(255, 255, 255));
        jB_Register.setText("Register");
        jB_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RegisterActionPerformed(evt);
            }
        });

        jB_Login.setForeground(java.awt.Color.red);
        jB_Login.setText("Back to Log In");
        jB_Login.setBorder(null);
        jB_Login.setBorderPainted(false);
        jB_Login.setContentAreaFilled(false);
        jB_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Login.setFocusPainted(false);
        jB_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_fullN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_studID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_studID)
                                    .addComponent(jL_fullN)
                                    .addComponent(jB_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_studPass)
                                    .addComponent(jTF_studPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_PLMemail)
                                    .addComponent(jTF_PLMemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jL_title, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jB_Login)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jL_title)
                .addGap(27, 27, 27)
                .addComponent(jL_fullN)
                .addGap(1, 1, 1)
                .addComponent(jTF_fullN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jL_studID)
                .addGap(1, 1, 1)
                .addComponent(jTF_studID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jL_studPass)
                .addGap(1, 1, 1)
                .addComponent(jTF_studPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jL_PLMemail)
                .addGap(1, 1, 1)
                .addComponent(jTF_PLMemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jB_Login)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_fullNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_fullNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_fullNActionPerformed

    private void jTF_studIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_studIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_studIDActionPerformed

    private void jB_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RegisterActionPerformed
        String user_fullname;
        int user_studID;
        String user_password;
        String user_email;
        
        try {
            user_fullname = jTF_fullN.getText();
            user_studID = Integer.valueOf(jTF_studID.getText());
            user_password = jTF_studPass.getText();
            user_email = jTF_PLMemail.getText();
            
            if (db.checkUser(user_studID)){
                db.registerUser(user_studID, user_password, user_email, user_fullname);
                JOptionPane.showMessageDialog(null, "Account Registered. Proceeding to Login.", "NOTICE" ,JOptionPane.PLAIN_MESSAGE);
                dispose();
                LoginForm lf = new LoginForm();
                lf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please fill all the fields", "NOTICE" ,JOptionPane.PLAIN_MESSAGE);
            }
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a valid Student ID", "NOTICE" ,JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jB_RegisterActionPerformed

    private void jB_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LoginActionPerformed
        dispose();
        LoginForm LF = new LoginForm();
        LF.setVisible(true);
    }//GEN-LAST:event_jB_LoginActionPerformed

    private void jTF_studPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_studPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_studPassActionPerformed

    private void jTF_PLMemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_PLMemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_PLMemailActionPerformed

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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Login;
    private javax.swing.JButton jB_Register;
    private javax.swing.JLabel jL_PLMemail;
    private javax.swing.JLabel jL_fullN;
    private javax.swing.JLabel jL_pic;
    private javax.swing.JLabel jL_studID;
    private javax.swing.JLabel jL_studPass;
    private javax.swing.JLabel jL_title;
    private java.awt.TextField jTF_PLMemail;
    private java.awt.TextField jTF_fullN;
    private java.awt.TextField jTF_studID;
    private java.awt.TextField jTF_studPass;
    // End of variables declaration//GEN-END:variables
}
