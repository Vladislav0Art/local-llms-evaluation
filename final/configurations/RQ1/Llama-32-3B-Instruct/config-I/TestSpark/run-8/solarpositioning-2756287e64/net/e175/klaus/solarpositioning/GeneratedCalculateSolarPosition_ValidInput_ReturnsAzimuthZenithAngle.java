package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_ValidInput_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_ValidInput_ReturnsAzimuthZenithAngle() {
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0, 1012.5, 20);
        assertNotNull(angle);
        // Add additional assertions for az and z values
    }

}