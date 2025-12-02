package sesion5;

import java.util.Scanner;

public class SwitchStatemen {

    public static final int MONDAY = 1 ;
    public static final int THUSDAY = 2 ;
    public static final int WENDSDAY = 3 ;
    public static final int THURSDAY = 4 ;
    public static final int FRIDAY = 5 ;


    public static void main(String[] args) {
       // printDayOfWeek();
       // printDayOfWeekSimpleEdition();
        printGrade();

    }

    private static void printDayOfWeek(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu ziua: ");
        String day = input.nextLine();

        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Thusday":
                System.out.println("Tuday is Thusday");
                break;
            case "Wendsday":
                System.out.println("Today is Wendsday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Fryday");
                break;
            default:
                System.out.println("Today is Weekend");
        }


    }

    private static void printDayOfWeekSimpleEdition(){
        Scanner imput = new Scanner(System.in);
        System.out.println("Inserati 1-5 numarul zilei : ");
        int day = imput.nextInt();
        switch (day){
            case MONDAY -> System.out.println("Monday");
            case THUSDAY -> System.out.println("Thusday");
            case WENDSDAY -> System.out.println("Wendday");
            case THURSDAY -> System.out.println("Thusday");
            case FRIDAY ->{
                System.out.println("Friday");
                System.out.println("is it Friday?");
            }
            default -> System.out.println("Weekend");
            }



        }
        private static void printGrade(){
        Scanner inpet = new Scanner(System.in);
            System.out.println("inserati o nota de la A la D ");
            char grade = inpet.nextLine().toUpperCase().charAt(0);
            switch (grade){
                case 'A' -> System.out.println("bravo");
                case 'B'-> System.out.println("almost");
                case 'C'-> System.out.println("not bad");
                case  'D'-> System.out.println("Bad");
                default -> System.out.println("Verry Bad");

            }
        }
    }

