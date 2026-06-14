import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Appartement A1 = new Appartement(1,"Ouakam",50,300000,4,false,100000);
        Maison A2 = new Maison(2,"Mermoz",70,400000,10,4);
        Appartement A3 = new Appartement(3,"allmadie",60,500000,6,true,200000);
        System.out.println(A1.calculerPrixFinal());

        Agence Agence1 = new Agence();

        Agence1.ajouterBien(A1);
        Agence1.ajouterBien(A2);
        Agence1.ajouterBien(A3);

        System.out.println(Agence1.catalogue);
        System.out.println(Agence1.toString());



    }
}
