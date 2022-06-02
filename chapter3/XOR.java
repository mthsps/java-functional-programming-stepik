package chapter3;

import java.util.function.Predicate;

public class XOR {

    public static <T> Predicate<T> xor(Predicate<T> predicate1, Predicate<T> predicate2) {
        return n -> predicate1.test(n) != predicate2.test(n);
    }

}
