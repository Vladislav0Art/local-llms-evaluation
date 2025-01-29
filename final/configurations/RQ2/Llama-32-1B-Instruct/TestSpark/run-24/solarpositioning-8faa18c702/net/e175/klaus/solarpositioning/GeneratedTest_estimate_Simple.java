package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_estimate_Simple {

    public final class LocalDateUtil {
        public static int getMonthFromEpoch(long epochMillis) {
            return 0;
        }
    }

    @Test
    public void test_estimate_Simple() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(1);
        when(forDate.getMonthValue()).thenReturn(5); // May is the fifth month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(10.0, result, 2);
    }

}