package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_estimate_DifferentMonthWithOffset_MultipleTimes {

    public final class LocalDateUtil {
        public static int getMonthFromEpoch(long epochMillis) {
            return 0;
        }
    }

    @Test
    public void test_estimate_DifferentMonthWithOffset_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getMonthValue()).thenReturn(5); // May is the fifth month of the year
        when(forDate.getDayOfMonth()).thenReturn(20); // February is the twentieth day of the month
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

}