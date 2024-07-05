public class fibbonacci {
    public static void main(String[] args) {
        // Test cases
        int n1 = 0;
        int n2 = 1;
        int n3 = 5;
        int n4 = 10;
        
        System.out.println("Fibonacci(" + n1 + "): " + fib(n1));
        System.out.println("Fibonacci(" + n2 + "): " + fib(n2));
        System.out.println("Fibonacci(" + n3 + "): " + fib(n3));
        System.out.println("Fibonacci(" + n4 + "): " + fib(n4));
    }
    public static int fib(int n) {
        if(n<1) return 0;
        else if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
    

