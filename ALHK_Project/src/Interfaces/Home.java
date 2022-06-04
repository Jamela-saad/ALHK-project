/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author jumanah
 */
public class Home extends javax.swing.JFrame {

    static Home window = new Home();
    public static String password;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setTitle("ALHK Home");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(197, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hologram-2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 57)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 39, 105));
        jLabel3.setText("Active Learning with Holo-Kid");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        signIn.setBackground(new java.awt.Color(161, 195, 252));
        signIn.setFont(new java.awt.Font("Sinhala MN", 1, 20)); // NOI18N
        signIn.setForeground(new java.awt.Color(34, 39, 105));
        signIn.setText("Sign In");
        signIn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(34, 39, 105)));
        signIn.setContentAreaFilled(false);
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel1.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 140, 40));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 74, 71));
        jLabel4.setText("Make the kids learn in an attractive educational environment ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 74, 71));
        jLabel5.setText("that help kids to to get the basic knowledge, increase their");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 74, 71));
        jLabel6.setText("exploring skills and expand their minds to different sciences.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 750));

        setSize(new java.awt.Dimension(1350, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
        SignIn.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signInActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signIn;
    // End of variables declaration//GEN-END:variables
}