import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe> {

    ArrayList<Employe> list = new ArrayList<>();

    public void ajouterEmploye(Employe e) {
        list.add(e);
    }

    public boolean rechercherEmploye(String nom) {
        for (Employe e : list)
            if (e.getNom().equalsIgnoreCase(nom)) return true;
        return false;
    }

    public boolean rechercherEmploye(Employe e) {
        return list.contains(e);
    }

    public void supprimerEmploye(Employe e) {
        list.remove(e);
    }

    public void displayEmploye() {
        for (Employe e : list)
            System.out.println(e);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(list);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(list, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                if (!e1.getDepartement().equals(e2.getDepartement()))
                    return e1.getDepartement().compareTo(e2.getDepartement());
                else if (e1.getGrade() > e2.getGrade())
                    return 1;
                else if (e1.getGrade() < e2.getGrade())
                    return -1;
                else
                    return e1.getNom().compareTo(e2.getNom());
            }
        });
    }


    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDepartement().equals(nomDepartement))
                result.add(list.get(i));
        }
        return result;
    }


}
