import java.util.HashMap;
import java.util.Map;

public class RatingFrequency {
    public static void main(String[] args) {
        // Given responses
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 2, 5, 3, 4, 5, 3, 1};

        // HashMap to store frequency of ratings
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences
        for (int rating : responses) {
            frequencyMap.put(rating, frequencyMap.getOrDefault(rating, 0) + 1);
        }

        // Display the frequency of each rating
        System.out.println("Rating Frequency:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + ": " + frequencyMap.getOrDefault(i, 0));
        }
    }
}
