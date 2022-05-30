package chapter3;

import java.util.Scanner;
import java.util.function.Function;

//https://stepik.org/lesson/529935/step/6
class DigitsSubstitution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();

        int result = Utils.substitution(n, digit -> (digit >= 5 && digit <= 9) ? digit-4 : digit); // modify the lambda expression

        System.out.println(result);
    }
}

class Utils {

    public static int substitution(long n, Function<Integer, Integer> digitRule) {
        String numberAsString = String.valueOf(n);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            result *= 10;
            int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            result += digitRule.apply(nextDigit);
        }

        return result;
    }
}
