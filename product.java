class product {
    public int[] findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{arr[left], arr[right]}; // return the pair
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        product s = new product();
        int[] arr = {10, 20, 30, 40, 50};
        int target = 50;

        int[] result = s.findPair(arr, target);
        if (result.length > 0) {
            System.out.println("Pair found: " + result[0] + " + " + result[1] + " = " + target);
        } else {
            System.out.println("No pair found");
        }
    }
}
