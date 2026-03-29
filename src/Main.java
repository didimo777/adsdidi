import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print("TASK1"+"\n");
        System.out.print("Enter n for sum of squares: ");
        int n1 = scanner.nextInt();
        System.out.println("Result: " + sumOfSquares(n1));

        // Task 2
        System.out.print("TASK2"+"\n");
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        fillArray(arr, 0, scanner); // рекурсивный ввод

        System.out.print("Enter n (how many elements to sum): ");
        int n2 = scanner.nextInt();
        System.out.println("Result: " + sumArray(arr, n2));

        // Task 3
        System.out.print("TASK3"+"\n");
        System.out.print("Enter base (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter power limit (n): ");
        int n3 = scanner.nextInt();
        System.out.println("Result: " + sumOfPowers(b, n3));

        // Task 4
        System.out.print("TASK4"+"\n");
        System.out.print("How many numbers to reverse: ");
        int n4 = scanner.nextInt();
        System.out.println("Enter numbers:");
        reverseInput(n4, scanner);

        scanner.close();
    }

    // Task 1
    public static int sumOfSquares(int n) {
        if (n == 1) return 1;

        return n * n + sumOfSquares(n - 1);

        /*
         * Time Complexity: O(n)
         * Explanation: one recursive call per value of n
         */
    }

    // Task 2 (sum)
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;

        return arr[n - 1] + sumArray(arr, n - 1);

        /*
         * Time Complexity: O(n)
         * Explanation: processes n elements recursively
         */
    }

    public static void fillArray(int[] arr, int index, Scanner scanner) {
        if (index == arr.length) return;

        arr[index] = scanner.nextInt();
        fillArray(arr, index + 1, scanner);

        /*
         * Time Complexity: O(n)
         */
    }

    // Task 3
    public static int sumOfPowers(int b, int n) {
        if (n == 0) return 1;

        return power(b, n) + sumOfPowers(b, n - 1);

        /*
         * Time Complexity: O(n^2)
         * Explanation: power() is O(n) and called n times
         */
    }

    public static int power(int b, int n) {
        if (n == 0) return 1;

        return b * power(b, n - 1);

        /*
         * Time Complexity: O(n)
         */
    }

    // Task 4
    public static void reverseInput(int n, Scanner scanner) {
        if (n == 0) return;

        int x = scanner.nextInt();

        reverseInput(n - 1, scanner);

        System.out.print(x + " ");

        /*
         * Time Complexity: O(n)
         * Explanation: one recursive call per input
         */
    }
}