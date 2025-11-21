import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        Employe e1 = new Employe(1, "bennaceur", "Hanen",8);
        Employe e2 = new Employe(2, "Trabelsi", "Asma",5);
        Employe e3 = new Employe(2, "Ali", "benfoulen",9);

        Departement d1 = new Departement(101, 4 ,"Informatique");
        Departement d2 = new Departement(102,5, "RH");

        affectationHashMap.ajouterEmployeDepartement(e1,d1);
        affectationHashMap. ajouterEmployeDepartement(e2,d2);

//ajout de e1 dans un autre département
        affectationHashMap.ajouterEmployeDepartement(e1, d2);
        affectationHashMap.afficherEmployesEtDepartements();



}}