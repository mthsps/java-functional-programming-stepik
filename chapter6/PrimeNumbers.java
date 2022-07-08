package chapter6;

import java.util.stream.LongStream;

//
public class PrimeNumbers {

    public static LongStream createPrimesFilteringStream(long start, long end) {
        // write your code here
        return LongStream.rangeClosed(start, end).filter(NumberUtils::isPrime).parallel();
    }

    static class NumberUtils {
        public static boolean isPrime(long n) {
            return n > 1 && LongStream
                    .rangeClosed(2, n - 1)
                    .noneMatch(divisor -> n % divisor == 0);
        }
    }

    public static void main(String[] args) {
        createPrimesFilteringStream(0,1000).forEach(System.out::println);
    }

}
