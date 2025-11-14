package MyRandomProgram;

import scala.Char;

public class DuplicateStringCharactors {
    public static void main(String[] args) {
        String str= new String("AutomationTesting");
        char[] ch= str.toCharArray();
        int count =0;

        for(int i=0; i<ch.length; i++)
        {
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println(ch[i]);
                    count++;

                }
            }
        }
        System.out.println("Duplicate char count" +count );

    }
}
