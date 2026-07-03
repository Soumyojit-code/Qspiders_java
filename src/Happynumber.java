public class Happynumber
  {
    public static int sumOfSquares(int num) 
      {
        int sum=0;
        while (num!=0) {
            int ld=num % 10;
            sum+=ld*ld;
            num/=10;
        }
        return sum;
    }
    public static boolean isHappy(int num) 
    {
        if (num<=0) return false;
        Set<Integer> seen = new HashSet<>();
        while (num!=1 && !seen.contains(num)) 
        {
            seen.add(num);
            num=sumOfSquares(num);
        }
        return num == 1;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
