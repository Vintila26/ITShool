package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class Home5 {
    public static void main(String[] args) {
        //1. Even or Odd Checker
        //Write a Java program that takes an integer as input.
        // If the number is even, print "Even". If it's odd, print "Odd".

        Scanner scaner = new Scanner(System.in);
//        System.out.println("Introduceti un numar : ");
//        int nr1 = scaner.nextInt();
//        if (nr1 % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

        //2. Month Name Finder
        //Write a program that asks the user to enter a number between 1 and 12.
        // Print the name of the corresponding month or "Invalid Month" if out of range.

//        System.out.println("Introduceti un numar de la 1-12");
//        int luna = scaner.nextInt();
//        switch (luna){
//            case 1 -> System.out.println("Ianuarie");
//            case 2 -> System.out.println("Februarie");
//            case 3 -> System.out.println("Martie");
//            case 4 -> System.out.println("Aprilie");
//            case 5 -> System.out.println("Mai");
//            case 6 -> System.out.println("Iunie");
//            case 7 -> System.out.println("Iulie");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("Septembrie");
//            case 10 -> System.out.println("Octombrie");
//            case 11 -> System.out.println("Noiembrie");
//            case 12 -> System.out.println("Decembrie");
//            default -> System.out.println("Numar invalid");
//
//        }

        //3. Counting Negative Numbers
        //Given an array of integers, write a program to count and print the number of negative integers in the array.

 //       int count = 0 ;
        //        int [] array = {10 , -2 , 7, -24 , -40 , 12 ,26};
        //        for (int i : array ){
        //            if(i < 0 ){
        //                System.out.println("Este numar negativ :" +i);
        //                count ++ ;
        //            }
        //        }
        //        System.out.println("totalul numerelor negative este : " +count);


        //4. String Reverser
        //Ask the user to enter a string. Print the reversed version of this string.

    //    int[] sir = {1,2,3,4,5};
        //        System.out.println("sirul de numere : " + Arrays.toString(sir));
        //        int stanga = 0 ;
        //        int dreapta =sir.length - 1;
        //        while (stanga < dreapta){
        //
        //            int temp = sir[stanga];
        //            sir[stanga] = sir[dreapta];
        //            sir[dreapta] = temp ;
        //            stanga++;
        //            dreapta --;
        //
        //        }
        //        System.out.println("sirul inversat este : " + Arrays.toString(sir));


        //6. While Loop
        //Write a program that asks the user to enter numbers.
        // The program should continue prompting the user until they enter -1.
        // After they enter -1, print the sum of all numbers entered (excluding -1)
  //      System.out.println("Introduceti primul numar: ");
        //        int number = scaner.nextInt();
        //        int sum=number;
        //      while (number != -1){
        //          System.out.println("Introduceti un alt numar :");
        //          int number2 = scaner.nextInt();
        //          if (number2 == -1){
        //              break;
        //          }
        //          sum +=number2;
        //
        //      }
        //       System.out.println("Suma numerelor introduse este : " +sum);


        //7. Do-While Loop
        //Create a program where the user is prompted to guess a predefined number.
        // After each guess, the program should inform the user if the guess is too high or too low.
        // The program should keep prompting the user until they guess correctly.
        // Using a do-while loop, ensure the user is always asked at least once.

//
        int number1 = 7 ;
        boolean guess= false;

        do{
            System.out.println("Introduceti numarul : " );
            int number2 = scaner.nextInt();
            if (number2==number1){
                guess = true;
            }else if (number2 < number1 ){
                System.out.println("Numarul este prea mic");
            }else{
                System.out.println("Numarul este prea mare ");
            }

        }while (!guess);{
            System.out.println("Ati introdus numarul corect");
        }

        //9. For-Each Loop
        //Given an array of integers, write a program that prints each number in the array followed
        // by "Even" if the number is even, or "Odd" if the number is odd.
        // Utilize a for-each loop for this task.

     //   int[] sir = {1,4,8,5,7,3,12,17};
        //        for(int number : sir){
        //            if (number % 2 == 0){
        //                System.out.println("Numar divizibil" + number);
        //            }else {
        //                System.out.println("Numar nedivizibil" + number);
        //            }
        //        }


    }
}
