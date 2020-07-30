/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExchangeRates;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Exchanges extends javax.swing.JFrame {

    
    double poundsAmount  = 0.81;
    double euroAmount = 0.90;
    double ghanaCedi  = 5.77;
    double bitcoin = 0.00010;
    Scanner input  = new Scanner(System.in);
    String amount;
    /**
     * Creates new form Exchanges
     */
    public Exchanges() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextDisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextDisplay2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 390, 320));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(390, 300));
        setMinimumSize(new java.awt.Dimension(390, 300));
        setPreferredSize(new java.awt.Dimension(390, 320));
        setResizable(false);
        setSize(new java.awt.Dimension(390, 320));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExchangeRates/principles-of-macroeconomics-exchange-rate-determination-and-conversion-across-countries_102161.jpg"))); // NOI18N
        jLabel1.setText("   CURRENCY CONVERTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-150, -40, 540, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Enter Amount:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 67, 95, 27);

        jTextDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDisplay);
        jTextDisplay.setBounds(23, 101, 95, 34);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(157, 78, 89, 25);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(157, 110, 89, 25);

        jTextDisplay2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextDisplay2);
        jTextDisplay2.setBounds(276, 99, 92, 36);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Currency From:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 188, 95, 21);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Currency To");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(276, 188, 92, 20);

        jComboBox1.setBackground(new java.awt.Color(0, 102, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US DOLLARS", "POUNDS", "EUROS", "GHANA CEDIS", "BITCOIN" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(23, 210, 95, 19);

        jComboBox2.setBackground(new java.awt.Color(204, 204, 0));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setMaximumRowCount(5);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US DOLLARS", "POUNDS", "EUROS", "GHANA CEDIS", "BITCOIN" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(276, 210, 92, 19);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(167, 254, 67, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExchangeRates/dynamic-currency-conversion.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 390, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDisplayActionPerformed
        
        amount = input.nextLine();
        jTextDisplay.setText(amount);
    }//GEN-LAST:event_jTextDisplayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          double US_DOLLAR = Double.parseDouble(jTextDisplay.getText());
     if (jComboBox1.getSelectedItem().equals("US DOLLARS"))  
     {
         if(jComboBox2.getSelectedItem().equals("US DOLLARS"))
         {
         String conversion1 = String.format("$ %.2f", US_DOLLAR * 1);
         jTextDisplay2.setText(conversion1);
         }
         else if(jComboBox2.getSelectedItem().equals("POUNDS"))
         {
         String conversion1 = String.format("£ %.2f", US_DOLLAR * poundsAmount);
         jTextDisplay2.setText(conversion1);
         } 
          else if(jComboBox2.getSelectedItem().equals("EUROS"))
         {
         String conversion1 = String.format("€ %.2f", US_DOLLAR * euroAmount);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("GHANA CEDIS"))
         {
         String conversion1 = String.format("GHC %.2f", US_DOLLAR * ghanaCedi);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("BITCOIN"))
         {
         String conversion1 = String.format("BTC %.2f", US_DOLLAR * bitcoin);
         jTextDisplay2.setText(conversion1);
         }  
     }
     if (jComboBox1.getSelectedItem().equals("POUNDS"))  
     {
         if(jComboBox2.getSelectedItem().equals("US DOLLARS"))
         {
         String conversion1 = String.format("$ %.2f", US_DOLLAR/poundsAmount);
         jTextDisplay2.setText(conversion1);
         }
         else if(jComboBox2.getSelectedItem().equals("POUNDS"))
         {
         String conversion1 = String.format("£ %.2f", US_DOLLAR * 1);
         jTextDisplay2.setText(conversion1);
         } 
          else if(jComboBox2.getSelectedItem().equals("EUROS"))
         {
         String conversion1 = String.format("€ %.2f", (US_DOLLAR/poundsAmount) * euroAmount);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("GHANA CEDIS"))
         {
         String conversion1 = String.format("GHC %.2f", (US_DOLLAR/poundsAmount) * ghanaCedi);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("BITCOIN"))
         {
         String conversion1 = String.format("BTC %.2f", (US_DOLLAR/poundsAmount) * bitcoin);
         jTextDisplay2.setText(conversion1);
         }  
     }
     
     if (jComboBox1.getSelectedItem().equals("EUROS"))  
     {
         if(jComboBox2.getSelectedItem().equals("US DOLLARS"))
         {
         String conversion1 = String.format("$ %.2f", US_DOLLAR/euroAmount);
         jTextDisplay2.setText(conversion1);
         }
         else if(jComboBox2.getSelectedItem().equals("POUNDS"))
         {
         String conversion1 = String.format("£ %.2f", (US_DOLLAR/euroAmount) * poundsAmount);
         jTextDisplay2.setText(conversion1);
         } 
          else if(jComboBox2.getSelectedItem().equals("EUROS"))
         {
         String conversion1 = String.format("€ %.2f", US_DOLLAR * 1);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("GHANA CEDIS"))
         {
         String conversion1 = String.format("GHC %.2f", (US_DOLLAR/euroAmount) * ghanaCedi);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("BITCOIN"))
         {
         String conversion1 = String.format("BTC %.2f", (US_DOLLAR/euroAmount) * bitcoin);
         jTextDisplay2.setText(conversion1);
         }  
     }
     
     if (jComboBox1.getSelectedItem().equals("GHANA CEDIS"))  
     {
         if(jComboBox2.getSelectedItem().equals("US DOLLARS"))
         {
         String conversion1 = String.format("$ %.2f", US_DOLLAR/ghanaCedi);
         jTextDisplay2.setText(conversion1);
         }
         else if(jComboBox2.getSelectedItem().equals("POUNDS"))
         {
         String conversion1 = String.format("£ %.2f", (US_DOLLAR/ghanaCedi) * poundsAmount);
         jTextDisplay2.setText(conversion1);
         } 
          else if(jComboBox2.getSelectedItem().equals("EUROS"))
         {
         String conversion1 = String.format("€ %.2f", (US_DOLLAR/ghanaCedi) * euroAmount);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("GHANA CEDIS"))
         {
         String conversion1 = String.format("GHC %.2f", US_DOLLAR * 1);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("BITCOIN"))
         {
         String conversion1 = String.format("BTC %.2f", (US_DOLLAR/ghanaCedi) * bitcoin);
         jTextDisplay2.setText(conversion1);
         }  
     }
     
     if (jComboBox1.getSelectedItem().equals("BITCOIN"))  
     {
         if(jComboBox2.getSelectedItem().equals("US DOLLARS"))
         {
         String conversion1 = String.format("$ %.2f", US_DOLLAR/bitcoin);
         jTextDisplay2.setText(conversion1);
         }
         else if(jComboBox2.getSelectedItem().equals("POUNDS"))
         {
         String conversion1 = String.format("£ %.2f", (US_DOLLAR/bitcoin) * poundsAmount);
         jTextDisplay2.setText(conversion1);
         } 
          else if(jComboBox2.getSelectedItem().equals("EUROS"))
         {
         String conversion1 = String.format("€ %.2f", (US_DOLLAR/bitcoin) * euroAmount);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("GHANA CEDIS"))
         {
         String conversion1 = String.format("GHC %.2f", (US_DOLLAR/bitcoin) * ghanaCedi);
         jTextDisplay2.setText(conversion1);
         }  
         else if(jComboBox2.getSelectedItem().equals("BITCOIN"))
         {
         String conversion1 = String.format("BTC %.2f", US_DOLLAR * 1);
         jTextDisplay2.setText(conversion1);
         }  
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextDisplay.setText("");
       jTextDisplay2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Exchanges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exchanges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exchanges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exchanges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exchanges().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextDisplay;
    private javax.swing.JTextField jTextDisplay2;
    // End of variables declaration//GEN-END:variables
}
