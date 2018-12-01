import java.util.Scanner;

public class PrimeNumber {

   public static void main(String args[])
   {   System.out.println("Enter the number to check if it's prime or not");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       Prime(x);

   }
   static void Prime(int x){

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
