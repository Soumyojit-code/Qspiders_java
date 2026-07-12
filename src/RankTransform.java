/*Given an array of integers arr, replace each element with its rank.
The rank represents how large the element is. The rank has the following rules:
Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.*/
 import java.util.*;
public class RankTransform
  {

      public static void main(String[] args)
       {
        int[] arr={37,12,28,9,100,56,80,5,12};
        Rankmap(arr);
        for(int i=0; i<arr.length; i++)
         System.out.print( arr[i]+" ");
       }
      static int[] Rankmap(int[]arr)
      {
        int[] sort=arr.clone();
        Arrays.sort(sort);
        Map<Integer, Integer> rank = new HashMap();
        int c=1;
        for(int n:sort)
        {
            if(!rank.containsKey(n))
            {
                rank.put(n, c);
                c+=1;
            }
        }
        for(int i=0;i<arr.length;i++) arr[i]=rank.get(arr[i]);
        return arr;
      }
  }
