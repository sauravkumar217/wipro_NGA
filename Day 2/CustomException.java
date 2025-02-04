//Write a java program by creating a custom exception of your own 
 
// Step 1: Create a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Call the constructor of the parent class (Exception)
    }
}

// Step 2: Create a class to use the custom exception
public class CustomException {

    // Method to check age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw the custom exception if age is invalid
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid. You are eligible.");
        }
    }

    public static void main(String[] args) {
        int age = 15; // Example age

        try {
            // Call the method that may throw the custom exception
            validateAge(age);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This will always run, regardless of exceptions.");
        }

        System.out.println("Program continues after exception handling.");
    }
}