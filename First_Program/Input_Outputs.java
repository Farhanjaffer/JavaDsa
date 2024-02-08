package First_Program;

import java.util.Scanner;

public class Input_Outputs {

    public static void main(String[] args){

        // here ln is used to change to next line
        System.out.println("Enter the number");
        // instead of System.in you can also use file actions
        // for integers
        Scanner num= new Scanner(System.in);
        System.out.println(num.nextInt());

        // for strings
        System.out.println("Enter the string");
        Scanner str= new Scanner(System.in);
        System.out.println(str.next());

        // for full line
        System.out.println("Enter the line");
        Scanner ln= new Scanner(System.in);
        System.out.println(ln.nextLine());

        Scanner input = new Scanner(System.in);
        int rollno= input.nextInt();
        System.out.println( "Your number inserted is "+ rollno);

    }
}