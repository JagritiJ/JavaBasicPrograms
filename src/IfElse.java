import java.util.Scanner;

public class IfElse {


    public static void main(String args[]) {

        System.out.println("what's your age, enter in numbers");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        vote(num);
        isOddEven(num);
        isPrime(num);
    }

    static void vote(int age) {

        if (age >= 18) {
            System.out.println("Enjoy the right to vote");
        } else {
            System.out.println("Wait until you are 18 years of age");
        }
    }

    static void isOddEven(int x) {
         if(x%2==0)
         {System.out.println("number is even"); }
         else{System.out.println("number is odd");}

        }

    static void isPrime(int x){

        int y = 1;

        if(x ==0 || x==1){
            System.out.println("Number is Not prime");
        }
        else if(x==2){
            System.out.println("Number is prime");
        }
        else if(x%2!= 0){
            for(int i=x-1;i>1;i--){
               if(x%i!=0){
                   continue;
               }
               else{
                   System.out.println("Number is Not prime");
                   break;
               }
           }
            System.out.println("Number is prime");
        }
        else{System.out.println("Number is Not prime");}

    }
}
