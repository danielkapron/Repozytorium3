public class Kalkulator {
    public static void main (String[] args) {

        int x = 3;
        int y = 2;
        int i = 0;
        int wynik = 0;

        while (i < x) {
            i = i + 1;
            wynik = wynik + y; // wynik += y;
        }
        System.out.println(x + " * " + y + " = " + wynik);
    }
}
