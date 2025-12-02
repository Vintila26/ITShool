package sesion5;

public class FlowControl {
    public static void main(String[] args) {
        int valuare = 5;
        printNumbersWhileDc(valuare);
        printNumberDoWhile(5);
        System.out.println("For each");
        int[] array = {1,2,3,4,5};
        printNumberForEach(array);

        int [] [] biArray = {{1,2,3} , {4,5,6} , {7,8,9}};
        printListofList(biArray);
        printUntilValue(5);
    }

    public  static void printNumbersWhileDc(int number){

        while (number <= 10 ){
            System.out.println("numarul : " + number);
            number++;
        }
    }

    public static void  printNumberDoWhile(int number){
        do {
            System.out.println("numarul :" + number);
            number++;
        }while (number <= 10);
    }

    public static void printNumberForEach(int[] array){
        for(int number : array ){
            System.out.println("numarul: " + number);
        }

    }

    public static void printListofList(int [][] biArray){
        for (int [] array : biArray){
            for (int number: array){
                System.out.print(number);

            }
            System.out.println();
        }
    }

    public static void printUntilValue(int value){
        for (int i = 0 ; i<=10; i++){
            if (i== value){
                break;
            }
            if (i == 2){
                continue;
            }
            System.out.println("Numar until Value: " + i);
        }
    }
}
