package moocFiExoJava1;

import java.util.Scanner;

public class Main {

    public static double raccinecarre(double n){
        return Math.pow(n,n);
    }

    public static void main(String[] args) {
        System.out.println("Entrer un nombre : ");
        Scanner reader = new Scanner(System.in);
        double n = Double.parseDouble(reader.nextLine());

        //.valueOf(reader.nextLine());

        System.out.println(raccinecarre(n));
    }
}
