package app;

import models.Pilote;
import models.Pneu;
import models.Voiture;
import models.TypePneu;

public class Application {

    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------
        // Etape 1 : Création d'une voiture de Formule 1
        // ---------------------------------------------------------------------------------------
        Voiture voiture = new Voiture(16, "Ferrari");
        // ---------------------------------------------------------------------------------------
        // Etape 2 : Afficher la voiture
        // ---------------------------------------------------------------------------------------
        System.out.println(voiture);
        // ---------------------------------------------------------------------------------------
        // Etape 3 : Création d'un pilote de Formule 1 et afficher ses informations
        // ---------------------------------------------------------------------------------------
        Pilote pilote = new Pilote("Charles Leclerc", "Monégasque", voiture);
        pilote.getNombrePneusEnReserve();
        pilote.setNombreCourse(16);
        pilote.setNombrePoint(65);
        pilote.setNombreVictoire(3);
        pilote.setNombrePodium(7);
        // ---------------------------------------------------------------------------------------
        // Etape 4 : Afficher le Pilote
        // ---------------------------------------------------------------------------------------
        System.out.println(pilote);
        // ---------------------------------------------------------------------------------------
        // Etape 5 : Tests des méthodes de la classe Pilote
        // ---------------------------------------------------------------------------------------
        // deposerPneuEnReserve() 5 fois de types différents
        Pneu pneu1 = new Pneu(TypePneu.DUR_BLANC, 1.5);
        Pneu pneu2 = new Pneu(TypePneu.MEDIUM_JAUNE, 1.8);
        Pneu pneu3 = new Pneu(TypePneu.TENDRE_ROUGE, 2.0);
        Pneu pneu4 = new Pneu(TypePneu.DUR_BLANC, 1.6);
        Pneu pneu5 = new Pneu(TypePneu.MEDIUM_JAUNE, 1.7);
        pilote.deposerPneuEnReserve(pneu1);
        pilote.deposerPneuEnReserve(pneu2);
        pilote.deposerPneuEnReserve(pneu3);
        pilote.deposerPneuEnReserve(pneu4);
        pilote.deposerPneuEnReserve(pneu5);
        // retirerPneuEnReserve() de type TENDRE_ROUGE et l'afficher
        pilote.retirerPneuEnReserve(TypePneu.TENDRE_ROUGE);
        System.out.println("Le pneu " + TypePneu.TENDRE_ROUGE + " qui été supprimé: " + pneu.toString());
        // getNombrePneusEnReserve() et afficher le nombre de pneus en réserve
        pilote.getNombrePneusEnReserve();
        System.out.println("Nombre de pneus en réserve: " pilote.getNombrePneusEnReserve());
        // getPneusEnReserveSansTrous() et afficher les pneus en réserve
        pilote.getPneusEnReserveSansTrous();
        System.out.println("Pneus en réserve sans trous: " + pilote.getPneusEnReserveSansTrous());
        // pressionMoyenneDesPneusEnReserveFormatee() et afficher la pression moyenne
        // des pneus
        pilote.pressionMoyenneDesPneusEnReserveFormatee();
        System.out.println("La pression moyenne des pneus" + pilote.pressionMoyenneDesPneusEnReserveFormatee());
        // compterNombrePneusEnReserveDeType() et afficher le nombre de pneus en réserve
        // de type DUR_BLANC
        pilote.compterNombrePneuEnreserveDeType(TypePneu.DUR_BLANC);
        System.out.println("Nombre de pneus en réserve de type " + TypePneu.DUR_BLANC + " : " + pilote.compterNombrePneuEnreserveDeType());

        // Créer les 3 pneus et ajout le lot de pneus pour le pilote et afficher réussi
        // ou échoué
        Pneu pneuPression1 = new Pneu(TypePneu.DUR_BLANC, 1.3);
        Pneu pneuPression2 = new Pneu(TypePneu.DUR_BLANC, 1.2);
        Pneu pneuPression3 = new Pneu(TypePneu.DUR_BLANC, 1.1);

        Pneu pneuReserve = new Pneu[3];
        pneuReserve[0] = pneuPression1;
        pneuReserve[1] = pneuPression2;
        pneuReserve[2] = pneuPression3;
        System.out.println(pneuPression1);
        System.out.println(pneuPression2);
        System.out.println(pneuPression3);

        // Supprimer les pneus de pression inférieure à 1.4 et afficher le nombre de
        // pneus supprimés
        
        for (int i = 0; i < args.length; i++) {
            if (pneuReserve[i] < pilote.supprimerPneusDePressionInferieure(1.4)) {
                pneuReserve[i] = null;
            }
        }
        System.out.println("Nombre de pneus supprimés de pression inférieure à 1.4 : " + pilote.supprimerPneusDePressionInferieure());

        // ---------------------------------------------------------------------------------------

    }

}
