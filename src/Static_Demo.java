public class Static_Demo {

    static int x=20;

    static{
      System.out.println("inside the static block");
    }

    static void display(){
        System.out.println("Inside the static method, value of x "+x );

    }

    public static void main(String args[]){
        System.out.println();
        Static_Demo.display();
    }

}
