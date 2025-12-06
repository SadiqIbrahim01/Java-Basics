import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Alice", List.of(66, 93, 72));
        studentScores.put("Bob", List.of(88, 79, 91));
        studentScores.put("Charlie", List.of(100, 95, 98));

        System.out.println("Alice's average: " + getAverage(studentScores, "Alice"));
        System.out.println("Bob's average: " + getAverage(studentScores, "Bob"));
        System.out.println("Charlie's average: " + getAverage(studentScores, "Charlie"));
        System.out.println("David's average: " + getAverage(studentScores, "David"));  // missing student
    }

    private static double getAverage(HashMap<String, List<Integer>> map, String name) {
        if (!map.containsKey(name)) {
            System.out.println("Error: Student '" + name + "' does not exist.");
            return -1;
        }
        List<Integer> scores = map.get(name);
        if (scores == null || scores.isEmpty()) {
            System.out.println("Error: No scores for '" + name + "'");
            return -1;
        }
        double sum = 0.0;
        for (Integer score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }
}
