package immobilier;
import java.util.ArrayList;
import java.util.List;

class Agence{
    List<Bien> catalogue = new ArrayList<Bien>();

    public void ajouterBien(Bien bien){
        catalogue.add(bien);
    }
    public void retirerBien(Bien bien){
        catalogue.remove(bien);
    }

    public double calculeValeurTotal() {
        double total = 0;
        for (Bien bien : catalogue) {
            total += bien.calculerPrixFinal();
        }
        return total;
    }
    @Override
    public String toString () {
        return "Valeur Totale " + "=" + calculeValeurTotal();
    }

    public void afficherLouables(){
        for (Bien bien : catalogue){
            if (bien instanceof Louable louable) {
                System.out.println(bien +  " -> loyer : " + louable.calculerLoyerMensuel());
            }
        }
    }

    public List<Bien> biensSousPrix(double seuil) {
        List<Bien> resultat = new ArrayList<>();
        for (Bien bien : catalogue) {
            if (bien.calculerPrixFinal() < seuil) {
                resultat.add(bien);
            }
        }
        return resultat;
    }
}