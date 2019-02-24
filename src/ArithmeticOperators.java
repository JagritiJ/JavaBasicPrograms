

public class ArithmeticOperators {


   public static void main(String args[]){

       /** Divide and Modulus */

       System.out.println(10/3);
       System.out.println(10%3);
       System.out.println(-10%3);
       System.out.println(10%-3);
       System.out.println(-10%-3); //only looks at sign of first operand
       System.out.println(10%3);
       System.out.println(10%3);
       //System.out.println(10/3); //Arithmetic Exception
       System.out.println(10.0/0); //Infinity
       System.out.println(- 10.0/0); //- Infinity


       /** Unary Operators */
       int n = 7;
       System.out.println(n++); //7, n++  post the ln statement
       System.out.println(n); //8
       System.out.println(++n); //9


       /** Assignment Operators
        *  =, +=, -=, *=, /=, %=
        */
       int a = 2;
       int b = 3;
       System.out.println(a+=b);

       //Associativity from right to left
       int x = 5;
       x *= x+=10; // x = x *(x+10) = 5*15 = 75
       System.out.println(x);
   }

}
