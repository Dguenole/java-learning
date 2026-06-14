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

}