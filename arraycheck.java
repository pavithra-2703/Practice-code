public class arraycheck {
    public static void main(String[] args) {
        int arr[] = {50, 10, 20, 30, 40};
        boolean isSorted = true;

        // Check ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

