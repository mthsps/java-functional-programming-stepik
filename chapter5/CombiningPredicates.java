package chapter5;

import java.util.function.IntPredicate;
import java.util.stream.Stream;

// https://stepik.org/lesson/562759/step/7
class CombiningPredicates {

    /**
     * The method represents the conjunction operator for a stream of predicates.
     * For an empty stream it returns the always true predicate.
     */
    public static IntPredicate conjunctAll(Stream<IntPredicate> predicates) {
        return predicates.reduce(n -> true, IntPredicate::and);  // write your code here
    }

}
