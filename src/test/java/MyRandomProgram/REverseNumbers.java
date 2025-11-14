package MyRandomProgram;

import java.util.Scanner;

public class REverseNumbers {
    public static void main(String[] args) {
       Scanner sr= new Scanner(System.in);
        int num=sr.nextInt();
        int rev=0;
       // int num=1234;
        int orgNum=num;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }

            System.out.println(rev);
        }
    }

