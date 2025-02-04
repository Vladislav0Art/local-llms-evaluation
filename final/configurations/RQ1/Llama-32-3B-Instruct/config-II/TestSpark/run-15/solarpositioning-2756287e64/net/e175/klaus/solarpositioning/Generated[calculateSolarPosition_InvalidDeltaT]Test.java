package net.e175.klaus.solarpositioning;

public class Generated[calculateSolarPosition_InvalidDeltaT]

Test {

    private static final double MIN_LONGITUDE = Double.NEGATIVE_INFINITY;
    private static final double MAX_LONGITUDE = Double.POSITIVE_INFINITY;

    @Test
    public void [calculateSolarPosition_InvalidDeltaT]Test() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), 0.0, MIN_LONGITUDE, Double.POSITIVE_INFINITY));
    }

}