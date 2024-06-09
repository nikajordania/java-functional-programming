import java.util.function.Function;

public class FunctionAndThenExample {
    public static void main(String[] args) {
        Function<String, String> processor = StringProcessors.createStringProcessor(true, true, "Prefix: ");

        Function<String, String> processor2 = str -> str + " <<Suffix";

        Function<String, String> combinedProcessor = processor.andThen(processor2);

        String result = combinedProcessor.apply("   hello world   ");
        System.out.println(result);
    }
}
