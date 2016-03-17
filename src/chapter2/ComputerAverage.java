package chapter2;

import java.util.Scanner;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class ComputerAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter three numbers:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double average = (number1 + number2 + number3) / 3;
        System.out.printf("The average of " + number1 + " " + number2 + " " + number3 +
        " is " + average);
    }
}
