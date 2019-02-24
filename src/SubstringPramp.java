/*
public class SubstringPramp {



    import java.io.*;
import java.util.*;

    class Solution {
        public int i=0;
        count=0;
        static boolean isMatch(String text, String pattern) {
            // your code goes here
            //abc ab.
            //text = "abbbbbcd" , pattern = "bb*c."
            // abcd   abc

            int n = pattern.length();
            int t = text.length()



    else{
                if(pattern.charAt(i) == text.charAt(i) || pattern.charAt(i) == ".")
                {
                    if(i == n)
                        return true;
                    i++;
                    isMatch(text,pattern);
                }

                else{
                    return false;
                }
            }

            public static void main(String[] args) {

                bool flag = isMatch(text, pattern);
                System.out.println(flag);

            }

        }
}
*/
