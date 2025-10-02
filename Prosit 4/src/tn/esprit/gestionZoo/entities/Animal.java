package tn.esprit.gestionZoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String s){}



    // Const
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getfamily() {
        return family;
    }

    // Setter nom
    public void setfamily(String f) {
        this.name = f;
    }
    public String getNom() {
        return name;
    }

    // Setter nom
    public void setNom(String nom) {
        this.name = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("l'âge de l'animal ne peut pas être négatif.");
        } else {
            this.age = age;
        }
    }


    @Override
    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

}

