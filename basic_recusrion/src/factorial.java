import java.util.ArrayList;
import java.util.List;

public class factorial {
    
    public static List<Long> findFactorialNumbers(long n) {
        List<Long> factorialNumbers = new ArrayList<>();
        long factorial = 1;
        int i = 1;
        
        while (factorial <= n) {
            factorialNumbers.add(factorial);
            i++;
            factorial *= i;
        }
        
        return factorialNumbers;
    }

    public static void main(String[] args) {
        long n = 6; // Example input
        List<Long> factorialNumbers = findFactorialNumbers(n);
        
        System.out.println("Factorial numbers less than or equal to " + n + ": " + factorialNumbers);
    }
}

