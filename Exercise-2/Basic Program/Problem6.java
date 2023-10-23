package Basic_Programs;

//Multiplication of two numbers from user input

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scan.nextInt();

        System.out.println("Enter second number: ");
        int num2=scan.nextInt();

        scan.close();

        int product=num1*num2;
        System.out.println("Output: "+product);
    }
}
