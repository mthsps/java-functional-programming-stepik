package chapter6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://stepik.org/lesson/562761/step/7
class Classifier {

    public static Map<Integer, List<String>> group(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(String::length));// write your code here
    }
}
