package MyRandomProgram;

import java.util.Scanner;

public class SumTheNumbers {
    public static void main(String[] args) {
        Scanner sr =  new Scanner(System.in);
        int num=sr.nextInt();
        int sum=0;
        int add=0;
        //Sum added numbers
        while(num>0)
        {

            add =num%10;
            num=num/10;
            sum= sum + add;
        }

        System.out.println(sum);





}}
