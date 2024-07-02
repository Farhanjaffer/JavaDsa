public class minjumps {

    // Method to return the minimum number of jumps to reach the end of the array
    static int minJumps(int[] arr, int n) {
        // If the array length is 1, no jump is needed
        if (n <= 1) {
            return 0;
        }

        // If the first element is 0, it's not possible to move anywhere
        if (arr[0] == 0) {
            return -1;
        }

        // Variables to store the maximum reachable index, the number of jumps, and the steps we can still take
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        // Traverse the array
        for (int i = 1; i < n; i++) {
            // If we have reached the end of the array
            if (i == n - 1) {
                return jumps;
            }

            // Update the maximum reachable index
            maxReach = Math.max(maxReach, i + arr[i]);

            // Decrease the steps we can still take
            steps--;

            // If no more steps are left
            if (steps == 0) {
                // We must have used a jump
                jumps++;

                // Check if the current index is beyond the maximum reachable index
                if (i >= maxReach) {
                    return -1;
                }

                // Reinitialize the steps to the amount of steps to reach maxReach from position i
                steps = maxReach - i;
            }
        }

        return -1;  // If we can't reach the end of the array
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n = arr.length;
        System.out.println("Minimum number of jumps to reach end is: " + minJumps(arr, n));
    }
}
