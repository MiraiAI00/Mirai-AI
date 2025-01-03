// File: Emotions.java
import java.util.HashMap;
import java.util.Map;

public class Emotions {
    private Map<String, Integer> emotions;

    public Emotions() {
        emotions = new HashMap<>();
        emotions.put("Happiness", 50);
        emotions.put("Sadness", 50);
        emotions.put("Anger", 50);
        emotions.put("Fear", 50);
    }

    public int getEmotionLevel(String emotion) {
        return emotions.getOrDefault(emotion, 0);
    }

    public void adjustEmotion(String emotion, int amount) {
        emotions.put(emotion, Math.min(100, Math.max(0, emotions.getOrDefault(emotion, 50) + amount)));
    }

    public String dominantEmotion() {
        return emotions.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Neutral");
    }

    public void resetEmotions() {
        emotions.replaceAll((key, value) -> 50);
    }

    public void displayEmotions() {
        System.out.println("Current Emotional Levels:");
        emotions.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void main(String[] args) {
        Emotions miraiEmotions = new Emotions();
        miraiEmotions.displayEmotions();

        miraiEmotions.adjustEmotion("Happiness", 20);
        miraiEmotions.adjustEmotion("Anger", -10);

        System.out.println("Dominant Emotion: " + miraiEmotions.dominantEmotion());
    }
}
