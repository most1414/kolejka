package kopiec;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Kopiec kopiec = new Kopiec();
        int rozmiarKopca;
        int liczbaLosowa;
        Random generator = new Random(); // RNG
        System.out.println("Liczby dodane do kopca:");
        for (int i = 0; i < 35 ; i++) {
            liczbaLosowa = generator.nextInt(20); // wylosuje liczby od 0 do 20
            System.out.print(liczbaLosowa+" ");
            kopiec.add(liczbaLosowa);
        }
        System.out.println();
        System.out.println("Liczby w kopcu:");
        kopiec.show();
        rozmiarKopca = kopiec.getEnd();
        System.out.println("Liczby posortowane");
        for (int i=0; i<=rozmiarKopca ; i++) {
            System.out.print(kopiec.pull()+" ");
        }
        System.out.println();
        kopiec.show();
    }
}




