public class Employe {
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

    public String getNomDepartement(){
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    @Override
    public String toString() {
        return "id" +id + "nom" +nom+  "prenom" +prenom+ "grade" + grade + "nomdépartement" + nomDepartement;
    }



}
