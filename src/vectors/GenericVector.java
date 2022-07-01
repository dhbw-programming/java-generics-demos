package vectors;

public class GenericVector<T extends Number> {
    private final T x, y, z;

    public GenericVector(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public T getZ() {
        return z;
    }

    /* this will not work
    public GenericVector<T> add(GenericVector<T> vec) {
        return new GenericVector<T>(this.x + vec.x, this.y + vec.y, this.z + vec.z);
    } */

    @Override
    public String toString() {
        return "(" + x + ',' + y + ',' + z + ')';
    }
}
