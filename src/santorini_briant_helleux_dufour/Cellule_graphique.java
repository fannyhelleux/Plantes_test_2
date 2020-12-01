/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini_briant_helleux_dufour;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author romdu
 */
public class Cellule_graphique extends JButton {

    Cellules celluleAssociee;
    ImageIcon img_case_dome = new javax.swing.ImageIcon(getClass().getResource("/icones/case_dome.png"));
    ImageIcon img_case_etage_1 = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_1.png"));
    ImageIcon img_case_etage_1_bc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_1_bc.png"));
    ImageIcon img_case_etage_1_bf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_1_bf.png"));
    ImageIcon img_case_etage_1_mc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_1_mc.png"));
    ImageIcon img_case_etage_1_mf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_1_mf.png"));
    ImageIcon img_case_etage_2 = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_2.png"));
    ImageIcon img_case_etage_2_bc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_2_bc.png"));
    ImageIcon img_case_etage_2_bf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_2_bf.png"));
    ImageIcon img_case_etage_2_mc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_2_mc.png"));
    ImageIcon img_case_etage_2_mf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_2_mf.png"));
    ImageIcon img_case_etage_3 = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_3.png"));
    ImageIcon img_case_etage_3_bc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_3_bc.png"));
    ImageIcon img_case_etage_3_bf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_3_bf.png"));
    ImageIcon img_case_etage_3_mc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_3_mc.png"));
    ImageIcon img_case_etage_3_mf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_etage_3_mf.png"));
    ImageIcon img_case_perso_bc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_perso_bc.png"));
    ImageIcon img_case_perso_bf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_perso_bf.png"));
    ImageIcon img_case_perso_mc = new javax.swing.ImageIcon(getClass().getResource("/icones/case_perso_mc.png"));
    ImageIcon img_case_perso_mf = new javax.swing.ImageIcon(getClass().getResource("/icones/case_perso_mf.png"));

    
    public Cellule_graphique(Cellules uneCellule) {
        celluleAssociee = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        switch(celluleAssociee.nb_etages){
            case 1: if (celluleAssociee.presence_personnage()){
                
            }
        }
    }
}