import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentmarks {
    public static void main(String[] args) {
        // Step 1: Create List and add marks
        List<Integer> marks = new ArrayList<>();
        Collections.addAll(marks, 85, 92, 78, 90, 65, 88, 76);

        // Step 2: Find highest and lowest
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        // Step 3: Find average
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.size();

        // Display results
        System.out.println("Marks List: " + marks);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Average Mark: " + average);

        // Step 4: Remove marks below average
        marks.removeIf(mark -> mark < average);
        System.out.println("Marks after removing below average: " + marks);

        // Step 5: Check if 90 is present
        if (marks.contains(90)) {
            System.out.println("Mark 90 is still present in the list.");
        } else {
            System.out.println("Mark 90 is not present in the list.");
        }

        // Step 6: Display marks greater than 80
        System.out.print("Marks greater than 80: ");
        for (int mark : marks) {
            if (mark > 80) {
                System.out.print(mark + " ");
            }
        }
    }
}
