class Solution {
    // Method to return the sum of divisors of all numbers from 1 to N
    static long sumOfDivisors(int N) {
        long sum = 0;
        for (int i = 1; i <= N; ++i) {
            sum += (N / i) * i;
        }
        return sum;
    }
}

public class divisorsum {
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {1, 2, 3, 4, 5, 6, 10, 12, 15, 20};

        for (int N : testCases) {
            long result = Solution.sumOfDivisors(N);
            System.out.println("Sum of divisors for N = " + N + " is: " + result);
        }
    }
}