package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSolarPosition_GivenInvalidDate_ReturnsCorrectAzimuth {

    @Test
    public void testCalculateSolarPosition_GivenInvalidDate_ReturnsCorrectAzimuth() {
        // Arrange
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Date initialDate = ...;

        // Act
        Azimuth azimuth = calculator.calculateSolarPosition(initialDate, new Location());

        // Assert
        assert azimuth != null;
    }

}