class Appartement extends Bien{
    private int etage;
    private boolean ascenseur;
    private float chargeDeCopropriete;

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public float getChargeDeCopropriete() {
        return chargeDeCopropriete;
    }

    public void setChargeDeCopropriete(float chargeDeCopropriete) {
        this.chargeDeCopropriete = chargeDeCopropriete;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }

    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
    }

    public Appartement(int identifiant, String adress, int superficie, float prix, int etage, boolean ascenseur, float charge_de_copropriete) {
        super(identifiant, adress, superficie, prix);
        this.etage = etage;
        this.ascenseur = ascenseur;
        this.chargeDeCopropriete = charge_de_copropriete;
    }

    @Override
    public double calculerPrixFinal(){
        return getPrix();
    }

    @Override
    public String toString(){
        return "[APPARTEMENT] " + super.toString() + " (étage " + etage + ")";
    }
}