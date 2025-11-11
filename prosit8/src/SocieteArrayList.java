import java.util.ArrayList;
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
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getId() > list.get(j).getId()) {
                    Employe tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }}}


    @Override
    public void trierEmployeParNomDepartementEtGrade() {

    }


    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNomDepartement().equals(nomDepartement))
                result.add(list.get(i));
        }
        return result;
    }


}
