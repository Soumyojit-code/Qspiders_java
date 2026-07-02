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
       for(int i=0;i< fre.length;i++)
        {
            System.out.println("Count of " +i+ "is: "+fre[i]);
        }


    }
}
