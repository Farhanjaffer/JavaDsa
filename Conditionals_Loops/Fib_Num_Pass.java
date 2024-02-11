package Conditionals_Loops;

public class Fib_Num_Pass {
    public static void main(String[] args) {

        // initialising the starting two fib numbers
        int a=0;
        int b=1;

        // loop variable initialisation & loop
        int i=2;
        while(i<6){
            int temp=a+b;
            a=b;
            b=temp;
            i++;
        }

        // printing the fib term
        System.out.println(b);
    }
}
