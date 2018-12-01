import java.util.Scanner;

public class Calculator {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    int result=0;

    System.out.println("Choose the math operation 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for modulus, 6 for increment and 7 for decrement");

    int option = sc.nextInt();
    int x=0;
    int y=0;
    if (option==6 ||option==7)
    {   System.out.println("Enter the number");
        x = sc.nextInt();
    }
    else {
        System.out.println("Enter the numbers");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    switch(option) {

        case 1:
            result = add(x, y);
            break;
        case 2:
            result = sub (x, y);
            break;
        case 3:
            result = mul (x,y);
            break;
        case 4:
            result = div (x,y);
            break;
        case 5:
            result = mod (x,y);
            break;
        case 6:
            result = inc(x);
            break;
        case 7:
            result = dec(x);
            break;
    }

    System.out.println("Result is " + result);
}

  static int add(int x, int y)
  {
      return x+y;
  }

  static int sub(int x, int y)
  {
      return x-y;
  }

  static int mul(int x, int y)
  {
        return x*y;
  }

  static int div(int x, int y)
  {
        return x/y;
  }

  static int mod(int x, int y)
  {
       return x%y;
  }
  static int inc(int x){ return ++x;}
  static int dec(int x){ return --x;}

}
