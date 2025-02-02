package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_WithPressureAndTemperature_ReturnsCorrectValues {

    @Test
    public void calculateSolarPosition_WithPressureAndTemperature_ReturnsCorrectValues() {
        // Given
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0;
        double longitude = 0;
        double deltaT = 0;
        double pressure = 1000;
        double temperature = 20;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(180, 90);

        // When
        Grena3 calculateSolarPosition = new Grena3();
        AzimuthZenithAngle actual = calculateSolarPosition.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Then
        assertEquals(expected, actual);
    }

}