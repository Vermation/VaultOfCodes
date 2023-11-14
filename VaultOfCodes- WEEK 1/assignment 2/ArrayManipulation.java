// In Java, arrays start at index 0. 
// So, if you have an array of 5 numbers, the indices are 0, 1, 2, 3, and 4.
// The loop in your code is trying to print out the numbers in the array, but it's going one too far. 
// It's trying to print out the number at index 5, but there is no number at index 5. 
// This will cause an error called an ArrayIndexOutOfBoundsException.


public class ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

// To fix this issue, you should change the loop condition to i < numbers.length:
// This will ensure that the loop runs for valid indices (0 to numbers.length - 1) and avoids the ArrayIndexOutOfBoundsException.