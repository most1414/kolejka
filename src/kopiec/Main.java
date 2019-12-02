package kopiec;

public class Main {
    public static void main(String[] args) {

        Kopiec kopiec = new Kopiec();

        kopiec.add(3);
        kopiec.add(9);
        kopiec.add(5);
        kopiec.add(10);
        kopiec.add(2);
        kopiec.add(7);
        kopiec.add(4);
        kopiec.add(8);

        kopiec.show();
        int zwracana = kopiec.pop();
        System.out.println(zwracana);
        kopiec.show();

    }
}
