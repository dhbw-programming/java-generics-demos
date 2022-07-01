package vectors;

public class Vector {
    private final float x, y, z;

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector add(Vector vec) {
        return new Vector(this.x + vec.x, this.y + vec.y, this.z + vec.z);
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y + ',' + z + ')';
    }
}
