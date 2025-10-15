package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal{
    protected  String habitat ;

    public Aquatic(String s) {
        super(s);
    }

    // Const param
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    public String toString() {
        return super.toString() + ", Habitat=" + habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }



}
