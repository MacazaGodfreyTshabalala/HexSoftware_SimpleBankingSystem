/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simplebankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tshabalala MG
 */
public class ChangePin extends javax.swing.JFrame {

   
    
    String cardNo;
    String pinDB;
    
    public ChangePin(String cardNo) {
        initComponents();
                
         this.cardNo = cardNo;
    }

    private ChangePin() {
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
        lbNewPin = new javax.swing.JLabel();
        tfNewPin = new javax.swing.JTextField();
        btBackPin = new javax.swing.JButton();
        btChange = new javax.swing.JButton();
        lbChange = new javax.swing.JLabel();
        lbReNePin = new javax.swing.JLabel();
        tfReNewPin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Your Pin");

        jPanel9.setBackground(new java.awt.Color(255, 102, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(500, 400));

        lbNewPin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNewPin.setForeground(new java.awt.Color(255, 255, 255));
        lbNewPin.setText("New Pin");

        tfNewPin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNewPin.setForeground(new java.awt.Color(153, 153, 153));
        tfNewPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNewPinActionPerformed(evt);
            }
        });
        tfNewPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNewPinKeyTyped(evt);
            }
        });

        btBackPin.setBackground(new java.awt.Color(153, 153, 153));
        btBackPin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btBackPin.setForeground(new java.awt.Color(255, 255, 255));
        btBackPin.setText("Back");
        btBackPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackPinActionPerformed(evt);
            }
        });

        btChange.setBackground(new java.awt.Color(153, 153, 153));
        btChange.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btChange.setForeground(new java.awt.Color(255, 255, 255));
        btChange.setText("Change");
        btChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangeActionPerformed(evt);
            }
        });

        lbChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbChange.setForeground(new java.awt.Color(255, 255, 255));
        lbChange.setText("Change You Pin");

        lbReNePin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbReNePin.setForeground(new java.awt.Color(255, 255, 255));
        lbReNePin.setText("Re-Enter New Pin");

        tfReNewPin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfReNewPin.setForeground(new java.awt.Color(153, 153, 153));
        tfReNewPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfReNewPinActionPerformed(evt);
            }
        });
        tfReNewPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfReNewPinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lbChange))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btBackPin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btChange, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(lbNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(lbReNePin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfReNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfReNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReNePin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBackPin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNewPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNewPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNewPinActionPerformed

    private void btBackPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackPinActionPerformed
        Transaction TransactionFrame = new Transaction(cardNo);
        TransactionFrame.setVisible(true);
        TransactionFrame.pack();
        TransactionFrame.setLocationRelativeTo(null);//center
        this.dispose();
    }//GEN-LAST:event_btBackPinActionPerformed

    private void btChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChangeActionPerformed
       
              String SUrl,SBank,SPass,query;
     
     SUrl= "jdbc:MySQL://localhost:3306/java_crud_db";
     SBank= "root";
     SPass="";  
     
        try
     {
         
           Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(SUrl,SBank,SPass);
          java.sql.Statement st = con.createStatement(); 
          
              
              
              query = "SELECT * FROM bankaccount WHERE cardNo="+cardNo;
              
              ResultSet rs = st.executeQuery(query);
              
              while(rs.next()){
                  
                  
                
                 pinDB = rs.getString("pin");
                 
                 
                
                 String newPin,reNewPin;
                 
                 
                 newPin = tfNewPin.getText();
                 reNewPin = tfReNewPin.getText();
                 
                 
          if("".equals(newPin))
          {
            JOptionPane.showMessageDialog(new JFrame(),"Pin is required", "Error",JOptionPane.ERROR_MESSAGE);
         
          }
          else if("".equals(reNewPin))
          {
              JOptionPane.showMessageDialog(new JFrame(),"Please re-enter pin", "Error",JOptionPane.ERROR_MESSAGE);
          }
          else
          {
              
                  if(!(newPin.equals(reNewPin)))
                  {
                      
                       JOptionPane.showMessageDialog(new JFrame(),"Please make sure the new pin matches re-enter pin", "Error",JOptionPane.ERROR_MESSAGE);
                  
                  }
                  else
                  { 
                      
                         if(pinDB.equals(reNewPin))
                         {
                             
                              JOptionPane.showMessageDialog(new JFrame(),"Please make sure new pin is not same as old", "Error",JOptionPane.ERROR_MESSAGE);
                  
                         
                         }
                         else
                         {
                             
                             
                               query = "UPDATE bankaccount SET pin='"+reNewPin+"'  WHERE cardNO = "+cardNo;
                               
                               
                               st.execute(query);
                               
                               
                               JOptionPane.showMessageDialog(new JFrame(),"Pin successfully changed!!");
                             
                             
                             
                                    Transaction TransactionFrame = new Transaction(cardNo);
                                    TransactionFrame.setVisible(true);
                                   TransactionFrame.pack();
                               TransactionFrame.setLocationRelativeTo(null);//center
                               this.dispose(); 
                             
                             
                         
                         }
                  
                  
                  }
              
              
              
          }
                 
                 
                 
                     
                 
                 
                 
                 
            
                 
                 
                   


                   
              
                  }
              
         
              
             
              
              
     }
                  
                   
                  
    
       catch(Exception e)
     {
        System.out.println("Error!"+e.getMessage());
     }
     
        
        
      
    }//GEN-LAST:event_btChangeActionPerformed

    private void tfReNewPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfReNewPinActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tfReNewPinActionPerformed

    private void tfNewPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNewPinKeyTyped
        // TODO add your handling code here:
        
            char c = evt.getKeyChar();
        // TODO add your handling code here:
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfNewPinKeyTyped

    private void tfReNewPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfReNewPinKeyTyped
        // TODO add your handling code here:
        
            char c = evt.getKeyChar();
        // TODO add your handling code here:
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfReNewPinKeyTyped

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
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackPin;
    private javax.swing.JButton btChange;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbChange;
    private javax.swing.JLabel lbNewPin;
    private javax.swing.JLabel lbReNePin;
    private javax.swing.JTextField tfNewPin;
    private javax.swing.JTextField tfReNewPin;
    // End of variables declaration//GEN-END:variables
}
