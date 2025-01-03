// File: Personality.java
public class Personality {
    private String name;
    private String temperament;
    private String preferredTopic;

    public Personality(String name, String temperament, String preferredTopic) {
        this.name = name;
        this.temperament = temperament;
        this.preferredTopic = preferredTopic;
    }

    public String getName() {
        return name;
    }

    public String getTemperament() {
        return temperament;
    }

    public String getPreferredTopic() {
        return preferredTopic;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ".");
        System.out.println("I'm " + temperament + " and love talking about " + preferredTopic + ".");
    }

    public static void main(String[] args) {
        Personality miraiPersonality = new Personality("Mirai", "friendly", "technology");
        miraiPersonality.introduce();
    }
}
