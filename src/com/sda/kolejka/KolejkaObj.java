package com.sda.kolejka;

public class KolejkaObj {

    Element pierwszy;
    Element ostatni;

    public KolejkaObj() {
        pierwszy = null;
        ostatni = null;
    }

    public void add(int liczba) {
        Element nowyElement = new Element(liczba);
        Element przedostatni = ostatni;

        if (ostatni == null)
            pierwszy = ostatni = nowyElement;
        else {
            ostatni.nastepny = nowyElement;
            ostatni = nowyElement;
        }
    }

    public int pop() {
        return 0;
    }



    public int push() {
        return 0;
    }
    @Override
    public String toString(){
        String opis = null;
       if (pierwszy != null){

           Element bierzacyElement = pierwszy;

           while (true){
               opis = opis + bierzacyElement.value + " ";
               bierzacyElement = bierzacyElement.nastepny;
               if (bierzacyElement.nastepny == null) break;
           }
           return opis;
       }else

        return "Kolejka jest pusta";
    }
}
