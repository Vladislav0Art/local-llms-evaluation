package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NoLatitudeTest {

    @Test
    public void calculateSolarPosition_NoLatitudeTest() {
        final ZonedDateTime date = ZonedDateTime.now();
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, -120, 1.0);
        assertNotNull(result);
    }

}