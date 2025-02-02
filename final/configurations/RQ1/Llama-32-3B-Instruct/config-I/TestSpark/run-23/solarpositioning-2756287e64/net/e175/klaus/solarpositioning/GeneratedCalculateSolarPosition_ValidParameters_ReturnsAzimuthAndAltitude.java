package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_ValidParameters_ReturnsAzimuthAndAltitude {

    @Test
    public void calculateSolarPosition_ValidParameters_ReturnsAzimuthAndAltitude() {
        ZonedDateTime date = ZonedDateTime.ofNow();
        double latitude = 37.7749;
        double longitude = -122.4194;
        assertNotEquals(null, Grena3.calculateSolarPosition(date, latitude, longitude, Double.MIN_VALUE, Double.MIN_VALUE));
    }

}