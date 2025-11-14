package MyRandomProgram;
import java.util.Scanner;
public class EvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num= sr.nextInt();
        int EvenCount1 =0;
        int OddCount= 0;
        while(num>0)
        {
            int digit = num%10;//get last digit
            if(digit%2==0)
            {
                EvenCount1++;}
            else
            {
                OddCount++;
            }
         num=num/10;
        }
        System.out.println(EvenCount1);
        System.out.println(OddCount);
    }
}
