public class InterfaceTest implements queue{


    public void insert(){
     System.out.println("Insert Elements in the queue");
    }

    public void delete(){
        System.out.println("Delete elements from the queue");


    }

    public static void main(String args[])
    {
        System.out.println("Hi, this is a small example on interface");

    }
}


interface queue{

    public void insert();

    public void delete();

}