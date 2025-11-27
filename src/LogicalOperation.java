public class LogicalOperation {
    public static void main(String[] args) {

        boolean isPresent = true ;
        boolean isRegistred = false;
        System.out.println("isPresent:" + isPresent);
        System.out.println("isRegistred:" + isRegistred);

        int a = 10;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);


        if (a < b){
            System.out.println("a este mai mic decat b ");
        }
        if (a <= b){
            System.out.println("a este mai mic sau egal decat b ");
        } else {
            System.out.println("a este mai mare sau egal decat b ");
        }

        if (a > b ){
            System.out.println("a este mai mare decat b ");
        }else if (a == b){
            System.out.println("a este egal cu b ");
        } else {
            System.out.println("a este mai mic decat b ");
        }

        int x;
        x = (a < b)? 1 : 2 ;
        System.out.println("Valuarea x este : "+x);

        int y;
        y = ( a==b )? 1 : 2 ;
        System.out.println("Valuarea lui y este : "+y);

        boolean w ;
        w = (x>y)? true : false ;
        System.out.println("Valuare W este :"+w);
    }
}
