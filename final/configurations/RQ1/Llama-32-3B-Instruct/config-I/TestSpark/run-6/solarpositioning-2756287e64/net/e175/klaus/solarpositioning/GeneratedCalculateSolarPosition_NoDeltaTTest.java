package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NoDeltaTTest {

    @Test
    public void calculateSolarPosition_NoDeltaTTest() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 40;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, -120, 0);
        assertNotNull(result);
    }

}