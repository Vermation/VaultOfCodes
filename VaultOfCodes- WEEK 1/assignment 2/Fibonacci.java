// The problem with the code is that it takes a long time to run because it keeps doing the same calculations over and over again. 
// To make it faster, we can use a trick called memoization. It's like keeping a record of the answers to the calculations so that we don't have to redo them every time. 
// Here's a new version of the code that uses memoization to speed things up:

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Check if the result is already memoized
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Calculate the Fibonacci number and memoize the result
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}

// I made a change in the code by adding a special storage space called "memo" to keep track of Fibonacci numbers we've already figured out.
// Before doing any new calculations, the code now looks into this storage to see if it already knows the answer for a particular position (let's call it 'n'). 
// If it does, great! It just uses that stored answer instead of doing the same calculation again. 
// If the answer isn't stored yet, the code calculates the Fibonacci number as usual and then saves it in the "memo" storage. 
// This tweak makes the Fibonacci calculations faster by avoiding unnecessary repetitive work.