public class Kalkulator2 {
    public static void main (String[] args) {

        int x = 3;
        int y = 2;
        int wynik = 0;

        int z = 3;
        int a = 2;
        int wynik2 = 0;

        for (int i = 0; i < x; i++){
            wynik = wynik + y;
            System.out.println(wynik);
        }

        System.out.println(x + "*" + y + "=" + wynik);

        for (int c = 0; c < a; c++){
            wynik2 = wynik2 + z;
            System.out.println(wynik2);
        }
        System.out.println(z + "*" + a + "=" + wynik2);
    }
}
