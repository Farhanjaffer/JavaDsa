package First_Program;

import java.util.Scanner;

public class sum {
public static void main(String[] args){
    System.out.println("Enter the numbers a & b");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println("Your sum is " + (a+b));
}

}
