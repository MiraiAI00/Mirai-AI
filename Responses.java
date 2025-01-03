// File: Responses.java
import java.util.HashMap;
import java.util.Map;

public class Responses {
    private Map<String, String> responseMap;

    public Responses() {
        responseMap = new HashMap<>();
        responseMap.put("greeting", "Hello! How can I assist you?");
        responseMap.put("farewell", "Goodbye! Take care.");
        responseMap.put("question", "That's an interesting question. Let me think...");
        responseMap.put("neutral", "I'm here for you.");
    }

    public String generateResponse(String inputType, String emotion) {
        String response = responseMap.getOrDefault(inputType, responseMap.get("neutral"));

        switch (emotion.toLowerCase()) {
            case "happiness":
                response += " 😊";
                break;
            case "sadness":
                response += " 😢";
                break;
            case "anger":
                response += " 😡";
                break;
            case "fear":
                response += " 😨";
                break;
            default:
                break;
        }
        return response;
    }

    public static void main(String[] args) {
        Responses miraiResponses = new Responses();
        System.out.println(miraiResponses.generateResponse("greeting", "happiness"));
        System.out.println(miraiResponses.generateResponse("farewell", "sadness"));
    }
}
