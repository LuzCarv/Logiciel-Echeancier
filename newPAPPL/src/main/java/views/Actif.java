/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ConActif;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import models.DetteDetaillee;

/**
 *
 * @author Luz
 */
public class Actif extends javax.swing.JPanel {
     private JPanel panel;
     private ConActif conactif;
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
       public Actif() {
        initComponents();
        this.conactif = new ConActif();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        retourner = new javax.swing.JButton();

        jLabel1.setText("Redevables Actifs");

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Libellé", "Date création écheancier", "Montant dû", "Dette actuelle", "Id"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        retourner.setText("Retourner");
        retourner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retournerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(retourner)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retourner)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void retournerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retournerActionPerformed
        ((CardLayout)panel.getLayout()).show(panel, "p1"); // TODO add your handling code here:
    }//GEN-LAST:event_retournerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if(evt.getClickCount() == 2){
        JTextField nom = ((DetailAH)panel.getComponent(5)).getNom();
        JTextField libelle = ((DetailAH)panel.getComponent(5)).getLibelle();
        JTextField mail = ((DetailAH)panel.getComponent(5)).getMail();
        JTextField montant = ((DetailAH)panel.getComponent(5)).getMontant();
        JTextField info = ((DetailAH)panel.getComponent(5)).getInfocomplementaire();
        JTextField actionEntre = ((DetailAH)panel.getComponent(5)).getActionentreprendre();
        JTextField actionEffect = ((DetailAH)panel.getComponent(5)).getActioneffectuee();
        JTextField idDette = ((DetailAH)panel.getComponent(5)).getIdDette();
        JTable echeances = ((DetailAH)panel.getComponent(5)).getListeEcheances();
        DetteDetaillee detteAffiche = conactif.showDetail(5,jTable1,echeances,idDette, nom, mail , libelle, montant, info, actionEntre, actionEffect);
        ((DetailAH)panel.getComponent(5)).setDetteEnregistre(detteAffiche);
        idDette.setVisible(false);
        ((CardLayout)panel.getLayout()).show(panel, "p5"); 
       } 
    }//GEN-LAST:event_jTable1MouseClicked

    public JTable getjTable1() {
        return jTable1;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton retourner;
    // End of variables declaration//GEN-END:variables
}
