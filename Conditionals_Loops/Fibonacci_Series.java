package Conditionals_Loops;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        // initialise array
        int[] arr = new int[10];

        // first 2 elements initialise, defined & printed
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]);
        System.out.print(" " + arr[1]);

        // loop
        int i = 0;
        while(i<=4){
            arr[i+2] = arr[i] + arr[i+1]; // storing element in array
            System.out.print(" " + arr[i+2]); // printing the element
            i++;
        }

        // returning the exact fib number to user
        System.out.println();
        System.out.println("Enter the series position (within 10 range) : ");
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();
        System.out.println(arr[pos-1]);

    }
}
