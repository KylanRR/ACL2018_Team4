



import java.awt.*;

public class PersonnageVie extends Entite {
// author : Gregoire Clouvel
    /**
     *On va g�rer la vie du H�ros dans cette classe
     * On prend en param�tre les coordonn�es du h�ros et le plateau de jeu
     */
    public Hero(Point coord, Plateau plateau) {
        super(coord, maze);
        coord = new Point(1,1);
        int  vie = 4;
        maze = new maze;
    }

   

    /**
     * Calcule les d�gats recu et recalcule la vie du h�ros
     * prend en param�tre nbdegats.
     */
    public void subirDegat(int nbDegats) {
        this.vie = vie - nbDegats;
        System.out.println("PAF");
        if (vie <= 0 ){
            Jeu.getInstance().estMort();
            System.out.println("GAME OVER");
        }
    }

    /**
     * Verifie que le h�ro est encore vivant
     *return true si le h�ros est en vie.
     */
    public boolean estVivant() {
        return this.vie <= 0;
    }

}

