import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
//        Static Method References
        Function<String, Integer> parseInt = Integer::parseInt;
        Integer number = parseInt.apply("123");
        System.out.println(number);

//        Instance Method References
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);

//        Instance Method References of an Arbitrary Object
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        names1.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


//        Constructor References
        Supplier<StringBuilder> stringBuilderSupplier = StringBuilder::new;
        StringBuilder stringBuilder = stringBuilderSupplier.get();
        stringBuilder.append("Hello, World!");
        System.out.println(stringBuilder.toString()); // Output: Hello, World!

    }
}
