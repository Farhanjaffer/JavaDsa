package Conditionals_Loops;

import java.util.Scanner;

public class Rep_in_Number {
    public static void main (String[] args){

        // intialise the variables to compare
        long num = 1334223423423L;
        int n = 121244;
        int a=3;

        // convert to string
        String str_num = Integer.toString(n);
        String str_long = "" + num;
        String str = Integer.toString(a);

        // intialise counter
        int counter1 = 0;
        int counter2 = 0;

        // loop to check repetitions in integer
        for(int i=0; i<str_num.length(); i++){
            if(str_num.charAt(i) == str.charAt(0)){
                counter1++;
            }
        }

        // loop to check repetitions in loop
        for(int i=0; i<str_long.length(); i++){
            if(str_long.charAt(i) == str.charAt(0)){
                counter2++;
            }
        }

        // print output
        System.out.println("for int : " + counter1);
        System.out.println("for long : " + counter2);
    }
}
