import java.util.Scanner;

public class cubeseriessum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        System.out.println(sumOfSeries(N));
    }
    static long sumOfSeries(long n) {
        // code here
        if(n == 0) return 0;
            
        return (n*n*n)+sumOfSeries(n-1);
    }
}

