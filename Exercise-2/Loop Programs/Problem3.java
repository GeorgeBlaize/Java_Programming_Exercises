package Loop_Programs;

//Fibonacci series

public class Problem3 {
    public static void main(String[] args) {

        int count=7,num1=0,num2=1,sumOfPrevTwo;
        System.out.println("Fibonacci Series of "+count+" number ");

        for(int i=1; i<=count; i++){
            System.out.println(num1+" ");

            sumOfPrevTwo=num1+num2;
            num1=num2;
            num2=sumOfPrevTwo;
        }
    }
}
