import java.util.function.*;

public class LambdaExample {

    public static void main(String[] args) {


        Function<Integer, Integer> square = x -> x * x;

        int result = square.apply(5);
        System.out.println(result);


        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;


        int sum = add.apply(3, 4);
        System.out.println(sum);


        Runnable helloWorld = () -> System.out.println("Hello World");
        helloWorld.run();


        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

        int maximum = max.apply(5, 8);
        System.out.println(maximum);


        Supplier<Integer> random = () -> (int) (Math.random() * 100);

        int randomNumber = random.get();
        System.out.println(randomNumber);


        IntPredicate isEven = (number) -> {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
                return true;
            } else {
                System.out.println(number + " is odd");
                return false;
            }
        };

        boolean resultIsEven1 = isEven.test(7);
        boolean resultIsEven2 = isEven.test(2);
        System.out.println("Is 7 even? " + resultIsEven1);
        System.out.println("Is 2 even? " + resultIsEven2);
    }
}
