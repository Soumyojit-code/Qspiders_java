
public class pattern1 {
    public static void main(String[] args) {
        int n = 7;
        int mid = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : (n - i + 1);
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}