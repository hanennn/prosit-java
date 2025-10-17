package tn.esprit.gestionZoo.entities;
import tn.esprit.gestionZoo.entities.Animal;

public class Aquatic extends Animal{
    protected  String habitat ;
    Aquatic[] aquaticAnimals=new Aquatic[10];

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

    public void addAquaticAnimal(Aquatic aquatic)
    {
       if(aquaticAnimals.length<10)
       {
           for (int i = 0; i < aquaticAnimals.length; i++)
               aquaticAnimals[i] = new Aquatic("Animal aquatic" + (i + 1));
       }
       else
           System.out.println("le tableau est plein");
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (null == obj)
            return false;
        if (obj.getClass() == Aquatic.class)
        {
            Aquatic aquatic=(Aquatic) obj;
             return getAge() == aquatic.getAge() && getNom().equals(aquatic.getNom()) && habitat.equals(aquatic.habitat);
        }
        return false;
    }







}











