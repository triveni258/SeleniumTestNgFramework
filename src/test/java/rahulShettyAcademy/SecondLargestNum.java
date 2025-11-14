package rahulShettyAcademy;

import MyRandomProgram.LargestNumber;

public class SecondLargestNum {
    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int largestNum=Integer.MIN_VALUE;
        int SecondLargestNum=Integer.MIN_VALUE;

        for(int no:a)
        {
            if (no>largestNum)
            {
                SecondLargestNum= largestNum;
                largestNum=no;
            }
            else if (no>SecondLargestNum && no!=largestNum)
            {
                SecondLargestNum=no;
            }
        }
        System.out.println(SecondLargestNum);
    }
}
