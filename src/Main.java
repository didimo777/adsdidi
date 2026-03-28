public class Main {

    public static void main(String[] args) {

        // Task 1
        System.out.println(sumOfSquares(4)); // 1^2+2^2+3^2+4^2 = 30

        // Task 2
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr, 3)); // 1+2+3k = 6

        // Task 3
        System.out.println(sumOfPowers(2, 3)); // 1+2+4+8 = 15

        // Task 4
        System.out.println("Enter 3 numbers:");
        reverseInput(3);
    }

    /**
     * Task 1: Sum of squares
     * Computes 1^2 + 2^2 + ... + n^2
     */
    public static int sumOfSquares(int n) {
        if (n == 1) return 1;

        return n * n + sumOfSquares(n - 1);

        /*
         * Time Complexity: O(n)
         * Explanation: The function makes one recursive call for each value of n,
         * decreasing n by 1 each time until it reaches 1.
         */
    }

    /**
     * Task 2: Sum of first n elements of array
     */
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;

        return arr[n - 1] + sumArray(arr, n - 1);

        /*
         * Time Complexity: O(n)
         * Explanation: The function processes each of the first n elements once,
         * making n recursive calls.
         */
    }

    /**
     * Task 3: Sum of powers
     * Computes b^0 + b^1 + ... + b^n
     */
    public static int sumOfPowers(int b, int n) {
        if (n == 0) return 1;

        return power(b, n) + sumOfPowers(b, n - 1);

        /*
         * Time Complexity: O(n^2)
         * Explanation: For each recursive call (n times),
         * we compute power(b, n), which itself takes O(n).
         */
    }

    // Helper method for exponentiation
    public static int power(int b, int n) {
        if (n == 0) return 1;

        return b * power(b, n - 1);

        /*
         * Time Complexity: O(n)
         */
    }

    /**
     * Task 4: Reverse input without arrays or loops
     */
    public static void reverseInput(int n) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        if (n == 0) return;

        int x = scanner.nextInt();

        reverseInput(n - 1);

        System.out.print(x + " ");

        /*
         * Time Complexity: O(n)
         * Explanation: The function reads and prints each element once,
         * using n recursive calls.
         */
    }
}