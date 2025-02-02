package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_InvalidLatitude_ReturnsNull {

    @Test
    public void calculateSolarPosition_InvalidLatitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.ofNow();
        double latitude = Double.MAX_VALUE;
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, 0.0, Double.MIN_VALUE));
    }

}