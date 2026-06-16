package recursiviter;

class Recursive{

    public static int factoriel(int n){
        if (n == 1) return 1;
        else return n * factoriel(n-1);
    }

    public static void main() {
        System.out.println(factoriel(13));
        
        }
}
