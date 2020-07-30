/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appForms;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibrahim Jaber
 * This part of the application is the main form and the greeting page when user login 
 * it will show a brief message explanation of what is Morse code
 * and other buttons the user can click to check out the other features the application has 
 */
public class morseHistory extends javax.swing.JFrame {

    /**
     * Creates new form morseHistory
     */
    public morseHistory() {
        initComponents();
        this.setTitle("Morse Code History");//setting the title of the form
        this.setResizable(false);//setting the resizable option to false
        MorseCodeHistoryTxt.setEnabled(false);//Setting the mian text to disabled so the user can't modify it
        getContentPane().setBackground(Color.decode("#005580"));//chanign the background of the panle
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
        MorseCodeHistoryTxt = new javax.swing.JTextArea();
        resourcesBtn = new javax.swing.JButton();
        conversionBtn = new javax.swing.JButton();
        examplesBtn = new javax.swing.JButton();
        conversionHistoryBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("            Morsecode by Samuel Morse");

        MorseCodeHistoryTxt.setColumns(20);
        MorseCodeHistoryTxt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        MorseCodeHistoryTxt.setRows(5);
        MorseCodeHistoryTxt.setText("\n Morse Code is a method used in telecommunication to encode\n text characters as Standarized sequences of two different\n Signal durations, called Dots and Dashes or dits and dash, \n Morse code was named after Samuel Morse.\n Samuale Morse was the Inventor of the Telegraph.");
        MorseCodeHistoryTxt.setBorder(null);
        MorseCodeHistoryTxt.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(MorseCodeHistoryTxt);

        resourcesBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resourcesBtn.setText("Morse Code Resources");
        resourcesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourcesBtnActionPerformed(evt);
            }
        });

        conversionBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        conversionBtn.setText("Convert words to Morse");
        conversionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionBtnActionPerformed(evt);
            }
        });

        examplesBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        examplesBtn.setText("Morse Alphabet & Machine sample");
        examplesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examplesBtnActionPerformed(evt);
            }
        });

        conversionHistoryBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        conversionHistoryBtn.setText("Conversion History");
        conversionHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionHistoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examplesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resourcesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conversionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(conversionHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conversionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resourcesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examplesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(conversionHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * @param evt 
     * this button when it's clicked it will open the resources form and hide the current form
     */
    private void resourcesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourcesBtnActionPerformed
       this.setVisible(false);
       new Resources().setVisible(true);
       

    }//GEN-LAST:event_resourcesBtnActionPerformed
    /**
     * 
     * @param evt 
     * this button when it's clicked it will open the Conversion form and hide the current form
     */
    private void conversionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new convertCode().setVisible(true);
    }//GEN-LAST:event_conversionBtnActionPerformed
    /**
     * 
     * @param evt 
     * this button when it's clicked it will open the Morsealphabet form and hide the current form
     */
    private void examplesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examplesBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new morseAlphabet().setVisible(true);
    }//GEN-LAST:event_examplesBtnActionPerformed
    /**
     * 
     * @param evt 
     * this button when it's clicked it will open the conversion History form and hide the current form
     */
    private void conversionHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionHistoryBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new conversionHistory().setVisible(true);
    }//GEN-LAST:event_conversionHistoryBtnActionPerformed

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
            java.util.logging.Logger.getLogger(morseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(morseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(morseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(morseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new morseHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MorseCodeHistoryTxt;
    private javax.swing.JButton conversionBtn;
    private javax.swing.JButton conversionHistoryBtn;
    private javax.swing.JButton examplesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resourcesBtn;
    // End of variables declaration//GEN-END:variables
}