public class Main {
    public static void main(String[] args){
        Marque apple = new Marque("apple");
        Incassable rinoshield = new Incassable("Rinoshield", true);

        Telephone iphone =new Telephone(34000, "iphone", apple, rinoshield);
        System.out.println(rinoshield.nom);

    }
}


class Telephone{
    int pixels;
    String nom;
    Marque marque;
    Incassable incassable;

    public Telephone(int pixels, String nom, Marque marque, Incassable incassable) {
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
        this.incassable = incassable;
    }
}

class Marque{
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}

class Incassable{
    String nom;
    boolean verre_tramper;

    public Incassable(String nom, boolean verre_tramper) {
        this.nom = nom;
        this.verre_tramper = verre_tramper;
    }
}