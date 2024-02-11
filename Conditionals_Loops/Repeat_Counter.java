package Conditionals_Loops;

import java.util.Scanner;

public class Repeat_Counter {
    public static void main(String[] args){
        // declare & user input the array
        int[] arr = new int[10];
        System.out.println("Enter the array : ");
        Scanner in = new Scanner(System.in);
        for (int i=0 ; i<10 ; i++){
            arr[i]=in.nextInt();
        }

        // number to be checked
        System.out.println("Enter the number to be checked : ");
        int num = in.nextInt();

        //initialise counter
        int count = 0;

        // checker loop
        for(int i=0 ; i<10 ; i++) {
            if (arr[i] == num){
                count++;
            }
        }
        System.out.println("No of repetitions : " + count);
    }
}
