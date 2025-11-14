package MyRandomProgram;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        //Scanner sr = new Scanner(System.in);
        // int a = sr.nextInt();
        //Approch1
        /*StringBuffer sB= new StringBuffer(String.valueOf(a));
        StringBuffer rev= sB.reverse();
        System.out.println(rev);*/

        //Approch2
        //StringBuilder sb = new StringBuilder(String.valueOf(a));
        //sb.append(a);
        //StringBuilder rev1 = sb.reverse();

        ReverseNumber reverseString = new ReverseNumber();
         reverseString.REvString1();
        String string = "ABCD";
        String rev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }
        System.out.println(rev);
    }
    public void REvString1()
            //Using charactor array
    {
        String string = "bghff";
       char a[]=  string.toCharArray();
       String rev="";

        for(int i=string.length()-1; i>=0; i--)
        {
            rev=rev+a[i];
        }
        System.out.println(rev);

        //Using StringBuffurClass
        String myName= "Triveni";
        StringBuffer sb= new StringBuffer(myName);
        System.out.println(sb.reverse());



    }
}
