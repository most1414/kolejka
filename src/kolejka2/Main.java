package kolejka2;

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
    }
}
// metoda ktora pokaze wspak (reverse)
