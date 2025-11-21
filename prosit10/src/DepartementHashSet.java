import java.util.*;
import java.util.ArrayList;

public class DepartementHashSet implements IDepartement<Departement> {

    HashSet<Departement> set = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        set.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : set)
            if (d.getNomDepartement().equals(nomDepartement))
                return true;
        return false;
}
    @Override
    public boolean rechercherDepartement(Departement d) {
        return set.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        set.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : set)
            System.out.println(d);
    }

    @Override
    public void trierDepartementsParId() {
        ArrayList<Departement> list = new ArrayList<>(set);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getId() > list.get(j).getId()) {
                    Departement temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }}}
        System.out.println("Tri par ID :");
        for (Departement d : list) {
            System.out.println(d);
        }}

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        ArrayList<Departement> list = new ArrayList<>(set);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Departement d1 = list.get(i);
                Departement d2 = list.get(j);

                if (d1.getNomDepartement().compareTo(d2.getNomDepartement()) > 0 || (d1.getNomDepartement().equals(d2.getNomDepartement())
                        && d1.getNombreEmployes() > d2.getNombreEmployes())) {
                    Departement temp = d1;
                    list.set(i, d2);
                    list.set(j, temp);
                }}}
        System.out.println("Tri par nom et nombre employés :");
        for (Departement d : list) {
            System.out.println(d);
        }}
}

