package Qspider_java;
import java.util.Arrays;
public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] arr={9,6,4,2,3,5,7,0,1};
       System.out.println(missingvalue(arr));
    }
    public static int missingvalue(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=i)
            {
                return i;
            }
        return arr.length;
    }

}
