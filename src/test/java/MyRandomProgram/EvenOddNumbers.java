package MyRandomProgram;

public class EvenOddNumbers {
    public static void main(String[] args) {
        //Findeven and Odd numbers
        int num = 1234;
        int Evencount = 0;
        int OddCount=0;
        while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0)
                {Evencount++;}
                else
                {OddCount++;}
                num=num/10;
            }
        System.out.println("Even num"+ " " +Evencount);
        System.out.println("Odd num"+" "+OddCount);
    }
    }