package Basic_Programs;

//User input
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int num;
        float fnum;
        String str;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str=in.nextLine();
        System.out.println("Input String is: "+str);

        System.out.println("Enter an integer: ");
        num=in.nextInt();
        System.out.println("Input Input is: "+num);

        System.out.println("Enter a float number: ");
        fnum=in.nextFloat();
        System.out.println("Input Float number is: "+fnum);
    }
}
