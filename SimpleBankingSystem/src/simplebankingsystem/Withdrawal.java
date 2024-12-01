/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simplebankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tshabalala MG
 */
public class Withdrawal extends javax.swing.JFrame {

   
   String cardNo;
    
    int notFound = 0;
    int balance;
    
     String SUrl,SBank,SPass,query;
    
    public Withdrawal(String cardNo) {
        initComponents();
        
        this.cardNo= cardNo;
        
       
        
         SUrl= "jdbc:MySQL://localhost:3306/java_crud_db";
         SBank= "root";
        SPass="";  
        
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
           
           lbMax.setText("Maximum withdrawal amount: R"+balance);
        }
        catch(Exception e)
        {
          System.out.println("Error!"+e.getMessage());
        
        }
       
    
        
        
    }

    private Withdrawal() {
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
        lbEnter = new javax.swing.JLabel();
        tfWithdraw = new javax.swing.JTextField();
        btBackWith = new javax.swing.JButton();
        btWithdrawAmount = new javax.swing.JButton();
        lbMax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Withdraw Money");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel9.setBackground(new java.awt.Color(255, 102, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(500, 400));

        lbEnter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEnter.setForeground(new java.awt.Color(255, 255, 255));
        lbEnter.setText("Enter the amount you want to withdraw");

        tfWithdraw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfWithdraw.setForeground(new java.awt.Color(153, 153, 153));
        tfWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWithdrawActionPerformed(evt);
            }
        });
        tfWithdraw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfWithdrawKeyTyped(evt);
            }
        });

        btBackWith.setBackground(new java.awt.Color(153, 153, 153));
        btBackWith.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btBackWith.setForeground(new java.awt.Color(255, 255, 255));
        btBackWith.setText("Back");
        btBackWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackWithActionPerformed(evt);
            }
        });

        btWithdrawAmount.setBackground(new java.awt.Color(153, 153, 153));
        btWithdrawAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btWithdrawAmount.setForeground(new java.awt.Color(255, 255, 255));
        btWithdrawAmount.setText("Withdraw");
        btWithdrawAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWithdrawAmountActionPerformed(evt);
            }
        });

        lbMax.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMax.setForeground(new java.awt.Color(255, 255, 255));
        lbMax.setText("Maximum Withdrawal is R 0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBackWith, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfWithdraw)
                        .addComponent(lbMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbMax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lbEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(btWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBackWith, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWithdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWithdrawActionPerformed

    private void btBackWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackWithActionPerformed
        Transaction TransactionFrame = new Transaction(cardNo);
        TransactionFrame.setVisible(true);
        TransactionFrame.pack();
        TransactionFrame.setLocationRelativeTo(null);//center
        this.dispose();
    }//GEN-LAST:event_btBackWithActionPerformed

    private void btWithdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWithdrawAmountActionPerformed

       
     
     
     try{
          Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SBank,SPass);
         java.sql.Statement st = con.createStatement(); 
         
        
        
       if("".equals(tfWithdraw.getText()))
               {
       
                JOptionPane.showMessageDialog(new JFrame(),"Please enter amount to withdraw", "Error",JOptionPane.ERROR_MESSAGE);
               }
       else{
           
           
            String transactionType="Withdraw";
            
            int amount=Integer.parseInt(tfWithdraw.getText());
            
         
            
            
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
           
           
           if(balance>0)
           {
            balance = balance - amount;
           
           
             query = "INSERT INTO statement(cardNo,transactionType,balance, amount)"+
                        "VALUES('"+cardNo+"', '"+ transactionType+"', '"+balance+"', '"+amount+"')";
             
                 st.execute(query);
                 
                 
                 JOptionPane.showMessageDialog(new JFrame(),"You have withdrawn amount : R"+amount);
           
           
          Transaction TransactionFrame = new Transaction(cardNo);
        TransactionFrame.setVisible(true);
        TransactionFrame.pack();
        TransactionFrame.setLocationRelativeTo(null);//center
        this.dispose();
           }
           else
           {
                JOptionPane.showMessageDialog(new JFrame(),"Declined!!Insuficient funds"+amount, "Error",JOptionPane.ERROR_MESSAGE);
               
               
           }
          
       
       }
     }
      catch(Exception e)
     {
        System.out.println("Error!"+e.getMessage());
     }



      
    }//GEN-LAST:event_btWithdrawAmountActionPerformed

    private void tfWithdrawKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWithdrawKeyTyped
        char c = evt.getKeyChar();
        // TODO add your handling code here:
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfWithdrawKeyTyped

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
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Withdrawal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackWith;
    private javax.swing.JButton btWithdrawAmount;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbEnter;
    private javax.swing.JLabel lbMax;
    private javax.swing.JTextField tfWithdraw;
    // End of variables declaration//GEN-END:variables
}