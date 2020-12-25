/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ConActif;
import controllers.ConAgent;
import controllers.ConCreation;
import controllers.ConEdition;
import controllers.ConHistorique;
import controllers.ConMail;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import models.AgentComptable;


/**
 *
 * @author Luz
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Panel2
     */
   private JPanel panel;
   private ConHistorique conhisto;
   private ConActif conactif;
   private ConCreation concreation;
   private ConAgent conagent;
   private ConMail conmail;
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    public Menu() {
        initComponents();
        this.conhisto = new ConHistorique();
        this.conactif = new ConActif();
        this.concreation=new ConCreation();
        this.conagent = new ConAgent();
        this.conmail= new ConMail();
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
        historique = new javax.swing.JButton();
        actif = new javax.swing.JButton();
        creationredevable = new javax.swing.JButton();
        gestionMail = new javax.swing.JButton();
        gestionAgent = new javax.swing.JButton();
        déconnecter = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Logiciel Echéancier"));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        jLabel1.setText("Menu");

        historique.setText("Historique des redevables");
        historique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiqueActionPerformed(evt);
            }
        });

        actif.setText("Redevables Actifs");
        actif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actifActionPerformed(evt);
            }
        });

        creationredevable.setText("Créer un redevable");
        creationredevable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creationredevableActionPerformed(evt);
            }
        });

        gestionMail.setText("Gestion Mail");
        gestionMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionMailActionPerformed(evt);
            }
        });

        gestionAgent.setText("Gestion Agents");
        gestionAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionAgentActionPerformed(evt);
            }
        });

        déconnecter.setText("Se déconnecter");
        déconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                déconnecterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(actif, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creationredevable, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gestionAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(historique)
                            .addComponent(gestionMail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(déconnecter)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creationredevable)
                    .addComponent(historique))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actif)
                    .addComponent(gestionMail))
                .addGap(39, 39, 39)
                .addComponent(gestionAgent)
                .addGap(60, 60, 60)
                .addComponent(déconnecter)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Menu");
    }// </editor-fold>//GEN-END:initComponents

    private void historiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiqueActionPerformed
        // TODO add your handling code here:
         JComboBox annee = ((RechercheHisto)panel.getComponent(2)).getAnnee();
         JComboBox mois1 = ((RechercheHisto)panel.getComponent(2)).getMois1();
         JComboBox mois2 = ((RechercheHisto)panel.getComponent(2)).getMois2();
         conhisto.rechercheHistorique(annee, mois1, mois2);
        ((CardLayout)panel.getLayout()).show(panel, "p2");
    }//GEN-LAST:event_historiqueActionPerformed

    private void actifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actifActionPerformed
         JTable table = ((Actif)panel.getComponent(4)).getjTable1();
         conactif.showListeActif(table);
        ((CardLayout)panel.getLayout()).show(panel, "p4");
    }//GEN-LAST:event_actifActionPerformed

    private void creationredevableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creationredevableActionPerformed

      ((CardLayout)panel.getLayout()).show(panel, "p11");
    }//GEN-LAST:event_creationredevableActionPerformed

    private void gestionMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionMailActionPerformed
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
           conmail.affichageInfo(jourAvantR, messageAvantR, jourApresR, messageApresR, jourAvantA, messageAvantA, jourApresA, messageApresA);
           ((CardLayout)panel.getLayout()).show(panel, "p9");
           //
       } catch (IOException ex) {
           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_gestionMailActionPerformed

    private void gestionAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionAgentActionPerformed
        // TODO add your handling code here:
        JTable agents = ((Agent)panel.getComponent(8)).getjTable1();
        conagent.afficherAgents(agents);
        ((CardLayout)panel.getLayout()).show(panel, "p8");
        //
    }//GEN-LAST:event_gestionAgentActionPerformed

    private void déconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_déconnecterActionPerformed
        // TODO add your handling code here:
        ((CardLayout)panel.getLayout()).show(panel, "p0");
    }//GEN-LAST:event_déconnecterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actif;
    private javax.swing.JButton creationredevable;
    private javax.swing.JButton déconnecter;
    private javax.swing.JButton gestionAgent;
    private javax.swing.JButton gestionMail;
    private javax.swing.JButton historique;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   


}
