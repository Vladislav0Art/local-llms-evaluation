package net.e175.klaus.solarpositioning;

public class Generated[calculateSolarPosition_ValidParameters]

Test {

    private static final double MIN_LONGITUDE = Double.NEGATIVE_INFINITY;
    private static final double MAX_LONGITUDE = Double.POSITIVE_INFINITY;

    @Test
    public void [calculateSolarPosition_ValidParameters]Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double longitude = date.getHour() + date.getMinute() / 60d + date.getSecond() / (60d * 60);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0.0, longitude, 0.0, 1000.0, 20.0);
        assertNotNull(result);
    }

}