public class ProgramFigury {
    public static void main(String[] args) {

        Trojkat trojkat = new Trojkat(); // obiekt

        trojkat.setPodstawa(5);
        trojkat.setDlugoscPierwszegoBoku(5);
        trojkat.setDlugoscDrugiegoBoku(5);
        trojkat.setWysokosc(7);

        double obwodTrojkata = trojkat.obliczObwod(); // oblicz obwod trojkata zdefiniowana w klasie Trojkat
        double poleTrojkata = trojkat.obliczPolePowierzchni();

        System.out.println("Obwód trójkąta, to " + obwodTrojkata);
        System.out.println("Pole trójkąta, to " + poleTrojkata);



        Kwadrat kwadrat = new Kwadrat();

        kwadrat.setDlugoscBoku(2);

        double obwodKwadratu = kwadrat.obliczObwod();
        double poleKwadratu = kwadrat.obliczPolePowierzchni();

        System.out.println("Obwód kwadratu, to " + obwodKwadratu);
        System.out.println("Pole kwadratu, to " + poleKwadratu);


        Prostokat prostokat = new Prostokat();

        prostokat.setDlugoscPierwszegoBoku(2);
        prostokat.setDlugoscDrugiegoBoku(4);

        double obwodProstokata = prostokat.obliczObwod();
        double poleProstokata = prostokat.obliczPolePowierzchni();

        System.out.println("Obwód prostokąta, to " + obwodProstokata);
        System.out.println("Pole prostokąta, to " + poleProstokata);

        Kolo kolo = new Kolo ();

        kolo.setPromien(3);

        double obwodKola = kolo.obliczObwod();
        double poleKola = kolo.obliczPolePowierzchni();

        System.out.println("Obwód koła, to " + obwodKola);
        System.out.println("Pole koła, to " + poleKola);



    }
}
