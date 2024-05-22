public class Dispersar {
    static final int M = 101;
    private static final double R = 0.6180334;

    public int dispersar(double x) {
        double t;

        int v;

        t = R * x - Math.floor(R * x);

        v = (int) (M * t);
        return v;
    }
}
