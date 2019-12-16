package collections;

import java.util.HashSet;
import java.util.Set;

public class Zbiory {
    //    add – dodaje element do listy,
    //    addAll – jako parametr przyjmuje inną kolekcję i dodaje wszystkie elementy z tej kolekcji do listy,
    //    contains – jako parametr przyjmuje element listy i zwraca flagę informującą czy dany element już istnieje (tutaj przyda Ci się artykuł o porównywaniu obiektów w języku Java),
    //    isEmpty – bezargumentowa metoda zwracająca flagę informującą czy lista jest pusta,
    //    size – bezargumentowa metoda zwracająca liczbę elementów w liście,
    //    indexOf – metoda jako parametr przyjmuje element listy i zwraca indeks pierwszego wystąpienia,


    public static void main(String[] args) {
        Set<String> zbiorImion = new HashSet<>();
        zbiorImion.add("Piotr");
        zbiorImion.add("Marek");
        zbiorImion.add("Piotr");
        java.util.Set<String> innyZbiorImion = new HashSet<>();
        innyZbiorImion.add("Anna");
        innyZbiorImion.add("Marek");

        zbiorImion.addAll(innyZbiorImion);
        System.out.println(zbiorImion.isEmpty());
        System.out.println(zbiorImion.size());
        System.out.println(zbiorImion.contains("Marek"));
        System.out.println(zbiorImion.remove("Anna"));
        System.out.println(zbiorImion.size());
        System.out.println(zbiorImion.remove("Jola"));

    }
}
