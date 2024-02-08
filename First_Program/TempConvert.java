package First_Program;

import java.util.Objects;
import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args){
        System.out.println("What do you want to convert to? (Enter C or F)");
        Scanner ch = new Scanner(System.in);
        String option = ch.next();

        if (Objects.equals(option, "C")) {

            // c -> f
            System.out.println("Enter Temp in Celsius");
            Scanner input1 = new Scanner(System.in);
            float tempcel = input1.nextFloat();

            System.out.println("Temp in Fahrenheit : " + (1.8 * tempcel + 32));

        }

        else {

            // f -> c
            System.out.println("Enter Temp in Fahrenheit");
            Scanner input2 = new Scanner(System.in);
            float tempfah = input2.nextFloat();

            System.out.println("Temp in Celsius : " + (tempfah - 273.15));

        }
    }
}
