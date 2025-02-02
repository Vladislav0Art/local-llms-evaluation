package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NoLongitudeTest {

    @Test
    public void calculateSolarPosition_NoLongitudeTest() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 40;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, 0, 1.0);
        assertNotNull(result);
    }

}