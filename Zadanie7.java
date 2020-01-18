public class Zadanie7 {
    public static void main(String[] args) {

             int podanaLiczba = 2;


             switch(podanaLiczba%2){
                 case 0:
                     System.out.println("true");
                     break;
                 case 1:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                     System.out.println("false");
                     break;
                 default:
                     System.out.println("nieprawidłowa liczba");
             }


    }
}
