import java.util.Scanner;

public class printname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        printGfg(N);
        
        scanner.close();
    }
    static void printGfg(int N) {
        // code here
        if(N == 0) return;
        
        System.out.print("GFG ");
        printGfg(N-1);
    }
}



