package exercise2;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Map<String, String> pairsMap = new HashMap<>();
        Scanner pobierz = new Scanner(System.in);
        String panstwo, miasto;
        panstwo = pobierz.next();
        miasto = pobierz.next();
        System.out.println(panstwo+" : "+miasto);
         do {
             panstwo = pobierz.next();
             if (panstwo.charAt(0) == '*')break;
             miasto = pobierz.next();
             if (miasto.charAt(0) == '*')break;

             pairsMap.put(panstwo, miasto);
        } while (true);

        for (String myPanstwo : pairsMap.keySet()) {
            System.out.println(myPanstwo+" : "+pairsMap.get(myPanstwo));

        }
    }
}

