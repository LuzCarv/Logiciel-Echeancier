/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Luz et Chenkai
 */
public class AgentComptable extends Personne{
    /**
     * Constructeur de la classe AgentComptable
     * @param nom nom et prénom de l'agent comptable
     * @param adresseMail adresse mail de l'agent comptable
     */
    private boolean statut;
     public AgentComptable() {
         
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public boolean isStatut() {
        return statut;
    }
     
    
    
    
}
