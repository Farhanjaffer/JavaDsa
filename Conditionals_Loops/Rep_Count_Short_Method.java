package Conditionals_Loops;

public class Rep_Count_Short_Method {
    public static void main(String[] args){

        // intialise numbers & counter
        int num = 12321333;
        int a = 3;
        int count = 0;

        // conditional loop
        while(num > 0){
            int rem = num % 10;
            if (rem == a){
                count ++;
            }
            num = num / 10;
        }

        // output print
        System.out.println(count);
    }
}

// you would be thinking we can also use rem as a condition in loop but yor are wrong
// as when you will use num will still be num it will not change, so you need to change
// num then you can use rem as well but that increases the lines of code