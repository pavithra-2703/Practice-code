import java.util.*;

public class FirstNegativeInWindow {
    public static int[] firstNegative(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            if (nums[i] < 0) {
                dq.offerLast(i);
            }

            if (i >= k - 1) {
                result[i - k + 1] = dq.isEmpty() ? 0 : nums[dq.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(Arrays.toString(firstNegative(arr, k)));
    }
}
