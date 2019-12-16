package exercise3;

public class Exercise3 { // sortowanie babelkowe // nie dziala
    public static void main(String[] args) {
        int[] tablica = {7, 21, 3, 4, 25, 16, 18, 7, 19, 10, 11,};
        int[] posortowana;

        posortowana = sortujBabelkowo(tablica);


        for (int liczba : posortowana) {
            System.out.print(liczba + " ");
        }
        int znaleziona;
        int szukana = 10;

        znaleziona = SzukanieBinarne.szukaj(szukana, posortowana);

        if (znaleziona!=-1) System.out.println("Znalazlem liczbe "+szukana+" na indeksie "+ znaleziona);
        else System.out.println("Poszukiwanej liczby "+szukana+" nie ma w tablicy");
    }

    public static int[] sortujBabelkowo(int[] tablica) {
        int temp;
        int licznik = 0;
        boolean czyKoniec = true;
        for (int i = 0; i < tablica.length; i++) {
            czyKoniec = true;
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    temp = tablica[j + 1];
                    tablica[j + 1] = tablica[j];
                    tablica[j] = temp;
                    czyKoniec = false;

                }
                licznik++;
            }
            if (czyKoniec) {
                System.out.println("ilość operacji : "+licznik);
                break;
            }
        }
        System.out.println("ilość operacji : "+licznik);
        return tablica;
    }
}
