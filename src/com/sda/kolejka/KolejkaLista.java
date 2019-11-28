package com.sda.kolejka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KolejkaLista {
    List<Integer> lista = new LinkedList();


    public void add(int liczba) {
        lista.add(liczba);

    }

    @Override
    public String toString() {
        return "KolejkaLista{" +
                "lista=" + lista +
                '}';
    }

    public int pop() {
return  lista.get(0);
    }

    public int push() {
        int pierwszy = lista.get(0);
        lista.remove(0);
        return pierwszy;
    }
}