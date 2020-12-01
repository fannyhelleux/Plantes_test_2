/*
Mini-Projet Santorini
BRIANT HELLEUX DUFOUR
 */
package santorini_briant_helleux_dufour;

/**
 *
 * @author romdu
 */
public class Joueur {
    Personnage [] liste_perso = new Personnage[2];
    String Couleur;
    String Nom;
    
    public Joueur (){
        liste_perso[0].teinte= Couleur+"_clair";
        liste_perso[1].teinte= Couleur+"_fonce";
    }
}
