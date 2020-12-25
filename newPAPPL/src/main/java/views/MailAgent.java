/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ConMail;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 96441
 */
public class MailAgent extends javax.swing.JPanel {

    /**
     * Creates new form MailAgent
     */
     private JPanel panel;
     private ConMail conmail;
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
     
    public MailAgent() {
        initComponents();
    }

    public JTextField getJourApresA() {
        return jourApresA;
    }

    public JTextField getJourAvantA() {
        return jourAvantA;
    }

    public JTextArea getMessageApresA() {
        return messageApresA;
    }

    public JTextArea getMessageAvantA() {
        return messageAvantA;
    }

    public void setJourApresA(JTextField jourApresA) {
        this.jourApresA = jourApresA;
    }

    public void setJourAvantA(JTextField jourAvantA) {
        this.jourAvantA = jourAvantA;
    }

    public void setMessageApresA(JTextArea messageApresA) {
        this.messageApresA = messageApresA;
    }

    public void setMessageAvantA(JTextArea messageAvantA) {
        this.messageAvantA = messageAvantA;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redevable = new javax.swing.JButton();
        agent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jourAvantA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageAvantA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jourApresA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messageApresA = new javax.swing.JTextArea();
        enregistrer = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Logiciel Echéancier"));

        redevable.setText("Redevable");
        redevable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redevableActionPerformed(evt);
            }
        });

        agent.setText("Agent");

        jLabel2.setText("Message avant la date d'échéance:");

        jLabel4.setText("Jour d'envoi avant la date:");

        jourAvantA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jourAvantAKeyTyped(evt);
            }
        });

        jLabel6.setText("Corps du message:");

        messageAvantA.setColumns(20);
        messageAvantA.setRows(5);
        jScrollPane2.setViewportView(messageAvantA);

        jLabel3.setText("Message après la date d'échéance:");

        jLabel5.setText("Jour d'envoi après la date:");

        jourApresA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jourApresAKeyTyped(evt);
            }
        });

        jLabel7.setText("Corps du message:");

        messageApresA.setColumns(20);
        messageApresA.setRows(5);
        jScrollPane3.setViewportView(messageApresA);

        enregistrer.setText("Enregistrer");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        retour.setText("Retourner");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });

        jLabel1.setText("Gestion Mail (Agent)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(enregistrer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(retour))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jourApresA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jourAvantA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(redevable)
                                .addGap(43, 43, 43)
                                .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redevable)
                    .addComponent(agent))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jourAvantA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jourApresA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(enregistrer)
                                    .addComponent(retour)))))
                    .addComponent(jLabel6))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void redevableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redevableActionPerformed
                ((CardLayout)panel.getLayout()).show(panel, "p9");// TODO add your handling code here:
    }//GEN-LAST:event_redevableActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        try {
            JTextField jourAvantR = ((MailRedevable)panel.getComponent(9)).getJourAvantR();
            JTextArea messageAvantR = ((MailRedevable)panel.getComponent(9)).getMessageAvantR();
            JTextField jourApresR = ((MailRedevable)panel.getComponent(9)).getJourApresR();
            JTextArea  messageApresR = ((MailRedevable)panel.getComponent(9)).getMessageApresR();
            JTextField jourAvantA = ((MailAgent)panel.getComponent(10)).getJourAvantA();
            JTextArea messageAvantA = ((MailAgent)panel.getComponent(10)).getMessageAvantA();
            JTextField jourApresA = ((MailAgent)panel.getComponent(10)).getJourApresA();
            JTextArea  messageApresA = ((MailAgent)panel.getComponent(10)).getMessageApresA();
            conmail=new ConMail();
            conmail.enregistrerInfo(jourAvantR, messageAvantR, jourApresR, messageApresR, jourAvantA, messageAvantA, jourApresA, messageApresA);
        } catch (IOException ex) {
            Logger.getLogger(MailRedevable.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:
    }//GEN-LAST:event_enregistrerActionPerformed

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
       ((CardLayout)panel.getLayout()).show(panel, "p1"); // TODO add your handling code here:
    }//GEN-LAST:event_retourActionPerformed

    private void jourAvantAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jourAvantAKeyTyped
  char c=evt.getKeyChar();   
          if (!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
              getToolkit().beep();
              evt.consume();  
          }            // TODO add your handling code here:
    }//GEN-LAST:event_jourAvantAKeyTyped

    private void jourApresAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jourApresAKeyTyped
  char c=evt.getKeyChar();   
          if (!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
              getToolkit().beep();
              evt.consume();  
          }            // TODO add your handling code here:
    }//GEN-LAST:event_jourApresAKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agent;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jourApresA;
    private javax.swing.JTextField jourAvantA;
    private javax.swing.JTextArea messageApresA;
    private javax.swing.JTextArea messageAvantA;
    private javax.swing.JButton redevable;
    private javax.swing.JButton retour;
    // End of variables declaration//GEN-END:variables
}
