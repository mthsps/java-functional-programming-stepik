package chapter4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

// https://stepik.org/lesson/483643/step/14
class PrintLoginQuiz {

    public static void printLoginIfPro(Set<User2> users, String id) {
        // write your code here
        users.stream()
                .filter(user -> user.getAccount().map(Account2::getId).map(id::equals).orElse(false))
                .filter(user -> user.getAccount().map(Account2::getType).map("pro"::equals).orElse(false))
                .forEach(user -> System.out.println(user.getLogin()));
    }
}

class Account2 {
    private String id;
    private String type;

    public Account2(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}

class User2 {
    private String login;
    private Account2 account2;

    public User2(String login, Account2 account2) {
        this.login = login;
        this.account2 = account2;

    }

    public String getLogin() {
        return login;
    }

    public Optional<Account2> getAccount() {
        return Optional.ofNullable(account2);
    }

}