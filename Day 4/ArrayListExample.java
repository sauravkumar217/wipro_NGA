import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add five integer elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Remove the third element
        numbers.remove(2);

        // Update the second element with a new value
        numbers.set(1, 25);

        // Display all the elements using a loop
        System.out.println("Elements of the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
