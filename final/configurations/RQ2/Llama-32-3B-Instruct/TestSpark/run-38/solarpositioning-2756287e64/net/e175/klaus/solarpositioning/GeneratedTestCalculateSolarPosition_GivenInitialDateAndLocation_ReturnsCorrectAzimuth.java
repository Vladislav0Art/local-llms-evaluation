package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSolarPosition_GivenInitialDateAndLocation_ReturnsCorrectAzimuth {

    @Test
    public void testCalculateSolarPosition_GivenInitialDateAndLocation_ReturnsCorrectAzimuth() {
        // Arrange
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Date initialDate = ...;
        Location location = ...;

        // Act
        Azimuth azimuth = calculator.calculateSolarPosition(initialDate, location);

        // Assert
        assert azimuth != null;
    }

}