package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_WithNullArguments {

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
    public void calculateSolarPosition_WithNullArguments() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, null, null, 8.0));
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 37.7749, -122.4194, null));
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 37.7749, -122.4194, 8.0));
    }

}