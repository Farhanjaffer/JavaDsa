package First_Program;

import java.util.Scanner;

public class Typecasting {
    public static void main (String[] args){
        // here enter int value not float value it will automatically convert your int to float
        // this is called automatic typecasting in java
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        // here enter float value not int value it will not automatically convert your float to int
        // it won't happen cause float is a larger value than int small can be stored in large but large cant be in small
        Scanner input2 = new Scanner(System.in);
        int num2 = input.nextInt();
        System.out.println(num1);
        System.out.println(num2);


        // how to typecast manually (type cast -  compressing larger datatype into small explicitly)
        int num3 =(int)(67.46f);
        System.out.println(num3);
        // you will have only 67 printed not 67.46


        // automatic type conversion in expressions
        int a1 = 257;
        byte b1 = (byte)(a1);
        System.out.println(b1);
        // it printed 1 because a byte can store maximum of 256 only it only adds and gives the remainder of the value remains

        byte a2 = 40;
        byte b2 = 30;
        byte c = 100;
        int d = (a2*b2)/c;
        System.out.println(d);
        // here we see that when you multiply a2 and b2 we get a number a lot above the storage capacity of byte so java automatically type converts
        // into int while working on it in d

        int charachter = 'A';
        System.out.println(charachter);
        // here it will print its ASCII value 65
    }
}
