package investissement;


public class Investissement {
    private double capitalInitial ;
    private double versementMensuel ;
    private double tauxAnnuel;
    private float dureeAnnees;

    public double getCapitalInitial() {
        return capitalInitial;
    }

    public void setCapitalInitial(double capitalInitial) {
        this.capitalInitial = capitalInitial;
    }

    public double getVersementMensuel() {
        return versementMensuel;
    }

    public void setVersementMensuel(double versementMensuel) {
        this.versementMensuel = versementMensuel;
    }

    public double getTauxAnnuel() {
        return tauxAnnuel;
    }

    public void setTauxAnnuel(float tauxAnnuel) {
        this.tauxAnnuel = tauxAnnuel;
    }

    public float getDureeAnnees() {
        return dureeAnnees;
    }

    public void setDureeAnnees(float dureeAnnees) {
        this.dureeAnnees = dureeAnnees;
    }

    public Investissement(double capitalInitial, double versementMensuel, float tauxAnnuel, float dureeAnnees) {
        this.capitalInitial = capitalInitial;
        this.versementMensuel = versementMensuel;
        this.tauxAnnuel = tauxAnnuel;
        this.dureeAnnees = dureeAnnees;
    }
    public void afficherEvolution(){
        double capital = capitalInitial;

        for (int annee = 0 ;annee < dureeAnnees;annee++){
            double interet = (capital * (tauxAnnuel/100));
            capital += interet;
            capital += versementMensuel * 12;
            System.out.println("Annee "+ annee +" est de " + String.format("%,.2f", capital));

        }

    }

    public double valeurFinale(){
        double capital = capitalInitial;

        for (int annee = 0 ;annee < dureeAnnees;annee++){
            double interet = (capital * (tauxAnnuel/100));
            capital += interet;
            capital += versementMensuel * 12;

        }
        return capital;
    }


}