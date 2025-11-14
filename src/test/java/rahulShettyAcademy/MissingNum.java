package rahulShettyAcademy;

public class MissingNum {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 6};
        int sum = 0;
        int sum1 = 0;
        int missNum;

        for (int i = 1; i <= 6; i++)
        {
            sum1 = sum1 + i;
        }


            for (int j = 0; j <= a.length - 1; j++)
            {
                sum = sum + a[j];
            }
        System.out.println(sum1 - sum);
            //another way
        int num[]={1,2,4,5,6};
        int m=6;
        int MissingNum=0;
        int exectedSum= m*(m+1)/2;
        int actualNum=0;
        for(int allSum: num)
        {
            actualNum=actualNum+allSum;
        }

        System.out.println(exectedSum-actualNum);

    }



}
