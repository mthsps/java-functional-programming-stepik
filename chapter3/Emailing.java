package chapter3;

import java.util.Scanner;
import java.util.function.Function;

// https://stepik.org/lesson/529935/step/9
// It doesn't work correctly outside Stepik
class Emailing {

    public static final String PIPE = "|";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sender = scanner.nextLine();
        String receiver = scanner.nextLine();
        String signature = scanner.nextLine();

        Function<String, String> emailFormatter = text ->
                String.join("|", sender, receiver, text, signature); // modify the lambda expression

        System.out.println(emailFormatter.apply(scanner.nextLine()));
    }
}
