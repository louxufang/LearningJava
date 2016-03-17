package chapter2;

import java.util.Scanner;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class ComputerAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nuimber for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area for the circle of radiuus " + radius + " is "+ area);
    }


}
