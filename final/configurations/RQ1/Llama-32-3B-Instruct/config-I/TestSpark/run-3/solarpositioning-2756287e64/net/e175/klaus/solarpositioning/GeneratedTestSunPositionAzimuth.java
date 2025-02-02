package net.e175.klaus.solarpositioning;

public class GeneratedTestSunPositionAzimuth {

    public static Object calculateSolarPosition(ZonedDateTime zdt, double lat, double lon) {
        // method implementation
        return null;
    }

    public static Object calculateSolarPosition(double latitude, double longitude, int year, int month, int day, double hour, double minute, double second) {
        // method implementation
        return null;
    }
}

public class SunPosition {

    private double azimuth;

    public SunPosition(double azimuth) {
        this.azimuth = azimuth;
    }

    public double getAzimuth() {
        return azimuth;
    }
}

public class Grena3Test {

    @Test
    public void testSunPositionAzimuth() {
        SunPosition sunPosition = new SunPosition(12.0);

        double azimuth = sunPosition.getAzimuth();
        assertEquals(12.0, azimuth);
    }

}