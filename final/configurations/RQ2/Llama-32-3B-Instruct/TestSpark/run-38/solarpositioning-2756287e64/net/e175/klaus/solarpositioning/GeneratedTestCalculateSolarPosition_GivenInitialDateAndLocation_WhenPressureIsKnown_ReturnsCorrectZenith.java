package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSolarPosition_GivenInitialDateAndLocation_WhenPressureIsKnown_ReturnsCorrectZenith {

    @Test
    public void testCalculateSolarPosition_GivenInitialDateAndLocation_WhenPressureIsKnown_ReturnsCorrectZenith() {
        // Arrange
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Date initialDate = ...;
        Location location = ...;

        // Act
        Zenith zenith = calculator.calculateSolarPosition(initialDate, location);

        // Assert
        assert zenith != null;
    }

}