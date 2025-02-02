package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_InvalidDate_ReturnsNull {

    @Test
    public void calculateSolarPosition_InvalidDate_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(10000, 1, 1, 0, 0, 0);
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, 0.0, 0.0, Double.MIN_VALUE));
    }

}