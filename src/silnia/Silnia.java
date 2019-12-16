package silnia;

public class Silnia {
    public static void main(String[] args) {

        int n=0;

        System.out.println("Silnia od "+n+" wynosi: "+ silnia(n));

    }
    public static int silnia(int x){
        if (x == 0) return 1;
        return x * silnia(x-1);

    }
}
