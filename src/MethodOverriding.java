public class MethodOverriding {
      int x =20;
      MethodOverriding(){
          System.out.println("Inside Base Class");
      }
      public void display(){

          System.out.println("Value of X is "+x);
      }
}

class ChildClass extends MethodOverriding{
    int x =30;
    ChildClass(){
        System.out.println("Inside the Child Class");
    }

    public void display(){
        System.out.println("Value of X from child class" +x);
    }

    public static void main(String args[]){
        ChildClass c1 = new ChildClass();
        c1.display();
    }

}