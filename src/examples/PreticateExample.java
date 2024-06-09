package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PreticateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C#");
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(p -> p.length() > 5)
                .forEach(System.out::println);

    }

}
