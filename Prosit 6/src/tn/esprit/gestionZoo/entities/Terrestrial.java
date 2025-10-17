package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial(String s) {
        super(s);
    }

    // Const param
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family,name,age,isMammal);
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        return super.toString() + ", Nombre de pattes=" + nbrLegs;
    }
}
