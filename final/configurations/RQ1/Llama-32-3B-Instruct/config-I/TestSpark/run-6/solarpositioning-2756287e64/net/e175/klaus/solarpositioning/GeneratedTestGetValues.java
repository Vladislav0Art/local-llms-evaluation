package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedTestGetValues {

    @Test
    public void testGetValues() {
        final AzimuthZenithAngle angle = new AzimuthZenithAngle(toDegrees(90), toDegrees(0));
        assertEquals(90.0, angle.getAlpha(), 1e-9);
        assertEquals(0.0, angle.getZ(), 1e-9);
    }
}

public class Grena3 {

    public static double calcT(ZonedDateTime date) {
        // implementation
    }

    public static double toDegrees(int degrees) {
        return Math.toRadians(degrees);
    }

    public static double toDegrees(double degrees) {
        return degrees;
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