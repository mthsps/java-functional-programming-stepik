package chapter3;

import java.util.function.BiFunction;

// https://stepik.org/lesson/529935/step/4
class Operator {
    static BiFunction<Integer, Integer, Integer> function = (x, y) -> (x < y) ? x : y;
}