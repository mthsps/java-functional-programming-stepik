package chapter6;

import java.util.Arrays;
import java.util.Scanner;

// https://stepik.org/lesson/562755/step/10
class NumbersProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .map(n -> n * 2)
                .parallel()
                .forEachOrdered(System.out::println);
    }
}
