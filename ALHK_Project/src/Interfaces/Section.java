/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 * Imports.
 */
import Classes.*;
import java.awt.Image;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author jumanah
 */
public class Section extends javax.swing.JFrame {

    static Section window = new Section();
    public static ArrayList<String> objectURL = new ArrayList();
    static String sections;

    /**
     * Creates new form Section
     */
    public Section() {
        initComponents();
        setTitle("Section");
        //Interface design
        ALHKProject.setColor(btnSection);
        ALHKProject.resetColor(btnHome, btnProfile, btnVideo);
        try {
            display();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There is an error in some files that occurred during downloading the app, please try to download the ALHK app again.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "There is an error that occurred on the Database server during the connection, please try again later.");
        }

    }

    public void display() throws ClassNotFoundException, SQLException {
        // TODO add your handling code here:
        ArrayList<Sections> section = Database.onLoadSection();
        JLabel[] JLabel = {Image_1, Image_2};
        JRadioButton[] jRadioButtons = {Section_1, Section_2};
        JTextPane[] jTextPanes = {Decription_1, Decription_2};
        //Display section information in the interface
        for (int i = 0; i < section.size(); i++) {
            jRadioButtons[i].setText(section.get(i).getSectionName());
            jTextPanes[i].setText(section.get(i).getSectionDescription());
            String sectionImage = section.get(i).getSectionImage();
            ImageIcon imageIcon = new ImageIcon(sectionImage);
            Image image = imageIcon.getImage();
            Image myImage = image.getScaledInstance(JLabel[i].getWidth(), JLabel[i].getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(myImage);
            JLabel[i].setIcon(newIcon);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProfile = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnSection = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnVideo = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        section_1 = new javax.swing.JPanel();
        Image_1 = new javax.swing.JLabel();
        Section_1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Decription_1 = new javax.swing.JTextPane();
        section_2 = new javax.swing.JPanel();
        Image_2 = new javax.swing.JLabel();
        Section_2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Decription_2 = new javax.swing.JTextPane();
        nextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(161, 195, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sinhala MN", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALHK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 20));

        btnProfile.setBackground(new java.awt.Color(92, 140, 215));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
        });
        btnProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Profile");
        btnProfile.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Fluency System Regular-User.png"))); // NOI18N
        btnProfile.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 350, 50));

        btnHome.setBackground(new java.awt.Color(92, 140, 215));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Home");
        btnHome.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Fluency System Regular-Home.png"))); // NOI18N
        btnHome.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 50));

        btnSection.setBackground(new java.awt.Color(92, 140, 215));
        btnSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSectionMouseClicked(evt);
            }
        });
        btnSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Section");
        btnSection.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Material Outlined-Four Squares.png"))); // NOI18N
        btnSection.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(btnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 350, 50));

        btnVideo.setBackground(new java.awt.Color(92, 140, 215));
        btnVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVideoMouseClicked(evt);
            }
        });
        btnVideo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Devices Tutorial");
        btnVideo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Material Outlined-Video.png"))); // NOI18N
        btnVideo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(btnVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 350, 50));

        btnLogOut.setBackground(new java.awt.Color(161, 195, 252));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        btnLogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Log Out");
        btnLogOut.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Windows 10-Logout Rounded Left.png"))); // NOI18N
        btnLogOut.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 350, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(null);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(35, 39, 101));
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(35, 39, 101)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 850, 20));

        jLabel4.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 39, 101));
        jLabel4.setText("Please choose a section:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sinhala MN", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 39, 101));
        jLabel5.setText("Section");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        section_1.setBackground(new java.awt.Color(255, 255, 255));
        section_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 233, 253), 3, true));
        section_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        section_1.add(Image_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 90));

        buttonGroup.add(Section_1);
        Section_1.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        Section_1.setForeground(new java.awt.Color(35, 39, 101));
        Section_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        section_1.add(Section_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 30));

        Decription_1.setFont(new java.awt.Font("Sinhala MN", 0, 16)); // NOI18N
        Decription_1.setForeground(new java.awt.Color(35, 39, 101));
        Decription_1.setFocusable(false);
        jScrollPane1.setViewportView(Decription_1);

        section_1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 630, 50));

        jPanel2.add(section_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 850, 130));

        section_2.setBackground(new java.awt.Color(255, 255, 255));
        section_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 233, 253), 3, true));
        section_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        section_2.add(Image_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 90));

        buttonGroup.add(Section_2);
        Section_2.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        Section_2.setForeground(new java.awt.Color(35, 39, 101));
        Section_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        section_2.add(Section_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 30));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(5, 26));

        Decription_2.setFont(new java.awt.Font("Sinhala MN", 0, 16)); // NOI18N
        Decription_2.setForeground(new java.awt.Color(35, 39, 101));
        Decription_2.setFocusable(false);
        jScrollPane2.setViewportView(Decription_2);

        section_2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 630, 50));

        jPanel2.add(section_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 850, 130));

        nextBtn.setBackground(new java.awt.Color(255, 255, 255));
        nextBtn.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(35, 39, 101));
        nextBtn.setText("Next");
        nextBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(35, 39, 101)));
        nextBtn.setContentAreaFilled(false);
        nextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel2.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (Section_1.isSelected()) {
                sections = Database.getSectionID().get(0);
            } else if (Section_2.isSelected()) {
                sections = Database.getSectionID().get(1);
            }
            this.setVisible(false);
            Object window = new Object();
            window.setVisible(true);

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There is an error in some files that occurred during downloading the app, please try to download the ALHK app again.");
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "There is an error that occurred on the Database server during the connection, please try again later.");
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        dispose();
        Home.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMouseClicked
        // TODO add your handling code here:
        Tutorials.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVideoMouseClicked

    private void btnSectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSectionMouseClicked
        // TODO add your handling code here:
        Section window = new Section();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSectionMouseClicked

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        // TODO add your handling code here:
        Profile.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfileMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        Home.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeMouseClicked

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
            java.util.logging.Logger.getLogger(Section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Section().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextPane Decription_1;
    public static javax.swing.JTextPane Decription_2;
    public static javax.swing.JLabel Image_1;
    public static javax.swing.JLabel Image_2;
    public static javax.swing.JRadioButton Section_1;
    public static javax.swing.JRadioButton Section_2;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnProfile;
    private javax.swing.JPanel btnSection;
    private javax.swing.JPanel btnVideo;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel section_1;
    private javax.swing.JPanel section_2;
    // End of variables declaration//GEN-END:variables
}