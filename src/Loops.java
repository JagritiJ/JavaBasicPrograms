import java.lang.reflect.Array;
import java.util.Scanner;

public class Loops {

    public static void main(String args[]) {
        //int count = printTenOddEvenNum();
        //System.out.println("here's the count " + count);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int fact = factorial(n);
        //System.out.println("factorial of number " + n + " is " + fact);
        //int fib = fibonacci(n);
        //System.out.println( n + "th Fibonacci number is "+ fib);

         reverse(n);
       // System.out.println("Reverse num is"+ reverseNum);
        tablesOfTen(n);

    }

    static int printTenOddEvenNum() {

        System.out.println("Printing 10 Even Num");
        int i = 2;
        int c = 0;
        while (c != 10) {
            System.out.println("c is " + c + " i is " + i);
            i = i + 2;
            c++;
        }
        return c;
    }


    static int factorial(int n) {

        if(n==1 || n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

    static int fibonacci(int n){

        //1,1,2,3,5,8,13...
            if(n==1 || n==2){return 1;}

            return fibonacci(n-1)+fibonacci(n-2);
    }

    static void reverse(int n ){
        int r =0;
        String str = "";
        //135 to 531
      /*  for(int i=1;i<=3;i++) {

            r = n % 10;
            str=str+r;
            n = n / 10;
        }
        System.out.println(str);
    */
       int c=0;
       int add =0;
        while(n!=0){

            r = n % 10;
            str=str+r;
            add =add+r;
            n = n / 10;
            c++;
        }
        System.out.println("reverse is " + str + " and no. of digits are " + c + "  addition of the digits is " + add);
    }

    static void addTheDigits(){

      //done above

    }

    static void tablesOfTen(int n){

        System.out.println("first 10 multiples of " + n + "are");
        int i=1;
        int tab =1;
        while(i<=10)
        {
            tab = n*i;
            System.out.println(tab);

            i++;
        }



    }

}


