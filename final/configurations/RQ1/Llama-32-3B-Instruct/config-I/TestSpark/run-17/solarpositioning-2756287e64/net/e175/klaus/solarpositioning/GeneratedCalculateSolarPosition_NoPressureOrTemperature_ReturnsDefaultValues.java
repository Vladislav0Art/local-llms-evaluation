package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NoPressureOrTemperature_ReturnsDefaultValues {

    @Test
    public void calculateSolarPosition_NoPressureOrTemperature_ReturnsDefaultValues() {
        // Given
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0;
        double longitude = 0;
        double deltaT = 0;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(180, 90);

        // When
        Grena3 calculateSolarPosition = new Grena3();
        AzimuthZenithAngle actual = calculateSolarPosition.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Then
        assertEquals(expected, actual);
    }

}