import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {

    private static final String[] NAMES = {
            "Alice", "Bob", "Charlie", "David", "Eve",
            "Frank", "Grace", "Heidi", "Ivan", "Judy",
            "Mallory", "Niaj", "Oscar", "Peggy", "Quentin",
            "Rupert", "Sybil", "Trent", "Uma", "Victor"
    };

    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String name = NAMES[random.nextInt(NAMES.length)];
            int age = random.nextInt(50) + 1;
            users.add(new User(name, age));
        }

        return users;
    }
}
