public class Zoo {
    Animal [] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
     public void displayZoo(){
         System.out.println("zoo");
         System.out.println("name: "+name);
         System.out.println("city: "+city);
     }
     public String toString()
     {
         System.out.println("zoo");
         System.out.println("name: "+name);
         System.out.println("city: "+city);
     }
}
