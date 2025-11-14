package rahulShettyAcademy;

public class printAllEvenNumFromString {
    public static void main(String[] args) {
        String s="My name is Triveni";
       String data[] =s.split(" ");
       for( String word : data)
       {
           if(word.length() %2 ==0)
           {
               System.out.println(word);

           }
       }

    }
}
