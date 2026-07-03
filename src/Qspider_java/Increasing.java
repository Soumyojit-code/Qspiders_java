//CHECK WHETHER THE DIGITS ARE IN NON-DECREASING ORDER FROM LEFT TO RIGHT
//        e.g.123489->true(1<2<3<4<8<9)
package Qspider_java;

public class Increasing
{
    public static void main(String[] args)
    {
        int num=12342;
        System.out.println(CountD( num));

    }
    public static boolean CountD(int num)
    {
        int ld=10;
        while(num>0)
        {
            int rem=num%10;
            if(rem>=ld) return false;
            ld=rem;
            num=num/10;
        }
        return true;
    }
}
