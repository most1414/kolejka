package com.sda.kolejka;

public class KolejkaElement {
    int value;
    KolejkaElement poprzedni;
    KolejkaElement nastepny;

    public KolejkaElement(int liczba) {
        value = liczba;
    }
}
