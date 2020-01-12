public class Silnia {
    public static void main (String[] args) {
        // silnia: n! = 1 * 2 * 3 * ... *n

        int n = 10;
        int i = 0;
        int wynik = 1;

        while (i<n) {
            i = i + 1;
           wynik = wynik * i;
            System.out.println(wynik);
        }

        int wynik2 = 1;

        for (int c = 1; c<=10 ; c++){
            wynik2 = wynik2 * c;
            System.out.println(wynik2);
        }

    }
}
