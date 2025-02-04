package net.e175.klaus.solarpositioning;

public class Generated[calculateSolarPosition_InvalidLatitude]

Test {

    private static final double MIN_LONGITUDE = Double.NEGATIVE_INFINITY;
    private static final double MAX_LONGITUDE = Double.POSITIVE_INFINITY;

    @Test
    public void [calculateSolarPosition_InvalidLatitude]Test() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), Double.POSITIVE_INFINITY, 0.0, 0.0));
    }

}