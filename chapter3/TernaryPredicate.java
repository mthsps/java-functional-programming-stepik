package chapter3;

//https://stepik.org/lesson/529937/step/12
public class TernaryPredicate {
    @FunctionalInterface
    public interface TernaryIntPredicate<I, R> {
        R test(I a, I b, I c);// write your code here
    }

    public static final TernaryIntPredicate<Integer, Boolean> allValuesAreDifferentPredicate =
            (a, b, c) -> !a.equals(b) && !b.equals(c) && !a.equals(c);// write a lambda expression here
}
