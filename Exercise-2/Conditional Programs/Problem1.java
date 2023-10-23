package Conditional_Programs;

//Check positive or negative number

public class Problem1 {
    public static void main(String[] args) {

        int number=109;
        if(number>0){
            System.out.println(number+" is a positive number");
        }
        else if(number<0){
            System.out.println(number+" is a negative number");

        }
        else{
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
