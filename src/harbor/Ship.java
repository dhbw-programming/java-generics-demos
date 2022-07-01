package harbor;

public class Ship <T> implements Comparable<Ship<T>> {
    private T contents;
    private int priority;

    public Ship(T contents, int priority) {
        this.contents = contents;
        this.priority = priority;
    }

    public void travel() {
        System.out.println("traveling along, hoping my goods are type safe");
    }

    public T getContents() {
        return contents;
    }

    @Override
    public int compareTo(Ship<T> o) {
        return this.priority - o.priority;
        //return this.contents.toString().compareTo(o.contents.toString());
    }
}
