/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.adhoccom.atbank;

import com.adhoccom.atbank.Main.Account;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.extras.FlatSVGIcon.ColorFilter;
import javax.swing.JOptionPane;


/**
 *
 * @author dermh
 */
public class Home extends javax.swing.JFrame {

    private Account account;

    /**
     * Creates new form Home
     *
     * @param account
     */
    public Home(Account account) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
            javax.swing.UIManager.put("Button.arc", 15);
            javax.swing.UIManager.put("Component.arc", 15);
            javax.swing.UIManager.put("ProgressBar.arc", 999);
            javax.swing.UIManager.put("TextComponent.arc", 15);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        this.account = account;

        initComponents();

        nameLabel.setText(account.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBarPanel = new javax.swing.JPanel();
        appLabel = new javax.swing.JLabel();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        checkBalanceButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();
        greetingPanel = new javax.swing.JPanel();
        greetingLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        contentsPanel = new javax.swing.JPanel();
        withdrawPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        transferPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        checkBalancePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        depositPanel = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Deposit = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Cancle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATBank");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Kanit", 0, 10)); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/credit-card-24.png")).getImage());

        sideBarPanel.setBackground(new java.awt.Color(102, 0, 204));

        appLabel.setFont(new java.awt.Font("Kanit", 1, 18)); // NOI18N
        appLabel.setForeground(new java.awt.Color(255, 255, 255));
        appLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/credit-card-24.png"))); // NOI18N
        appLabel.setText("ATBank");

        depositButton.setText("ฝาก");
        depositButton.setActionCommand("ฝาก");
        depositButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setText("ถอน");
        withdrawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        transferButton.setText("โอน");
        transferButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        checkBalanceButton.setText("เช็คยอด");
        checkBalanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalanceButtonActionPerformed(evt);
            }
        });

        signOutButton.setForeground(new java.awt.Color(255, 153, 0));
        signOutButton.setIcon(new FlatSVGIcon("com/adhoccom/atbank/icons/arrow-alt-circle-left.svg", 16, 16).setColorFilter(new ColorFilter(color -> new java.awt.Color(255, 153, 0)))
        );
        signOutButton.setText("ออกจากระบบ");
        signOutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        signOutButton.setContentAreaFilled(false);
        signOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        greetingPanel.setBackground(new java.awt.Color(102, 0, 204));
        greetingPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        greetingLabel.setForeground(new java.awt.Color(255, 255, 255));
        greetingLabel.setText("ยินดีต้อนรับคุณ");
        greetingPanel.add(greetingLabel);

        nameLabel.setFont(new java.awt.Font("Kanit", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        greetingPanel.add(nameLabel);

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBalanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greetingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(appLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greetingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(sideBarPanel, java.awt.BorderLayout.LINE_START);

        contentsPanel.setLayout(new java.awt.CardLayout());

        withdrawPanel.setBackground(new java.awt.Color(241, 243, 249));

        jLabel2.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        jLabel2.setText("| ถอน");

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        contentsPanel.add(withdrawPanel, "withdraw");

        transferPanel.setBackground(new java.awt.Color(241, 243, 249));

        jLabel3.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        jLabel3.setText("| โอน");

        javax.swing.GroupLayout transferPanelLayout = new javax.swing.GroupLayout(transferPanel);
        transferPanel.setLayout(transferPanelLayout);
        transferPanelLayout.setHorizontalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        transferPanelLayout.setVerticalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        contentsPanel.add(transferPanel, "transfer");

        checkBalancePanel.setBackground(new java.awt.Color(241, 243, 249));

        jLabel4.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        jLabel4.setText("| เช็คยอด");

        javax.swing.GroupLayout checkBalancePanelLayout = new javax.swing.GroupLayout(checkBalancePanel);
        checkBalancePanel.setLayout(checkBalancePanelLayout);
        checkBalancePanelLayout.setHorizontalGroup(
            checkBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBalancePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        checkBalancePanelLayout.setVerticalGroup(
            checkBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBalancePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        contentsPanel.add(checkBalancePanel, "checkBalance");

        depositPanel.setBackground(new java.awt.Color(204, 204, 255));

        Header.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Header.setText("| ฝากเงิน ");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("กรอกจำนวนเงินที่ต้องการฝาก");

        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        Enter.setBackground(new java.awt.Color(105, 177, 144));
        Enter.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Enter.setForeground(new java.awt.Color(255, 255, 255));
        Enter.setText("ยืนยัน");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Cancle.setBackground(new java.awt.Color(233, 143, 143));
        Cancle.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Cancle.setForeground(new java.awt.Color(255, 255, 255));
        Cancle.setText("ยกเลิก");
        Cancle.setActionCommand("ยกเลิก");
        Cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Header))
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Header)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        contentsPanel.add(depositPanel, "deposit");

        getContentPane().add(contentsPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) contentsPanel.getLayout();
        card.show(contentsPanel, "withdraw");
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) contentsPanel.getLayout();
        card.show(contentsPanel, "transfer");
    }//GEN-LAST:event_transferButtonActionPerformed

    private void checkBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalanceButtonActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) contentsPanel.getLayout();
        card.show(contentsPanel, "checkBalance");
    }//GEN-LAST:event_checkBalanceButtonActionPerformed

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Authentication().setVisible(true);
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) contentsPanel.getLayout();
        card.show(contentsPanel, "deposit");
    }//GEN-LAST:event_depositButtonActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        JOptionPane.showMessageDialog(this, "ยืนยันจำนวนเงินที่ต้องการฝาก" +  Deposit.getText());
    }//GEN-LAST:event_EnterActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        try {
            // แปลงค่าจำนวนเงินจาก text field เป็นตัวเลข
            double depositAmount = Double.parseDouble(Deposit.getText());
            // ตรวจสอบว่าจำนวนเงินฝากเป็นบวก
            if (depositAmount > 0) {
                // เรียกใช้เมธอดใน Account เพื่อเพิ่มยอดเงิน
                account.deposit(depositAmount);
                // แสดงข้อความยืนยัน
                JOptionPane.showMessageDialog(this, "ฝากเงินจำนวน " + depositAmount + " สำเร็จแล้ว");
            } else {
                // แสดงข้อความแจ้งเตือนหากจำนวนเงินไม่ถูกต้อง
                JOptionPane.showMessageDialog(this, "กรุณากรอกจำนวนเงินที่ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // แสดงข้อความแจ้งเตือนหากกรอกข้อมูลไม่ถูกต้อง
            JOptionPane.showMessageDialog(this, "กรุณากรอกจำนวนเงินที่ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DepositActionPerformed

    private void CancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleActionPerformed
        Deposit.setText("");
    }//GEN-LAST:event_CancleActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancle;
    private javax.swing.JTextField Deposit;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel appLabel;
    private javax.swing.JButton checkBalanceButton;
    private javax.swing.JPanel checkBalancePanel;
    private javax.swing.JPanel contentsPanel;
    private javax.swing.JButton depositButton;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JLabel greetingLabel;
    private javax.swing.JPanel greetingPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton transferButton;
    private javax.swing.JPanel transferPanel;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}