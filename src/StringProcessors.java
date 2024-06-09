import java.util.function.Function;

public class StringProcessors {
    // Higher-order function that returns a string processor
    public static Function<String, String> createStringProcessor(boolean toUpperCase, boolean trim, String prefix) {
        return str -> {
            if (toUpperCase) {
                str = str.toUpperCase();
            }
            if (trim) {
                str = str.trim();
            }
            return prefix + str;
        };
    }
}
