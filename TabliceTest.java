public class TabliceTest {
    public static void main(String[] args) {

        int[] tablica1 = new int[5];
        tablica1[0] = 10;
        tablica1[1] = 20;
        tablica1[2] = 30;

        int suma = 0;

        for(int currentTablica1 : tablica1){
            suma += currentTablica1;
        }
        System.out.println(suma);

        suma = 0;

        for(int currentTablica1 = 0; currentTablica1 < tablica1.length; currentTablica1++){
            suma = suma + tablica1[currentTablica1];
        }
        System.out.println(suma);



    }
}
