package Conditionals_Loops;

public class Reverse {
    public static void main(String[] args){
        int num = 12321333;
        int rev = 0;
        // conditional loop
        while(num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        // output print
        System.out.println(rev);
    }
}
