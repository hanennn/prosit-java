public class Departement implements Comparable<IDepartement> {
    int id;
    int nbremployes;
    String nomdepartement;

    public Departement() {}
    public Departement(int id, String nomdepartement, int nbremployes) {
        this.id = id;
        this.nomdepartement = nomdepartement;
        this.nbremployes = nbremployes;
    }
    public int getId()
    {
        return id; }
    public void setId(int id)
    {
        this.id = id; }


    public String getNomDepartement()
    {
        return nomdepartement;
    }
    public void setNomDepartement(String nomDepartement)
    {
        this.nomdepartement = nomDepartement;
    }


    public int getNombreEmployes()
    {
        return nbremployes;
    }
    public void setNombreEmployes(int nombreEmployes)
    {
        this.nbremployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;

        Departement d = (Departement) obj;
        return id == d.id && nomdepartement.equals(d.nomdepartement);

    }
    @Override
    public int hashCode() {
        return id + nomdepartement.hashCode();
    }

    @Override
    public String toString() {
        return "Departement: id=" + id + ", nom='" + nomdepartement + "', employés=" + nbremployes + " }";
    }

    @Override
    public int compareTo(IDepartement o) {
        return 0;
    }
}
