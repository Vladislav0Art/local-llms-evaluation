package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure) {
        // implementation of solar position calculation
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double temperature) {
        // implementation of solar position calculation
    }
}

public class AzimuthZenithAngle {

    public double azimuth;
    public double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

    @Override
    public String toString() {
        return "(" + azimuth + "," + zenith + ")";
    }
}

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_SimpleTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 10.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_SimpleTest_WithPressure() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 10.5;
        double pressure = 1013.25;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_InvalidLatitude() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -90.0;
        double longitude = -74.0060;
        double deltaT = 10.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_InvalidLongitude() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = 180.0;
        double deltaT = 10.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_InvalidDeltaT() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = Double.POSITIVE_INFINITY;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_SimpleTest_WithTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 10.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 20.0);
        assertNotNull(result);
    }

}