/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmanagementsystem;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author ASUS
 */
public class DeleteTeacher extends javax.swing.JFrame {

    /**
     * Creates new form DeleteTeacher
     */
    public DeleteTeacher() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        teachersTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        retrieveBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idTextToDelete = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        idTextToSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(240, 150, 0, 0));
        setMinimumSize(new java.awt.Dimension(680, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search and Delete Teachers");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 420, -1));

        teachersTable.setBackground(new java.awt.Color(204, 204, 204));
        teachersTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Specialization", "Subject_Assigned"
            }
        ));
        teachersTable.setMinimumSize(new java.awt.Dimension(65, 50));
        teachersTable.setRowHeight(25);
        teachersTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                teachersTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(teachersTable);
        if (teachersTable.getColumnModel().getColumnCount() > 0) {
            teachersTable.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 640, 130));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Enter id to delete specific teacher: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 310, -1));

        retrieveBtn.setBackground(new java.awt.Color(51, 51, 51));
        retrieveBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        retrieveBtn.setForeground(new java.awt.Color(204, 204, 204));
        retrieveBtn.setText("Retrieve all Teachers");
        retrieveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(retrieveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 230, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter id to search specific teacher: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 310, -1));

        idTextToDelete.setBackground(new java.awt.Color(51, 51, 51));
        idTextToDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTextToDelete.setForeground(new java.awt.Color(204, 204, 204));
        idTextToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextToDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(idTextToDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 140, 40));

        deleteBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(204, 204, 204));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 100, 40));

        idTextToSearch.setBackground(new java.awt.Color(51, 51, 51));
        idTextToSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTextToSearch.setForeground(new java.awt.Color(204, 204, 204));
        idTextToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextToSearchActionPerformed(evt);
            }
        });
        getContentPane().add(idTextToSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 140, 40));

        searchBtn.setBackground(new java.awt.Color(51, 51, 51));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(204, 204, 204));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("-------------------------------------------");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 320, 40));

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(204, 204, 204));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextToDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextToDeleteActionPerformed

    private void idTextToSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextToSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextToSearchActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
             
        String id = idTextToDelete.getText();
        
        if(id.matches("^\\d{1,10}$")){
              
             try{
            
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");

                    String query1 = "select * from teachers Where id = ? ";

                    PreparedStatement pst1 = connection.prepareStatement(query1);
                    pst1.setInt(1, Integer.parseInt(id));
                    ResultSet rs = pst1.executeQuery();

                    if(rs.next()){

                        String query2 = "delete from teachers where id = ? "; 

                        PreparedStatement pst2 = connection.prepareStatement(query2);
                        pst2.setInt(1, Integer.parseInt(id));
                        pst2.execute();

                        JOptionPane.showMessageDialog(null, "Data has been deleted successfully"); 
                        connection.close();  
                        idTextToDelete.setText("");

                    }else{
                        JOptionPane.showMessageDialog(null, "Data not found");
                        idTextToSearch.setText(""); 
                    }
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }else{                    
            JOptionPane.showMessageDialog(null, "Please enter the appropriate ID"); 
        }
        
       
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        TeacherModule tm = new TeacherModule();
        tm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void retrieveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveBtnActionPerformed
                  
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
            
            String query = "select * from teachers";
            
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            DefaultTableModel tm = (DefaultTableModel)teachersTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object obj[] = {rs.getInt("id"), rs.getString("name"),rs.getString("specialization"), rs.getString("subject_assigned")};
               
                tm.addRow(obj);
            }
            
            connection.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_retrieveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
           
        String id = idTextToSearch.getText();
        
        if(id.matches("^\\d{1,10}$")){
            
                 try{
            
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");

                        String query1 = "select * from teachers Where id = ? ";

                        PreparedStatement pst1 = connection.prepareStatement(query1);
                        pst1.setInt(1, Integer.parseInt(id));
                        ResultSet rs1 = pst1.executeQuery();

                        if(rs1.next()){

                            String query2 = "select * from teachers where id = ? ";
                            PreparedStatement pst2 = connection.prepareStatement(query2);
                            pst2.setInt(1, Integer.parseInt(id));
                            ResultSet rs2 =pst2.executeQuery(); 


                             DefaultTableModel tm = (DefaultTableModel)teachersTable.getModel();
                             tm.setRowCount(0);

                             while(rs2.next()){

                                Object obj[] = {rs2.getInt("id"), rs2.getString("name"), rs2.getString("specialization"), rs2.getString("subject_assigned")};

                                tm.addRow(obj);

                             }

                              connection.close();
                              idTextToSearch.setText("");

                        }else{
                            JOptionPane.showMessageDialog(null, "Data not found");
                            idTextToSearch.setText("");

                        }
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

        }else{
             JOptionPane.showMessageDialog(null, "Please enter the appropriate ID"); 
        }
        
    
    }//GEN-LAST:event_searchBtnActionPerformed

    private void teachersTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_teachersTablePropertyChange
        teachersTable.getTableHeader().setFont(new java.awt.Font("Arial", Font.PLAIN, 19)); // Set your preferred font and size

    }//GEN-LAST:event_teachersTablePropertyChange

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
            java.util.logging.Logger.getLogger(DeleteTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField idTextToDelete;
    private javax.swing.JTextField idTextToSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton retrieveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable teachersTable;
    // End of variables declaration//GEN-END:variables
}