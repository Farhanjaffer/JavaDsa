import java.util.Scanner;

public class reversenumprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        printNos(N);
        
        scanner.close();
    }
    static void printNos(int N) {
        // code here
        if (N == 0) return;
        
        System.out.print(N + " ");
        printNos(N-1);
    }
}
