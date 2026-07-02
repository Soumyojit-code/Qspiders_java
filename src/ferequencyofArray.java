public class ferequencyofArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40, 20, 10};
        array(arr);
    }

    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }

            }
            System.out.println("Count of '" + arr[i] + "' is: " + c);
        }
    }
}
