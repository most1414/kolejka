package kolejka2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kolejka kolejka = new Kolejka();

        if (kolejka.isEmpty()) System.out.println("Kolejka jest pusta");

        kolejka.add(7);
        kolejka.add(3);
        kolejka.add(5);

        kolejka.show();
        System.out.println("Pierwszy element w kolejce to: "+kolejka.pop());
        System.out.println("Zdejmiemy element pierwszy");
        kolejka.push();
        kolejka.show();

        kolejka.add(4);
        kolejka.add(2);
        kolejka.add(1);
        kolejka.add(9);
        kolejka.show();

        kolejka.find(2);
        kolejka.delete(4);
        kolejka.show();

//        Scanner read = new Scanner(System.in);
//        String str = read.nextLine();
//        StringBuilder sb = new StringBuilder(str);
//        kolejka.show();
//        System.out.println(sb.reverse().toString());

    }
}
// metoda ktora pokaze wspak (reverse)
// Do klasy Kolejka dopiszcie i przetestujcie metody:
//showReverse() - metoda ma wypisać na ekran kolejkę od elementu ostatniego do pierwszego
//popLast() - metoda ma zwrócić pole "wartosc" ostatniego elementu kolejki ale nie ma usuwać tego elementu z kolejki
//pushLast() - metoda ma wzrócić pole "wartosc" ostatniego elementu i ma usunąć ten element z kolejki.
//Dla chętnych dodatkowa metoda:
//swap(int index1, int index2) - metoda ma zamiemić elementy w kolejce.
// Czyli element o indeksie index1 ma zamienić z elementem o indeksie index2.
// Jeśli zamiana się powiedzie to metoda ma zwrócić "true" a jeśli któryś z indeksów jest poza zakresem kolejki i nie można dokonać zamiany to metoda ma zwrócić "false"
