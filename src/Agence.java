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
}