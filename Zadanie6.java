public class Zadanie6 {
    public static void main(String[] args) {

        int[] tablica = {1,2,3,4,5};
        int wartoscMax = 5;
        int wartoscMin = 1;

        for(int i = 0; i < tablica.length; i++) {

            if (tablica[i] == wartoscMax){
                System.out.println("Maksymalna liczba to: " + wartoscMax);
            }
            if(tablica[i] == wartoscMin) {

                System.out.println("Minimalna liczba to: " + wartoscMin);
            }
        }

    }
}
