package DynamicProgramming;

public class Fibonacci {

    public static void main(String args[]){
     int x= fib(7);
     System.out.println("x is .."+x);
    }

    static int fib(int n){
        return fib(n, new int[n+1]);
    }

    static int fib(int i, int[] memo){
        if(i==0 || i==1) {return i;}
        if(memo[i]==0){
            memo[i]=fib(i-1, memo)+fib(i-2, memo);
            System.out.println(memo[i]);
        }
        return memo[i];
    }

}
