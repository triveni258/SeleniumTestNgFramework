package rahulShettyAcademy.TestComponent;

public class ReverseInt {
    public static void main(String[] args) {
        int number=123;
        int reverseNum=0;
        int lastNum ;

        while (number!=0) {

            lastNum = number % 10;
            reverseNum = reverseNum * 10 + lastNum;
            number = number / 10;
        }
        System.out.println(reverseNum);

    }
}
