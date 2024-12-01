/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simplebankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tshabalala MG
 */
public class FirstDeposit extends javax.swing.JFrame {

     String cardNo;
     
     int balance=0;
    public FirstDeposit(String cardNo) {
        initComponents();
        
          this.cardNo = cardNo;
        
        lbAccNo.setText(""+cardNo);
    }

    private FirstDeposit() {
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
        lbDeposit = new javax.swing.JLabel();
        tfDepositAm = new javax.swing.JTextField();
        btDepositAmount = new javax.swing.JButton();
        lbAccNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Deposit");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel9.setBackground(new java.awt.Color(255, 102, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(500, 400));

        lbDeposit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDeposit.setForeground(new java.awt.Color(255, 255, 255));
        lbDeposit.setText("Deposit money into account:");

        tfDepositAm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfDepositAm.setForeground(new java.awt.Color(153, 153, 153));
        tfDepositAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDepositAmActionPerformed(evt);
            }
        });
        tfDepositAm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDepositAmKeyTyped(evt);
            }
        });

        btDepositAmount.setBackground(new java.awt.Color(153, 153, 153));
        btDepositAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btDepositAmount.setForeground(new java.awt.Color(255, 255, 255));
        btDepositAmount.setText("Deposit");
        btDepositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositAmountActionPerformed(evt);
            }
        });

        lbAccNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAccNo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbDeposit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAccNo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(tfDepositAm, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDepositAm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDepositAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDepositAmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDepositAmActionPerformed

    private void btDepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositAmountActionPerformed

          String SUrl,SBank,SPass,query;
        
        SUrl= "jdbc:MySQL://localhost:3306/java_crud_db";
     SBank= "root";
     SPass="";  
        
     
     try{
         
           Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(SUrl,SBank,SPass);
          Statement st = con.createStatement();
         
         
        if("".equals(tfDepositAm.getText()))
        {

            JOptionPane.showMessageDialog(new JFrame(),"Please enter amount to deposit ", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            
            String transactionType="Deposit";
             balance=balance+ Integer.parseInt(tfDepositAm.getText());
            int amount=Integer.parseInt(tfDepositAm.getText());
            
           //   BankAccount account = new BankAccount(idNo,cardNo,pin, accountType,declaration, atmCard, internet, mobile,email, cheque, statement);
            
          //  Statement stm = new Statement(cardNo,transactionType,balance,amount);
            
            
             query = "INSERT INTO statement(cardNo,transactionType,balance, amount)"+
                        "VALUES('"+cardNo+"', '"+ transactionType+"', '"+balance+"', '"+amount+"')";
             
                 st.execute(query);
                 
                 
                 JOptionPane.showMessageDialog(new JFrame(),"You have deposited amount: R "+amount);
            
            
           // Statement statement = new Statement(cardNo,transactionType,tfDepositAm.getText(),tfDepositAm.getText());
            
            

            
            Transaction TransactionFrame = new Transaction(cardNo);
            TransactionFrame.setVisible(true);
            TransactionFrame.pack();
            TransactionFrame.setLocationRelativeTo(null);//center
            this.dispose();

        }
     }
      catch(Exception e)
     {
        System.out.println("Error!"+e.getMessage());
     }
     
     
    }//GEN-LAST:event_btDepositAmountActionPerformed

    private void tfDepositAmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDepositAmKeyTyped
            char c = evt.getKeyChar();
        // TODO add your handling code here:
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfDepositAmKeyTyped

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
            java.util.logging.Logger.getLogger(FirstDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FirstDeposit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositAmount;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbAccNo;
    private javax.swing.JLabel lbDeposit;
    private javax.swing.JTextField tfDepositAm;
    // End of variables declaration//GEN-END:variables
}
