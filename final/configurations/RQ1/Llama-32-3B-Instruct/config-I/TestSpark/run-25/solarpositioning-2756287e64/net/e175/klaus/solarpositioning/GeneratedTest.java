package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private double azimuth;
    private double elevation;

    public void setValues(double azimuth, double elevation) {
        this.azimuth = azimuth;
        this.elevation = elevation;
    }

    public int getAzimuthAsInt() {
        return (int) azimuth;
    }

    public int getElevationAsInt() {
        return (int) elevation;
    }
}

public class Grena3 {
    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        // implementation of the method
        AzimuthZenithAngle result = new AzimuthZenithAngle();
        result.setValues(azimuth, elevation);
        return result;
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        // implementation of the method
        AzimuthZenithAngle result = new AzimuthZenithAngle();
        result.setValues(azimuth, elevation);
        return result;
    }
}

public class GeneratedTest {

    @Test
    public void testCalculateSolarPosition_CalculateSolarPositionForDefaultParameters_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 50.0;
        double longitude = -10.0;
        double deltaT = 3600.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertTrue(result.getAzimuthAsInt() > 0 && result.getElevationAsInt() < 90);
    }

    @Test
    public void testCalculateSolarPosition_CalculateSolarPositionForZeroLatitude_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = -10.0;
        double deltaT = 3600.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(90, result.getElevationAsInt());
    }

    @Test
    public void testCalculateSolarPosition_CalculateSolarPositionForNegativeLongitude_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 50.0;
        double longitude = -10.0;
        double deltaT = 3600.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(90, result.getElevationAsInt());
    }

    @Test
    public void testCalculateSolarPosition_CalculateSolarPositionForDifferentPressureAndTemperature_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double pressure = 1000.0;
        double temperature = 273.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50.0, -10.0, 3600.0, pressure, temperature);
        assertTrue(result.getAzimuthAsInt() > 0 && result.getElevationAsInt() < 90);
    }

}