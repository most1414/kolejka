package kolejka2;

public class Kolejka {
    private Element pierwszy;
    private Element ostatni;

    public Kolejka() {
        pierwszy = null;
        ostatni = null;
    }

    public void add(int wartosc) {
        Element nowyElement = new Element(wartosc);
        if (isEmpty()) {
            pierwszy = ostatni = nowyElement;

        } else {
            nowyElement.setPoprzedni(ostatni);
            ostatni.setNastepny(nowyElement);
            ostatni = nowyElement;

        }

    }
    public void show() {
        Element indexElement = pierwszy;

        while (indexElement != null) {
            System.out.println(indexElement.getWartosc());
            indexElement = indexElement.getNastepny();
        }
        System.out.println();
    }
        public boolean isEmpty (){
            if (ostatni == null) return true;
            else return false;
        }
        public int pop(){
        return pierwszy.getWartosc();
    }
    public int push(){
        int zwracana = pierwszy.getWartosc();
        pierwszy = pierwszy.getNastepny();
        pierwszy.setPoprzedni(null);
        return zwracana;
    }
    public Element find(int szukana){
        Element indexElement = pierwszy;
        int index = 0;
        while (indexElement != null){
            if (szukana == indexElement.getWartosc()){
                System.out.println("Wartosc"+szukana+" zostala znalezionana indeksie"+ index);
                return indexElement;

            } else index++;
            indexElement = indexElement.getNastepny();
        }
        System.out.println("Niestety nie znalazlem wartosci"+szukana);
        return null;
    }

    public boolean delete(int usuwana) {
        Element znaleziony = find(usuwana);
        if (znaleziony != null) {
            if (znaleziony == pierwszy) push();
            if (znaleziony == ostatni) {
                ostatni = ostatni.getPoprzedni();
                ostatni.setNastepny(null);
            } else {
                znaleziony.getPoprzedni().setNastepny(znaleziony.getNastepny());
                znaleziony.getNastepny().setPoprzedni(znaleziony.getPoprzedni());
            }   return true;
            }
            return false;

        }
    }




