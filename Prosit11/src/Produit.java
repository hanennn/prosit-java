public class Produit implements Comparable<Produit> {
    int idProd;
    String nomProd;
    double prixProd;

    Produit() {}
    Produit(int idProd, String nomProd, double prixProd) {
        this.idProd = idProd;
        this.nomProd = nomProd;
        this.prixProd = prixProd;
    }

    public int getIdProd() {
        return idProd;
    }
    public void setIdProd(int idProd)
    {
        this.idProd = idProd;
    }
    public String getNomProd()
    {
        return nomProd;
    }
    public void setNomProd(String nomProd)
    {
        this.nomProd = nomProd;
    }

    public double getPrixProd() {
        return prixProd;
    }
    public void setPrixProd(double prixProd) {
        this.prixProd = prixProd;
    }
    @Override
    public String toString() {
        return "id du produit:" + idProd+ "nom du produit:" + nomProd+ "prix du produit" + prixProd ;

    }

    public int compare(Produit T1, Produit T2)
    {
            return T1.idProd - T2.idProd;
    }


    @Override
    public int compareTo(Produit o) {
        return this.idProd - o.idProd;
    }

}
