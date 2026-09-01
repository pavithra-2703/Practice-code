import java.util.*;

class MinimumPlatforms {
    public static int findPlatform(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int platforms = 0;

        for (int i = 0; i < n; i++) {
            while (!pq.isEmpty() && pq.peek() < arr[i]) {
                pq.poll();
            }
            pq.add(dep[i]);
            platforms = Math.max(platforms, pq.size());
        }
        return platforms;
    }

    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Minimum Platforms Required = " + findPlatform(arr, dep, arr.length));
    }
}
