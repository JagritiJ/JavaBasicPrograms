import java.util.Scanner;

public class ReverseANumber {

    public static void main(String args[])
    {  System.out.println("Enter a number whose reverse you want to find");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String rev = reverse(n);

        System.out.println("Reverse of " + n + " is " + rev);
    }

    static String reverse(int n){

       int r=0;
       String str ="";
       while(n!=0){
        r = n % 10;
        str=str+r;
        n = n / 10;

        //say if n is 007, it gives output at 7 only, instead of 700..?
       }
        return str;
   }

}
