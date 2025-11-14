package rahulShettyAcademy;

public class LengthOfStringEvenOrOdd {
    public static void main(String[] args) {
        String s ="Java";
        int data =s.length();
        System.out.println(data);
        if (data%2==0)
        {
            System.out.println("It is even number");
        }
        else {
            System.out.println("It is odd num");
        }
    }
}
