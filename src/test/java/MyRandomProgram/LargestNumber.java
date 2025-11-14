package MyRandomProgram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //Find Largest Numbers
        Scanner Sr1 = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = Sr1.nextInt();

        Scanner Sr2 = new Scanner(System.in);
        System.out.println("Enter 2nd number");
        int b = Sr2.nextInt();

        Scanner Sr3 = new Scanner(System.in);
        System.out.println("Enter 3rd number");
        int c = Sr3.nextInt();

      if(a>b && a>c)
        {
            System.out.println(a+"a is Largest Number");
        }
        else if (b>a && b>c)
        {
            System.out.println(b+"b is the Larget no");
        }
        else {
            System.out.println(c+"c is the largest number");
        }
        //Ternary operation a>b?a:b
        






    }
}
