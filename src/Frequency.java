public class Frequency {
    public static void main(String[] args)
    {
        long num = 12317850120135L;
        countFrequency(num);
    }
    public static void countFrequency(long num)
    {
        int[] fre = new int[10];
        while(num!=0)
        {
           int ld=(int)(num%10);
           fre[ld]++;
           num/=10;

        }
        for(int i=fre.length-1;i>=0;i--)
        {
            System.out.println("Count of " +i+ "is: "+fre[i]);
        }


    }
}
