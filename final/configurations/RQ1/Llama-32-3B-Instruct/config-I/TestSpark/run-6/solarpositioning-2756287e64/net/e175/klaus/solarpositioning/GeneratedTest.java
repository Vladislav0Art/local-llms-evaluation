package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static double calcT(int y, int m, int d) {
        return (int) (365.25 * (y - 2000)) + (int) (30.6001 * (m + 1));
    }

    public static double toDegrees(double degrees) {
        return Math.toRadians(degrees);
    }
}

public class AzimuthZenithAngle {
    private final double alpha;
    private final double z;

    public AzimuthZenithAngle(double alpha, double z) {
        this.alpha = alpha;
        this.z = z;
    }

    public double getAlpha() {
        return alpha;
    }

    public double getZ() {
        return z;
    }
}

public class Test {

}