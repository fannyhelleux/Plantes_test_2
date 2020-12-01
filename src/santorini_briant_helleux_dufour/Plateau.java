/*
Mini-Projet Santorini
BRIANT HELLEUX DUFOUR
 */
package santorini_briant_helleux_dufour;

/**
 *
 * @author romdu
 */
public class Plateau {
    Cellules[][] plateau = new Cellules [5][5];
    
    public Joueur etre_gagnant(){
        for (int i=0; i<=4; i++){
            for (int j=0; j<=4; j++){
                if (plateau[i][j].nb_etages == 3 && plateau[i][j].perso_courant != null){
                    return plateau[i][j].perso_courant.joueur;
                }
            }
        }
    return null;
    }

    public boolean deplacement_possible(int X1, int Y1, int X2, int Y2){
        if (plateau[X2][Y2].presence_personnage() == true){
            return false;
        }
        if (plateau[X2][Y2].nb_etages == 4){
            return false;
        }
        if (plateau[X2][Y2].nb_etages - plateau[X1][Y1].nb_etages >= 2){
            return false;
        }
        return true;
    }
    
}
