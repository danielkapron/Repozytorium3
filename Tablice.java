public class Tablice {
    public static void main(String[] args) {

        //tablice indeksuje się od 0, czyli wielkości tablicy: x - 1 . Powiedzmy tablica[3], to : 0,1,2

        // 1. SPOSÓB

        float[] theVals = new float[3];
        theVals[0] = 10.0f;  // ctr + d - kopiowanie lijniki
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;

        // 2. SPOSÓB - oba dają ten sam wynik

        float[] theVals2 = { 10.0f, 20.0f, 30.0f};


        for(int i = 0; i < theVals.length; i++){ // w tradycyjnym forze my musimy zadbać o wykonanie
            float f = theVals[i];
            System.out.println(f);
        }

        for (float f : theVals){ // w każdej iteracji pętli, do zmiennej float f, przypisywane są kolejne elementy z tablicy
            System.out.println(f);
        }

        // w forze należy unikać działań matematycznych, żeby nie opóźniać działania programu, ponieważ program za każdym
        // razem będzie wykonywać to działanie

        for (float f: theVals){

            if (f == 10){
                continue;
            }

            if(f == 30){
                break;
            }
        }



    }

}
