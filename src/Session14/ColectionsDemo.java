package Session14;

import java.util.*;

public class ColectionsDemo {
    public static void main(String[] args) {
        listDemo();
        setDemo();
        mapDemo();
    }

    private static void listDemo() {
        System.out.println("list demo \n");
        List<Integer> numbers = initialiseList();
        System.out.println("Numbers list " + numbers);
        List<Integer> newNumbers = updateList(numbers, 5, 500);
        System.out.println("NewNumbers List " + newNumbers);
        System.out.println("is number 500 in list ? : " + isElementPresent(newNumbers, 500));
    }

    private static List<Integer> initialiseList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> updateList(List<Integer> numbers, int index, int value) {
//        numbers.set(index,value);
//        return numbers;
        if (index < 0 || index >= 10) {
            System.out.println("invalid index");
            return numbers;
        }
        List<Integer> newList = new ArrayList<>(numbers);
        newList.set(index, value);
        return newList;
    }

    private static boolean isElementPresent(List<Integer> list, int value) {
//        for (int i = 0 ; i< list.size(); i++){
//            if (list.get(i) == value) return true;
//        }
//        return false;
//    }
        return list.contains(value);
    }

    private static void setDemo(){
        System.out.println("\n set demo \n");

        zileleSaptamanii();
        Set<String> hasSet = new HashSet<>();
        hasSet.add("A");
        hasSet.add("B");
        hasSet.add("C");

    }
    private static void zileleSaptamanii(){
        EnumSet<ZiuaSaptamanii> zile = EnumSet.range(
                ZiuaSaptamanii.LUNUI,
                ZiuaSaptamanii.MIERCURI
        );
        System.out.println("Enmu Set: " + zile);

        zile.add(ZiuaSaptamanii.JOI);
        zile.add(ZiuaSaptamanii.VINERI);
        System.out.println("Enmu Set: " + zile);
        zile.add(ZiuaSaptamanii.VINERI);
        System.out.println("Enmu Set: " + zile);

    }
    enum ZiuaSaptamanii{
        LUNUI, MARTI , MIERCURI , JOI , VINERI
    }

    private static void mapDemo(){
        System.out.println("\n map demo \n");
        Map<String,Integer> students = initielizeMap();
        System.out.println("Students Map : " + initielizeMap());
        System.out.println(students.get("Marcel"));
        students.remove("Vio");
        System.out.println("Students : " + students);
        System.out.println("Avem studenti cu varsta de 42? " + students.containsValue(42));

        for (Integer age : students.values()){
            System.out.println("varsta: " + age);
        }

        for (Map.Entry<String,Integer> entry : students.entrySet()){
            System.out.println("key: " + entry.getKey() + "  value : " + entry.getValue());
        }
    }

    private static Map<String,Integer> initielizeMap(){
        Map<String,Integer> students = new HashMap<>();
        students.put("Marcel", 39);
        students.put("Marcella", 40);
        students.put("Vio" , 23);
        return students;
    }
}
