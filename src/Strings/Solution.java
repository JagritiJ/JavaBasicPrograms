package Strings;

import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    //Given a String to find it has all the unique characters
    public static void main(String args[]) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine() == true) {
            String s = sc.nextLine();
            //boolean flag = hasUniqueChar(s);
            //System.out.println("hasUniqueChar "+flag);
            //String s2 = sc.nextLine();

            //boolean permute = isPermuted(s, s2);
            //System.out.println("Is Permuted? "+ permute);

            //String urlified = Urlify(s);
            //System.out.println("Original String "+ s+ " After Urlifying the string "+urlified);
            //String a = countChar(s);

            boolean b = isPalindrome(s);
            System.out.println(b);

        } else {
            System.out.println("No Input given");
        }

    }

    public static boolean hasUniqueChar(String s) {

        int len = s.length();
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for (int i = 0; i < len; i++) {
               if(hmap.get(s.charAt(i))==null){
                  hmap.put(s.charAt(i), 1);
               }
               else{
                   return false;
                   //hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
               }
        }
        return true;
    }

    public static boolean isPermuted(String s1, String s2){

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1!=len2){return false;}

        for(int j=0;j<len1;j++)
        if(hashMap.get(s1.charAt(j))==null)
        { hashMap.put(s1.charAt(j), 1);
        }
        else{
            hashMap.put(s1.charAt(j), hashMap.get(s1.charAt(j))+1);
        }

        int count=0;
        boolean flag=true;

        for(int i=0;i<len1;i++)
        { if(hashMap.get(s2.charAt(i))==null){
            //return false;}
        flag = false;
        }
          else{count++;continue;}

        }
        if(count==len1){ flag =true;
          //return true;
        }

        return flag;
    }

    public static String countChar(String s){
        String str="";
        int len = s.length();
        HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();


        for(int i=0; i<len;i++){
            if(hmap.get(s.charAt(i))==null){
                hmap.put(s.charAt(i),1);
            }
            else{
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
            //String str1= s.charAt(i)+(hmap.get(s.charAt(i))).toString();
            //str = str.concat(str1);
            System.out.println(s.charAt(i));
            System.out.println(hmap.get(s.charAt(i)));
        }

        int size = hmap.size();
        //hmap.keySet();
        //hmap.values();

        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
      /*  for(key:hmap.keySet()){
            for(val:hmap.values()){
                System.out.println(hmap.keySet());
                System.out.println(hmap.values());
            }

        }*/
        //System.out.println(hmap+"size of hmap "+size);
        return str;
    }

    public static String Urlify(String s)
    {
        int len = s.length();
        String urlfied ="";
        //HashMap myHashmap = createHashMap(s, len);

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int j=0;j<len;j++)
            if(hashMap.get(s.charAt(j))==null)
            { hashMap.put(s.charAt(j), 1);
            }
            else{
                hashMap.put(s.charAt(j), hashMap.get(s.charAt(j))+1);
            }
        System.out.println("before urlfying " + s+ " hashmap is " + hashMap );
        System.out.println("hey space comes " + hashMap.get("p"));
        if(hashMap.containsKey("p")==true)
        {
            System.out.println("hurray");
        }
        //System.out.println("after urlfying " + s+ "hashmap is " + myHashmap );

        return s;
    }

    public static HashMap createHashMap(String s1, int len1){
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int j=0;j<len1;j++)
            if(hashMap.get(s1.charAt(j))==null)
            { hashMap.put(s1.charAt(j), 1);
            }
            else{
                hashMap.put(s1.charAt(j), hashMap.get(s1.charAt(j))+1);
            }
        return hashMap;
    }

    public static boolean isPalindrome(String s){
        int len = s.length();
        int mid = len/2;
        int count=0;
        //kayak, len =5, mid = 2
        //paayyaap, len=8, mid= 4

        for(int i=0;i<=len/2;i++){
            if(s.charAt(i)==s.charAt(len-1)){
                System.out.println( i +".."+s.charAt(i)+".."+s.charAt(len-1));
                len--;
                count++;
            }

        }
        if(count==mid){return true;}
        else{ return false;}
    }
}