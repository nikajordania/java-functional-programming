import java.util.function.Function;

public class ConstructorReferences {
    public static void main(String[] args) {
        Function<String, Person> personCreator = Person::new;
        Person person = personCreator.apply("Alice");
        System.out.println(person); // Output: Alice

//        BiFunction<String, Integer, Person> personCreator = Person::new;
//        Person person = personCreator.apply("Alice",12);
//        System.out.println(person); // Output: Alice

//        Function3<String, Integer, String, Person> personCreator = Person::new;
//        Person person = personCreator.apply("Alice", 30, "New York");
//        System.out.println(person); // Output: Alice (30), New York

    }
}

@FunctionalInterface
interface Function3<T, U, V, R> {
    R apply(T t, U u, V v);
}