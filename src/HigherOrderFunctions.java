import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HigherOrderFunctions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Output: [2, 4, 6]


        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add3 = x -> x + 3;

        Function<Integer, Integer> multiplyThenAdd = multiplyBy2.andThen(add3);
        System.out.println(multiplyThenAdd.apply(5)); // Output: 13

        Function<Integer, Integer> addThenMultiply = multiplyBy2.compose(add3);
        System.out.println(addThenMultiply.apply(5)); // Output: 16


//        List<User> users = getAllUsers();
//        Collections.sort(users,
//                Comparator.comparing((u) -> u.getName()));
        List<User> users = UserGenerator.getAllUsers();
        users.stream()
                .filter((u) -> u.getAge() > 18)
                .limit(5)
                .sorted(Comparator.comparing(User::getName))
                .forEach(System.out::println);

    }

    void removeUserByName(String userName) {
        List<User> users = UserGenerator.getAllUsers();
        users.removeIf((u) ->
                u.getName().equals(userName));
    }

}
