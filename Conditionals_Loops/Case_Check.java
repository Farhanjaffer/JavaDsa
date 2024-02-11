package Conditionals_Loops;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Case Check program
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("UPPERCASE");
        }
        // what below line of code does is it will print whatever the next string(only the first word) of code is
        System.out.println(input.next());
        // the below code will store the char at the given location and print it
        String sentence = input.next();
        System.out.println(sentence.charAt(3)); // charAt function
    }
}
