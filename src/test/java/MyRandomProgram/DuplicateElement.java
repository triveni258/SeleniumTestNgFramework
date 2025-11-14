package MyRandomProgram;

public class DuplicateElement {
    public static void main(String[] args) {

        String arr[] = {"java", "c", "c++", "java", "python", "c"};
        int ele[]={1,2,2,3,4,3,4,1,6,5,7,8};
        //Approch1

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found Duplicate Element:" + arr[i]);
                }

            }
        }


        for(int i=0; i<ele.length; i++)
        {
            for( int j=i+1; j<ele.length; j++)
            {
                if( ele[i]==ele[j])
                {
                    System.out.println("Duplicate ele:"+ele[i]);
                }
            }
        }


    }
}
