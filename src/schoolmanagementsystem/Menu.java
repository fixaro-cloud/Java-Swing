/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author ASUS
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        smButton = new javax.swing.JButton();
        fsmButton = new javax.swing.JButton();
        tmButton = new javax.swing.JButton();
        srmButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(270, 150, 0, 0));
        setMinimumSize(new java.awt.Dimension(780, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 60));

        smButton.setBackground(new java.awt.Color(51, 51, 51));
        smButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        smButton.setForeground(new java.awt.Color(204, 204, 204));
        smButton.setText("Student Module");
        smButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smButtonActionPerformed(evt);
            }
        });
        getContentPane().add(smButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 50));

        fsmButton.setBackground(new java.awt.Color(51, 51, 51));
        fsmButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fsmButton.setForeground(new java.awt.Color(204, 204, 204));
        fsmButton.setText("Fee Submission Module");
        fsmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fsmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 280, 50));

        tmButton.setBackground(new java.awt.Color(51, 51, 51));
        tmButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tmButton.setForeground(new java.awt.Color(204, 204, 204));
        tmButton.setText("Teacher Module");
        tmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 50));

        srmButton.setBackground(new java.awt.Color(51, 51, 51));
        srmButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        srmButton.setForeground(new java.awt.Color(204, 204, 204));
        srmButton.setText("Student's Report Module");
        srmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(srmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 290, 50));

        logoutButton.setBackground(new java.awt.Color(51, 51, 51));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(204, 204, 204));
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smButtonActionPerformed
        StudentModule studentModule = new StudentModule();
        studentModule.setVisible(true);
        dispose();
    }//GEN-LAST:event_smButtonActionPerformed

    private void fsmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsmButtonActionPerformed
        FeeSubmissionModule feeSubmissionModule = new FeeSubmissionModule();
        feeSubmissionModule.setVisible(true);
        dispose();
    }//GEN-LAST:event_fsmButtonActionPerformed

    private void srmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srmButtonActionPerformed
        StudentReportModule studentReportModule = new StudentReportModule();
        studentReportModule.setVisible(true);
        dispose();
    }//GEN-LAST:event_srmButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void tmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmButtonActionPerformed
        TeacherModule tm = new TeacherModule();
        tm.setVisible(true);
        dispose();
    }//GEN-LAST:event_tmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fsmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton smButton;
    private javax.swing.JButton srmButton;
    private javax.swing.JButton tmButton;
    // End of variables declaration//GEN-END:variables
}