package chapter6;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://stepik.org/lesson/562760/step/12
class CalculateAverageSalary {

    private static double calcAverageSalary(Collection<Integer> salaries) {
        return salaries.stream().mapToInt(i -> i).summaryStatistics().getAverage(); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> salaries = scanner.tokens()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(calcAverageSalary(salaries));
    }
}
