/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class FeeSubmissionModule extends javax.swing.JFrame {

    /**
     * Creates new form FeeSubmissionModule
     */
    public FeeSubmissionModule() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        annualfeeText = new javax.swing.JTextField();
        sportsfeeText = new javax.swing.JTextField();
        libraryfeeText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setBackground(new java.awt.Color(70, 70, 70));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTextPane1.setAlignmentX(2.0F);
        jTextPane1.setAlignmentY(2.0F);
        jTextPane1.setMargin(new java.awt.Insets(8, 9, 8, 9));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 0, 390, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fee Counter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 40));

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        backBtn.setForeground(new java.awt.Color(204, 204, 204));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 90, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Sports Fee:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 40, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Library Fee:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Annual Fee:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, -1));

        nameText.setBackground(new java.awt.Color(51, 51, 51));
        nameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 204, 204));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 220, 40));

        annualfeeText.setBackground(new java.awt.Color(51, 51, 51));
        annualfeeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        annualfeeText.setForeground(new java.awt.Color(204, 204, 204));
        annualfeeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualfeeTextActionPerformed(evt);
            }
        });
        getContentPane().add(annualfeeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 220, 40));

        sportsfeeText.setBackground(new java.awt.Color(51, 51, 51));
        sportsfeeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sportsfeeText.setForeground(new java.awt.Color(204, 204, 204));
        sportsfeeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsfeeTextActionPerformed(evt);
            }
        });
        getContentPane().add(sportsfeeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 220, 40));

        libraryfeeText.setBackground(new java.awt.Color(51, 51, 51));
        libraryfeeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        libraryfeeText.setForeground(new java.awt.Color(204, 204, 204));
        libraryfeeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryfeeTextActionPerformed(evt);
            }
        });
        getContentPane().add(libraryfeeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 220, 40));

        idText.setBackground(new java.awt.Color(51, 51, 51));
        idText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idText.setForeground(new java.awt.Color(204, 204, 204));
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        getContentPane().add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 220, 40));

        calculateBtn.setBackground(new java.awt.Color(51, 51, 51));
        calculateBtn.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        calculateBtn.setForeground(new java.awt.Color(204, 204, 204));
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(calculateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("( 30000 MMK )");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 334, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("( 20000 MMK )");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("( 100000 MMK )");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 274, -1, 30));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void annualfeeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualfeeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualfeeTextActionPerformed

    private void sportsfeeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsfeeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportsfeeTextActionPerformed

    private void libraryfeeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryfeeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libraryfeeTextActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        
        String id = idText.getText();
        String name = nameText.getText();
        String annualFee = annualfeeText.getText();
        String sportsFee = sportsfeeText.getText();
        String libraryFee = libraryfeeText.getText();
        
        String idRegex =  "^\\d{1,10}$";
        String nameRegex = "^[A-Za-z]+(\\s[A-Za-z]+)*$";
        String feeRegex = "^(0|[1-9]\\d*)(\\.\\d{1,2})?$";
        
        if(id.matches(idRegex) && name.matches(nameRegex) && annualFee.matches(feeRegex) && sportsFee.matches(feeRegex) && libraryFee.matches(feeRegex)){
            
            double annualFeeD= Double.parseDouble(annualFee);
            double sportsFeeD = Double.parseDouble(sportsFee);
            double libraryFeeD = Double.parseDouble(libraryFee);
            
            if(annualFeeD > 0 && annualFeeD <= 100000 && sportsFeeD > 0 && sportsFeeD <= 30000 && libraryFeeD > 0 && libraryFeeD <= 20000 ){
                
                double tobepaid = 150000;
                double totalpaid = annualFeeD + sportsFeeD + libraryFeeD;
                double rem = tobepaid - totalpaid ;
                
                String status;
                
                if(rem == 0){
                    status = "paid";
                }
                status = "unpaid";
                
                jTextPane1.setText("\t School Management System \n                **************************"
                + "\nTotal Fee to be paid: 150000 MMK \n                   ********************\n\n\n"
                + "Annual FEE: "+annualFeeD+" MMK\n Sports FEE:  "+ sportsFeeD + " MMK\n Library FEE "+libraryFeeD +
                " MMK\n\nTotal Fee Paid: "+totalpaid+" MMK\n Remaining Fee: "+rem + " MMK");
                
                try{
                    
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
                        String sql = "insert into feesubmission values(?,?,?,?,?,?)";

                        PreparedStatement preparedStatement = connection.prepareStatement(sql);

                        preparedStatement.setInt(1, Integer.parseInt(id));           
                        preparedStatement.setString(2, name);
                        preparedStatement.setInt(3, Integer.parseInt(annualFee) );
                        preparedStatement.setInt(4, Integer.parseInt(sportsFee));
                        preparedStatement.setInt(5, Integer.parseInt(libraryFee));        
                        preparedStatement.setString(6, status);
                        
                        preparedStatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data has been stored successfully");
                        connection.close();
                  }
                  catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                  }
            }else{
                JOptionPane.showMessageDialog(null , "Fees must be within given range!");
            } 
        } else{
            JOptionPane.showMessageDialog(null , "the appropriate values into input field!");
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FeeSubmissionModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeSubmissionModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeSubmissionModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeSubmissionModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeSubmissionModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annualfeeText;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField libraryfeeText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField sportsfeeText;
    // End of variables declaration//GEN-END:variables
}