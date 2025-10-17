package tn.esprit.gestionZoo.entities;
import java.util.Scanner;
import tn.esprit.gestionZoo.entities.Penguin;


public class Zoo {
    Animal[] animals = new Animal[25]; // max 25 animaux
    private String name;
    private String city;
    private static final int NBR_CAGES = 25;
    private int nbAnimaux;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbAnimaux) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.nbAnimaux = nbAnimaux;
    }


    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        if (nom == "") {
            System.out.println("le nom du zoo ne peut pas être vide.");
        } else {
            this.name = nom;
        }
    }
    public String getCity() {
        return city;
    }
    public int getNbrCages() {
        return NBR_CAGES;
    }

    public void setCity(String city) {
        if (city == "") {
            System.out.println("La ville ne peut pas être vide.");
        } else {
            this.city = city;
        }
    }


    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein");
            return false;
        }
        if (searchAnimal(animal) != 1 && NBR_CAGES < 25)
            for (int i = 0; i < animals.length; i++)
                animals[i] = new Animal("Animal" + (i + 1));
        nbAnimaux++;

        return false;
    }


    public void afficheAnimal() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        System.out.println("Donner le nom de l'animal");
        Scanner sc = new Scanner(System.in);
        String namecherch1 = sc.nextLine();

        for (int i = 0; i < animals.length; i++) {
            if (namecherch1 == animals[i].getNom()) {
                System.out.println("animal existant");
                return 1;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getNom().equals(animal.getNom())) {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        if (NBR_CAGES >= animals.length) {
            System.out.println("Le zoo est plein !");
            return true;
        }
        System.out.println("Il reste des cages libres.");
        return false;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.NBR_CAGES > z2.NBR_CAGES) {
            return z1;
        } else if (z2.NBR_CAGES > z1.NBR_CAGES) {
            return z2;
        }

        return null;
    }

    public float maxPenguinswimDepth() {
        float max = 0;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Penguin) {
                Penguin p = (Penguin) animals[i];
                if (p.swimmingDepth > max) {
                    max = p.swimmingDepth;
                }
            }
        }
        return max;
    }


    public void displayNumberOfAquaticsByType() {
        int nbDolphins = 0;
        int nbPenguins = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dolphin) {
                nbDolphins++;
            } else if (animals[i] instanceof Penguin) {
                nbPenguins++;
            }
        }
        System.out.println("Nombre de dauphins : " + nbDolphins);
        System.out.println("Nombre de pingouins : " + nbPenguins);
    }


}


