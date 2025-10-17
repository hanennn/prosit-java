package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    protected float  swimmingDepth;


    public Penguin(String s) {
        super(s);
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        return super.toString() + ", Profondeur max=" + swimmingDepth + " m";
    }
}
