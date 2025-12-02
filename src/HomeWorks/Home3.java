package HomeWorks;

public class Home3 {
    public static void main(String[] args) {

        //1. Write a Java program to take two numbers as input and display the result of addition,
        // subtraction, multiplication, division, and modulus.

        int number1 = 10;
        int number2 = 5;
        System.out.println("Suma numerelor este : " +  (number1 + number2));
        System.out.println("Diferenta numerelor este : " + (number1 - number2));
        System.out.println("Inmultirea numerelor este :" + (number1 * number2));
        System.out.println("Impartitea numerelor este : " + (number1 / number2));
        System.out.println("Modulul numerelor este : " + (number1 % number2));

        //2. Create a Java program where you increment and decrement the same variable.
        // Display the value of the variable after each operation.


        int number = 5 ;
        int plusnumber = ++number;
        System.out.println("Numarul dupa operatie este : " + plusnumber);
        int minusnumber = --number;
        System.out.println("Numarul dupa operatie este : " + minusnumber);

        //3. Write a program to check if a number is positive or negative
        // using logical complement operator.

        int nr1 = -10 ;
        if(nr1 > 0 ){
            System.out.println("Nmumarul este pozitiv");
        }else {
            System.out.println("Numarul este negativ");
        }

        //4. Write a Java program that uses both the increment (++) and decrement (--) operators
        // in a loop to count up to 10 and then back down to 1.

        for (int a = 0 ; a <= 10 ; a++){
            System.out.println("Numaratoarea este : " + a);
        }
        for (int b = 10 ; b >= 0 ; b--){
            System.out.println("Numaratoarea inversa este : " + b );
        }

        //6. Write a Java program that takes two numbers from the user and uses relational
        // operators to display whether the first number
        // is greater than, less than, or equal to the second number.
         int number3 = 6 ;
        int number4 = 8 ;
        if(number3 > number4){
            System.out.println("Primul numar este mai mare ");
        } else if (number3 < number4) {
            System.out.println("Al doilea numar este mai mare ");
        } else {
            System.out.println("Numerele sunt egale ");
        }

        //7. Write a program where you perform operations between an integer and a double. Display the result.

        int intval = 5 ;
        double doubleval= 2.5 ;
        System.out.println("Suma numerelor este : " + (intval + doubleval));
        System.out.println("Diferenta numerelor este : " + (intval - doubleval));
        System.out.println("Inmultirea numerelor este : " + (intval * doubleval));

        // 9.Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

        int L= 10 ;
        int l = 6 ;
        System.out.println("Aria este : " + (l * L ));

        //11.Write a Java program that takes two boolean inputs from a user.
        // Apply the logical negation operator (!) to each and print the result.

        boolean b1 = true ;
        boolean b2 = false ;
        System.out.println(b1);
        System.out.println(!b1);
        System.out.println(b2);
        System.out.println(!b2);

        //13. Write a program to calculate the price after discount. Take the original price and discount percentage as input.
        // Use compound assignment operator to perform the calculation.

        int price = 80 ;
        int discount = 16 ;
        System.out.println("Pretul initial este : " + price);
        System.out.println("Discontul este de " + discount + "%");
        int finalprice = price - ((price * discount) / 100);
        System.out.println("Pretul final este : " + finalprice);


    }
}
