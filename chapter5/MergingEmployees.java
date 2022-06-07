package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://stepik.org/lesson/562698/step/8
class MergingEmployees {

    public static Stream<String> mergeEmployees(Stream<String> empls1, Stream<String> empls2) {
        return Stream.concat(empls1, empls2).sorted(); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> employees1 = convertLineToEmployees(scanner.nextLine());
        List<String> employees2 = convertLineToEmployees(scanner.nextLine());

        mergeEmployees(employees1.stream(), employees2.stream()).forEach(System.out::println);
    }

    private static List<String> convertLineToEmployees(String line) {
        return Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
    }
}