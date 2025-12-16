package HomeWorks;

import java.util.*;

public class Home8 {
    public static void main(String[] args) {

//        listaCumparaturi();
//        listaDorinte();
//        studentList();
//        numaratoare();
//        listaOrase();
//        listaStudenti();
        listaFilme();

    }

    //1. Create a shopping list with Array and print the values
    public static void listaCumparaturi() {

        String[] lista = {"Ulei", "Lapte", "Sare", "Malai"};
        System.out.println(Arrays.toString(lista));
    }

    //2. Create a wishlist for christmas with ArrayList and print the values
    public static void listaDorinte() {
        ArrayList<String> dorite = new ArrayList<>(Arrays.asList("bomboane", "masinuta", "ciocolata"));
        System.out.println(dorite);
    }

    //3. Create
    //2 empty ArrayLists: studentList and graduateStudentList
    //populate studentList with 10 students
    //copy values from studentList to graduateStudentList
    //iterate through graduateStudentList and print each graduated student
    public static void studentList() {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.add("Daniel");
        studentList.add("Razvan");
        studentList.add("Ionut");
        studentList.add("Alex");
        studentList.add("Diana");
        studentList.add("Rares");
        studentList.add("Lavinia");
        studentList.add("Dragos");
        studentList.add("Maria");
        studentList.add("Ana");
        graduateStudentList.add(String.valueOf(studentList));
        System.out.println(graduateStudentList);
        for (String student : graduateStudentList) {
            System.out.println(student);
        }


    }

    //4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
    public static void numaratoare() {

        int[] numere = {12, 14, 17, 21, 33, 44, 20, 15, 11, 8};
        int par = 0;
        int impar = 0;
        for (int i : numere) {
            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Numarul numerelor pare este  : " + par);
        System.out.println("Numarul numerelor impare este : " + impar);

    }
    //5. Create an ArrayList that stores city names. Add at least five city names initially.
    // Then, prompt the user to add a city name.
    // If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.

    public static void listaOrase() {

        ArrayList<String> orase = new ArrayList<>(Arrays.asList("Craiova", "Valcea", "Brasov", "Timisoara", "Pitesti"));
        System.out.println(orase);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti orasul:");
        String orase2 = scanner.nextLine();
        if (orase.contains(orase2)) {
            System.out.println("Orasul este in lista");
        } else {
            orase.add(orase2);
            System.out.println(orase);
        }


    }
    //6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
    // If it does, remove that name from the list.
    public static void listaStudenti() {
        List<String> studenti = new LinkedList<>(List.of("Maria", "Ion", "Valentin", "Alexandru", "Ana"));
        System.out.println(studenti);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele studentului : ");
        String student = scanner.nextLine();
        if (studenti.contains(student)){
            studenti.remove(student);
            System.out.println(studenti);
        }else{
            System.out.println("Studentul nu este pe lista");
        }

    }
//8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
// If it does, print out its position in the array.
    public static void listaFilme(){

        String[] filme = {"Avatar","Titanic","Superman","Transformars","Frankenstein"};
        System.out.println(Arrays.toString(filme));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele filmului : ");
        String film = scanner.nextLine();
        for(int i= 0 ; i <= filme.length ; i++){
            if (filme[i].equalsIgnoreCase(film)) {
                System.out.println(film + " se afle pe pozitia" + i);
                break;
            }else {
                System.out.println("Filmul nu este in lista");

            }
        }


    }

}
