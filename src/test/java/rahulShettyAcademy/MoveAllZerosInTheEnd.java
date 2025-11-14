package rahulShettyAcademy;

public class MoveAllZerosInTheEnd {
    public static void main(String[] args) {
        int a[]={1,0,2,0,3,0};
        int tem;
        int putAllNonZero=0;
        for(int currunt=0; currunt<a.length; currunt++) {
            if (a[currunt] != 0)
            {
                tem=a[putAllNonZero];
                a[putAllNonZero]=a[currunt];
                a[currunt]=tem;
                putAllNonZero++;
            }
        }
        for (int no: a)
        {
            System.out.print(no);
        }
    }
}
