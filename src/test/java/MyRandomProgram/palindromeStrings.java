package MyRandomProgram;

import java.util.Scanner;

public class palindromeStrings {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String name=sr.next();
        String orgName=name;
        String rev="";
        for(int i=name.length()-1; i>=0; i--)
        {
            rev=rev+name.charAt(i);
        }
       if(orgName.equals(rev))
       {
           System.out.println("Palindrom name"+rev);
       }
       else {
           System.out.println("No palindrome"+rev);
       }
    }
}
