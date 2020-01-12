public class Potega {
    public static void main (String[] args) {

        // 2^5
        int potega = 5;
        int podstawa = 2;
        int i = 1;
        int wynik = 1;

        while (i<=potega){
            i = i + 1;
            wynik = wynik * podstawa;
        }
        System.out.println("2^5 = " + wynik);

        wynik = 1;

        for(i=1;i<=potega;i++){
            wynik = wynik * podstawa;
        }
        System.out.println("2^5 = " + wynik);
    }
}
