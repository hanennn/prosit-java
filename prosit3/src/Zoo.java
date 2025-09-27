import java.util.Scanner;

public class Zoo {
    Animal[] animals = new Animal[25]; // max 25 animaux
    String name;
    String city;
    private static final int NBR_CAGES = 25;
    int nbAnimaux;
    public Zoo(){}

    // Constructeur paramétré
    public Zoo(String name, String city, int nbAnimaux) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.nbAnimaux=nbAnimaux;
    }

    public void displayZoo()
    {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + "]";
    }

    public boolean addAnimal(Animal animal)
    {
        if (nbAnimaux >= NBR_CAGES) {
            System.out.println("Le zoo est plein");
            return false;
        }
        if(searchAnimal(animal)!=1 && NBR_CAGES<25)
            for (int i = 0; i < animals.length; i++)
                animals[i] = new Animal("Animal" + (i + 1));
                nbAnimaux++;

        return false;
    }


    public void afficheAnimal()
    {
        for(int i=0;i<animals.length;i++)
            {
            System.out.println(animals[i]);
            }
    }

    public int searchAnimal(Animal animal)
    {
        System.out.println("Donner le nom de l'animal");
        Scanner sc = new Scanner(System.in);
        String namecherch1 = sc.nextLine();

        for (int i = 0; i < animals.length; i++)
        {
            if (namecherch1 == animals[i].name)
            {
                System.out.println("animal existant");
                return 1;
            }
        }
            return -1 ;
        }
    boolean removeAnimal(Animal animal){
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull()
    {
        if (NBR_CAGES >= animals.length)
        {
            System.out.println("Le zoo est plein !");
            return true;
        }
    System.out.println("Il reste des cages libres.");
        return false;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (z1.NBR_CAGES > z2.NBR_CAGES)
        {
            return z1;
        }
        else if (z2.NBR_CAGES> z1.NBR_CAGES)
        {
            return z2;
        }

        return null;
    }

}



