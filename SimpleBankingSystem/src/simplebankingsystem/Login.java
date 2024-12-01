

package simplebankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author SuperiorAuto
 */
public class Login extends javax.swing.JFrame {

    
    
    String cardNo;
    
    public Login(String cardNo) {
        initComponents();
        
        this.cardNo=cardNo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        lbWelcome = new javax.swing.JLabel();
        tfCardNumber = new javax.swing.JTextField();
        lbCardNumber = new javax.swing.JLabel();
        lbPinNo = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        btSignIn = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btSignUp = new javax.swing.JButton();
        lbIDontHave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automated Teller Machine");
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        LEFT.setBackground(new java.awt.Color(255, 102, 51));
        LEFT.setMinimumSize(new java.awt.Dimension(450, 700));
        LEFT.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MY BANK");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bank.png"))); // NOI18N

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jPanel1.add(LEFT);
        LEFT.setBounds(0, 0, 450, 700);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(450, 700));

        lbWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbWelcome.setForeground(new java.awt.Color(255, 102, 51));
        lbWelcome.setText("WELCOME TO MY ATM");

        tfCardNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfCardNumber.setForeground(new java.awt.Color(102, 102, 102));
        tfCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCardNumberActionPerformed(evt);
            }
        });
        tfCardNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCardNumberKeyTyped(evt);
            }
        });

        lbCardNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbCardNumber.setForeground(new java.awt.Color(102, 102, 102));
        lbCardNumber.setText("Card No");

        lbPinNo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbPinNo.setForeground(new java.awt.Color(102, 102, 102));
        lbPinNo.setText("Pin ");

        tfPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfPass.setForeground(new java.awt.Color(102, 102, 102));
        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });
        tfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPassKeyTyped(evt);
            }
        });

        btSignIn.setBackground(new java.awt.Color(255, 102, 51));
        btSignIn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btSignIn.setText("Sign In");
        btSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignInActionPerformed(evt);
            }
        });

        btClear.setBackground(new java.awt.Color(255, 102, 51));
        btClear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btClear.setForeground(new java.awt.Color(255, 255, 255));
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btSignUp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btSignUp.setForeground(new java.awt.Color(255, 0, 51));
        btSignUp.setText("Sign Up");
        btSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignUpActionPerformed(evt);
            }
        });

        lbIDontHave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIDontHave.setText("I don't have an account");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPinNo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCardNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RightLayout.createSequentialGroup()
                                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RightLayout.createSequentialGroup()
                                            .addComponent(btSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31))
                                        .addComponent(lbIDontHave, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbWelcome)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbWelcome)
                .addGap(43, 43, 43)
                .addComponent(lbCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPinNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSignUp)
                    .addComponent(lbIDontHave))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(450, 0, 470, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCardNumberActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void btSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignInActionPerformed
       
         String cardNo,pin;
        
        String SUrl,SBank,SPass,query,pinDB = null;
     
     SUrl= "jdbc:MySQL://localhost:3306/java_crud_db";
     SBank= "root";
     SPass="";  
     int notFound = 0;
     
     
     try
     {
         
           Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(SUrl,SBank,SPass);
          Statement st = con.createStatement(); 
          
          if("".equals(tfCardNumber.getText()))
          {
            JOptionPane.showMessageDialog(new JFrame(),"Please enter your card number ", "Error",JOptionPane.ERROR_MESSAGE);
          }
          else if("".equals(tfPass.getText())){
              
           JOptionPane.showMessageDialog(new JFrame(),"Please enter your PIN", "Error",JOptionPane.ERROR_MESSAGE);

          
          
          }
          else
          {
              
              cardNo = tfCardNumber.getText();
              pin = tfPass.getText();
              
              query = "SELECT * FROM bankaccount WHERE cardNo="+cardNo;
              
              ResultSet rs = st.executeQuery(query);
              
              while(rs.next()){
                
                  pinDB = rs.getString("pin");
                  notFound = 1;
              }
              
              if(notFound == 1 && pin.equals(pinDB)){
                  
                    Transaction TransactionFrame = new Transaction(cardNo);
              TransactionFrame.setVisible(true);
              
              TransactionFrame.pack();
             TransactionFrame.setLocationRelativeTo(null);//center
          this.dispose();
                  
              }
              else{
                  
                   JOptionPane.showMessageDialog(new JFrame(),"Incorrect email or pin", "Error",JOptionPane.ERROR_MESSAGE);
              
              }
              
        
        
        
             
              tfPass.setText("");
        
            
          }
     }
      catch(Exception e)
     {
        System.out.println("Error!"+e.getMessage());
     }
     
    }//GEN-LAST:event_btSignInActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
           
        tfCardNumber.setText("");
        tfPass.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void btSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignUpActionPerformed
        
          SignUp SignUpFrame = new SignUp();
         SignUpFrame.setVisible(true);
          SignUpFrame.pack();
          SignUpFrame.setLocationRelativeTo(null);//center
          this.dispose();
        
    }//GEN-LAST:event_btSignUpActionPerformed

    private void tfCardNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCardNumberKeyTyped
        // TODO add your handling code here:
        
          char c = evt.getKeyChar();
        // TODO add your handling code here:
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfCardNumberKeyTyped

    private void tfPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPassKeyTyped
        // TODO add your handling code here:
        
          char c = evt.getKeyChar();
        // TODO add your handling code here:
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfPassKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btSignIn;
    private javax.swing.JButton btSignUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCardNumber;
    private javax.swing.JLabel lbIDontHave;
    private javax.swing.JLabel lbPinNo;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JTextField tfCardNumber;
    private javax.swing.JPasswordField tfPass;
    // End of variables declaration//GEN-END:variables
}
