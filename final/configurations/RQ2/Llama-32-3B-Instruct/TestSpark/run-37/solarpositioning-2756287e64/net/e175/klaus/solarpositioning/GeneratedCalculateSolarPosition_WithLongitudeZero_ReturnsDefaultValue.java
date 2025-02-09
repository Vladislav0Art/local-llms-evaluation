package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_WithLongitudeZero_ReturnsDefaultValue {

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
    public void calculateSolarPosition_WithLongitudeZero_ReturnsDefaultValue() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(ZonedDateTime.now(), 37.7749, 0.0, 8.0);
        assertNotNull(result);
        assertEquals(Grena3.AzimuthZenithAngle.DEFAULT, result.toString());
    }

}