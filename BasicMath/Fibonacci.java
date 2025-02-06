package BasicMath;

public class Fibonacci {

    // Method to find Fibonacci number using a for loop
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Return n if n is 0 or 1
        }

        int a = 0, b = 1;  // Initializing the first two Fibonacci numbers

        // Loop to calculate the nth Fibonacci number
        for (int i = 2; i <= n; i++) {
            int next = a + b;  // Calculate the next Fibonacci number
            a = b;  // Move the previous number to 'a'
            b = next;  // Move the next number to 'b'
        }
        
        return b;  // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        int n = 10;  // Find the 10th Fibonacci number
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
