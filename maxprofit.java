public class maxprofit {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -1, 4, -5};
        System.out.println(findMaxProfit(arr));
    }

    public static int findMaxProfit(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
