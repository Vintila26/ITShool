public class ForStatement {
    public static void main(String[] args) {

        for (int i=0 ; i<= 10 ; i++){
            System.out.println("Numarul curent este :" + i);
        }

        for (int i=0 ; i<=10; i=i+2){
            System.out.println("Numarul meu este :" +i);
        }

        int [] sir = {1,2,3,4,5,10,2};
        for (int i=0 ; i<sir.length; i++ ){
            System.out.println(sir[i]);
        }
        for (int number : sir){
            System.out.println("Numarul din sir este: " + number);
        }
    }
}
