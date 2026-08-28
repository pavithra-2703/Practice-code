import java.util.*;

public class SuitcasePacking {
    static String[] clothes = {"Shirt", "Jeans", "Jacket", "Shoes", "Kurti"};
    static int[] weights = {2, 4, 5, 3, 1}; // weights in kg
    static int maxWeight = 7;

    public static void main(String[] args) {
        System.out.println("Possible clothing combinations under " + maxWeight + " kg:\n");
        findCombinations(0, new ArrayList<>(), 0);
    }

    public static void findCombinations(int index, List<String> currentSet, int currentWeight) {
        if (currentWeight > maxWeight) return;

        if (!currentSet.isEmpty()) {
            System.out.println(currentSet + " -> " + currentWeight + " kg");
        }

        for (int i = index; i < clothes.length; i++) {
            currentSet.add(clothes[i]);
            findCombinations(i + 1, currentSet, currentWeight + weights[i]);
            currentSet.remove(currentSet.size() - 1); // backtrack
        }
    }
}
