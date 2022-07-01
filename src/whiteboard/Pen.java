package whiteboard;

public class Pen {
    private final int fontSize;
    private final String message;

    public Pen(int fontSize, String message) {
        this.fontSize = fontSize;
        this.message = message;
    }

    @Override
    public String toString() {
        return "(size: " + fontSize + ") " + message;
    }
}
