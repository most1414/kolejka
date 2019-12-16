package exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        int[] tablica = new int[51];

        for (int i=0; i< tablica.length ; i++) {
            tablica[i] = i;
        }

        tablica[1] = 0;

        for (int index=2; index < Math.sqrt(tablica.length); index++) {
            if (tablica[index] != 0) {
                for (int mnoznik = 2; mnoznik < tablica.length; mnoznik++) {
                    if (index*mnoznik >= tablica.length) break;
                    else tablica[index*mnoznik] = 0;
                }
            }
        }

        for (int i : tablica) {
            if (tablica[i] != 0)
                System.out.print(tablica[i] + " ");

        }
    }
}




