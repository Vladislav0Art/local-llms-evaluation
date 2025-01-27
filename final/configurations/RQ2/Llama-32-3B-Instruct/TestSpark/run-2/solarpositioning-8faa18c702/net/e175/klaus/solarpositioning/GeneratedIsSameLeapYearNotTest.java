package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyDouble;

public class GeneratedIsSameLeapYearNotTest {

    @Test
    public void isSameLeapYearNotTest() {
        assertFalse(DeltaT.isSameLeapYear(LocalDate.of(2023, 2, 29)));
    }
}

public class DeltaT {

    private static final double MAX_VALUE = pow(10, 10);
    private static final double MIN_VALUE = -pow(10, 9);

    public static double estimate(final LocalDate forDate) {
        if (forDate.isLeapYear()) {
            return 1.0;
        } else {
            return 0.5;
        }
    }

    public static boolean isSameLeapYear(final LocalDate date) {
        return date.isLeapYear();
    }

}