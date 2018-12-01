import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]){
        System.out.println("Enter the number to find the nth fibonacci number");
        Scanner sc = new Scanner(System.in);
        long fib = sc.nextInt();
        long start = System.currentTimeMillis();
        System.out.println("Result is "+ fibonacci(fib));
        long end =System.currentTimeMillis();
        System.out.println(end-start +" ms taken to run the50 algorithm");
    }

    static long fibonacci(long n){

        //1,1,2,3,5,8,13...
        if(n<1){return 0;}
        if(n==1 || n==2){return 1;}

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
