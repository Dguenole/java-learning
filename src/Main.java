public class Main {

    public static void main(String[] args){
        Voiture voiture =new Voiture();
        voiture.start();

        Bateau bateau = new Bateau();
        bateau.start();
    }

}
class Vehicule{
    void start(){
        System.out.println("VROUMMMM");
    }
}

class Voiture extends Vehicule{

    @Override
    void start(){
        super.start();
        allumerfeux();
        }

    void allumerfeux(){
        System.out.println("Allumer feu!!!!!");
    }
}

class Bateau extends Vehicule{


}