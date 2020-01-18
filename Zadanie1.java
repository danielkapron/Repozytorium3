public class Zadanie1 {
    public static void main(String[] args) {

       /*  int a = 12345;

        int b = a%10;
        System.out.println(b);

        a = a / 10;
        System.out.println(a);

        int c = a%10;
        System.out.println(c);

        a = a /10;
        System.out.println(a);

        int d = a%10;
        System.out.println(d);

        a = a / 10;
        System.out.println(a);
         */


    /*    for(int i = 12345; i > 0; i = i / 10){
            int reszta = i%10;
            System.out.println(reszta);
            // reszta 5,4,3,2,1 po kazdej petli



            // jak uzyskac 54321

        }   */

        int i = 12345;
        while (i > 0){
            int reszta = i%10; //5, 4, 3, 2, 1
            i = i /10; // 1234, 123, 12 , 1
            System.out.print(reszta);
        }








    }
}
