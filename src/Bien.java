public abstract class Bien {
    private int identifiant;
    private String adress;
    private int superficie;
    private float prix;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Bien(int identifiant, String adress, int superficie,float prix) {
        this.identifiant = identifiant;
        this.adress = adress;
        this.superficie = superficie;
        this.prix = prix;
    }

    public abstract double calculerPrixFinal();

    @Override
    public String toString() {
        return "#" + identifiant + " " + adress + " - " + superficie + " m² - " + prix + " FCFA";
    }
}