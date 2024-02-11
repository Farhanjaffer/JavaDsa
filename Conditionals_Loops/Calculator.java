package Conditionals_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while(true) {
            System.out.println("Specify Operation(+,*,-,/): ");
            char input = sc.next().trim().charAt(0);

            if(input == '+' || input == '*' || input == '/' || input == '-') {
                System.out.println("Enter number to add");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (input == '+') {
                    System.out.println((a+b) + " to end type X");
                } else if (input == '*') {
                    System.out.println(a*b + " to end type X");
                } else if (input == '/') {
                    System.out.println(a/b + " to end type X");
                } else if (input == '-') {
                    System.out.println(a-b + " to end type X");
                }
            }
            else if (input == 'X') {
                System.out.println(total);
                break;
            }
        }
    }
}
