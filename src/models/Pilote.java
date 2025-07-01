package models;

import java.text.DecimalFormat;

public class Pilote {
    public static final int NOMBRE_PNEU_EN_RESERVE = 16;
    // MR Tu as oublié le mot-clé final pour indiquer que cette valeur ne changera
    // pas pour les deux premiers attributs
    private String nom;
    private String nationalite;
    private int nombrePoint;
    private int nombreCourse;
    private int nombreVictoire;
    private int nombrePodium;
    private Pneu[] pneusEnReserve;
    private Voiture voiture;

    public Pilote(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
        // MR Il faut initialiser les variables de compteur à 0
        this.nombrePoint = nombrePoint;
        this.nombreVictoire = nombreVictoire;
        this.nombrePodium = nombrePodium;
        // MR Tu n'as pas besoin de créer un nouveau Pneu ici, tu dois initialiser le
        // tableau pneusEnReserve
        new Pneu(null, NOMBRE_PNEU_EN_RESERVE);
        // MR Ce constructeur indique que le pilote n'a pas de voiture assignée
        this.voiture = voiture;
    }

    public Pilote(String nom, String nationalite, Voiture voiture) {
        this.nom = nom;
        this.nationalite = nationalite;
        // MR Il faut initialiser les variables de compteur à 0
        this.nombrePoint = nombrePoint;
        this.nombreVictoire = nombreVictoire;
        this.nombrePodium = nombrePodium;
        // MR Tu n'as pas besoin de créer un nouveau Pneu ici, tu dois initialiser le
        // tableau pneusEnReserve
        new Pneu(null, NOMBRE_PNEU_EN_RESERVE);
        this.voiture = voiture;
    }

    // MR Il faut ajouter un paramètre Pneu pour la méthode deposerPneuEnReserve
    public boolean deposerPneuEnReserve() {
        boolean aReussi = false;

        if (pneusEnReserve == null) {
            for (int i = 0; i < pneusEnReserve.length; i++) {
                if (pneusEnReserve[i] == null) {
                    pneusEnReserve[i] = true;
                    aReussi = true;
                }
            }
        }

        return aReussi;
    }

    // MR Il faut ajouter un paramètre TypePneu pour la méthode retirerPneuEnReserve
    // de ce type
    public boolean retirerPneuEnReserve() {
        boolean aReussi = false;

        if (pneusEnReserve != null) {
            for (int i = 0; i < pneusEnReserve.length; i++) {
                if (pneusEnReserve[i] == valeurRecherchee) {
                    aReussi = true;
                    pneusEnReserve[i] = null;
                }
            }
        }
        return aReussi;

    }

    // MR Il faut ajouter un paramètre TypePneu pour la méthode retirerPneuEnReserve
    // de ce type
    public int compterNombrePneuEnreserveDeType() {
        int pneusEnReserveDeType = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve == TypePneu.DUR_BLANC) {
                pneusEnReserveDeType++;
            }
        }
        return pneusEnReserveDeType;
    }

    public int getNombrePneusEnReserve() {
        int nombrePneu = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                nombrePneu++;
            }
        }
        return nombrePneu;
    }

    public Pneu[] getPneusEnReserveSansTrous() {
    Pneu[] pneuEnNouvelleReserve;
        new Pneu[NOMBRE_PNEU_EN_RESERVE];
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] == valeurRecherchee) {
                pneuEnNouvelleReserve[0] += pneuEnNouvelleReserve[i];
                pneusEnReserve[i] = null;
            }
        }
        return pneuEnNouvelleReserve;
    }

    
    public String pressionMoyenneDesPneusEnReserveFormatee() {

        double pressiontotale = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            //MR Ici tu essaye d'aditionner un tableau de Pneu à un double, ce n'est pas possible
            pressiontotale += pneusEnReserve[i];
        }
        Double chaineDeMoyenne = pressiontotale / NOMBRE_PNEU_EN_RESERVE;

        String.valueOf(DecimalFormat(chaineDeMoyenne));

        return chaineDeMoyenne;
    }

    public int supprimerPneusDePressionInferieure(double pression){
        int nombreSupprime = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            //MR Il faut vérifier si pneusEnReserve[i] n'est pas null avant de comparer la pression
            // Et utiliser pneuxEnReserve[i].getPression() pour obtenir la pression du pneu
            if (pneusEnReserve < pression) {
                pneusEnReserve = null;
                nombreSupprime;
            }
        }
        return nombreSupprime;
    }

    public boolean ajouterLotDePneus(Pneu[] pneu) {
        boolean aReussi = false;

        return aReussi;
    }

    public String getNom() {
        return nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }

    public int getNombreCourse() {
        return nombreCourse;
    }

    public void setNombreCourse(int nombreCourse) {
        this.nombreCourse = nombreCourse;
    }

    public int getNombreVictoire() {
        return nombreVictoire;
    }

    public void setNombreVictoire(int nombreVictoire) {
        this.nombreVictoire = nombreVictoire;
    }

    public int getNombrePodium() {
        return nombrePodium;
    }

    public void setNombrePodium(int nombrePodium) {
        this.nombrePodium = nombrePodium;
    }

    @Override
    public String toString() {


        String resultat = "Pilote: " + nom + " ( " + nationalite + " )\n";

        if (voiture != null) {
            //MR Il faut le mettre dans une variable pour éviter de l'appeler plusieurs fois
            voiture.getNomEquipe();
            voiture.getNumero();
            resultat += "Voiture " + voiture.getNomEquipe() + " (" + voiture.getNumero() + ")\n";
            resultat += "Point " + nombrePoint + "\n";
            resultat += "Course " + nombreCourse + "\n";
            resultat += "Victoire" + nombreVictoire + "\n";
            resultat += "Podium" + nombrePodium + "\n";
        } else {
            resultat += "(Pas de voiture assignée.)\n";
        }
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve != null) {
                //MR Il faut utiliser le pneusEnReserve[i] pour obtenir le type de pneu
                pneu.getType();
                resultat += "Pneu en réserve: " + pneu.getType() + "\n";
            }
        }
        return resultat;
    }

}
