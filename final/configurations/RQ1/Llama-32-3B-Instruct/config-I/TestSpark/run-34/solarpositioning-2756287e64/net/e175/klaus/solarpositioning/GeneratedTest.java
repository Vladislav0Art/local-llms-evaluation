package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static class G Rena3 {
        public double getAzimuthZenithAngle(int altitude, int azimuth) {
            return Math.toDegrees(Math.atan(Math.tan(Math.toRadians(altitude)) / Math.cos(Math.toRadians(azimuth))));
        }
    }

}