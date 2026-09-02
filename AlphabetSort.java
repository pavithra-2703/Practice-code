import java.util.*;

public class AlphabetSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a word: ");
        String input = sc.nextLine().toLowerCase(); // convert to lowercase

        // Convert to character array
        char[] chars = input.toCharArray();

        // Sort characters
        Arrays.sort(chars);

        // Print sorted characters
        System.out.println("Sorted characters: " + new String(chars));

        sc.close();
    }
}
