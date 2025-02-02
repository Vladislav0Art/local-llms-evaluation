package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_DateAndLatitudeOnly_ReturnsNull {

    @Test
    public void calculateSolarPosition_DateAndLatitudeOnly_ReturnsNull() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 0.0, 0.0, Double.MIN_VALUE));
    }

}