package net.e175.klaus.solarpositioning;

public class Generated[calcT_ValidDateAndYear]

Test {

    private static final double MIN_LONGITUDE = Double.NEGATIVE_INFINITY;
    private static final double MAX_LONGITUDE = Double.POSITIVE_INFINITY;

    @Test
    public void [calcT_ValidDateAndYear]Test() {
        int year = 2022;
        int month = 6;
        int dayOfMonth = 1;
        ZonedDateTime date = ZonedDateTime.of(year, month, dayOfMonth, 0, 0, 0);
        double result = Grena3.calcT(date);
        assertEquals(2451545.0378, result, 0.00001);
    }

}