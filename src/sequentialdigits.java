//An integer has sequential digits if each digit is exactly one more than the previous
// digit (e.g., 123, 2345, 6789).
// Since these numbers are formed by consecutive digits from 1 to 9,
// there are only a limited number of such numbers (maximum 36). We can generate
// all possible sequential numbers and filter those that lie within the given range [low, high].

import java.util.*;
public class sequentialdigits {
    public static void main(String[] args) {
        int low = 1000, high = 13000;

        System.out.println(SequentDigits(low, high));
    }

    static List<Integer> SequentDigits(int low, int high) {
        List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            long num = i;
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                if (num > high) break;
                else if (num >= low) A.add((int) num);
            }
        }
        Collections.sort(A);
        return A;

    }

}
