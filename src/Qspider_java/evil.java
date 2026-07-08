package Qspider_java;

public class evil {
    public static boolean evilnum(int num) {

        if (num <= 0) return false;
        String binary = "";
        int count = 0;
        while (num != 0)
        {
            int rem = num % 2;
            binary = binary + rem;
            num = num / 2;

        }
        for (int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1') count++;
        }
        return count % 2 == 0;
    }
    public static void main(String[] args) {
        int Num = 12;

        if (evilnum(Num)) {
            System.out.println(Num + " is an Evil Number.");
        } else {
            System.out.println(Num + " is an not evil");
        }
    }
}