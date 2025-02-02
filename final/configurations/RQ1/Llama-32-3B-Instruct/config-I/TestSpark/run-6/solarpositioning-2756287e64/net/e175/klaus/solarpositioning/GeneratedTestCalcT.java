package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedTestCalcT {

    @Test
    public void testCalcT() {
        final int m = 12;
        final int y = 2022;
        final int d = 31;
        ZonedDateTime date = ZonedDateTime.of(y, m - 1, d, 0, 0, 0);
        double t = Grena3.calcT(date);
        assertEquals((int) (365.25 * (y - 2000)) + (int) (30.6001 * (m + 1)), t);
    }

}