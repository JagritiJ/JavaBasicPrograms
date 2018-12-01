import java.util.Scanner;

public class Factorial {


   public static void main(String args[]){

       System.out.println("Enter the number to find the factorial");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int fact = factorial(n);
       System.out.println("Here's the factorial " + fact);
   }

    static int factorial(int n) {

        if(n==1 || n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
