package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Penguin;
import tn.esprit.gestionZoo.entities.Aquatic;
import tn.esprit.gestionZoo.entities.Terrestrial;
import tn.esprit.gestionZoo.entities.Dolphin;

public class Main {
    public static void main(String[] args) {

        Aquatic a1 = new Aquatic("Aquatic");
        Terrestrial t1 = new Terrestrial("Terrestrial");
        Dolphin d1 = new Dolphin("Dolphin");
        Penguin p1 = new Penguin("Penguin");

        System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        Aquatic a2 = new Aquatic("Poissons", "Poisson rouge", 1, false, "Bassin");
        Terrestrial t2 = new Terrestrial("Félins", "Tigre", 5, true, 4);
        Dolphin d2 = new Dolphin("Cétacés", "Flipper", 4, true, "Mer", 25.5f);
        Penguin p2 = new Penguin("Oiseaux marins", "Pingu", 3, false, "Banquise", 12.5f);

        System.out.println(a2);
        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);

        a2.swim();
        d2.swim();
        p2.swim();
    }
}