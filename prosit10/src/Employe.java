public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private int grade;
    private String nomDepartement;
    public Employe() {
    }
    public Employe(int id, String nom, String prenom, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.nomDepartement = nomDepartement;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDepartement(){
        return nomDepartement;
    }
    public void setDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    @Override
    public String toString() {
        return "id" +id + "nom" +nom+  "prenom" +prenom+ "grade" + grade + "nomdépartement" + nomDepartement;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        return false;
    }

    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }

}
