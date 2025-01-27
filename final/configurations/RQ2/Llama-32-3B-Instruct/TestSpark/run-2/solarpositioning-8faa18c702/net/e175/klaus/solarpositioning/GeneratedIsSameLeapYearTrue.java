package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyDouble;

public class GeneratedIsSameLeapYearTrue {

    public static class DeltaTStub {
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

    @Test
    public void isSameLeapYearTrue() {
        assertTrue(DeltaTStub.isSameLeapYear(LocalDate.of(2020, 2, 29)));
    }

}