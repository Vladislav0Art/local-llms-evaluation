package net.e175.klaus.solarpositioning;

public class Generated[calculateSolarPosition_InvalidLongitude]

Test {

    private static final double MIN_LONGITUDE = Double.NEGATIVE_INFINITY;
    private static final double MAX_LONGITUDE = Double.POSITIVE_INFINITY;

    @Test
    public void [calculateSolarPosition_InvalidLongitude]Test() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), -90.0, MAX_LONGITUDE, 0.0));
    }

}