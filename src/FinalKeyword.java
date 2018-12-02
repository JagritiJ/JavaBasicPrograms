public final class FinalKeyword {
   final static int x= 20;
   public static void main(String args[]){

       //we can't assign value to final variable, so compiler will give error
      // x=30;

   }

   class Child extends FinalKeyword{

 // we can't inherit a final class
   }
}
