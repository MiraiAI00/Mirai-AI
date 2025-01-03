// File: Speech.java
import java.util.Scanner;

public class Speech {
    private boolean isSpeaking;

    public Speech() {
        isSpeaking = false;
    }

    public void startSpeaking(String message) {
        isSpeaking = true;
        System.out.println("Mirai says: " + message);
        isSpeaking = false;
    }

    public void emulateSpeech(String message) {
        isSpeaking = true;
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100); // Emulates speech by typing out each character
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
        isSpeaking = false;
    }

    public static void main(String[] args) {
        Speech miraiSpeech = new Speech();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what Mirai should say:");
        String input = scanner.nextLine();

        miraiSpeech.emulateSpeech(input);
    }
}
