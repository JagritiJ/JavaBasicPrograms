public class ExceptionDemo extends Exception{

    public void divide(int x, int y){

        try
        {int res = x/y; }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        ExceptionDemo ob = new ExceptionDemo();
              ob.divide(5,0);
    }


}
