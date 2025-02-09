package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_WithDate Null_ReturnsException {

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double altitude) {
        // implementation of the method
    }
}

class AzimuthZenithAngle {
    public static final String DEFAULT = "default";

    public static class Default implements AzimuthZenithAngle {
        @Override
        public String toString() {
            return "AzimuthZenithAngle{" +
                    "azimuth=" + DEFAULT + ", zenith=" + DEFAULT +
                    '}';
        }
    }

    private static String getDefault() {
        try {
            return this.getClass().getField("DEFAULT").get(this);
        } catch (Exception e) {
            return null;
        }
    }
}

public class Grena3Test {

    @Test
    public void calculateSolarPosition_WithDate

    Null_ReturnsException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 0.0, 0.0, 8.0));
    }

}