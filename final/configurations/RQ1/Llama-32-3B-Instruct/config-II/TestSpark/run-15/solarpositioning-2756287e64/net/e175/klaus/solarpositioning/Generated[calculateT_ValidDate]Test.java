package net.e175.klaus.solarpositioning;

public class Generated[calculateT_ValidDate]

Test {

    private static final double MIN_LONGITUDE = Double.NEGATIVE_INFINITY;
    private static final double MAX_LONGITUDE = Double.POSITIVE_INFINITY;

    @Test
    public void [calculateT_ValidDate]Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double result = Grena3.calcT(date);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calcT(null));
    }

}