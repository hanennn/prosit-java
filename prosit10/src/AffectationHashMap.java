import java.util.*;

public class AffectationHashMap {
    Map<Employe, Departement> departementEmployeMap = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d){
        if(departementEmployeMap.containsKey(e)) {
            System.out.println("Erreur , un employé ne peut pas être affecté à 2 départment");
        }
        else  {
            departementEmployeMap.put(e,d);

        }}


    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe, Departement> entry : departementEmployeMap.entrySet())
            System.out.println("Employe : " + entry.getKey() +"departement: " + entry.getValue());
    }

    public void supprimerEmploye(Employe e){
        if(departementEmployeMap.containsKey(e)) {
            departementEmployeMap.remove(e);
        }
        else  {
            System.out.println("Erreur, employe non existant");
        }}


    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if (departementEmployeMap.containsKey(e) && departementEmployeMap.get(e).equals(d)) {
            departementEmployeMap.remove(e);
        } else {
            System.out.println("Affectation introuvable !");
        }}


    public void afficherEmployes(){
        Set <Employe> employeCollection = departementEmployeMap.keySet();
        for(Employe e : employeCollection) {
            System.out.println("Employe : " + e);
        }}



    public void afficherDepartements(){
        Collection <Departement> departementValue = departementEmployeMap.values();
        Iterator<Departement> departementIterator = departementValue.iterator();
        while(departementIterator.hasNext()){
            System.out.println("Departement : " + departementIterator.next());
        }}


    public boolean rechercherEmploye(Employe e)
    {
        return departementEmployeMap.containsKey(e);
    }

    public boolean rechercherDepartements(Departement d)
    {
       return departementEmployeMap.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap()
    {
        return new TreeMap<>(departementEmployeMap);
    }



}
