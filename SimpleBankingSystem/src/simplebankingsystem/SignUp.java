

package simplebankingsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SuperiorAuto
 */
public class SignUp extends javax.swing.JFrame {
    
    int formNo =1110;

 
    public SignUp() {
        initComponents();
        
         lbApplication.setText("APPLICATION FORM NO. "+formNo);
   
    }
    
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGender = new javax.swing.ButtonGroup();
        bgMarital = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        lbApplication = new javax.swing.JLabel();
        lbPage1 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        lbName1 = new javax.swing.JLabel();
        tfDOB = new javax.swing.JTextField();
        lbDOB = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbMarital = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        lbAddress = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        rbSingle = new javax.swing.JRadioButton();
        rbMarried = new javax.swing.JRadioButton();
        rbOther = new javax.swing.JRadioButton();
        tfCity = new javax.swing.JTextField();
        lbAddress1 = new javax.swing.JLabel();
        tfProvince = new javax.swing.JTextField();
        lbAddress2 = new javax.swing.JLabel();
        tfCode = new javax.swing.JTextField();
        lbAddress3 = new javax.swing.JLabel();
        btNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Account Application Form");
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(255, 102, 51));

        LEFT.setBackground(new java.awt.Color(255, 102, 51));
        LEFT.setPreferredSize(new java.awt.Dimension(450, 700));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bank.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MY BANK");

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Left);
        Left.setBounds(0, 0, 450, 700);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(450, 700));
        Right.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RightKeyTyped(evt);
            }
        });

        lbApplication.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbApplication.setForeground(new java.awt.Color(255, 102, 51));
        lbApplication.setText("APPLICATION FORM NO. 1111");

        lbPage1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPage1.setForeground(new java.awt.Color(255, 102, 51));
        lbPage1.setText("Page 1: Personal Details");

        lbName.setBackground(new java.awt.Color(153, 153, 153));
        lbName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbName.setForeground(new java.awt.Color(102, 102, 102));
        lbName.setText("Name");

        tfName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfName.setForeground(new java.awt.Color(102, 102, 102));
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNameKeyTyped(evt);
            }
        });

        tfSurname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfSurname.setForeground(new java.awt.Color(102, 102, 102));
        tfSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSurnameActionPerformed(evt);
            }
        });
        tfSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSurnameKeyTyped(evt);
            }
        });

        lbName1.setBackground(new java.awt.Color(153, 153, 153));
        lbName1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbName1.setForeground(new java.awt.Color(102, 102, 102));
        lbName1.setText("Surname");

        tfDOB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfDOB.setForeground(new java.awt.Color(102, 102, 102));
        tfDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDOBActionPerformed(evt);
            }
        });
        tfDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDOBKeyTyped(evt);
            }
        });

        lbDOB.setBackground(new java.awt.Color(153, 153, 153));
        lbDOB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbDOB.setForeground(new java.awt.Color(102, 102, 102));
        lbDOB.setText("Date of Birth");

        lbGender.setBackground(new java.awt.Color(153, 153, 153));
        lbGender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbGender.setForeground(new java.awt.Color(102, 102, 102));
        lbGender.setText("Gender");

        lbEmail.setBackground(new java.awt.Color(153, 153, 153));
        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(102, 102, 102));
        lbEmail.setText("Email");

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(102, 102, 102));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        lbMarital.setBackground(new java.awt.Color(153, 153, 153));
        lbMarital.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbMarital.setForeground(new java.awt.Color(102, 102, 102));
        lbMarital.setText("Marital Status");

        tfAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAddress.setForeground(new java.awt.Color(102, 102, 102));
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        lbAddress.setBackground(new java.awt.Color(153, 153, 153));
        lbAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbAddress.setForeground(new java.awt.Color(102, 102, 102));
        lbAddress.setText("Address");

        rbMale.setBackground(new java.awt.Color(255, 255, 255));
        bgGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMale.setForeground(new java.awt.Color(102, 102, 102));
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rbFemale.setBackground(new java.awt.Color(255, 255, 255));
        bgGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(102, 102, 102));
        rbFemale.setText("Female");

        rbSingle.setBackground(new java.awt.Color(255, 255, 255));
        bgMarital.add(rbSingle);
        rbSingle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbSingle.setForeground(new java.awt.Color(102, 102, 102));
        rbSingle.setText("Single");
        rbSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSingleActionPerformed(evt);
            }
        });

        rbMarried.setBackground(new java.awt.Color(255, 255, 255));
        bgMarital.add(rbMarried);
        rbMarried.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMarried.setForeground(new java.awt.Color(102, 102, 102));
        rbMarried.setText("Married");
        rbMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMarriedActionPerformed(evt);
            }
        });

        rbOther.setBackground(new java.awt.Color(255, 255, 255));
        bgMarital.add(rbOther);
        rbOther.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbOther.setForeground(new java.awt.Color(102, 102, 102));
        rbOther.setText("Other");

        tfCity.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfCity.setForeground(new java.awt.Color(102, 102, 102));
        tfCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCityActionPerformed(evt);
            }
        });
        tfCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCityKeyTyped(evt);
            }
        });

        lbAddress1.setBackground(new java.awt.Color(153, 153, 153));
        lbAddress1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbAddress1.setForeground(new java.awt.Color(102, 102, 102));
        lbAddress1.setText("City");

        tfProvince.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfProvince.setForeground(new java.awt.Color(102, 102, 102));
        tfProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProvinceActionPerformed(evt);
            }
        });
        tfProvince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfProvinceKeyTyped(evt);
            }
        });

        lbAddress2.setBackground(new java.awt.Color(153, 153, 153));
        lbAddress2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbAddress2.setForeground(new java.awt.Color(102, 102, 102));
        lbAddress2.setText("Province");

        tfCode.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfCode.setForeground(new java.awt.Color(102, 102, 102));
        tfCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodeActionPerformed(evt);
            }
        });
        tfCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodeKeyTyped(evt);
            }
        });

        lbAddress3.setBackground(new java.awt.Color(153, 153, 153));
        lbAddress3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbAddress3.setForeground(new java.awt.Color(102, 102, 102));
        lbAddress3.setText("Code");

        btNext.setBackground(new java.awt.Color(255, 102, 51));
        btNext.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btNext.setForeground(new java.awt.Color(255, 255, 255));
        btNext.setText("Next...");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName1)
                            .addComponent(lbName)
                            .addComponent(lbDOB)
                            .addComponent(lbGender)
                            .addComponent(lbEmail)
                            .addComponent(lbMarital)
                            .addComponent(lbAddress)
                            .addComponent(lbAddress1)
                            .addComponent(lbAddress2)
                            .addComponent(lbAddress3))
                        .addGap(18, 18, 18)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(tfDOB, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfName)
                                .addComponent(tfAddress)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RightLayout.createSequentialGroup()
                                    .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfCity)
                                .addComponent(tfProvince)
                                .addComponent(tfCode))
                            .addGroup(RightLayout.createSequentialGroup()
                                .addComponent(rbSingle)
                                .addGap(26, 26, 26)
                                .addComponent(rbMarried, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbOther, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbApplication))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbPage1)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbApplication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPage1)
                .addGap(18, 18, 18)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName1)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDOB)
                    .addComponent(tfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(22, 22, 22)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarital)
                    .addComponent(rbSingle)
                    .addComponent(rbMarried)
                    .addComponent(rbOther))
                .addGap(22, 22, 22)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress1)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress2)
                    .addComponent(tfProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress3)
                    .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(450, 10, 450, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSurnameActionPerformed

    private void tfDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDOBActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSingleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSingleActionPerformed

    private void rbMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMarriedActionPerformed

    private void tfCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCityActionPerformed

    private void tfProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProvinceActionPerformed

    private void tfCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodeActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed

          String selectedGender,selectedMarital ;
        
        
        
         if("".equals(tfName.getText()))
          {
            JOptionPane.showMessageDialog(new JFrame(),"Name is required", "Error",JOptionPane.ERROR_MESSAGE);
         
          }
         else if("".equals(tfSurname.getText()))    
         {
             JOptionPane.showMessageDialog(new JFrame(),"Surname is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }
           else if("".equals(tfDOB.getText()))    
         {
             JOptionPane.showMessageDialog(new JFrame(),"Date of birth is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }
             else if(!(rbMale.isSelected() || rbFemale.isSelected()))    
         {
             JOptionPane.showMessageDialog(new JFrame(),"Gender is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }
               else if("".equals(tfEmail.getText()))    
         {
             JOptionPane.showMessageDialog(new JFrame(),"Email address is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }
                else if(!(rbSingle.isSelected() || rbMarried.isSelected() || rbOther.isSelected()))    
         {
             JOptionPane.showMessageDialog(new JFrame(),"Marital Status is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }
                     else if("".equals(tfAddress.getText())) 
         {
             JOptionPane.showMessageDialog(new JFrame(),"Address is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }  
                                else if("".equals(tfCity.getText())) 
         {
             JOptionPane.showMessageDialog(new JFrame(),"City is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }  
                                                      else if("".equals(tfProvince.getText())) 
         {
             JOptionPane.showMessageDialog(new JFrame(),"Province is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }  
         else if("".equals(tfCode.getText())) 
         {
             JOptionPane.showMessageDialog(new JFrame(),"Code is required", "Error",JOptionPane.ERROR_MESSAGE);
         
         }  
         else
         {
             
            
              
              
              
                   if(rbMale.isSelected())
                   {
                       selectedGender = "Male";
                   }
                   else
                   {
                        selectedGender = "Female";
                       
                   }
                   
                   if(rbSingle.isSelected())
                   {
                       selectedMarital = "Single";
                   }
                   else if(rbMarried.isSelected())
                   {
                       selectedMarital = "Married";
                   }
                   else 
                   {
                       selectedMarital = "Other";
                       
                   }
                   
                    
                   
                      
              SignUpPg2 SignUpPg2Frame = new SignUpPg2(tfName.getText(),tfSurname.getText(),tfDOB.getText(),selectedGender,tfEmail.getText(),selectedMarital,tfAddress.getText(),tfCity.getText(),tfProvince.getText()
                 ,tfCode.getText(),formNo);
            SignUpPg2Frame.setVisible(true);
           SignUpPg2Frame.pack();
             SignUpPg2Frame.setLocationRelativeTo(null);//center
          this.dispose();
         
         }
        
       
        //int dob = Integer.parseInt( tfDOB.getText());
       // String gender = bgGender.getSelection().getActionCommand();
        
//       String maritalStatus = bgMarital.getSelection().getActionCommand();
      
    
       // int code = Integer.parseInt(tfCode.getText());
         
        
        
        //newCustomer = new Customer();
        
          
       
        
    }//GEN-LAST:event_btNextActionPerformed

    private void tfCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyTyped
        char c = evt.getKeyChar();
        // TODO add your handling code here:
        
         if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfCodeKeyTyped

    private void tfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyTyped
        // TODO add your handling code here:
        
          char c = evt.getKeyChar();
        // TODO add your handling code here:
        
         if(Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfNameKeyTyped

    private void tfSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSurnameKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
         if(Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfSurnameKeyTyped

    private void tfDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDOBKeyTyped
       
    }//GEN-LAST:event_tfDOBKeyTyped

    private void tfCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCityKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
         if(Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfCityKeyTyped

    private void RightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RightKeyTyped
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
         if(Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_RightKeyTyped

    private void tfProvinceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProvinceKeyTyped
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
         if(Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfProvinceKeyTyped

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.ButtonGroup bgMarital;
    private javax.swing.JButton btNext;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbAddress1;
    private javax.swing.JLabel lbAddress2;
    private javax.swing.JLabel lbAddress3;
    private javax.swing.JLabel lbApplication;
    private javax.swing.JLabel lbDOB;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbMarital;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    private javax.swing.JLabel lbPage1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbMarried;
    private javax.swing.JRadioButton rbOther;
    private javax.swing.JRadioButton rbSingle;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfDOB;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfProvince;
    private javax.swing.JTextField tfSurname;
    // End of variables declaration//GEN-END:variables
}
