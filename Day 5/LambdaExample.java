import java.util.Arrays;
import java.util.List;

// Functional interface with a single abstract method
@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaExample{
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Sort the list in reverse alphabetical order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println("Sorted in reverse alphabetical order:");
        strings.forEach(System.out::println);

        // Create a lambda expression for the StringProcessor functional interface
        StringProcessor toUpperCaseProcessor = str -> str.toUpperCase();

        // Process the list of strings to convert them to uppercase
        System.out.println("\nUppercase versions of the strings:");
        strings.forEach(str -> System.out.println(toUpperCaseProcessor.process(str)));
    }
}