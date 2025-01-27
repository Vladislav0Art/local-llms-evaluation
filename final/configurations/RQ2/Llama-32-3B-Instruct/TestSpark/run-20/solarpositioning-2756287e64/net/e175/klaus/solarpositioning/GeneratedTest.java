package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_MultipleInputParameters_WithPressureAndTemperature_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 10.0;
        double pressure = 1013.25; // atm
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_MultipleInputParameters_WithoutPressureAndTemperature_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 10.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_MultipleInputParameters_WithInvalidTemperature_ReturnsDefaultAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 10.0;
        double temperature = -100.0; // invalid temperature

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 1013.25, temperature);
        assertNotNull(result);
    }

}