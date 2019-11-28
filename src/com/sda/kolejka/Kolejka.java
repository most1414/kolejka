package com.sda.kolejka;

import java.util.Arrays;

public class Kolejka {

    int[] tablica = new int[10]; // tablica na 10 miejsc
    int koniecTablicy = 0;


    public void add(int liczba) {
        tablica[koniecTablicy] = liczba;
        koniecTablicy++;

    }

    @Override
    public String toString() {
        return "Kolejka{" +
                "tablica=" + Arrays.toString(tablica) +
                                '}';
    }
}
