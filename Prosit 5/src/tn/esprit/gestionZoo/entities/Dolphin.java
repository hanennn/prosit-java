package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;

    public Dolphin(String s) {
        super(s);
    }

    // Const param
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString() {
        return super.toString() + ", Vitesse=" + swimmingSpeed + " km/h";
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
