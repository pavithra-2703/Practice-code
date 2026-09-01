import java.util.Scanner;

public class LexicoSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("Enter k:");
        int k = sc.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        sc.close();
    }
}
