package chapter4;

import java.util.*;

// https://stepik.org/lesson/483643/step/8
class FindUserQuiz {

    public static Optional<User> findUserByAccountId(Set<User> users, String id) {
        // write your code here
       return users.stream()
               .filter(user -> Objects.equals(user.getAccount().get().getId(), id))
               .findAny();
    }
}

class Accounts {
    private final String id;

    public Accounts(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class User {
    private final String login;
    private final Accounts account;

    public User(String login, Accounts account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return login;
    }

    public Optional<Accounts> getAccount() {
        return Optional.ofNullable(account);
    }
}