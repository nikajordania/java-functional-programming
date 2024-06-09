import java.util.function.Function;

public class StringProcessorsDemo {
    public static void main(String[] args) {

        Function<String, String> processor = StringProcessors.createStringProcessor(true, true, "Prefix: ");

        String result1 = processor.apply("   hello world   ");
        System.out.println(result1); // Output: Prefix: HELLO WORLD

        Function<String, String> processor2 = StringProcessors.createStringProcessor(false, true, ">> ");

        String result2 = processor2.apply("   hello world   ");
        System.out.println(result2); // Output: >> hello world
    }
}
