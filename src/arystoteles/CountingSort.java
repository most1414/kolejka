package arystoteles;

public class CountingSort {
    public static void main(String[] args) {
        int tablicaWejsciowa[] = {1,3,5,8,3,5,2,9,7,0,0,3,2,6, 7 , 8 , 8 , 9 };
        int tablicaInteligentna[] = new int[10];
        for( int liczba : tablicaWejsciowa )
            tablicaInteligentna[ liczba ]++;
        int sumaLiczbSpodIndeksu = 0 ;
        for( int i = 0 ; i < tablicaInteligentna.length; i++ ){
            for( int j = 0 ; j < tablicaInteligentna[i] ; j++ )
                System.out.printf(" " + i );
        }
    }
}

