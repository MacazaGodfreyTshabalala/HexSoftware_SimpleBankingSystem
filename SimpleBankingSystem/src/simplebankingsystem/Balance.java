/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simplebankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tshabalala MG
 */
public class Balance extends javax.swing.JFrame {

 
    String cardNo;
    
    int notFound=0,balance;
    
    public Balance(String cardNo) {
        initComponents();
        this.cardNo = cardNo;
        
         String SUrl,SBank,SPass,query;
        
        SUrl= "jdbc:MySQL://localhost:3306/java_crud_db";
     SBank= "root";
     SPass="";  
     
     
     try
     {
          Connection con = DriverManager.getConnection(SUrl,SBank,SPass);
          java.sql.Statement st = con.createStatement(); 
         
         
          query = "SELECT * FROM statement ORDER BY date DESC;";
           
           java.sql.ResultSet rs = st.executeQuery(query);
           
           while(rs.next() && notFound==0 )
           {
               if(rs.getString("cardNo").equals(cardNo))
               { 
                     notFound=1;
                      balance  = rs.getInt("balance");
                      
               }
           }
           
           lbBalance.setText("Your Current Balance is R"+balance);
           
           
           
         
         
     }
     catch(Exception e)
     {
        System.out.println("Error!"+e.getMessage());
     }
     
    }

    private Balance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        lbBalance = new javax.swing.JLabel();
        btBackBal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Your Balance");

        jPanel9.setBackground(new java.awt.Color(255, 102, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(500, 300));

        lbBalance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBalance.setForeground(new java.awt.Color(255, 255, 255));
        lbBalance.setText("Your Current Balance is R 0.00");

        btBackBal.setBackground(new java.awt.Color(153, 153, 153));
        btBackBal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btBackBal.setForeground(new java.awt.Color(255, 255, 255));
        btBackBal.setText("Back");
        btBackBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackBalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lbBalance)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btBackBal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btBackBal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackBalActionPerformed
       
        Transaction TransactionFrame = new Transaction(cardNo);
        TransactionFrame.setVisible(true);
        TransactionFrame.pack();
        TransactionFrame.setLocationRelativeTo(null);//center
        this.dispose();
    }//GEN-LAST:event_btBackBalActionPerformed

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
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Balance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackBal;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbBalance;
    // End of variables declaration//GEN-END:variables
}
