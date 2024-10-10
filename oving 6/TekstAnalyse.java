import java.util.HashMap;
import java.util.Map;

public class TekstAnalyse {

    private final String userInput;

    public TekstAnalyse(String userInput) {
        this.userInput = userInput;
    }

    public void antallTegn() {
        Map<String, Integer> characterCount = new HashMap<>();

        int totalCharacters = userInput.length();
        if (totalCharacters == 0) { 
            System.out.println("The input string is empty.");
            return;
        }

        int alphabeticCharacters = 0;

        String input = userInput.toLowerCase();
        for (int i = 0; i < input.length(); ++i) {
            char currentChar = input.charAt(i);
            String key;

            if (currentChar >= 'a' && currentChar <= 'z') {
                key = String.valueOf(currentChar);
                alphabeticCharacters++;
            } else {
                key = "non-alphabetic";
            }
            characterCount.put(key, characterCount.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : characterCount.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Count: " + entry.getValue());
        }

        double percentageAlphabetic = (alphabeticCharacters * 100.0) / totalCharacters;
        System.out.println("Percentage of alphabetic characters: " + percentageAlphabetic);
        System.out.println("Total amount of alphabetic characters: " + alphabeticCharacters);

        int maxCount = 0;
        for (int count : characterCount.values()) {
            characterCount.put("non-alphabetic" , 0);
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.print("Most repeated character(s): ");
        for (Map.Entry<String, Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println("with a count of: " + maxCount);
    }
}
