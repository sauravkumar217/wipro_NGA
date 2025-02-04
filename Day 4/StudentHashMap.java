import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");

        // Retrieve and display the name of a student using a specific roll number
        int rollNumberToFind = 103;
        String studentName = students.get(rollNumberToFind);
        System.out.println("Student with roll number " + rollNumberToFind + ": " + studentName);

        // Remove a student entry using a roll number
        int rollNumberToRemove = 104;
        students.remove(rollNumberToRemove);
        System.out.println("Removed student with roll number " + rollNumberToRemove);

        // Display all student records
        System.out.println("All student records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
