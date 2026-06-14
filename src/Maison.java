class Maison extends Bien{
    private int surfaceJardin;
    private int nombreEtages;

    public int getSurfaceJardin() {
        return surfaceJardin;
    }

    public void setSurfaceJardin(int surfaceJardin) {
        this.surfaceJardin = surfaceJardin;
    }

    public int getNombreEtages() {
        return nombreEtages;
    }

    public void setNombreEtages(int nombreEtages) {
        this.nombreEtages = nombreEtages;
    }

    public Maison(int identifiant, String adress, int superficie, float prix,int surface_de_jardin, int nombre_etage) {
        super(identifiant, adress, superficie,prix);
        this.surfaceJardin = surface_de_jardin;
        this.nombreEtages = nombre_etage;
    }


    @Override
    public double calculerPrixFinal(){
        return getPrix() + (surfaceJardin * 50000);
    }

    @Override
    public String toString(){
        return "[MAISON] " + super.toString() + " (jardin " + surfaceJardin + " m²)";
    }
}