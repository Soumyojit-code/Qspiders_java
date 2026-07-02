public class subarray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 1, 1, 5};
        int target = 1;
        java.util.function.BiFunction<Integer, Integer, Integer> search = new java.util.function.BiFunction<>() {
            @Override
            public Integer apply(Integer index, Integer direction) {
                if (index < 0 || index >= nums.length) {
                    return -1;
                }
                if (nums[index] == target) {
                    return index;
                }
                return this.apply(index + direction, direction);
            }
        };

        int first = search.apply(0, 1);
        int last = search.apply(nums.length - 1, -1);

        System.out.println(first);
        System.out.println( last);
    }
}