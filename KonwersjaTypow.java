public class KonwersjaTypow {
    public static void main(String[] args) {  //psvm


        float floatVal = 1.7f;  // nazwy zmiennych nie mogą być takie jak nazwy typów zmiennych
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;


        short result1 = byteVal; // byte mieści się w short więc jest git
        System.out.println(result1);

        //  short result2 = longVal; // to się nie uda, bo long jest większy niż short
        short result2 = (short)longVal; // rzutujemy z long na short
        System.out.println(result2);

       // short result3 = byteVal - longVal; // to się nie uda, bo wyrażenie arytmetyczne jest w typie o większej pojemności
        // czyli przyjmuje wartość long

        short result3 = (short)(byteVal - longVal);
        System.out.println(result3);

        long result4 = (long)(longVal - floatVal);  // 5 - 1.7 = 3.3
        System.out.println(result4);

        long result5 = longVal - (long)floatVal; // 5 -1 = 4
        System.out.println(result5);

        double result6 = shortVal + longVal * floatVal * doubleVal;
        System.out.println(result6);

        int intVal;     //kompilator nie pozwala na rzutowanie typów logicznych na całkowite
        if (true){  // możemy to jednak zakodować
            intVal = 1;
        } else {
            intVal = 0;
        }

        char c = 'u';

        int a = c;

        System.out.println(c);
        System.out.println(a);









    }
}
