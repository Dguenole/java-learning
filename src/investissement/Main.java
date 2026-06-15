package investissement;

public class Main {
    public static void main(String[] args){
        Investissement I1 = new Investissement(100000,10000,10,10);

        I1.afficherEvolution();
        System.out.println(I1.valeurFinale());
    }
}
