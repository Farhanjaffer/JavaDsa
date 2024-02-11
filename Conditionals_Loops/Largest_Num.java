package Conditionals_Loops;

import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args){

        System.out.print("Enter 3 numbers: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat(); // num 1
        float b = input.nextFloat(); // num 2
        float c = input.nextFloat(); // num 3

        if (a>b && a>c){
            System.out.println( a + " is the largest number");
        } else if (b > a && b > c) {
            System.out.println( b + " is the largest number");
        } else {
            System.out.println( c + " is the largest number");
        }

        // Use math function to do the same work in one line
        System.out.println(Math.max(Math.max(a,b),c));
    }
}

// you can also declare a new integer maximum and then define its value to be a then
// compare maximum with b,c then print accordingly

// You can use Math.max function to get the max of 2 numbers