package vectors;

public class Calculator {

    public static GenericVector<Float> addFloatVector(GenericVector<Float> v1, GenericVector<Float> v2) {
        return new GenericVector<>(
                v1.getX() + v2.getX(),
                v1.getY() + v2.getY(),
                v1.getZ() + v2.getZ()
        );
    }

    public static void useNormalVector() {
        Vector v1 = new Vector(0.5f, 0.5f, 0.5f);
        Vector v2 = new Vector(0.5f, 0.5f, 0.5f);
        Vector v3 = v1.add(v2);
        System.out.println(v3);
    }

    public static void useGenericVector() {
        GenericVector<Float> v1 = new GenericVector<Float>(0.5f, 0.5f, 0.5f);
        GenericVector<Float> v2 = new GenericVector<Float>(0.5f, 0.5f, 0.5f);
        GenericVector<Float> v3 = addFloatVector(v1, v2);
        System.out.println(v3);
    }

    public static void main(String[] args) {
        useNormalVector();
        useGenericVector();
    }
}
