package kopiec;

public class Kopiec {

    int[] kopiec = new int[100];
    int end = -1;
    int rodzicIndex;
    int biezacyIndex;
    boolean czyZamienic = true;

    public void add(int wartosc) {

        czyZamienic = true;
        end++;
        if (end == 0) {
            kopiec[0] = wartosc;
        } else {
            kopiec[end] = wartosc;
            biezacyIndex = end;
            while ((biezacyIndex > 0) && czyZamienic == true) zamienWezlyWGore(biezacyIndex);
        }
    }

    public int pull() {
        if (end < 0) {
            System.out.print("\nKopiec pusty : ");
            return -1;
        } else {
            int zwracana = kopiec[0];
            kopiec[0] = kopiec[end];
            kopiec[end] = 0;
            end--;
            rodzicIndex = 0;
            czyZamienic = true;

            while ((rodzicIndex < end) && czyZamienic == true) zamienWezlyWDol(rodzicIndex);

            return zwracana;
        }
    }

    public void zamienWezlyWDol(int rodzicIndex) {
        int syn1Index = 2 * rodzicIndex + 1;
        int syn2Index = 2 * rodzicIndex + 2;

        if (syn1Index > end) {
            czyZamienic = false;
            return;
        } else {
            if (syn1Index == end) biezacyIndex = syn1Index;
            else {
                if (kopiec[syn1Index] > kopiec[syn2Index]) biezacyIndex = syn1Index;
                else biezacyIndex = syn2Index;
            }
        }

        if (kopiec[rodzicIndex] < kopiec[biezacyIndex]) {
            int temp;
            temp = kopiec[rodzicIndex];
            kopiec[rodzicIndex] = kopiec[biezacyIndex];
            kopiec[biezacyIndex] = temp;
            this.rodzicIndex = biezacyIndex;
            czyZamienic = true;
        } else {
            czyZamienic = false;
        }
    }

    public boolean zamienWezlyWGore(int biezacyIndex) {
        rodzicIndex = (biezacyIndex - 1) / 2;
        if (kopiec[biezacyIndex] > kopiec[rodzicIndex]) {
            int temp;
            temp = kopiec[biezacyIndex];
            kopiec[biezacyIndex] = kopiec[rodzicIndex];
            kopiec[rodzicIndex] = temp;
            this.biezacyIndex = rodzicIndex;
            return true;
        } else {
            czyZamienic = false;
            return false;
        }
    }

    public void show() {
        for (int i=0 ; i<=end ; i++) {
            System.out.print(kopiec[i] + " ");
        }
        System.out.println();
    }

    public int getEnd() {
        return end;
    }
}

