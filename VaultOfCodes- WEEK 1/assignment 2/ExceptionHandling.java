// The program is trying to divide two numbers, but there is a possibility that the division cannot be performed, such as when dividing by zero.
// This is called an exception.

// The program is not currently handling this exception properly. 
// If an exception occurs, the program will crash.

// Additionally, the program is printing the result of the division before the division is actually performed. 
// This means that if the division cannot be performed, the program will still try to print the result, which will cause an error.

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

// In this corrected version:

// I added a try-catch block around the division operation in the main method to catch the ArithmeticException that may occur when dividing by zero.
// I moved the System.out.println("Result: " + result); statement inside the try block to ensure it is only executed when there is no exception.
// Now, the program should handle both array index out of bounds and division by zero exceptions gracefully.