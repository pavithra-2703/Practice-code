import java.util.HashMap;
import java.util.Map;

public class map{
    public static void main(String[] args) {
        Map<Integer, String> name = new HashMap<>();
        name.put(1, "Siya");
        name.put(2, "Nithu");

        // Access value by key
        System.out.println(name.get(1));

        // Check if value exists
        System.out.println("Check the value: " + name.containsValue("Siya"));

        // Check if key exists
        System.out.println("Check the key: " + name.containsKey(1));

        // Remove key-value pair
        name.remove(1);
        System.out.println(name.get(1)); // will print null since key 1 is removed

        // Find the size of the map
        System.out.println("Find the size: " + name.size());
    }
}


