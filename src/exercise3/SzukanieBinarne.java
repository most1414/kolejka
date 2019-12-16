package exercise3;

public class SzukanieBinarne {
    public static int szukaj(int szukana, int[]tablica){

        int indexDolny=0;
        int indexGorny = tablica.length-1;

        return szukanieRekurencyjne(szukana, tablica, indexDolny, indexGorny);
    }
    public static int szukanieRekurencyjne(int szukana, int[] tablica, int indexDolny, int indexGorny){

        int indexSrodkowy = (indexGorny - indexDolny)/2;

        if (indexGorny - indexDolny == 1){
            if (tablica[indexDolny]== szukana) return  indexDolny;
            if (tablica[indexDolny]== szukana) return  indexGorny;
            else return -1;
        }
        if (tablica[indexSrodkowy]== szukana) return indexSrodkowy;
        else{
            if (tablica[indexSrodkowy]< szukana){
                indexDolny = indexSrodkowy;
                return szukanieRekurencyjne(szukana, tablica, indexDolny, indexGorny);
            }else{
                indexGorny = indexSrodkowy;
                return szukanieRekurencyjne(szukana, tablica, indexDolny, indexGorny);
            }
        }

    }

}
