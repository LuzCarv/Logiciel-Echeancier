/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import models.AgentComptable;
import models.DetteSimplifiee;
import models.EcheanceDetaillee;
import models.EcheanceSimplifiee;
import models.Redevable;

/**
 *
 * @author 96441
 */
public class DaoCreation {
     public void CreationRedevable(String mailRedevable, String nomRedevable, ArrayList<EcheanceSimplifiee> listEcheance, String libelle, String montant, String infoComplementaire, String mailAgent,String nomAgent){
       try {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(DaoHistorique.url,"postgres", DaoHistorique.motDePass);
        PreparedStatement  stmt = null;
        String requete1 = "SELECT redevable.adresse_mail_redevable FROM redevable ";
        stmt=conn.prepareStatement(requete1);
        ResultSet res = stmt.executeQuery();
        res.next();
        boolean existe=false;
        do{
            if (res.getString("adresse_mail_redevable")==mailRedevable){existe=true;}
        }while(res.next());
        
        if (existe==true){
          String requete2= "INSERT INTO redevable(adresse_mail_redevable,nom_redevable) VALUES (?,?) ";
           stmt=conn.prepareStatement(requete2);
           stmt.setString(1,mailRedevable);
           stmt.setString(2,nomRedevable);
           stmt.executeUpdate();
        }
        
        requete1 = "SELECT agent.adresse_mail_agent FROM agent ";
        stmt=conn.prepareStatement(requete1);
        res = stmt.executeQuery();
        res.next();
        existe=false;
        do{
            if (res.getString("adresse_mail_agent")==mailRedevable){existe=true;}
        }while(res.next());
        if (existe==true){
          String requete2= "INSERT INTO agent(adresse_mail_agent,nom_agent) VALUES (?,?) ";
           stmt=conn.prepareStatement(requete2);
           stmt.setString(1,mailAgent);
           stmt.setString(2,nomAgent);
           stmt.executeUpdate();
        }
        
        
        String requete3="INSERT INTO dette(id_dette,libelle,montant_dette,info_complementaire,adresse_mail_redevable,adresse_mail_agent,date_creation,statut_dette,dette_actuelle) "
                        +"VALUES (nextval('dette_sequence'),?,?,?,?,?,?,?,?)";
        stmt=conn.prepareStatement(requete3);
        stmt.setString(1,libelle);
        stmt.setDouble(2,Double.parseDouble(montant));
        stmt.setString(3,infoComplementaire);
        stmt.setString(4,mailRedevable);
        stmt.setString(5,mailAgent);
        stmt.setTimestamp(6,Timestamp.valueOf(LocalDateTime.now()));
        stmt.setBoolean(7, false);
        stmt.setDouble(8, Double.parseDouble(montant));
        stmt.executeUpdate();
        requete3="SELEC currval('dette_sequence') FROM dette";
        stmt=conn.prepareStatement(requete3);
        res = stmt.executeQuery();
        res.next();
        for (EcheanceSimplifiee e : listEcheance){
        String requete4 = "INSERT INTO echeance(id_echeance,date_deadline,montant_echeance,statut_paiement,statut_annulation,id_dette,) "
                   +"VALUES (nextval('echeance_sequence'),?,?,?,?,?,?,?)";
        stmt=conn.prepareStatement(requete4);
        stmt.setDate(1,Date.valueOf(e.getDateDeadLine()));
        stmt.setDouble(2,e.getMontant());
        stmt.setBoolean(3,false);
        stmt.setBoolean(4,false);
        stmt.setString(5,res.getString("id_dette"));
        stmt.executeUpdate();
        }
        
        stmt.close() ;
        conn.close() ; 
         
     }
    catch (SQLException e) {
             e.printStackTrace();
    }
    catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } 
    }
}