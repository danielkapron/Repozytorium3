public class Zadanie3 {
    public static void main(String[] args) {

        int tablica[] = {1,2,3,4,5};

        int suma = 0;

        for(int i = 0; i < tablica.length; i++){
            suma = suma + tablica[i];
        }

        int srednia = suma / tablica.length;
        System.out.println(srednia);

    }

}
