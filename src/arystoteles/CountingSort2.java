package arystoteles;

import java.util.Arrays;

public class CountingSort2 {
    static void countSort(int[] tablica)
    {
        int max = Arrays.stream(tablica).max().getAsInt();
        int min = Arrays.stream(tablica).min().getAsInt();
        int zakres = max - min + 1;
        int tabIlosc[] = new int[zakres];
        int tabWyjsciowa[] = new int[tablica.length];
        for (int i = 0; i < tablica.length; i++)
        {
            tabIlosc[tablica[i] - min]++;
        }

        for (int i = 1; i < tabIlosc.length; i++)
        {
            tabIlosc[i] += tabIlosc[i - 1];
        }

        for (int i = tablica.length - 1; i >= 0; i--)
        {
            tabWyjsciowa[tabIlosc[tablica[i] - min] - 1] = tablica[i];
            tabIlosc[tablica[i] - min]--;
        }

        for (int i = 0; i < tablica.length; i++)
        {
            tablica[i] = tabWyjsciowa[i];
        }
    }

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void main(String[] args)
    {
        int[] tabWejsciowa = {-5, -10*9, 0, -3*3, 8, 5, -1, 100};
        countSort(tabWejsciowa);
        printArray(tabWejsciowa);
    }
}

