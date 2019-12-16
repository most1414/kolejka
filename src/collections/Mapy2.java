package collections;

import java.util.HashMap;
import java.util.Map;
public class Mapy2 {
    public static void main(String[] args) {
        Map<String, String> mojaMapa = new HashMap<>();
        mojaMapa.put("Polska", "Warszawa");
        mojaMapa.put("Niemcy", "Berlin");
        System.out.println("Iterowanie po wartosciach");
        for(String stolica : mojaMapa.values()) {
            System.out.println(stolica);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartosci");
        for(String panstwo : mojaMapa.keySet()) {
            String stolica = mojaMapa.get(panstwo);
            System.out.println(panstwo + ": " + stolica);
        }

        System.out.println("Iterowanie po kluczach i wartosciach");
        for(Map.Entry<String, String> entry : mojaMapa.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
