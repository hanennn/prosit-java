package tn.esprit.gestionZoo.entities;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /* Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */
        //Instruction 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal("Félidé", "Lion", 5, true); // constructeur paramétré

        Zoo myZoo = new Zoo();
        myZoo.setNom("Parc Animalier");
        myZoo.setCity("Tunis");

        System.out.println("Animal : " + lion);
        System.out.println("Zoo : " + myZoo);

        System.out.println("Zoo : " + myZoo.getNom() + " à " + myZoo.getCity());
        System.out.println("Animal : " + lion.getNom() + " (" + lion.getfamily() + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo1 = new Zoo("Parc Animalier", "Tunis", 20);

        System.out.println("Animal créé : " + lion1.getNom());
        System.out.println("Zoo créé : " + myZoo1.getNom() + " (" + myZoo.getCity()+ ")");

        myZoo.displayZoo();
        System.out.println(myZoo);
    }
}
