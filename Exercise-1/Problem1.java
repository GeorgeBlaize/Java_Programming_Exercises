
//Java Program to Print an Integer (Entered by the User)

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner input= new Scanner(System.in);

        int num= input.nextInt();

        System.out.println("You entered: "+num);
    }

}
