public class Zadanie4 {
    public static void main(String[] args) {

        int tablica[] = {1,4,5,9,12,99};

        int szukanaLiczba = 9;

        for(int i = 0; i < tablica.length; i++){

           if(tablica[i] == szukanaLiczba){
               System.out.println("Indeks to: " + i);
               break;
           }
        }

        int indeks = znajdzLiczbe(tablica, szukanaLiczba);
        System.out.println(indeks);

    }

    public static int znajdzLiczbe(int[] tablica, int szukanaLiczba){

        for(int i = 0; i < tablica.length; i++){

            if(tablica[i] == szukanaLiczba){
                return i;
            }
        }
        return -1;
    }

}
