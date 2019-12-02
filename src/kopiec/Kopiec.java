package kopiec;

public class Kopiec {
    int[] kopiec = new int[20];
    int end = 0;
    int indexRodzica;
    int bierzacyIndex;
    boolean czyZamienic = true;

    public void add(int wartosc) {
        czyZamienic = true;
        if (end == 0){
            kopiec[0] = wartosc;
            end++;
    }
        else {
          kopiec[end] = wartosc;
          bierzacyIndex = end;
          while ((bierzacyIndex > 0) && czyZamienic == true) zamienWezly(bierzacyIndex);
          end++;

        }

    }

    public int pop(){
        int zwracana = kopiec[0];
        kopiec[0] = kopiec[end];
        bierzacyIndex = 0;
        czyZamienic = true;
        while ((indexRodzica < end) && czyZamienic == true) zamienWezlyWDol(indexRodzica);
        end--;
        return zwracana;
    }
    public  void zamienWezlyWDol(int indexRodzica){
        int syn1Index = 2*indexRodzica+1;
        int syn2Index = 2*indexRodzica+2;
        if (kopiec[syn1Index]>kopiec[syn2Index]) bierzacyIndex = syn1Index;
        else bierzacyIndex = syn2Index;

        if (kopiec[indexRodzica]<kopiec[bierzacyIndex]){
            int temp;
            temp = kopiec[indexRodzica];
            kopiec[indexRodzica] = kopiec[bierzacyIndex];
            kopiec[bierzacyIndex] = temp;
            this.indexRodzica = bierzacyIndex;
            czyZamienic = true;
        }else czyZamienic = false;

    }

    public boolean zamienWezly(int bierzacyIndex){
        System.out.println("Bierzacy Index: "+ bierzacyIndex+ "Index Rodzica: "+indexRodzica);
        System.out.println("Wartosc Indexu: "+kopiec[bierzacyIndex]+ "Wartosc rodzica: "+kopiec[indexRodzica]);
        indexRodzica = (bierzacyIndex - 1)/2;

        if (kopiec[bierzacyIndex] > kopiec[indexRodzica]){
            System.out.println("Bedzie zamiana");
           int temp;
           temp = kopiec[bierzacyIndex];
           kopiec[bierzacyIndex] = kopiec[indexRodzica];
           kopiec[indexRodzica] = temp;
            System.out.println("Wartosc Indexu: "+kopiec[bierzacyIndex]+"Wartosc rodzica: "+kopiec);
           this.bierzacyIndex = indexRodzica;
            System.out.println("Bierzacy index ma teraz wartosc: "+ this.bierzacyIndex);
            System.out.println();
           return true;
       }else {
           czyZamienic = false;
           return false;
       }

       }

       public void show(){
        for (int elKopca : kopiec){
            System.out.print(elKopca+" ");
        }
           System.out.println();
       }
    }

