public class SegmentTree {
    static int[] tree;
    static int n;

    // Build segment tree
    public static void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(arr, 2 * node, start, mid);
            build(arr, 2 * node + 1, mid + 1, end);
            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }
    }

    // Query sum in range [l, r]
    public static int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0; // no overlap
        }
        if (l <= start && end <= r) {
            return tree[node]; // total overlap
        }
        int mid = (start + end) / 2;
        int leftSum = query(2 * node, start, mid, l, r);
        int rightSum = query(2 * node + 1, mid + 1, end, l, r);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        // Array with 7 elements so total = 360
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        n = arr.length;
        tree = new int[4 * n]; // safe size

        build(arr, 1, 0, n - 1);

        // Total sum (all elements)
        System.out.println("Total sum: " + query(1, 0, n - 1, 0, 6)); // 360

        // Sum from index 1 to 4 (2nd to 5th element)
        System.out.println("Sum of [2 to 5]: " + query(1, 0, n - 1, 1, 4)); // 140

        // Sum from index 2 to 6 (3rd to 7th element)
        System.out.println("Sum of [3 to 7]: " + query(1, 0, n - 1, 2, 6)); // 250
    }
}
