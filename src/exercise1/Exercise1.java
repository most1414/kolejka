package exercise1;
// wpisywanie imion. przy wpisaniu * wypisuje wszystkie wpisane imiona i konczy dzialanie
// nie dziala
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Set< String > names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String name;
      //  System.out.println("Wprowadz imiona: ");
        do {
            name = scanner.nextLine();
            if (name.equals("*"))
            names.add(name);
            else break;
        }
        while (!name.equals("*"));

        for (String s : names)
            System.out.println(s);

    }
}
