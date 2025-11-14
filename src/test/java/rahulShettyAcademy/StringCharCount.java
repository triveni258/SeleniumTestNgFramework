package rahulShettyAcademy;

import scala.Char;

import java.util.HashMap;

public class StringCharCount {
    public static void main(String[] args) {
        String s="madam";
      char inputarray[]=s.toCharArray();
        HashMap<Character, Integer> fryquencyMap= new HashMap<Character, Integer>();
      for(char charactor :inputarray)
      {
          fryquencyMap.put(charactor,fryquencyMap.getOrDefault(charactor,0)+1);
      }
      for(char c :fryquencyMap.keySet())
      {
          System.out.println(c+ " " +fryquencyMap.get(c));
      }

    }
}
