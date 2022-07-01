package whiteboard;

public class PostItNote {
    private final String color;
    private final String message;

    public PostItNote(String color, String message) {
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        String result = color + ':';
        for (int i = 0; i < message.length() + 1 - color.length(); i++) {
            result += '-';
        }
        result += "\n|" + message + "|\n";
        for (int i = 0; i < message.length() + 2; i++) {
            result += '-';
        }
        return result;
    }
}
