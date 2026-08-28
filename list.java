import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sudha");
        list.add("neha");
        list.add("rishitha");
        list.add("nithu");
        list.add("siya");

        System.out.println("List of the students: " + list);

        // Access element at index 2
        System.out.println("Access the index element: " + list.get(2));

        // Remove element (case-sensitive, so use "siya")
        list.remove("siya");
        System.out.println("List of students after removal: " + list);

        // Update element at index 3 (last valid index after removal)
        list.set(3, "ani");
        System.out.println("List of students after update: " + list);
    }
}
