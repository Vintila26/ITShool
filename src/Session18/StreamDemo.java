package Session18;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        demoFilterForEach();
        System.out.println("\n Map and colect exampels");
        System.out.println(demoMapCollect());
        System.out.println("Distinct , Sorted and collect exampel");
        distinctDemoSortedCollect();
        System.out.println("FlatMap and Collect");
        demoFlatMapCollect();
        System.out.println("Count");
        demoCount();
    }
    private static void demoFilterForEach(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter( n -> n % 3 == 0 )
                .filter( n -> n % 2 == 0 )
//                .forEach(n-> System.out.print(n+" "));
                .forEach(System.out::print);

    }
    private static List<String> demoMapCollect(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
       List<String> numbersString =  numbers.stream()
                .map(n->"Nr: "+ n)
               .collect(Collectors.toList());
       return numbersString;


    }
    private static void distinctDemoSortedCollect(){
        List<Integer> numbers = List.of(1,2,1,4,2,1,7,8,5,6);
        List<Integer> newnumber = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(newnumber);
    }

    private static void demoFlatMapCollect(){
        List<List<String>> listOfList = List.of(List.of("a","b") , List.of("c"),List.of("d","e"));
        List<String> list = listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void demoCount(){
        List<String> list = List.of("Marcel ", "Marcella","Ion");
        long count = list.stream()
                .filter(n->n.length() > 3)
                .count();
        System.out.println(count);

    }



}
