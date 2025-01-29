package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_estimate_DifferentMonthOfYear_MultipleTimes {

    public final class LocalDateUtil {
        public static LocalDate get

        LocalDateFromEpochMillis(long epochMillis) {
            return null;
        }
    }

    @Test
    public void test_estimate_DifferentMonthOfYear_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getMonthValue()).thenReturn(4); // April is the fourth month of the year
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

}