public class CastingExampels {
    public static void main(String[] args) {

        float floatVal = 1.0f ;
        double doubleVal = 4.0d;
        byte byteVal = 7 ;
        short shorVal = 7 ;
        int intVal = 7 ;
        long longVal = 10 ;
        long longVal2 = 433332233443L;


        short rez1 = byteVal ;
        System.out.println(rez1);
        short rez2= (short) longVal;
        System.out.println(rez2);
        short rez3 = (short) longVal2;
        System.out.println(rez3);

        int rez4 = (int) 1.0f;
        System.out.println(rez4);

        float rez5 = longVal - floatVal ;
        System.out.println(rez5);

        intVal= Integer.MAX_VALUE;
        System.out.println(intVal);
        intVal = Integer.MIN_VALUE;
        System.out.println(intVal);

        System.out.println(Long.MAX_VALUE);
        System.out.println((Long.MIN_VALUE));

        System.out.println(10 % 3);
        System.out.println(16 % 5);
    }
}
