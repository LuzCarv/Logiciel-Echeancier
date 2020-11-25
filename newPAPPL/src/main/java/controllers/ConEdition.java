/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DaoEdition;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.AgentComptable;
import models.DetteDetaillee;
import models.DetteSimplifiee;
import models.EcheanceDetaillee;
import models.Redevable;

/**
 *
 * @author Luz
 */
public class ConEdition {
    private DaoEdition daoEdit;
    
    public ConEdition(){
        this.daoEdit=new DaoEdition();
    }
    public void afficherDonneesEditionAH(DetteDetaillee detteDetail, JTable table,JTextField idDette,JTextField nom,JTextField mail,JTextField libelle,JTextField montant,JTextField info,JTextField actionEntreprendre,JTextField actionEffectuee){
        nom.setText(detteDetail.getRedev().getNom());
        mail.setText(detteDetail.getRedev().getAdresseMail());
        libelle.setText(detteDetail.getLibelle());
        montant.setText(String.valueOf(detteDetail.getMontant()));
        info.setText(detteDetail.getInfoComplementaire());
        actionEntreprendre.setText(detteDetail.getActionEntreprendre());
        actionEffectuee.setText(detteDetail.getActionEffectuee());
        idDette.setText(detteDetail.getIdDette());
        
        Object[] ligneS = new Object[7]; 
        ArrayList<EcheanceDetaillee> echeances = detteDetail.getEd();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        int i=1;
        for(EcheanceDetaillee echeance: echeances){
            ligneS[0]= "Deadline " + i;
            ligneS[1] = echeance.getDateDeadLine();
            ligneS[2] = echeance.getMontant();
            ligneS[3] = echeance.isStatutPaiement();
            ligneS[4] = echeance.getDatePaiement();
            ligneS[5] = echeance.isStatutAnnulation();
            ligneS[6] = echeance.getRaisonAnnulation();
            model.addRow(ligneS);
            i++;
        }
    }
    
    public DetteDetaillee update(JTable table,JTextField idDette,JTextField nom,JTextField mail,JTextField libelle,JTextField montant,JTextField info,JTextField actionEntreprendre,JTextField actionEffectuee){
        DetteDetaillee detDetail = new DetteDetaillee();
        //AgentComptable agent = new AgentComptable();
       // agent.setAdresseMail(mail.getText());
       // agent.setNom(nom.getText());
         Redevable redevable = new Redevable();
         redevable.setAdresseMail(mail.getText());
         redevable.setNom(nom.getText());
         //detDetail.setAgent(agent);
        detDetail.setLibelle(libelle.getText());
        detDetail.setRedev(redevable);
        detDetail.setMontant(Double.parseDouble(montant.getText()));
        detDetail.setIdDette(idDette.getText());
        detDetail.setActionEffectuee(actionEffectuee.getText());
        detDetail.setActionEntreprendre(actionEntreprendre.getText());
        detDetail.setInfoComplementaire(info.getText());
        ArrayList <EcheanceDetaillee> echeances = new ArrayList <>();
        
        
        for (int i = 0; i < table.getRowCount(); i++) {
            EcheanceDetaillee echeance = new EcheanceDetaillee();
            echeance.setDateDeadLine((LocalDateTime)table.getValueAt(i, 1)); //ojo
            echeance.setMontant((Double)table.getValueAt(i, 2));
            echeance.setStatutPaiement((Boolean)table.getValueAt(i, 3));
            echeance.setDatePaiement((LocalDateTime)table.getValueAt(i, 4));
            echeance.setStatutAnnulation((Boolean)table.getValueAt(i, 5));
            echeance.setRaisonAnnulation((String)table.getValueAt(i, 5));  
        }
             
        return detDetail;
    } 
    
    public void effacerEcheances(JTextField idDette){
        daoEdit.effacerEcehances(idDette.getText());
        
    }

    
    
}