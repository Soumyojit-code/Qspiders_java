public class Frequencychar
{
    public static void main(String[] args)
    {
        String str = "Soumyojit";
        countFrequency(str);
    }
    public static void countFrequency(String str)
    {
        int[] fre = new int[26];
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            fre[ch]++;
        }
        for (int i = 0; i < fre.length; i++)
        {
            if (fre[i] > 0)
            {
                System.out.println("Count of '" + (char) i + "' is: " + fre[i]);
            }


        }
    }
    }
