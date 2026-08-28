public class BuffetBacktracking {
    static String[] food = {"rice", "dal", "salad", "paneer", "desert"};
    static int[] calories = {120, 300, 90, 200, 150}; // added calories for "desert"
    static int caloriesLimit = 400;

    public static void findCombinations(int index, String currentPlate, int currentCalories) {
        if (currentCalories > caloriesLimit) {
            return;
        }

        if (index == food.length) {
            if (!currentPlate.isEmpty()) {
                System.out.println(currentPlate + "-> " + currentCalories + " cal");
            }
            return;
        }

        // Choice 1: include current food
        findCombinations(index + 1,
                currentPlate + food[index] + " ",
                currentCalories + calories[index]);

        // Choice 2: exclude current food
        findCombinations(index + 1, currentPlate, currentCalories);
    }

    public static void main(String[] args) {
        System.out.println("Possible buffet combinations under " + caloriesLimit + " calories:\n");
        findCombinations(0, "", 0); // corrected argument order
    }
}
