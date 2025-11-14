package MyRandomProgram;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
       String name =sr.next();
       String org_name= name;
       String rev="";
       for(int i=name.length()-1; i>=0; i--)

       {
          rev = rev + name.charAt(i);

       }
       if(org_name.equals(rev))
       {
           System.out.println(org_name + " palindrome");
       }else
       {
           System.out.println("not palindrome");
       }
}}
