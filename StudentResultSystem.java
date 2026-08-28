import java.util.HashMap;
import java.util.Map;

public class StudentResultSystem {
    public static void main(String[] args) {
        Map<Integer, String> studentResults = new HashMap<>();

        // Adding students
        studentResults.put(101, "Siya - 85");
        studentResults.put(102, "Nithu - 90");
        studentResults.put(103, "Rishitha - 78");
        studentResults.put(104, "Neha - 92");

        // Searching
        System.out.println(studentResults.get(102));

        // Removing
        studentResults.remove(103);

        // Updating
        studentResults.put(101, "Siya - 88");

        // Displaying all results
        for (Map.Entry<Integer, String> entry : studentResults.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
