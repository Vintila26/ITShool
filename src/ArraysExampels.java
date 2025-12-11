import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysExampels {
    public static void main(String[] args) {
//        arrayExampels();
//        arrayExampels2();
//        arrayListExampels1();
        linkedLIstExampels();
    }


    public static void arrayExampels(){

        String[] friends = {"Marcel" , "Marcela", "Maria", "Marius"};
        System.out.println("Primul prieten: " +friends[2]);
        System.out.println("numarul de prieteni: " +friends.length);
        friends[2] = "Andrei";
        System.out.println("Friends pe pozitia 2 : " +friends[2]);
        System.out.println("Toti prietenii: " + Arrays.toString(friends));


    }

    public static void arrayExampels2(){
        int[] numbers = {12 , 3, 5 , 1231, 2503};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,12));
        System.out.println(numbers[2]);
        int [] numbers2 = Arrays.copyOfRange(numbers, 2 ,4);
        System.out.println(Arrays.toString(numbers2));


    }

    public static void arrayListExampels1(){

        List<String> friends = new ArrayList<>(Arrays.asList("Marcel", "Marcela", "Rolando"));
        ArrayList<String> friends2 = new ArrayList<>();

//        friends = List.of("Marcel" , "Marcela", "Rolando");
        System.out.println(friends.get(2));
        System.out.println(friends.size());
        friends.add(1,"Messi the goat");
        System.out.println(friends.get(1));
        System.out.println(friends);
        friends.set(1,"Messi");
        System.out.println(friends);
        friends.clear();
        System.out.println(friends);
    }


    public static void linkedLIstExampels(){
        List<String> liked= new LinkedList<>();
        liked.add("Marcel");
        liked.add("Marcella");
        liked.add("Marius");

        System.out.println(liked.get(2));
        liked.add(1, "Maria");
        System.out.println(liked);
        liked.remove(0);
        System.out.println(liked);

    }
    public static void comparatii(){

        int size = 500000;
        List<String>  arryList = new ArrayList<>();
        List<String> linked = new LinkedList<>();

        for(int i=0 ; i<= size; i++){

            String value = String.valueOf(i);
            arryList.add(value);
            linked.add(value);
        }

        long start = System.currentTimeMillis() ;


    }

}
