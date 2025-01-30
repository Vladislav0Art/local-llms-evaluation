package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class GeneratedCalcTTest {

    private static final double DELTA = 1e-6;

    @Test
    public void calcTTest() throws Exception {
        ZonedDateTime testDate = ZonedDateTime.of(2015, 3, 7, 16, 30, 0, 0, ZoneId.of("UTC"));
        java.lang.reflect.Method method = Grena3.class.getDeclaredMethod("calcT", ZonedDateTime.class);
        method.setAccessible(true);
        double result = (double) method.invoke(null, testDate);

        assertEquals(5510.6875, result, DELTA);
    }

}