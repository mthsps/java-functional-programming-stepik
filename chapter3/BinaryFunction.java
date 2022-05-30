package chapter3;

// https://stepik.org/lesson/509722/step/4

@FunctionalInterface
public interface BinaryFunction<T, U, R> {
    R apply(T argument1, U argument2);
}
