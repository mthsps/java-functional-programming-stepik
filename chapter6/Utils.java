package chapter6;

import java.util.stream.Stream;

// https://stepik.org/lesson/578900/step/9
final class Utils {

    private Utils() { }

    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream.iterate(1, n -> n <= numberOfUsers, n -> n + 1)
                .map(i -> new User(i,"user"+i+"@gmail.com"));
    }

    public static void main(String[] args) {
        Utils.generateUsers(3).forEach(user-> System.out.println(user.getId()+" "+user.getEmail()));
    }

}

class User {
    private final long id;
    private final String email;

    User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
