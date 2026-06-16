package immobilier;

class Appartement extends Bien implements Louable {
    private int etage;
    private boolean ascenseur;
    private float chargeDeCopropriete;
    private boolean disponible;

    public int getEtage() {
        return this.etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public float getChargeDeCopropriete() {
        return this.chargeDeCopropriete;
    }

    public void setChargeDeCopropriete(float chargeDeCopropriete) {
        this.chargeDeCopropriete = chargeDeCopropriete;
    }

    public boolean isAscenseur() {
        return this.ascenseur;
    }

    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
    }

    public Appartement(int identifiant, String adress, int superficie, float prix, int etage, boolean ascenseur, float charge_de_copropriete, boolean disponible) {
        super(identifiant, adress, superficie, prix);
        this.etage = etage;
        this.ascenseur = ascenseur;
        this.chargeDeCopropriete = charge_de_copropriete;
        this.disponible = disponible;
    }

    public double calculerPrixFinal() {
        return (double)this.getPrix();
    }

    public String toString() {
        String var10000 = super.toString();
        return "[APPARTEMENT] " + var10000 + " (étage " + this.etage + ")";
    }

    public double calculerLoyerMensuel() {
        return (double)this.getPrix() * 0.01;
    }

    public boolean estDisponible() {
        return this.disponible;
    }
}
