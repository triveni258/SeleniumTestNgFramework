package rahulShettyAcademy;

public class LenthOftheLastWord {
    public static void main(String[] args) {
        String s1 = "     hello     Word     ";
        s1 = s1.trim();
        char inutArray[] = s1.toCharArray();
        int count =0;

        for (int i = inutArray.length - 1; i >= 0; i--)
        {
            if (inutArray[i] != ' ')
            {
                count ++ ;

            }
            else
            { if(count>0)// here no use to trim the string becouse count value will not increase in white spases
                System.out.println(count);
                break;
            }

            String s="     Hi Triveni    ";
            //Find the lass  twords length count
            char charactor[] = s.toCharArray();
            //traverse the char
            for (int j =charactor.length-1; j>=0;j--)
            {
                if (charactor[j]!=' ')
                {
                    System.out.println(charactor [j]);
                }
            }


        }

    }
}
