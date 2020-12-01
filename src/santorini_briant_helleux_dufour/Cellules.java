/*
Mini-Projet Santorini
BRIANT HELLEUX DUFOUR
 */
package santorini_briant_helleux_dufour;

/**
 *
 * @author romdu
 */
public class Cellules {
    int nb_etages;
    Personnage perso_courant;
    
    
    
    public boolean presence_personnage(){
        return perso_courant != null;
    }
    
    public Cellules(){
        nb_etages = 0;
        perso_courant = null;
    }
    
    public boolean ajouter_etage(){
        if (nb_etages < 4){
            nb_etages += 1;
            return true;
        } else return false;
    }
    
}
