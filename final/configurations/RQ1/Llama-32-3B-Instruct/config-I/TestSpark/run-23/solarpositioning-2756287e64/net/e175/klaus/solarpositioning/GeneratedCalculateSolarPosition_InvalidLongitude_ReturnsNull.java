package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_InvalidLongitude_ReturnsNull {

    @Test
    public void calculateSolarPosition_InvalidLongitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.ofNow();
        double longitude = Double.MAX_VALUE;
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, 0.0, longitude, Double.MIN_VALUE));
    }

}