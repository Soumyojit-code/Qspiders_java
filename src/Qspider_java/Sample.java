package Qspider_java;
import java.util.*;
//treversing a list
public class Sample
{
    public static void main(String[] args)
    {
       ArrayList list=new ArrayList();
       list.add(10);
       list.add(20);
       list.add("hellow");
       list.add(null);
       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i)+" ");
       }
    }
}
