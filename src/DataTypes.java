public class DataTypes {

    public static void main(String args[]) {
        /**char 2 bytes of memory for java, in c/c++ memory for char = 1 byte */
        char c = 'A';

        System.out.println(c);
        System.out.println(Integer.toHexString(65));

        c = 65; //implicit typecasting
        System.out.println(c);

        c = '\u0041';
        System.out.println(c);

        c = '\u0905';
        System.out.println(c); //shows ? need to change in Resource IDE to UTF8 - now this one shows unicode for hi di

        /**Float & Double */

        //float - 4 bytes, double - 8 bytes
        // no. with decimal points are OS dependent and ie. why no implcit typecasting

        float num = 123.45f; //by default java considers decimal numbers as double, but to save mememory we have to explicit typecast to float
        float num1 = 123.45F;

        /**byte */
        byte b1 = 10;
        byte b2 = 20;
        //byte b3 = b1+b2; //gives error because arithmetic operation are being used and return type will be max(int, type(b1), type(b2));
        int b3 = b1 + b2;

    }
}