package rahulShettyAcademy;

import java.util.Scanner;

public class EvenOrOddNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        if(number%2==0)
        {
            System.out.println("It is even number");
        }
        else
        {
            System.out.println("It is odd number");
        }
        sc.close();

    }
}
