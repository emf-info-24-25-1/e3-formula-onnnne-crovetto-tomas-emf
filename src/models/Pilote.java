package models;

import java.text.DecimalFormat;

public class Pilote {
    public static final int NOMBRE_PNEU_EN_RESERVE = 16;
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
        this.nombrePoint = nombrePoint;
        this.nombreVictoire = nombreVictoire;
        this.nombrePodium = nombrePodium;
        new Pneu(null, NOMBRE_PNEU_EN_RESERVE);
        this.voiture = voiture;
    }

    public Pilote(String nom, String nationalite, Voiture voiture) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.nombrePoint = nombrePoint;
        this.nombreVictoire = nombreVictoire;
        this.nombrePodium = nombrePodium;
        new Pneu(null, NOMBRE_PNEU_EN_RESERVE);
        this.voiture = voiture;
    }

    public boolean deposerPneuEnReserve(){
        boolean aReussi = false;

        if(pneusEnReserve == null){
            for (int i = 0; i < pneusEnReserve.length; i++) {
                if (pneusEnReserve[i] == null) {
                    pneusEnReserve[i] = true;
                    aReussi = true;
                }
            }
        }

        return aReussi;
    }

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
            pressiontotale += pneusEnReserve[i];
        }
        Double chaineDeMoyenne = pressiontotale / NOMBRE_PNEU_EN_RESERVE;

        String.valueOf(DecimalFormat(chaineDeMoyenne));

        return chaineDeMoyenne;
    }

    public int supprimerPneusDePressionInferieure(double pression){
        int nombreSupprime = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
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
                pneu.getType();
                resultat += "Pneu en réserve: " + pneu.getType() + "\n";
            }
        }
        return resultat;
    }

}
