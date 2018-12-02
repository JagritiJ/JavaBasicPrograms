public class ConstructorAndInheritance {

    int x = 20;
    ConstructorAndInheritance(){
        System.out.println("Inside the Base Class");
    }

    public void display(){
        System.out.println("X is " +x);
    }
}
    
class DerivedClass extends ConstructorAndInheritance{

    DerivedClass(){
        System.out.println("Inside the Derived Class");
    }

    public static void main(String args[])
    {
      DerivedClass d = new DerivedClass();
      d.display();

    }
}