package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double width,height,bmi;
        System.out.print("Nhập width :");
        width = scanner.nextDouble();
        System.out.print("Nhập height : ");
        height = scanner.nextDouble();
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        bmi = width/Math.pow(height,2);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
