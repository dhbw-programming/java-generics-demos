package whiteboard;

import java.util.ArrayList;

public class Whiteboard {
    private ArrayList<String> entries;

    public Whiteboard() {
        this.entries = new ArrayList<>();
    }

    public void show() {
        for (String entry : entries) {
            System.out.println(entry);
        }
    }

    public void addEntry(Object obj) {
        entries.add(obj.toString());
    }

    public static void main(String[] args) {
        Whiteboard whiteboard = new Whiteboard();
        whiteboard.addEntry("super important note");
        whiteboard.addEntry("super unimportant note");
        whiteboard.addEntry(new Pen(72, "this is too large"));
        whiteboard.addEntry(new PostItNote("green", "good message"));
        whiteboard.show();
    }
}
