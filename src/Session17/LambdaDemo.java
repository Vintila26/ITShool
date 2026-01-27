package Session17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface IntSum {
    int sum(int a, int b);
}

@FunctionalInterface
interface IntMultiply {
    int multiply(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        IntSum resultSum = (a, b) -> a + b;
        System.out.println(resultSum.sum(1, 2));

        IntMultiply resultMultiply = (a, b) -> a * b;
        System.out.println(resultMultiply.multiply(3, 2));
    }
}

@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        Calculator multy = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("sum " + sum.compute(2, 3));
        System.out.println("multy " + multy.compute(2, 3));
        System.out.println("div " + div.compute(6, 3));
    }
}

@FunctionalInterface
interface CreatingService {
    void create(String mag);
}

class CreatingServicePractice {
    public static void main(String[] args) {


        CreatingService anonymCreating = new CreatingService() {
            @Override
            public void create(String mag) {
                System.out.println("Hello from " + mag);
            }
        };

        anonymCreating.create("anonym Class");
    }
}

class LambdaStandardExample{
    public static void main(String[] args) {

        Runnable noParam = ()-> System.out.println("Hello from runnable");
        noParam.run();

        Consumer <String> oneParam = msg-> System.out.println("Hello from " + msg);
        oneParam.accept("from consumer");

        List<String> name =new ArrayList<>( List.of("Marcel"));
        Predicate<List> predicate = a->a.isEmpty();
        System.out.println(predicate.test(name));

    }
}
