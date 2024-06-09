import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctionExample {


    public static void main(String[] args) {
        IntBinaryOperator add = (a, b) -> a + b;
        IntBinaryOperator subtract = (a, b) -> a - b;
        IntBinaryOperator multiply = (a, b) -> a * b;
        int x = 10;
        int y = 5;
        int resultAdd = applyOperation(x, y, add);
        int resultSubtract = applyOperation(x, y, subtract);
        int resultMultiply = applyOperation(x, y, multiply);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);


        operateAndPrint(5, lambda -> lambda * lambda);
        operateAndPrint(10, lambda -> lambda + 5);

        operateAndPrint(arr -> (arr[0] + " "), "nika", "zhordania", "Hello", "World");

        operateAndPrint("Hello", str -> str.length(), len -> "Length: " + len);


    }

    public static int applyOperation(int a, int b, IntBinaryOperator operation) {
        return operation.apply(a, b);
    }


    public static <T, R> void operateAndPrint(T value, Function<T, R> function) {
        R result = function.apply(value);
        System.out.println("Result: " + result);
    }

    public static <T, R> R applyOperation(T value, Function<T, R> function) {
        return function.apply(value);
    }

    public static <T, U, R> void operateAndPrint(T value, U argument, BiFunction<T, U, R> function) {
        R result = function.apply(value, argument);
        System.out.println("Result: " + result);
    }


    public static <T, U, V, R> void operateAndPrint(T value1, U value2, V value3, TriFunction<T, U, V, R> function) {
        R result = function.asdasd(value1, value2, value3);
        System.out.println("Result: " + result);
    }


    public static <T, R> R operateAndPrint(Function<T[], R> function, T... values) {
        R result = function.apply(values);
        System.out.println("Result: " + result);
        return result;
    }

    public static <T, R, V> void operateAndPrint(T value, Function<T, R> function, Function<R, V> after) {
        V result = function.andThen(after).apply(value);
        System.out.println("Result: " + result);
    }
}

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R asdasd(T t, U u, V v);
}
