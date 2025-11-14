package MyRandomProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();


        int rev = 0;
        int orgNum=num;
        while (num > 0)
        {
            rev = rev*10+ num % 10;
            num = num /10;
        }
        if (orgNum == rev)
        {
            System.out.println("Palindrome No");
        }
        else {
            System.out.println("Not Palindrrome no");
        }


    }
}

