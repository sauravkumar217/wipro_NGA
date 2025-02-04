//write a program that shows the implementation of null pointer exception &array index out of bound exception using try catch finally blocks
 
class ExceptionHandling {
    public static void main(String[] args) {
        // NullPointerException Example
        try {
            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This will always run for NullPointerException.");
        }

        // ArrayIndexOutOfBoundsException Example
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This will always run for ArrayIndexOutOfBoundsException.");
        }

        System.out.println("Program continues after exceptions.");
    }
}