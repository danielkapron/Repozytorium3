public class SwitchZajecia {
    public static void main(String[] args) {

        byte testValue = 10;

        switch (testValue){  // w switchu mogą zostać użyte TYLKO zmienne int,char, byte i short
            case 0:
                System.out.println("Znaleziono 0");
            case 1:
                System.out.println("Znaleziono 1");
            case 10:
                System.out.println("Znaleziono 10");
            case 11:
                System.out.println("Znaleziono 11");
            default:
                System.out.println("Nie znaleziono");
        }

    }

}
