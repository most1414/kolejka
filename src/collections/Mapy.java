package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

        //    put – dodaje parę klucz/wartość do mapy,
//    putAll – jako parametr przyjmuje inną mapę i dodaje wszystkie elementy z do mapy,
//    containsKey – jako parametr przyjmuje klucz i zwraca flagę informującą czy dany klucz już istnieje,
//    containsValue – jako parametr przyjmuje wartość i zwraca flagę informującą czy dana wartość już istnieje,
//    isEmpty – bezargumentowa metoda zwracająca flagę informującą czy mapa jest pusta,
//    size – bezargumentowa metoda zwracająca liczbę elementów w mapie,
//    remove – metoda jako parametr przyjmuje klucz i usuwa parę klucz/wartość z mapy,
//    get – metoda jako parametr przyjmuje klucz i zwraca odpowiadającą mu wartość.

    public static void main(String[] args) {
        Map<String, String> pairsMap = new HashMap<>();
        pairsMap.put("Marcin", "Adela");
        pairsMap.put("Marek", "Magda");
        Map<String, String> otherPairsMap = new HashMap<>();
        otherPairsMap.put("Marek", "Ewa");
        otherPairsMap.put("Adam", "Ewa");

        pairsMap.putAll(otherPairsMap);

        System.out.println(pairsMap.get("Marek"));
        System.out.println(pairsMap.remove("Marek"));
        System.out.println(pairsMap.size());
        System.out.println(pairsMap.isEmpty());
        System.out.println(pairsMap.containsKey("Jan"));
        System.out.println(pairsMap.containsValue("Adela"));

    }


}
