import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        String s = "Hello, World!";
        Map<Character, Integer> counts = countCharacters(s);
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
