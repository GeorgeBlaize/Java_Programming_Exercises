package Conditional_Programs;

//Check even or odd number

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter an Integer number: ");

        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        if(num%2==0){
            System.out.println("Entered numbered is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
}
