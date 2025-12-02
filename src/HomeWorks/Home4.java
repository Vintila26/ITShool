package HomeWorks;

public class Home4 {
    public static void main(String[] args) {
        // 1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI".
        // Check and print whether they refer to the same object.

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println(stringOne == stringTwo); //true
        System.out.println(stringOne.equals(stringTwo)); // true

        //2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
        // Use an equality operator to compare these two numbers and print the result.
        // Do the same for two String objects firstString and secondString with the same value,
        // but use the equals() method for comparison. Print the result.

        int firstNumber = 50 ;
        int socondNumber = 70 ;
        System.out.println(firstNumber == socondNumber); //false
        String firstString = "Numar " ;
        String secondString = "Numar " ;
        System.out.println(firstString.equals(secondString)); // true

        //3. Write a Java program that declares an integer variable age with a value of 20.
        // Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".

        int age = 20 ;
        if (age >= 18 ){
            System.out.println(" I am adult");
        }else {
            System.out.println("I am not an adult ");
        }

        //4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
        // Use a ternary operator to determine the greater height and assign it to a variable maximumHeight.
        // Print the result.
        int heightOne = 70 ;
        int heightTwo = 82;
        int maxHeight = (heightOne > heightTwo ) ? heightOne : heightTwo ;
        System.out.println(maxHeight);

        //5. Write a Java program to print the numbers from 1 to 10 using a for loop.
        // As a next step, modify your program to print only the even numbers from 1 to 10.
        for (int a = 1 ; a <= 10 ; a++){
            System.out.println("Numerele sunt : " + a );
        }
        for (int b= 1 ; b <= 10 ; b++){
            if (b%2 == 0 ){
                System.out.println("Numerele pare sunt: " +b );
            }
        }

        //6. Write a Java program where you declare an integer variable temperature.
        // Assign a value to it and print "Hot" if the temperature is more than 30,
        // "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.

        int temp = 21 ;
        if (temp > 30) {
            System.out.println("Hot");
        }else if (temp >= 20 ){
            System.out.println("Warm");
        }else if (temp < 20) {
            System.out.println("Cold");
        }

        //7. Write a Java program that determines the type of a triangle based on its sides.
        // Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
        // Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene"

        int sideOne = 10 ;
        int sideTwo = 10;
        int sideTrhee = 19;

        String tipe = (sideOne == sideTwo && sideOne == sideTrhee && sideTwo == sideTrhee) ? "Equilateral" : (sideOne == sideTwo && sideOne != sideTrhee)? "Isoscel" : "Scalene";
        System.out.println(tipe);

        //8.Write a Java program to calculate the factorial of a number using a for loop.
        // Declare an integer variable number and assign a value to it.
        // Then calculate and print the factorial of number.

        int factNr = 4 ;
        for(int a = factNr ; a>1 ; a--){
            factNr *= (a-1);

        }
        System.out.println("Factorialul numarului este : " + factNr);


        //9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA".
        // Check if countryOne and countryTwo are equal using the equals() method and print the result.
        // Then change the value of countryTwo to "UK" and check for equality again. Print the result.

       // String countryOne = "USA";
       // String countryTwo = "USA";
      //  System.out.println(countryOne.equals(countryTwo)); // true
        String countryOne = "USA";
        String countryTwo = "UK";
        System.out.println(countryOne.equals(countryTwo)); // false

        //11. Write a Java program where you declare four integer variables: a, b, c, and d.
        // Assign them values of 10, 20, 30, and 40 respectively.
        // Create two more variables additionResult and multiplicationResult.
        // Set additionResult to the sum of a and b and multiplicationResult to the product of c and d.
        // Print the values of additionResult and multiplicationResult.

        int a = 10;
        int b = 20 ;
        int c = 30 ;
        int d = 40 ;
        int additionResolt = a + b ;
        int multiplicationResolt = c * d ;
        System.out.println(additionResolt);
        System.out.println(multiplicationResolt);

        //12. Write a Java program where you declare an integer variable number with a value of 25.
        // Use unary minus operator to change the sign of number and assign it to a variable negativeNumber.
        // Print the values of number and negativeNumber.

        int val = 25 ;
        int negativeNumber = -val ;
        System.out.println(negativeNumber);

        //13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false,
        // respectively. Use the logical complement operator to negate the values of both variables and print the new values.
        boolean isRaining = true ;
        boolean isSunny = false ;
        System.out.println(isRaining);
        System.out.println(isSunny);
        System.out.println(!isRaining);
        System.out.println(!isSunny);

        //14. Write a Java program where you declare an integer variable counter with a value of 0.
        // Use the increment operator to increase the value of counter by 1 and then print the value.
        // After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
        int counter = 0 ;
        System.out.println(++counter);
        counter--;
        System.out.println(--counter);

        //15. Write a Java program where you declare an integer variable total with a value of 100.
        // Use the compound assignment operator to decrease the total by 20 and then print the value.
        // Next, use another compound assignment operator to multiply the total by 2 and then print the value.

        int total = 100 ;
        total -=20 ;
        System.out.println(total);
        total *=2 ;
        System.out.println(total);

        //16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.
        // First, negate number, then take the absolute value, and finally increment it by 1.
        // Print the result at each step.

        int number1 = 50 ;
        int negNumber1 = -number1;
        System.out.println(negNumber1);
        negNumber1 = -(negNumber1);
        System.out.println(negNumber1);
        System.out.println(++negNumber1);

        //17. Write a Java program that simulates a simple authentication system.
        // Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions
        // using these two variables that will check the following conditions:
        //
        //If both hasUsername and hasPassword are true, print "Authentication successful".
        //If either hasUsername or hasPassword is false, print "Authentication failed".
        //If hasUsername is true but hasPassword is false, print "Password is incorrect".

        boolean hasUsername = true ;
        boolean hasPassowrd = false ;

        if (hasUsername && hasPassowrd ){
            System.out.println("Autentificare cu succes");
        } else if (hasUsername && !hasPassowrd){
            System.out.println("Parola este incorecta ");
        }else {
            System.out.println("Autentificare esuata ");
        }

        //19. Write a Java program that takes an integer variable age as input.
        // Use a ternary operator to classify the person into one of the following categories:
        // "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and
        // "Senior" (age 65 and above). Print the resulting classification.

        int age2 =63 ;
        System.out.println("Varsta este : " + age2 );
        if (age2 < 12 ) {
            System.out.println("Este copil ");
        } else if (age2 >=12 && age2 < 18 ) {
            System.out.println("Este adolescent ");
        } else if (age >= 18 && age < 65 ){
                    System.out.println("Este adult ");
        }else {
                    System.out.println("Este senior ");
                }


            }
        }


